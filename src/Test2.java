public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 0;

        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
