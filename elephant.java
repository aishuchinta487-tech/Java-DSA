import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int steps = 0;

        while (x > 0) {
            if (x >= 5) {
                x = x - 5;
            } else {
                x = x - x;
            }

            steps++;
        }

        System.out.println(steps);
    }
}