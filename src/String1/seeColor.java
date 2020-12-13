package String1;

public class seeColor {

    /* Given a string, if the string begins with "red" or "blue" return that color string,
     * otherwise return the empty string.

     * seeColor("redxx") → "red"
     * seeColor("xxred") → ""
     * seeColor("blueTimes") → "blue" */
    public static void main(String[] args) {
        String result = seeColor("red");
        System.out.println(result);
    }

    public static String seeColor(String str) {
// hvis String str starter med 'red' returnere vi 'red';
        if (str.startsWith("red")) {
            return "red";
        }

        if (str.startsWith("blue")) {
            return "blue";
//hvis ingen af kriterierne bliver mødt returnere vi ingenting.
        } else {
            return "";
        }
    }
}
