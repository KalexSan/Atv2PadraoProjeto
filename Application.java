public class Application {

    private ArithmeticProgression arithmeticProgression = null;
    private UserInterface userInterface = null;

    public Application(UserInterface userInterface) {
        super();
        this.userInterface = userInterface;
        this.arithmeticProgression = new ArithmeticProgression(0, 1);

    }

    private void doUseChoice(int userChoice) {
        switch (userChoice){
            case 1 : {
                doCreateArithmeticProgression();
                break;
            }
            case 2 : {
                doPrintSequence();
                break;
            }
            case 3 : {
                doPrintSpecifiedTerm();
                break;
            }
            case 4 : {
                doPrintSum();
                break;
            }
        }
    }

    private void doPrintSum() {
        int numberOfTerms = userInterface.readNumberOfTerms();
        int sum = 0;
        for (int i = 0; i < numberOfTerms; i++) {
            sum += arithmeticProgression.termOfIndex(i);
        }
        userInterface.printSum(sum);
    }

    private void doPrintSpecifiedTerm() {
        int index = userInterface.readFirstTerm();
        int term = arithmeticProgression.termOfIndex(index);
        userInterface.printSequence(new int[] {term});
    }

    private void doPrintSequence() {
        userInterface.printSequence(arithmeticProgression.generatedSequence(userInterface.readNumberOfTerms()));

    }

    private void doCreateArithmeticProgression() {
        int firstTerm = userInterface.readFirstTerm();
        int step = userInterface.readStep();
        arithmeticProgression = new ArithmeticProgression(firstTerm, step);
    }

    public void rum() {
        int userChoice = 0;

        do {
            userInterface.printUserOptions();
            userChoice = userInterface.readUserChoise();
            doUseChoice(userChoice);
        } while (userChoice != 0);

    }
    
    public static void main(String[] args) {
        UserInterface userInterface = new TextUserInterface();
        Application app = new Application(userInterface);
        app.rum();
    }
}
