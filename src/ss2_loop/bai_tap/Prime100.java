package ss2_loop.bai_tap;
public class Prime100 {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (count < 100) {
            int total = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    total++;
                    break;
                }
            }
            if (total == 0) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
