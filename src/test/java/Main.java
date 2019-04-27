public class Main {
    public static void main(String[] args) {
    /*
    double[] ts =
      {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};

    double result = A.closestToZero(ts);
    int[][] timestable = A.getTimesTable( );
    System.out.println("Result: " + result);
    boolean result = A.isPalindrome("teet");


    String result = A.fileReader("C:\\Users\\Alexandre\\Documents\\Uninstall STAR WARS The Old Republic.log");
    boolean result = A.isPalindrome("letest","testle");
    result = A.isPalindrome("marion","noiram");
    System.out.println(result);

 // This program received 2 arguments. We want to
    // determine if those two strings are equal.

    // Compare the first argument to the second argument
    String str = "Sun microsystems";
    char[] cha = str.toCharArray();
    cha[6] = 'G';

    System.out.println(new String(cha));
    */
        // définition d'un thread de comptage
        Runnable compte = new Runnable() {

            public void run() {

                // chaque thread possède son propre compteur
                SimpleCompteur compteur = new SimpleCompteur();
                for (int i = 0; i < 100; i++) {
                    compteur.compte();
                }
            }
        };

        // on lance 5 threads, qui comptent chacun jusqu'à 100
        Thread[] compteurs = new Thread[5];

        // initialisation des threads
        for (int i = 0; i < compteurs.length; i++) {
            compteurs[i] = new Thread(compte);
        }

        // lancement des threads
        for (int i = 0; i < compteurs.length; i++) {
            compteurs[i].start();
        }

        for (int i = 0; i < compteurs.length; i++) {
            // jette une InterruptedException
            try {
                compteurs[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // vérification de la valeur de compte
        System.out.println("Compteur = " + SimpleCompteur.getCompte());
        Test test = new Test();
    }
}
