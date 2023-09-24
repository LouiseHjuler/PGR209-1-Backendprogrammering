package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    public final ServerSocket serverSocket;
    public final String requestline;
    public final Map<String, String> headers;

    public String HttpServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);

        Socket clientSocket = serverSocket.accept();
        String requestLine = readLine(clientSocket);
        headers = new Hashmap <>();

        String headerLine;
        while(!(headerling= read(clientSocket)))

    }
    private String readLine(Socket socket) throws IOException{
        StringBuilder sb = new StringBuilder();
        int character;

        while ( (character = socket.getInputStream().read() ) != '\r') {
            sb.append( (char) character);
        }
        character = socket.getInputStream().read();
        return sb.toString();
    }
}
