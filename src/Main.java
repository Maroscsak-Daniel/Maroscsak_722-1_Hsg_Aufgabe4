import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EShop gerate = new EShop(new int[] {15, 20, 10, 35}, new int[] {20, 15, 40, 15});
        System.out.println(gerate.billigsteTastatur());
        System.out.println(gerate.teuerstenGegenstand());
        System.out.println(gerate.teuersteNachBudget());
    }
}