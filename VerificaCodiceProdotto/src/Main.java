//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java Main <codice prodotto>");
            return;
        }
        for(String codice : args) {
            if(!codice.startsWith("PROD-")) {
                System.out.println("codice non valido perché non comincia con PROD-");
                continue;
            }
            //permette di cominciare dopo Prod-
            String parteNumerica = codice.substring(5);

            if (parteNumerica.matches("\\d{4,}")) {
                System.out.println("codice valido: " + codice);
            } else {
                System.out.println("codice non valido: " + codice);
                System.out.println("Motivo: Il codice deve contenere almeno 4 cifre numeriche dopo 'PROD-'.");
            }
        }



    }
}