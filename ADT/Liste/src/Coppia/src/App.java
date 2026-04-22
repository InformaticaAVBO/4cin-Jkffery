public class App {
    public static void main(String[] args) throws Exception {
        Coppia<Integer, String> c1 = new Coppia(27, "rty");
        Coppia<Double, Character> c2 = new Coppia(27.5, 'a');
        System.out.println(c1);
        System.out.println(c2);
    }
}