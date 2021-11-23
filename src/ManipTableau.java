public class ManipTableau {

    public static void afficher (int[] tab, int i) {

        for (int j=i; j < tab.length;j++) {
            System.out.print (tab [j] +" ");
        }

    }

    public static int somme(int[] tab, int i) {
        int s=0;
        for (int j=i ; j< tab.length; j++){

            s+=tab[j];

        }
        return s;

    }

    public static void ajouterUn (int[] tab) {

        int[] u = tab;

        for (int i = 0; i < u.length; i++)

            u[i] = u[i] + 1;

    }

    public static void main (String[] args) {

        int[] t= {1, 2, 3, 4, 5};

        afficher (t, 2);

        ajouterUn (t);

        afficher (t, 1);

        System.out.println(somme(t, 1));

    }

}