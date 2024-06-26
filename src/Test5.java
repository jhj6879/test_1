public class Test5 {
    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 1; i <= 100; ++i) {
//            if (i % 2 == 0) {
//                sum += i;
//            } else {
//                sum -= i;
//            }
//        }
//        System.out.println(sum);

        int tot = 0;
        int m = -1;

        // 1+2-3+4-5+...-99+100 순서로 연산하는 프로그램
        for (int i = 1; i <= 100; i++) {
            if (i == 2)m=-1;
            tot += i * (m *= -1);
        }
        System.out.println("Tot = " + tot);
    }
}