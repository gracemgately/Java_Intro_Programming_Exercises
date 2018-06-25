//Diamond Exercises

class Diamond extends Shape{

    Diamond(int n){
        super(n);
    }

    /*
    Diamond
    Given a number n, print a centered diamond. Example for n=3:

             *
            ***
           *****
            ***
             *
    */
    String centeredDiamond(){
        Triangle first = new Triangle(this.getNumber());
        Triangle second = new Triangle(this.getNumber() - 1);

        String topIso = first.isoscelesTriangle();
        String bottomIso[] = second.isoscelesTriangle().split("\n");

        String bottomDiamond = "";
        for (int numSpaces = bottomIso.length - 1; numSpaces > 0; numSpaces--){
            bottomDiamond += "\n " + bottomIso[numSpaces];
        }

        return topIso + bottomDiamond;

    }

    /*
    Diamond with Name
    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

            *
           ***
           Bill
           ***
            *
    */
    String namedDiamond(String name){
        String wholeDiamond = this.centeredDiamond();
        String diamondArr[] = wholeDiamond.split("\n");
        int center = (int) Math.round(diamondArr.length / 2);

        diamondArr[center] = " " + name;
        return String.join("\n", diamondArr);
    }
}