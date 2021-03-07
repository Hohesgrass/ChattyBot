import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = data.nextInt();
        System.out.print(a + " ");
        while (a != 1) {
            if (a % 2 == 0){
                a = a / 2;
                System.out.print(a + " ");
            } else if (a % 2 != 0){
                a = (a * 3) + 1;
                System.out.print(a + " ");
            }
        }
    }
}