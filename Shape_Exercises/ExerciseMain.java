class ExerciseMain {
    public static void main(String[] args){
        //taking number n from command-line arguments
        int numAsterisksToPrint = Integer.parseInt(args[0]);
        String nameToPrint = args[1];

        Line line = new Line(numAsterisksToPrint);
        System.out.println("Single: " + line.singleAsterisk());
        System.out.println("Horizontal: " + line.horizontalLine());
        System.out.println("Vertical: " + line.verticalLine());

        Triangle triangle = new Triangle(numAsterisksToPrint);
        System.out.println("Right: " + triangle.rightTriangle());
        System.out.println("Isosceles:" + triangle.isoscelesTriangle());

        Diamond diamond = new Diamond(numAsterisksToPrint);
        System.out.println("Centered: " + diamond.centeredDiamond());
        System.out.println("Name:" + diamond.namedDiamond(nameToPrint));


    }
}