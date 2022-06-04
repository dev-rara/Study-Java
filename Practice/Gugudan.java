public class Gugudan {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%02d", j);
                System.out.print(" x ");
                System.out.printf("%02d", i);
                System.out.print(" = ");
                System.out.printf("%02d", i * j);
                System.out.print("\t");

// String.format 함수를 이용하면 아래와 같이 구현가능
// System.out.print(String.format("%02d", j) + " x " + String.format("%02d", i) + " = " + String.format("%02d", i * j) + "\t");

            }
            System.out.println();
        }
    }
}
