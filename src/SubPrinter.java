public class SubPrinter extends Printer {
    int z = 3;

    void printMe() {
        System.out.println("x wynosi " + x + ", y wynosi " + y + ", z wynosi " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();

        Printer printer = new Printer();
        printer.printMe();

        printer = subPrinter;
        printer.printMe();
    }
}
