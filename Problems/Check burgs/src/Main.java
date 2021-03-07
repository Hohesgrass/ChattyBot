import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String city = data.nextLine();
        if (city.length() >= 4) {
            if (city.substring(city.length() - 4).equals("burg")) {
                System.out.println("true");
            } else
                System.out.println("false");
        } else
        System.out.println("false");
    }
}