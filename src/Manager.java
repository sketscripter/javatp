public class Manager extends Employe {
    protected double bonus;
    public Manager(String nom, double salaire){
        super(nom,salaire);
    }
    public Manager(String nom, double salaire, double bonus) {
        super(nom, salaire);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalaire() {
        return salaire+bonus;
    }

    @Override
    public String toString() {
        return "Manager (" +"nom=" + nom +", salaire=" + salaire +", bonus=" + bonus +')';
    }
}