public class CompteBancaire {
    protected double solde;
    protected static int nbCptes=0;
    protected int numCptes;

    public CompteBancaire() {
        nbCptes += 1;
        numCptes=nbCptes;
		this.solde=0;
    }

    public CompteBancaire(double solde) {
        nbCptes += 1;
        this.solde = solde;
        numCptes=nbCptes;

    }
    public void retirer(double montant){
        solde-=montant;
    }
    public void deposer(double montant){
        solde+=montant;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" + "solde=" + solde + " num Compte="+numCptes+"}";
    }
}
class CompteEpargne extends CompteBancaire{
    protected double TauxInteret = 0.06;

    public CompteEpargne(double a) {
        super(a);

    }

    
    public void calculInteret(){
        this.solde *= (this.TauxInteret+1);
    }
	
	@Override
    public String toString(){
        return "CompteEpargne { " + "solde=" + solde + " Taux interet =" + TauxInteret + " num Compte="+numCptes + " } ";}
}
class ComptePayant extends CompteBancaire {
    public ComptePayant(double a){
        super(a);}
		
    public ComptePayant(){
        super(0);}

    public void deposer(double f){
        super.deposer(f);
        super.retirer(5);}

    public void retirer (double r){
        super.retirer(r+5);}

    @Override
    public String toString(){
        return "ComptePayant {" + "solde=" + solde + " num Compte="+numCptes+ '}';}}