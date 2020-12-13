package String1;

public class startWord {

    /*
    * Given a string and a second "word" string, we'll say that the word matches the string
    *  if it appears at the front of the string, except its first char does not need to match exactly.
    *  On a match, return the front of the string, or otherwise return the empty string.
    *  So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
    *  The word will be at least length 1.

    * startWord("hippo", "i") → "h"
    * startWord("hippo", "xip") → "hip"
    * startWord("hippo", "hi") → "hi"
     */
    public static void main(String[] args) {
String result = startWord("hippo","xip");
        System.out.println("Forventet resultat: hip");
        System.out.println("endeligt resultat:" + result);

    }

    //Kopireret fra nettet.
    public static String startWord(String str, String word) {
        int lenStr = str.length();
        int lenWord = word.length();

        if (lenStr == 0)
        return "";

        if (lenWord > lenStr)
        return "";

        if (word.length() == 1)
        return str.substring(0,1);

  else if (str.substring(1,lenWord).equals(word.substring(1,lenWord)))
        return str.substring(0,lenWord);
  else
        return "";


    }

}
