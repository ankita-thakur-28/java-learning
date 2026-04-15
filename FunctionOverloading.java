public class FunctionOverloading {

    static void display(String text) {
        System.out.println("Message: " + text);
    }

    static void display(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String args[]) {
        display("hello");
        display("have a good day", 3);
    }
}
