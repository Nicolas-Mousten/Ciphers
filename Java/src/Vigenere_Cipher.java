import java.util.Scanner;

public class Vigenere_Cipher {
    public static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String abcCom = ABC+abc;

    public static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    //-----------------------------------Tools above--------------------------------------------------
    public static void main(String[] args) {

        System.out.println(abcCom);
        //System.out.println(abcCom.length());
        scanner();
        System.out.print("Encrypt:1 / Decrypt:2 ");
        String choice = scanner().nextLine();
        if(choice.equalsIgnoreCase("1")){
            encrypt();
        }else if(choice.equalsIgnoreCase("2")){
            decrypt();
        }
    }
    public static void encrypt(){
        scanner();
        System.out.println("Choose your key: ");
        String key = "Kea";
        //String key = scanner().nextLine();
        System.out.println("Input message to encrypt: ");
        String message = "Helloxyz";
        //String message = scanner().nextLine();
        int[] convertedMessageToInt = stringToIntArray(message);
        int[] convertedKeyToInt = stringToIntArray(key);

    }
    public static void decrypt(){
        scanner();
        System.out.print("Choose your key: ");
        String key = scanner().nextLine();
        System.out.print("Input message to decrypt: ");
        String message = scanner().nextLine();

    }
    //------------------------------------Functions below---------------------------------------------
    public static int[] stringToIntArray(String input){
        int stringLen = input.length();
        int[] StringToIntArray = new int[stringLen];
        for (int i = 0; i < stringLen; i++) {
            StringToIntArray[i] = abcCom.indexOf(input.charAt(i)+1);
            System.out.println(StringToIntArray[i]);
        }
        return StringToIntArray;
    }
    //public static int[] combineIntArray(int[] arrayKey, int[] arrayMessage){

    //}
}
