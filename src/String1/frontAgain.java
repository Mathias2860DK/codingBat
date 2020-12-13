package String1;

public class frontAgain {
/*
* Given a string, return true if the first 2 chars in the string also appear at the end of the string,
* such as with "edited".

* frontAgain("edited") → true
* frontAgain("edit") → false
* frontAgain("ed") → true
*/

    public static void main(String[] args) {
boolean result1 = frontAgain1("ed");
        System.out.println("frontAgain1: " + result1);
        boolean result2 = frontAgain2("edited");
        System.out.println("frontAgain2: " + result2);
    }

    //smarteste metode:
    private static boolean frontAgain2(String str) {
        //hvis String'en er 1 vil der aldrig findes 2 match.
        if (str.length() < 2){
return false;
        }
        // hvis de 2 første chars af String'et er de samme som de 2 sidste chars af string'et mathcer
        // kriterierne.
        if (str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
            return true;
        }
return false;

    }

    //Min egen løsning inden, jeg tjekkede nettet.
    public static boolean frontAgain1 (String str){
        if (str.length() < 2){
return false;
        }
        //jeg deler det op som individuelle chars, og sammenligner.
        char char1 = str.charAt(0);
        char char2 = str.charAt(1);
        char char11 = str.charAt(str.length()-2);
        char char22 = str.charAt(str.length()-1);
        if (char1 == char11 && char2 == char22){
            return true;
        } else{
            return false;
        }
    }
}
