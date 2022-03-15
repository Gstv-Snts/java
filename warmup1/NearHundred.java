package warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        } else {
            return false;
        }
    }
}
