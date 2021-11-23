
public class TestBanque extends CompteBancaire {
public static void main(String[] args) {
    CompteBancaire cp1 = new CompteBancaire();
    CompteEpargne cp2 = new CompteEpargne(5);
    ComptePayant cp3 = new ComptePayant();
    cp1.deposer(50);
    cp2.deposer(50);
    cp3.deposer(50);
    cp1.retirer(20);
    cp2.retirer(20);
    cp3.retirer(20);
    cp2.calculInteret();
    System.out.println(cp1);
    System.out.println(cp2);
    System.out.println(cp3);
}
}