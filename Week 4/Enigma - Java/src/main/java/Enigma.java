// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    /*
    Encodes the supplied string message by formatting the input message first, then
    applying an initial CaesarShift then applying the keys within the List rotors. 
    All text should be uppercase, spaces replaced by the '?' character and all full
    stops '.' with a '€'. All other characters that are not [A..Z] or [a..z] should be 
    removed from the message. 
    
    Example input: "Deine Zauber binden wieder. Was die Mode streng geteilt.", 12, "HFPMRIBTJWYDXQLGUKOVSNAZEC"
    Expected output: "GKAPS?UOQNCQ?EBXMIG?CXWWDC€?IYM?GNO?FRSA?DQXHYR?IRSBDGE€"
    */ 

    public static String encode(String message, int incrementNumber,List<String> rotors ){
        // TODO - Implement the Encrypt method
        // Steps in brief
        // 1. Apply the CAESAR shift using the increment number
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        // 3. Return the encrypted string

        return "Implement the encrypt method";
    }

    public static String decode(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }

    public static String formatInputMessage(String message){
        /* The method FormatInputMessage should be used when encoding a message. It should
        make all characters in the string message uppercase. Remove all non alphabetic 
        characters from the string except for spaces ' '  and full stops '.'. Then 
        replace all spaces with a '?' and all full stops '.' with a '€'.
        TO DO - add your implementation 
        
        Example input:  "Test message. Working.
        Example output: "TEST?MESSAGE€?WORKING€" */

        // TO DO - add your implementation
    }

    public static String formatOutputMessage(String message){
        /* The method FormatOuputMessage should be used when decoding a message. It should replace
        all '?' characters with a single space ' ' and all '€' with a '.' full stop. All 
        characters should be lower case except for the first character in the input string 
        and every character after a full stop.  
        
        Example input:  "TEST?MESSAGE€?WORKING€"
        Example output: "Test message. Working. */

        // TO DO - add your implementation
        message = message.replace('?', ' ');
        message = message.replace('€', '.');
        return message;
    }

    public static String caesarShift(String message, int shift, bool encode){
        /* The CaesarShift method should take a message and shift each character [A-Z] by the 
        value shift, incrementing or decrementing the value of shift by 1 or -1 with each 
        character shifted if given a positive shift value if encode = true otherwise shifted
        by a negative value if encode = false.
         
        Example input:  "HELLO", -7, true 
        initial shift value = -7 for 'H' then -8 for 'E' and so forth results in:
        Example output: "AWCBD" */
        
        // TO DO - add your implementation
    }

    private static String applyRotor(String message, String rotor){

        /*The ApplyRotor method should substitue each [A..Z] character in the input string
        with the corresponding character in the rotor. 
                                                 
        Example input message: "Apples", rotor: HFPMRIBTJWYDXQLGUKOVSNAZEC
        Example outout: "HGGDRO" */
        // TO DO - add your implementation
    }

    private static String reverseRotor(String message, String rotor){
        /*The ReverseRotor method should substitue each [A..Z] character in the input string
        with the corresponding character in the rotor as above. */
        
        // TO DO - add your implementation
    }
}
