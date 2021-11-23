public class Personne{
    String nom;
    String prenom;
    int age;
    double poids;
    double taille;

    Personne(){};

    Personne( String n, String pr,int a, double p, double t){
        this.nom =n;
        this.prenom=pr;
        this.age=a;
        this.poids=p;
        this.taille=t;
    }

    public void Afficher(){
        System.out.println("nom : "+ nom +" prenom : " + prenom +" age : "+ age +" poids : "+ poids +" taille : "+ taille);
    }

    @Override

    public String toString(){
       return "nom : "+ nom +" prenom : " + prenom +" age : "+ age +" poids : "+ poids +" taille : "+ taille;
    }}