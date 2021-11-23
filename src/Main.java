import java.util.Scanner;
public class Main{
    public static void main(String [] args ){
        Employe[] personnel = new Employe[5];
        personnel[0] = new Manager("Aribou",50000,3000);
        personnel[1] = new Manager("Moha",30000,2500);
        personnel[2] = new Employe("Gartit",15000);
        personnel[3] = new Employe("Maizou",20000);
        personnel[4] = new Employe("Manolo",10000);
        int i ;
        for(i=0;i<5;i++){
            Scanner str = new Scanner(System.in);
            System.out.println("Veuillez indiquer le taux d'augmentation");
            double taux = 0.5;
            personnel[i].augmenteSalaire(taux);
        }
        double s = 0 ;
        for(i=0;i<5;i++){
            s+=personnel[i].getSalaire();
        }
        System.out.println("Le salaire total est : " +s );
        System.out.println("Le salaire moyen est :" + s/i) ;
        for(i=0;i<5;i++){
            System.out.println(personnel[i].toString()) ;
        }
    }}

