import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = 0;
        int max = 0;
        while (data.hasNextInt()){
            a = data.nextInt();
            if ((a % 4) == 0 && a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}