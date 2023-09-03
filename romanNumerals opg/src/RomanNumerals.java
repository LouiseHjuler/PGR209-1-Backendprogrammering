public class RomanNumerals {
    // for each string.length fra index =string.length
// untill string.length-1 do this and
// that baseret på hvor i string arrayen man er med passende
// konverterings regler til romer tal. max 3999
    public String numerals(int input) {
        String singlesResult = "";
        String tensResult = "";
        String hundredsResult = "";
        String thousandsResult = "";
        //convert input to string to get length
        String inputString = String.valueOf(input);
        //creating array of right length
        char[] inputArray = inputString.toCharArray();
        // reverse through each index of input Array corresponding to number value group
        for (int i = inputString.length()-1; i >= 0 ; i--) {
        int arrayNumber = Character.getNumericValue(inputArray[i]);
            if (i == inputString.length()-1) {
                String result = "";
                String counter = "";
                //converting 1-9
                if (arrayNumber < 4) {
                    for (int j = 0; j < arrayNumber; j++) {
                        counter = counter + "I";
                    }
                } else if (arrayNumber == 4){
                    result = "IV";
                } else if (5 <= arrayNumber && arrayNumber <= 8){
                    result = "V";
                    for (int j = 5; j < arrayNumber; j++) {
                        counter = counter + "I";
                    }
                } else if (arrayNumber == 9) {
                    result = "IX";
                } singlesResult = result + counter;
            //sorting out the 10s
            } if (i == inputString.length()-2){
                String counter = "";
                String L = "L";
                if (arrayNumber < 4) {
                    for (int j = 0; j < arrayNumber; j++) {
                        tensResult = tensResult + "X";
                    }
                }else if (arrayNumber == 4){
                    tensResult = "XL";
                } else if ( 5 <= arrayNumber && arrayNumber <= 8){
                    for (int j = 5; j < arrayNumber; j++) {
                        counter = counter + "X";
                    } tensResult = tensResult + L + counter;
                } else if ( arrayNumber == 9){
                    tensResult = "XC";
                }
            // 100'S
            }if (i == inputString.length()-3) {
                String counter = "";
                String D = "D";
                if (arrayNumber < 4) {
                    for (int j = 0; j < arrayNumber; j++) {
                        hundredsResult = hundredsResult + "C";
                    }
                } else if (arrayNumber == 4){
                    hundredsResult = "CD";
                } else if (5 <= arrayNumber && arrayNumber <= 8) {
                    for (int j = 5; j < arrayNumber; j++) {
                        counter = counter + "C";
                    }
                    hundredsResult = hundredsResult + D + counter;
                } else if (arrayNumber == 9) {
                    hundredsResult = "CM";
                }
            }if (i == inputString.length()-4) {
                if (arrayNumber < 4) {
                    for (int j = 0; j < arrayNumber; j++) {
                        thousandsResult = thousandsResult + "M";
                    }
                } else if (arrayNumber >= 4){
                    System.out.println("we only calculate roman numerals until 3999 or MMMCMXICIX ");
                }
            }
        }
        System.out.println(thousandsResult + hundredsResult + tensResult + singlesResult);
        return thousandsResult + hundredsResult + tensResult + singlesResult;
    }
}


