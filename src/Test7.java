public class Test7 {
    public static void main(String[] args) {
        float sum = 0;

        for (int i = 1; i <= 50; ++i) {
            sum = sum + (float) i / (i + 1);
        }
        System.out.println(sum);
    }
}
