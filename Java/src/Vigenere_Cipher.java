import java.util.Scanner;

public class Vigenere_Cipher {
    public static String abc = "abcdefghijklmnopqrstuvwxyz";

    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    //-----------------------------------Tools above--------------------------------------------------
    public static void main(String[] args) {
        scanner();
        System.out.print("Encrypt:1 / Decrypt:2 ");
        String choice = scanner().nextLine();
        if(choice.equalsIgnoreCase("1")){
            encrypt();
        }else if(choice.equalsIgnoreCase("2")){

        }
    }
    public static void encrypt(){
        scanner();
        System.out.print("Choose your key: ");
        String key = scanner().nextLine();
        System.out.print("Input message to encrypt: ");
        String message = scanner().nextLine();
    }
    //------------------------------------Functions below---------------------------------------------
    //Make an array that saves the entire word whitout the blank spaces, then use index of the word to remake them to numbers.
    //Problem is that i don't know how many words there will be and can't create arrays for the numbers after.
    //Mabey i can make a master array to keep the format right.
}
