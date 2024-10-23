import java.util.Scanner;
import java.io.PrintStream;

public class TextUserInterface implements UserInterface {
    
    private final Scanner scanner;
    private final PrintStream console;

    public TextUserInterface() {
        this.scanner = new Scanner(System. in);
        this.console = System.out;
    }

    @Override
    public int readFirstTerm() {
        
        int firstTerm;
        do {
            console.println("Digite o primeiro termo da PA: ");
            firstTerm = scanner.nextInt();
        } while (firstTerm < 1);
        return firstTerm;
    }

    @Override
    public int readStep() {
        int step;
        do {
            console.println("Digite a razão da PA: ");
            step = scanner.nextInt();
        }  while (step < 1);
        return step;
    }

    @Override
    public int readNumberOfTerms() {
        int numberOfTerms;
        do {
            console.println("Digite o númeoros dos termos da PA: ");
            numberOfTerms = scanner.nextInt();
        } while (numberOfTerms < 2);
        return numberOfTerms;
    }

    @Override
    public void printSequence(int[] sequence) {
        console.println("Sequência gerada: ");
        for (int i = 0; i < sequence.length; i++) {
            console.print(sequence[i] + " ");
        }
    }

    @Override
    public void printSum(int sum) {
        console.println("Soma dos termos da PA: " + sum);
    }

    @Override
    public void printUserOptions() {
        console.println("1 - Criar uma progressão aritmética");
        console.println("2 - Imprimir a sequência");
        console.println("3 - Imprimir um termo específico");
        console.println("4 - Imprimir a soma dos termos");
        console.println("0 - Sair");
    }

    @Override
    public int readUserChoise() {
        console.println("Digite a opção desejada: ");
        return scanner.nextInt();
    }

}
