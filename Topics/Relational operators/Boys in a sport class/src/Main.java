import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();
        System.out.println(heightOrder(boy1, boy2, boy3));
    }

    private static boolean heightOrder(int a, int b, int c) {
        return (a >= b && b >= c) || (a <= b && b <= c);
    }
}