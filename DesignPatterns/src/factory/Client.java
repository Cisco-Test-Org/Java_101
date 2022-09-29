package factory;

public class Client {
    public static void main(String[] args) {

        /* triangle */
        Polygon triangle = PolygonFactory.getInstance(3);
        System.out.println(triangle.getType());
        
        /* pentagon */
        Polygon pentagon = PolygonFactory.getInstance(5);
        System.out.println(pentagon.getType());
    }
}
