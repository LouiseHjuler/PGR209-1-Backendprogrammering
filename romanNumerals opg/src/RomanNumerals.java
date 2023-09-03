public class RomanNumerals {
    public String numerals(int input) {
        //iString inputNumber = String.valueOf(input);
        String result = "";
        String counter = "";
        if (input < 4) {
            for (int i = 0; i < input; i++) {
                result = result + "I";
            }
        } else if (input == 4){
            result = "IV";
        } else if (input == 5){
            result = "V";

        } else if (5 < input || input > 9){
            result = "V";
            for (int i = 5; i < input; i++) {
                counter = counter + "I";
            }
        } else if (input == 9) {
            result = "IV";
            System.out.println(result);
        } else if (input == 10){
            result = "X";
        }
        System.out.println(result+counter);
        return result+counter;
    }
    
}

// for each string.length fra index =string.length
// untill string.length-1 do this and
// that baseret på hvor i string arrayen man er med passende
// konverterings regler til romer tal. max 3999
