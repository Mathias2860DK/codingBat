package Logic2;

public class makeBricks {
    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops.
    See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
     */
    public static void main(String[] args) {
        System.out.println("false: " + makeBricks(3, 1, 9));
        System.out.println("true: " + makeBricks(3, 1, 8));
        System.out.println("true: " + makeBricks(3, 2, 10));
        System.out.println("false: " + makeBricks(1, 4, 12));
    }

    //1 , 4 , 12
    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrick = 5;
        int avalibleBig = bigBrick * big;
        // hvis målet er større end alle brickene tilsammen er det false
        if (goal > avalibleBig + small){
            return false;
            //eks: 12 % 5 = 2 > small hvis % 5 er større end det antal small bricks tilgængelige er det ogs false
            //så i dette tilfælde: hvis der ikke er nok tilgængelig small bricks er det false
        }if (goal % bigBrick > small){
            return false;
        }

        return true;
    }
}
