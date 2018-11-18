import java.awt.*;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;


    Box() {

    }

    Box(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    Box(Point topLeft, Point bottomRight) {

        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);


    }

    Box(Point topLeft, int w, int h) {
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
    }

    void printBox() {
        System.out.println("Box: <" + this.x1 + " , " + this.y1 + " , " + this.x2 + " , " + this.y2 + ">");
    }

    public static void main(String[] args) {


        System.out.println("Wywołanie konstruktora ze współrzędnymi rect.buildBox(25,25)i (50,50");
        Box rect = new Box(25, 25, 50, 50);
        rect.printBox();
        System.out.println();


        System.out.println("Wywołanie konstruktora z punktami (10,10) i (20,20)");
        Box rect2 = new Box(new Point(10, 10), new Point(20, 20));
        rect2.printBox();
        System.out.println();

        System.out.println("Wywołanie Konstruktora z punktem (10,10), szerokością 50 i wysokoscią 50");
        Box rect3 = new Box(new Point(10, 10), 50, 50);
        rect3.printBox();


    }
}
