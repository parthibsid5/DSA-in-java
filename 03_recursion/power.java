
public class power {
    // This approach has stack height of n i.e power.
    public static int cal_power1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpow1 = cal_power1(x, n - 1);
        int xpow = x * xpow1;
        return xpow;
    }

    // This approach has stack height of Log(n).
    public static int cal_power2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            // int newpow=n/2;
            int nxpow1 = cal_power2(x, n / 2) * cal_power2(x, n / 2);
            return nxpow1;
            
            
        }
        else{
            int nxpow1 = cal_power2(x, n / 2) * cal_power2(x, n / 2) *x;
            return nxpow1;
        }

    }


    public static void main(String args[]) {
        int res1 = cal_power1(2, 4);
        int res2 = cal_power1(2, 4);

        System.out.println(res1);
        System.out.println(res2);

    }
}
