package TpArticle;

public class Article {
       private int id;
       private String designation;
       private static int nbArticles=0;
       private double prixUnitaire;
       private int qte;

        public Article(String designation, double prixUnitaire, int qte) {
                nbArticles++;
                this.id = nbArticles;
                this.designation = designation;
                this.prixUnitaire = prixUnitaire;
                this.qte = qte;
        }

        public Article(String designation, double prixUnitaire) {
             this(designation,prixUnitaire,0);
        }

        public Article() {
                nbArticles++;
                this.id=nbArticles;
                }

public static void main(String[] args) {
       Article A1 = new Article("article 1", 9999);
       System.out.println(A1.designation);

}}