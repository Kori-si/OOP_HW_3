package Z_2;

public class Program {
    public static void main(String[] args) {

        NewCollection col1 = new NewCollection();
        NewCollection col2 = new NewCollection();

        col1.addCollection("It seems");
        col1.addCollection("like a List");
        col1.addCollection("in Python");
        col1.addCollection(123);


        col2.addCollection("WTF");
        col2.addCollection("?");
        col2.addCollection(3.21);


        for(Object item : col1) {
            System.out.println("item " + item);
        }

        System.out.println("\n<<< >>>\n");

        for(Object item : col2) {
            System.out.println("?! " + item);
        }
    }
}
