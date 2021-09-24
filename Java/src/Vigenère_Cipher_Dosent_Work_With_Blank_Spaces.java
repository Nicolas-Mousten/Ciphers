import java.util.Locale;
import java.util.Scanner;

public class Vigenère_Cipher_Dosent_Work_With_Blank_Spaces {
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
        int[] convertedMessage = stringToInt(message);
        int[] convertedKey = stringToInt(key);
        int[] combinedMessageAndKey = addingTwoIntArraysTogether(convertedMessage,convertedKey);
        for (int i = 0; i < combinedMessageAndKey.length; i++) {
            System.out.print(abc.charAt(combinedMessageAndKey[i]));
        }
    }
    //------------------------------------Functions below---------------------------------------------
    public static int[] stringToInt(String stringToInt){
        stringToInt = stringToInt.toLowerCase();
        int stringLen = stringToInt.length();
        int[] convertedString = new int[stringLen];
        for (int i = 0; i < stringLen; i++) {
            int temp = abc.indexOf(stringToInt.charAt(i))+1;
            convertedString[i] = temp;
        }
        return convertedString;
    }
    public static int[] addingTwoIntArraysTogether(int[] integerArray1,int[]intKey){
        int intArray1Len = integerArray1.length;
        int intArray2Len = intKey.length;
        int[] combinedInt = new int[intArray1Len];
        int j = 0;
        for (int i = 0; i < intArray1Len; i++) {
            System.out.println(abc.charAt(integerArray1[i]-1) +" "+abc.charAt(intKey[j]-1));//Check the characters in the arrays
            combinedInt[i] = (integerArray1[i] + intKey[j])%26;
            j = j +1;
            if(j ==intArray2Len){ //makes it so the key is repeated to match the message
                j=0;
            }}
        return combinedInt;
    }
}
