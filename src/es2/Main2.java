package es2;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di n casuali da generare:");
        int numInserito = scanner.nextInt();

        List<Integer> listaCasuale = new ArrayList<>();
        generaListaCasuale(listaCasuale, numInserito);

        List<Integer> listaInvertita = new ArrayList<>(listaCasuale);
        creaListaInvertita(listaInvertita);
    }

    public static void generaListaCasuale(List<Integer> listaCasuale, int numInserito) {
        Random random = new Random();

        for (int i = 0; i < numInserito; i++) {
            listaCasuale.add(random.nextInt(101));
        }
        System.out.println("Lista casuale non ordinata: " + listaCasuale);
        Collections.sort(listaCasuale);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

    }

    public static void creaListaInvertita(List<Integer> listaInvertita) {
        Collections.reverse(listaInvertita);
        listaInvertita.addAll(new ArrayList<>(listaInvertita));
        System.out.println("Lista con elementi invertiti: " + listaInvertita);
    }



}
