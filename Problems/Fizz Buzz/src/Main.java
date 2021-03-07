import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int first = data.nextInt();
        int second = data.nextInt();
        for (int i = first; i <= second; i++){
            if ((i % 3) == 0 && (i % 5) == 0){
                System.out.println("FizzBuzz");
            } else if ((i % 5) == 0 && (i % 3) != 0){
                System.out.println("Buzz");
            } else if ((i % 3) == 0 && (i % 5) != 0){
                System.out.println("Fizz");
            } else
                System.out.println(i);

        }
    }
}
