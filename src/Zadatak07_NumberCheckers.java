import java.util.Objects;
import java.util.Scanner;

public class Zadatak07_NumberCheckers {

    public static void main(String[] args) {

        // Write a program in which the user enters the type and dimensions of a geometric figure
        // and calculates its area.
        // The figures are of four types: square, square, rectangle, circle, and triangle.
        // The first line of the input reads the type of figure (string with the following options:
        // square, rectangle, circle, or triangle).

        //	If the figure is a square: on the next line read a floating-point number - the length of its side
        //	If the figure is a rectangle: on the next two lines read two floating-point numbers -
        //	the lengths of its sides
        //	If the figure is a circle: on the next line read a floating-point number - the radius of the circle
        //	If the figure is a triangle: on the next two lines read two floating-point numbers -
        //	the length of its side and the length of the height to it
        //Round the result up to 3 digits after the decimal point.

        Scanner sc = new Scanner(System.in);

        String geometricFigure = sc.nextLine();

        String SQ = "square";
        String REC = "rectangle";
        String CIR = "circle";
        String TRI = "triangle";

        if (geometricFigure.equals(SQ)) {
            double a = Double.parseDouble(sc.nextLine());
            double squareArea = a * a;
            System.out.printf("%.3f", squareArea);

        } else if (geometricFigure.equals(REC)) {
            double x = Double.parseDouble(sc.nextLine());
            double y = Double.parseDouble(sc.nextLine());
            double recArea = x * y;
            System.out.printf("%.3f", recArea);

        } else if (geometricFigure.equals(CIR)) {
            double radius = Double.parseDouble(sc.nextLine());
            double cirArea = (radius * radius) * Math.PI;
            System.out.printf("%.3f", cirArea);
        } else if (geometricFigure.equals(TRI)) {
            double side = Double.parseDouble(sc.nextLine());
            double height = Double.parseDouble(sc.nextLine());
            double triangleArea = (side * height) / 2;
            System.out.printf("%.3f", triangleArea);
        }


    }
}
