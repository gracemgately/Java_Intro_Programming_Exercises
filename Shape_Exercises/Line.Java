//Some Triangle Exercises

class Line extends Shape{
    Line (int n){
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

        for (int numAsterisks = this.getNumber(); numAsterisks > 0; numAsterisks--){
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

        for (int numAsterisks = this.getNumber(); numAsterisks > 0; numAsterisks--){
            vertical += "\n*";
        }

        return vertical;
    }
}