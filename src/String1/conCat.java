package String1;

public class conCat {

    /* Given two strings, append them together (known as "concatenation") and
     * return the result. However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     */

    public static void main(String[] args) {
String result = conCat("abc","cat");
        System.out.println(result);
    }

    public static String conCat(String a, String b) {
//hvis en af de 2 strings er længde 0 skal intet erstates og de begge kan returneres
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
//-1 længde for længden af a = 3. Men vi sammenligner indexes - og vi skal have fat i sidste index af String a.
//Så hvis a.charAt(2) == b.charAt(0) :
// a (abc) + b (at)
//substring fortæller beginIndex (fra hvilket start index skal vi returnere fra?)
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);

        }
        //Hvis ingen af disse tilstande er gældene returnere vi bare alt
        return a + b;
    }
}
