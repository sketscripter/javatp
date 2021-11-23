
public class Fraction {
    private int num;
    private int den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public Fraction(int n, int d) {
        this.num = n;
        this.den = d;

    }

    public Fraction(int n) {
        this.num = n;
        this.den = 1;
    }

    public Fraction( String s) {
        int pos = s.indexOf('/');
        String s1 = s.substring(0, pos);
        String s2 = s.substring(pos+1);
        this.num = Integer.parseInt(s1);
        this.den = Integer.parseInt(s2);
    }



    public static int ppcm(int a, int b) {
        return a * b / pgcd(a, b);
    }

    public static int pgcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return pgcd(b, a % b);
    }

    @Override
    public String toString() {
        return num +"/"+den;
    }

    public Fraction reduire() {
        int d = pgcd(num, den);
        return new Fraction(num / d, den / d);
    }

    public Fraction plus(Fraction f) {
        Fraction res = new Fraction(num * f.den + f.num * den, den * f.den);
        return res.reduire();
    }

    public Fraction moins(Fraction f) {
        Fraction res = new Fraction(num * f.den - f.num * den, den * f.den);
        return res.reduire();
    }

    public Fraction multiplie(Fraction f) {
        Fraction res = new Fraction(num * f.num, den * f.den);
        return res.reduire();
    }

    public Fraction divise(Fraction f) {
        Fraction res = new Fraction(num * f.den, den * f.num);
        return res.reduire();
    }

    public static Boolean equals(Fraction f1, Fraction f2) {
        return (f1.num * f2.den == f1.den * f2.num);
    }

    public Boolean equals(Fraction f) {
        return (num * f.den == den * f.num);
    }

    public int compareTo(Fraction f){
        int res = 0;
        if (num/den < f.num/f.den)
            res = -1;
        else if (num*f.den == den*f.num)
            res = 0;
        else
            res = 1;
        return res;
    }
    public static int compareTo(Fraction f1,Fraction f2){
        int res = 0;
        if(f1.num/f1.num < f2.num/f2.den)
            res = -1;
        else if (f1.num*f2.den == f1.den*f2.num)
            res = 0;
        else
            res = 1;
        return res;
    }

    Fraction valueOf(String s){
        int pos = s.indexOf('/');
        String s1 = s.substring(0, pos);
        String s2 = s.substring(pos+1);
        int num = Integer.parseInt(s1);
        int den = Integer.parseInt(s2);
        return new Fraction(num,den);
    }
    }

