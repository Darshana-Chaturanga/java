import Generics.Pair;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Hello and welcome!"); // this line is added from remote
        System.out.println("Hello and welcome!"); // this line is added from local and after creating branch
        System.out.println("Hello and welcome!"); // this line for terminal test

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        Pair<String,Integer> obj3 = new Pair<>("Kasun",22);
    }
}
