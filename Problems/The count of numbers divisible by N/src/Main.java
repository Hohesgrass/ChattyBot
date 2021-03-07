import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = data.nextInt();
        int b = data.nextInt();
        int n = data.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++){
            if ((i % n) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}