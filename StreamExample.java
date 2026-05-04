import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamExample {
    public static void main(String[] args) throws Exception {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your name:");

        String name = br.readLine();

        System.out.println("Hello " + name);
    }
}
