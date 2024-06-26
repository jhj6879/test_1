public class Triangle2 {
    public static void main(String[] args) {
//        for (int i = 5; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 5; i++) {  // 행
            for (int j = 4-i; j >= 0; j--) {   // 열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
