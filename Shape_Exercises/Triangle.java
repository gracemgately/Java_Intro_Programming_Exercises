//More Triangle Exercises

class Triangle extends Shape{

    Triangle(int n){
        super(n);
    }

    /*
    Draw a right triangle
    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
    Example when n=3:
    *
    **
    ***
     */
    String rightTriangle(){
        String rightTri = "";

        for (int numLines = 0; numLines < this.getNumber(); numLines++){
            Line line = new Line(numLines + 1);
            rightTri += "\n" + line.horizontalLine();
        }

        return rightTri;
    }

    /*
    Isosceles Triangle (NOTE: this was in the diamond exercises section, I guess it's a half-diamond...?)
    Given a number n, print a centered triangle. Example for n=3:
             *
            ***
           *****
          *******
         *********
    */

    //line number + 2 = numasterisks
    //n * 2 - 1 = last line
    //num spaces to leave = n - current line num




}