class Room {
    double height, width, breadth;

    Room(double h, double w, double b) {
        height = h;
        width = w;
        breadth = b;
    }

    double volume() {
        return height * width * breadth;
    }
}

public class RoomDemo {
    public static void main(String[] args) {

        Room r1 = new Room(10, 12, 8);
        Room r2 = new Room(15, 10, 6);

        System.out.println("Volume of Room 1 = " + r1.volume());
        System.out.println("Volume of Room 2 = " + r2.volume());
    }
}