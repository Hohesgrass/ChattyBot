import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String name = data.next();
        int first = data.nextInt();
        int second = data.nextInt();
        System.out.println(name.substring(first, second + 1));
    }
}
