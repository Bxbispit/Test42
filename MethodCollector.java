package hsw;

public class MethodCollector {

    /**
     * Die main-Methode ruft alle statischen
     * Methoden nacheinander auf.
     *
     * @param args
     */
    public static void main(String[] args) {
        int methodCounter = 1;
        // Erste Methode
        System.out.println("Method " + methodCounter + ":");
        aFirstMethod();
        methodCounter++;
        henrysMethod();
        // hier kann die nächste Methode folgen.
        aAnotherMethod();
        aSecondMethod();
        methodCounter++;

        printTicTacToeBoard();
        methodCounter++;
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector aFirstMethod: This method has been created     by ");
    }

    private static void aAnotherMethod() {
        System.out.println("MethodCollector aAnotherMethod: This method has been created     by henri ");
    }
    private static void aSecondMethod() {
        System.out.println("MethodCollector aSecondMethod: This method has been created     by heisob ");
    }

    private static void printTicTacToeBoard() {
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
    private static void henrysMethod() {
        System.out.println("Henry hat eine methode erstellt");
    }

}
