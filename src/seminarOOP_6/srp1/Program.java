package seminarOOP_6.srp1;

public class Program {

    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);  //задали координаты первой точки
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(square, 5);
        squareDrawer.draw();
    }

}
