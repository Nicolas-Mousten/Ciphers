import java.util.Locale;
import java.util.Scanner;

public class Vigenère_Cipher {
    public static String abc = "abcdefghijklmnopqrstuvwxyz ,.!";

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
            decrypt();
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
        System.out.println("");
        decrypt();
    }
    public static void decrypt(){
        scanner();
        System.out.print("Choose your key: ");
        String key = scanner().nextLine();
        System.out.print("Input message to decrypt: ");
        String message = scanner().nextLine();
        int[] convertedMessage = stringToInt(message);
        int[] convertedKey = stringToInt(key);
        int[] seperatedMessageAndKey = SubtractingTwoIntArraysTogether(convertedMessage,convertedKey);
        for (int i = 0; i < seperatedMessageAndKey.length; i++) {
            System.out.print(abc.charAt(seperatedMessageAndKey[i]));
        }
    }
    //------------------------------------Functions below---------------------------------------------
    public static int[] stringToInt(String stringToInt){
        stringToInt = stringToInt.toLowerCase();
        int stringLen = stringToInt.length();
        int[] convertedString = new int[stringLen];
        for (int i = 0; i < stringLen; i++) {
            int temp = abc.indexOf(stringToInt.charAt(i));
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
            //System.out.println(abc.charAt((integerArray1[i])) +" "+abc.charAt((intKey[j])));//Check the characters in the arrays
            //System.out.println(integerArray1[i]);
            combinedInt[i] = (integerArray1[i] + intKey[j])%(abc.length());
            j = j +1;
            if(j ==intArray2Len){ //makes it so the key is repeated to match the message
                j=0;
            }}
        return combinedInt;
    }
    public static int[] SubtractingTwoIntArraysTogether(int[] integerArray1,int[]intKey) {
        int intArray1Len = integerArray1.length;
        int alphabetLen = abc.length();
        int intArray2Len = intKey.length;
        int[] combinedInt = new int[intArray1Len];
        int j = 0;
        for (int i = 0; i < intArray1Len; i++) {
            //System.out.println(abc.charAt((integerArray1[i])) +" "+abc.charAt((intKey[j])));//Check the characters in the arrays
            // (a % b + b) % b
            //You aren't doing modulus at all. There is no modulo operator in Java. % is a remainder operator. And it dosen't work with negative numbers.
            int input = integerArray1[i] - intKey[j];

            //------------------------------------
            int r = input % alphabetLen;
            if (r < 0)
            {
                input += alphabetLen;

            }
            //------------------------------------------------------------------------------------------------------


            combinedInt[i] = input;
            j = j + 1;
            if (j == intArray2Len) { //makes it so the key is repeated to match the message
                j = 0;
            }
        }
        return combinedInt;
    }
}
