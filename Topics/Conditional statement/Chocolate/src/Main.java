import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if(solution(N, M, K)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean solution(int a, int b, int c) {
        if(c % a == 0 || c % b == 0){
            return a * b >= c;
        }
        else{
            return false;
        }
    }
}