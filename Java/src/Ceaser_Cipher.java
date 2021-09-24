import java.util.Scanner;

public class Ceaser_Cipher {
     public static String abc = "abcdefghijklmnopqrstuvwxyz";
     public static Scanner scanner(){
         Scanner scanner = new Scanner(System.in);
         return scanner;
     }
     public static String encryption(String input){
         String encodedMessage = "";
         int shiftLen = input.length();
         input = input.toLowerCase();
         for (int i = 0; i < shiftLen; i++) {
             int tempInt = abc.indexOf(input.charAt(i));
             tempInt = tempInt + shiftLen%26;
             encodedMessage += String.valueOf(abc.charAt(tempInt));
         }
         return encodedMessage;
     }
     public static String decryption(String input){
         String encodedMessage = "";
         int shiftLen = input.length();
         input = input.toLowerCase();
         for (int i = 0; i < shiftLen; i++) {
             int tempInt = abc.indexOf(input.charAt(i));
             tempInt = tempInt - shiftLen%26;
             encodedMessage += String.valueOf(abc.charAt(tempInt));
         }
         return encodedMessage;
     }
     public static void main(String[] args) {
         String output = "";
         String input = scanner().nextLine();
         output = encryption(input);
         System.out.println(output);
         String output2 = decryption(output);
         System.out.println(output2);
     }
}
