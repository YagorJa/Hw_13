package Task1;

public class Test {
    public static void main(String[] args) {
        try {
            boolean test = Task1.method("fhRY22 C","yberyb13","yberyb13");
            System.out.println("Все чётко? " + test);
        }catch (WrongLoginException | WrongPasswordException e ){
e.printStackTrace();
        }
    }
}
