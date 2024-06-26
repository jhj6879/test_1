public class Test10 {
    public static void main(String[] args) {
//        int n = 10;
//        int a = 1;
//        int b = 1;
//
//        int tot = a + b;
//
//        for (int i = 2; i < n; ++i) {
//            int next = a + b;
//            a = b;
//            b = next;
//            tot += next;
//        }
//        System.out.println(tot);

        int tot = 0;
        int n_2 = 0;
        int n_1 = 0;
        int n = 0;

        // 1+1+2+3+5+8+13+21+34+55 와 같은 순서의 합계 구하기
        for (int i = 0; i < 10; i++) {
            // i 가 0인 경우 n을 1로 변경
            if (i==0) n = 1;
            else n = n_1 + n_2;
            n_2 = n_1;
            n_1 = n;
            tot += n;
        }
        System.out.println("피보나치 수열 합계 = "+tot);
    }
}