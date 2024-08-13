import java.util.Scanner;

public class caesarCypher {

    static String convertString(String in, int offset){
        String encodedString = "";
        char cyph;

        for(int i = 0; i < in.length(); ++i){
            cyph = in.charAt(i);

            if(cyph >= 97 && cyph <=122){
                cyph = (char)(((cyph - 97 + offset) % 26) + 97);
            } else if(cyph >= 65 && cyph <=90) {
                cyph = (char)(((cyph - 65 + offset) % 26) + 65);
            }
            encodedString = encodedString.concat("" + cyph);
        }
        return encodedString;
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String inputString = scnr.nextLine();

        System.out.print("Please enter the offset: ");
        int inputOffset = scnr.nextInt();

        System.out.println("\nEncoded message: " + convertString(inputString, inputOffset));

    }
}
