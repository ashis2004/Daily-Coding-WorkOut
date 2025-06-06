class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        return powHelper(x, n);
    }
    
    private double powHelper(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double temp = powHelper(x, n / 2);
        
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}
