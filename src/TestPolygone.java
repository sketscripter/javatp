public class TestPolygone{
    public static void main( String[] args){
        Polygone p = new Rectangle(4, 2,8 , 12);
        System.out.println("rectangle :" + p);
        System.out.println("aire du rectangle :" + p.aire());

        p = new Triangle (new Point(4,3), new Point(7,6), new Point (7,7));
        System.out.println("triangle:" + p);
        System.out.println("aire du triangle :" + p.aire());

        p = new PolygoneRegulier (new Point(1,4),2,5);
        System.out.println("polygone régulier " + p);
        System.out.println("aire du polygone :" + p.aire());

    }
}