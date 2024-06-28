import java.util.*;

public class lcmGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(n / 2+" "+n/2);
            } else {
                int min = Integer.MAX_VALUE;
                int st = 1;
                int en = n - 1;
                int[] arr = new int[2];
                while (st < en) {
                    int lcm = (st * en) / gcd(st, en);
                    // System.out.println(lcm);
                    if (lcm < min) {
                        arr[0] = st;
                        arr[1] = en;
                        min = lcm;
                    }
                    st++;
                    en--;
                }
                System.out.println(arr[0]+" "+arr[1]);
                
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
