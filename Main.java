public class Main {
    public static void main(String[] args) {
        int b = 5;
        int sum = 0;

        for (int i = 0; i <= b; i++) {
            if (i >= b) {
                System.out.println("sum равно = " + sum);
            }
            else {
                sum += i;
            }
        }
    }
}
