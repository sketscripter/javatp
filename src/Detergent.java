public class Detergent extends Cleanser {
        // Change une méthode:
        public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Appel de la version de   la classe de base
        }
        // Ajoute une méthode à l'interface:
        public void foam() { append(" foam()"); }
        // Test de la nouvelle classe:
        public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.print();
        System.out.println("Testing base class:");
        Cleanser.main(args);
        }
        }    