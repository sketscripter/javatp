public class TestFraction extends Fraction{
    public static void main(String[] args) {
Fraction f1 = new Fraction(2,3);
Fraction f2 = new Fraction(3,5);
Fraction f3 = new Fraction(6,14);
Fraction f4 = new Fraction(1,5);
Fraction f5 = new Fraction("25/32");
Fraction plus = f3.plus(f4);
Fraction diff = f3.moins(f4);
Fraction prod = f3.multiplie(f4);
Fraction div = f3.divise(f4);
System.out.println("f1 = " + f1);
System.out.println("f2 = " +f2);
System.out.println("f3 = " +f3);
System.out.println("f4 = " +f4);
System.out.println("f5 = " +f5);
System.out.println("f3 + f4 = " +plus);
System.out.println("f3-f4 = " +diff);
System.out.println("f3*f4 = " +prod);
System.out.println("f3/f4 = " +div);
}
}