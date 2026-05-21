class Box {
    double height, width, breadth;

    Box(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    double getVolume() {
        return height * width * breadth;
    }

    double getArea() {
        return 2 * (height * width + width * breadth + height * breadth);
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        Box b1 = new Box(10, 5, 4);
        Box b2 = new Box(8, 6, 3);

        System.out.println("Box 1 Volume = " + b1.getVolume());
        System.out.println("Box 1 Surface Area = " + b1.getArea());

        System.out.println();

        System.out.println("Box 2 Volume = " + b2.getVolume());
        System.out.println("Box 2 Surface Area = " + b2.getArea());
    }
}