package ss2_loop.bai_tap;
public class PrimeTo100 {
    public static void main(String[] args) {
        int n = 2;
        while (n <100) {
            int total = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    total++;
                    break;
                }
            }
            if (total == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
