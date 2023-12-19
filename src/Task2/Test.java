package Task2;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("В блоке try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("В блоке catch");
        } finally {
            System.out.println("В блоке finally");
        }
    }
    /// проблема с гитом
}
