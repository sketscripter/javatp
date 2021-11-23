public class TestLivre extends Livre{
public static void main(String[] args) {
   Livre L1= new Livre();
   Livre L2= new Livre("Entreprise Java Bean","Richard Monson-Haefel");
   Livre L3= new Livre("Au coeur de java : Fonctions Avancees","Horstman",950);

L1.setAuteur("Horstman");
L1.setTitre("Au coeur de java : Notions Fondamentales");
L1.setNbPages(820);

L2.setNbPages(568);

System.out.println(L1);
System.out.println(L3);
}
}