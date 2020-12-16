package Logic1;

public class old35 {
/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both.
 Use the % "mod" operator -- see Introduction to Mod

//hvis 3 og 5 går op i nummeret return false
old35(3) → true
old35(10) → true
old35(15) → false
 */

    public static void main(String[] args) {

    }

    public static boolean old35(int n) {
boolean retVal = true;
//Hvis ingen af tallene går op i 3 eller 5 return false
if (n % 3 != 0 && n % 5 != 0){
    return false;
    //Hvis både 3 og 5 går op i tallet (n) return false
} else if (n % 3 == 0 && n % 5 == 0){
    return false;
}else {
    //hvis én af tallene går op i (n) 10 feks.
    return retVal;
}
    }
}
