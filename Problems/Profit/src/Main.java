import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner data =  new Scanner(System.in);
        double M = data.nextDouble();
        double P = data.nextDouble() / 100;
        double K = data.nextDouble();
        int years = 0;
        if (M != K) {
            do {
                years++;
                M = M + M * P;
                if (M == K)
                    break;
            }
            while (M <= K);
            System.out.println(years);
        } else
            System.out.println(years);
    }
}