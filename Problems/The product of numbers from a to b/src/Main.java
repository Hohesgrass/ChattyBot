import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        long a = data.nextInt();
        long b = data.nextInt();
        long sum = 1;
        for (long i = a; i < b; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}