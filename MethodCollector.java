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
        // hier kann die nächste Methode folgen.
        System.out.println(subtracNumber(5,2));
    }


    private static void aFirstMethod() {
        System.out.println("MethodCollector aFirstMethod: This method has been created     by ");
    }

    private static int subtracNumber(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

}
