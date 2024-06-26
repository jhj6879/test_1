public class Test4 {
    public static void main(String[] args) {
        // 소수를 판단하기 위한 변수 jdg
        boolean jdg = true;
        // 소수의 합계 변수 sum
        int sum = 0;
        // 소수의 갯수를 세는 변수 count
        int count = 0;

        // 1을 제외한 2부터 100 까지의 숫자 반복
        for (int i = 2; i <= 100; i++) {
            // 1과 자기 자신과의 제외한 숫자 반복
            for (int j = 2; j < i; j++) {
                // 소수 판단 처리
                if (i % j == 0) {
                    jdg = false;
                    break;
                }
            }
            // 소수 확인
            if (jdg) {
                count++;
                sum += i;
            }
            // 소수판단 변수 초기화
            jdg = true;
        }
        System.out.println("소수의 갯수 = " + count + "합계는 = " + sum);
    }
}