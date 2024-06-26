public class Test10 {
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;

        int sum = a + b;

        for (int i = 2; i < n; ++i) {
            int next = a + b;
//            System.out.println(" " + next);
            a = b;
            b = next;
            sum += next;
        }
        System.out.println(sum);

    }
}