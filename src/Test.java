class A {
    public String f() { return ("A");}
    public String f(B obj) { return ("A et B");}
    public String f(A obj) { return ("A et A");}
    }
    class B extends A {
    public String f() { return ("B");}
    public String f(B obj) { return ("B et B");}
    public String f(A obj) { return ("B et A");}
    }
    public class Test {
    public static void main (String [] args){
    A a1 = new A();
    A a2 = new B();
    B b = new B();
    System.out.println(a1.f());
    System.out.println(a2.f());
    System.out.println(b.f());
    System.out.println(a1.f(a1));
    System.out.println(a1.f(a2));
    System.out.println(a2.f(a1));
    System.out.println(a2.f(a2));
    System.out.println(a2.f(b));
    System.out.println(b.f(a2));}
    }
    