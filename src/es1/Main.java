package es1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di parole da inserire");
        int numParoleIns = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleUniche = new HashSet<>();
        Set<String> duplicati = new HashSet<>();
        System.out.println("Inserisci " + numParoleIns +" parole");
        for (int i = 0; i < numParoleIns; i++) {
            String word = scanner.nextLine();
            if (!paroleUniche.add(word)) {
                //true se la parola è gia presente nel set
                duplicati.add(word);
            }
        }

        System.out.println("Lista parole duplicate:");
        for (String word : duplicati) {
            System.out.println(word);
        }

        System.out.println("Numero parole non duplicate: " + paroleUniche.size());

        System.out.println("Elenco delle parole non duplicate:");
        for (String word : paroleUniche) {
            System.out.println(word);
        }
    }
}
