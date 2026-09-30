import java.util.*;

class solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;

        for(int i = 0; i < x; i++) {

            int n = sc.nextInt();

            if(n >= 10 && n % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}