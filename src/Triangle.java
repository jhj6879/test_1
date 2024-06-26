public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {  // 행
            for (int j = 0; j <= i; j++) {   // 열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
