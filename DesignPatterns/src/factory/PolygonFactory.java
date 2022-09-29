package factory;


public class PolygonFactory {

    public static Polygon getInstance(int numOfSides) {

        Polygon polygon = switch (numOfSides) {
            case 3 -> new Triangle();
            case 4 -> new Square();
            case 5 -> new Pentagon();
            default -> null;
        };

        return polygon;
    }
}
