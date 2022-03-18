package warmup1;

public class EveryNth {

    public String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i = i + n) {
            s = s + str.substring(i, i + 1);
        }
        return s;
    }

}
