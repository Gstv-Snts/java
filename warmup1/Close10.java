package warmup1;

public class Close10 {
    public int close10(int a, int b) {
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        } else if (a - 10 < b - 10) {
            return a;
        } else {
            return b;
        }
    }

}
