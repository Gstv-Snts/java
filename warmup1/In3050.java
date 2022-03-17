package warmup1;

public class In3050 {
    public boolean in3050(int a, int b) {
        if ((a < 30 || a > 50) || (b < 30 || b > 50)) {
            return false;
        } else if (a == 40 || b == 40) {
            return true;
        } else if (a >= 30 && a < 40) {
            if (b >= 30 && b < 40) {
                return true;
            } else {
                return false;
            }
        } else if (a >= 40 && a <= 50) {
            if (b >= 40 && b <= 50) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
