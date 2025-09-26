public class Main {
    public static void main(String[] args) {
        int[] voti = {1, 10, 3, 12, 8, 6};
        int somma = 0;
        int validi = 0;

        for (int i = 0; i < voti.length; i++) { // = di troppo perché piu valori che array
            if (voti[i] >= 0 && voti[i] <= 10) {
                somma += voti[i];
                validi++;
            } else {
                System.out.println("Voto non valido: " + voti[i]);
            }
        }
        try {
            double media = somma / validi;
        } catch (ArithmeticException e) {
            validi = 1;
            System.out.println("ArithmeticException: 0/0 non si puo fare");
        }
        double media = somma / validi;
        System.out.println("Media voti validi: " + media);
    }
}