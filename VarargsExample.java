public class VarargsExample {
    
    static void printSum(int... values) {
        int total = 0;

        for (int x : values) {
            total += x;
        }
        System.out.println("The sum is: " + total);
    }

    public static void main(String args[]) {
        printSum(10, 20);
        printSum(1, 2, 3, 4);
        printSum();
    }
}
