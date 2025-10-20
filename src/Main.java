import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EShop gerate = new EShop(new int[] {40, 50, 60}, new int[] {8, 12});
        System.out.println(gerate.billigsteTastatur());
        System.out.println(gerate.teuerstenGegenstand());
        System.out.println(gerate.teuersteNachBudget());
        System.out.println(gerate.maxGeldbetrag());
    }
}