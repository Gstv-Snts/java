package warmup1;

public class Front22 {
    public String front22(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str + str + str;
        } else {

            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

}
