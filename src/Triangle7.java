public class Triangle7 {
    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i > 0; i--) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 + i;j++) {
                if (j >= 4 - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 9 - i;j++) {
                if (j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
