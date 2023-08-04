import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int result = 1;
        for (;start<end;start++) {
            result *= start;
        }
        System.out.println(result);
    }
}