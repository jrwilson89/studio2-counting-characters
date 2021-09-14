import java.util.ArrayList;
import java.util.HashMap;

public class CharacterCounter {
    //Class Variables

    //Constructors

    public CharacterCounter() {

    }

    //Methods

    public void countCharacters(String wordToCount) {
        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i=0; i < arrayOfChars.length; i++) {
            //Add or update the count of each character into the hashmap

            char theCharacter = arrayOfChars[i];
            if(myCharacterCount.containsKey(theCharacter) ==false) {
                //Does not contain the key
                myCharacterCount.put(theCharacter, 1);
            } else {
                //Does contain the key
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue=theValue+1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for (int i = 0; i <myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }
}
