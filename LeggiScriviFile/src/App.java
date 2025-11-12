import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leggi = new Scanner(System.in);
        System.out.print("Ciao, come ti chiami? ");
        String s = leggi.nextLine();
        System.out.println("Hello, " + s + "!");
    }
}