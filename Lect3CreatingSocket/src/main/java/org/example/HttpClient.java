package org.example;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class HttpClient {

    public final int statusCode;
    public final Map<String, String> headers= new HashMap<>();
    public final String status;
    public final String body;
    public HttpClient (String host, int port, String url) {
        // socket closes by itself when we are done using it.
        try (Socket socket = new Socket(host, port)){
            //http servers view an empty line as the end of the request. so \r\n in the end
            String request = String.format("GET %s HTTP/1.1\r\n" +
                    "Host: %s\r\n\r\n", url, host);

            socket.getOutputStream().write(request.getBytes());

            String[] statusLine = readLine(socket).split(" ", 3);
            statusCode = Integer.parseInt(statusLine[1]);
            status = statusLine[2];

            String headerLine;
            while (!(headerLine= readLine(socket)).isEmpty()){
                String[] headerParts = headerLine.split(" *:* ", 2);
                headers.put(headerParts[0], headerParts[1]);
            }


            StringBuilder body = new StringBuilder();
            for (int i = 0; i < getContentLength(); i++
                 ) {
                body.append((char) socket.getInputStream().read());
            }
            this.body = body.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private int getContentLength() {
        return Integer.parseInt(headers.get("Content-Length"));
    }

    private String readLine(Socket socket) throws IOException {
        StringBuilder sb = new StringBuilder();
        int character;

        while ( (character = socket.getInputStream().read() ) != '\r') {
            sb.append( (char) character);
        }
        character = socket.getInputStream().read();
        if (character != '\n'){
            throw new IllegalStateException("invalid Http header - \\r not followed by \\n");
        }
        return sb.toString();
    }
}
