/*Triangle Exercises

Draw a right triangle
Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
Example when n=3:
*
**
***

Isosceles Triangle (NOTE: this was in the diamond exercises section?)
Given a number n, print a centered triangle. Example for n=3:
  *
 ***
*****

*/

public class Triangle extends Shape{

    Triangle(int n){
        super(n);
    }

    /*
    Easiest exercise ever
    Print one asterisk to the console.
    Example:
    *
    */
    String singleAsterisk(){
        return "*";
    }

    /*
    Draw a horizontal line
    Given a number n, print n asterisks on one line.
    Example when n=8:
            ********
    */
    String horizontalLine(){
        String horizontal = "";

        for (int numAsterisks = this.number; numAsterisks > 0; numAsterisks--){
            horizontal += "*";
        }

        return horizontal;
    }

    /*
    Draw a vertical line
    Given a number n, print n lines, each with one asterisks
    Example when n=3:
    *
    *
    *
    */
    String verticalLine(){
        String vertical = "";

        for (int numAsterisks = this.number; numAsterisks > 0; numAsterisks--){
            vertical += "\n*";
        }

        return vertical;
    }

    public static void main(String[] args){
        int numAsterisksToPrint = Integer.parseInt(args[0]);
        Triangle triangle = new Triangle(numAsterisksToPrint);

        System.out.println("Single: " + triangle.singleAsterisk());
        System.out.println("Horizontal: " + triangle.horizontalLine());
        System.out.println("Vertical: " + triangle.verticalLine());


    }

}