public class Employe {

    protected String nom;
    protected double salaire;
    public Employe(String nom, double salaire){
        this.nom = nom;
        this.salaire = salaire;
    }
    public String getNom(){
        return this.nom;
    }
    public double getSalaire(){
        return this.salaire;
    }
    public void augmenteSalaire(double pourcentage){
        this.salaire = this.salaire*( pourcentage + 1);
    }
    public static boolean compareSalaire(Employe a,Employe b){

        if(a.salaire==b.salaire)
            return true;
        else
            return false;
    }
    public boolean compareSalaire(Employe b){

        if(this.salaire==b.salaire)
            return true;
        else
            return false;
    }


    @Override
    public String toString() {
        return "Employe (" +"nom='" + nom + '\'' +", salaire=" + salaire +')';
    }
}