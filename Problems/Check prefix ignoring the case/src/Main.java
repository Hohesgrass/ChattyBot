import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String name = data.nextLine();
        if (name.charAt(0) == 'J' || name.charAt(0) == 'j'){
            System.out.println("true");
        } else
            System.out.println("false");
    }
}