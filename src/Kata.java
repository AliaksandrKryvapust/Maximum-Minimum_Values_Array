import java.util.Arrays;
import java.util.OptionalInt;

public class Kata {
    public static void main(String[] args) {
int [] list = {-52, 56, 30, 29, -54, 0, -110};
        System.out.println(min(list)); // -110
        System.out.println(max(list)); // 56
    }
    public static int min(int[] list) {
        return  Arrays.stream(list).min().getAsInt(); // если есть int он его вернет
    }
    public static int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
