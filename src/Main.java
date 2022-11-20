import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String a = "mateusz";
        String hash = DigestUtils.md5Hex(a);
        System.out.println(hash);
    }
}
