//More Triangle Exercises

class Triangle extends Line{

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
    */
    String isoscelesTriangle(){
        String isoTri = "";

        for (int currentLine = 0; currentLine < this.getNumber(); currentLine++){

            int numAsterisks = ((currentLine + 1) * 2 - 1);
            Line charLine = new Line(numAsterisks);
            String asteriskLine = charLine.horizontalLine();

            int numSpaces = this.getNumber() - currentLine;
            Line noLine = new Line(numSpaces);
            String emptyLine = noLine.emptyHorizontalLine();


            isoTri += "\n" + emptyLine + asteriskLine;

        }

        return isoTri;
    }




}