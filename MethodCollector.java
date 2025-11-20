package hsw;

public class MethodCollector {

    /**
     * Die main-Methode ruft alle statischen
     * Methoden nacheinander auf.
     *
     * @param args
     */
    public static void main(String[] args) {
        int methodCounter = 2;
        // Erste Methode
        System.out.println("Method " + methodCounter + ":");
        aFirstMethod();
        methodCounter++;
        henrysMethod();
        // hier kann die nächste Methode folgen.
        System.out.println(subtracNumber(5, 2));
        aAnotherMethod();
        aSecondMethod();
        methodCounter++;
        anotherOne();

        aThirdMethod();
        methodCounter++;

        printTicTacToeBoard();
        methodCounter++;
    }

    private static void aFirstMethod() {
        System.out.println("MethodCollector aFirstMethod: This method has been created     by ");
    }

    private static void anotherOne() {
        System.out.println("MethodCollector anotherOne: This method has been created by Finn ");
    }

    private static int subtracNumber(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static void aAnotherMethod() {
        System.out.println("MethodCollector aAnotherMethod: This method has been created     by henri ");
    }

    private static void aSecondMethod() {
        System.out.println("MethodCollector aSecondMethod: This method has been created     by heisob ");
    }

    private static void aThirdMethod() {
        System.out.println("MethodCollector aThirdMethod: This method has been created     by heisob ");
    }

        System.out.println("MethodCollector aThirdMethod");
    }

    private static void printTicTacToeBoard() {
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
    }

    private static void henrysMethod() {
        System.out.println("Henry hat eine methode erstellt");
    }
}
