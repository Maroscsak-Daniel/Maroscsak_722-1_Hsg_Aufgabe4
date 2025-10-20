public class EShop {

    public int[] tastatur;
    public int[] usb;
    public int markusBudget = 30;

    public EShop(int[] tastatur,  int[] usb) {
        this.tastatur = tastatur;
        this.usb = usb;
    }

    public int billigsteTastatur() {
        int min = Integer.MAX_VALUE;
        for (int i=0; i < tastatur.length; i++) {
            if  (tastatur[i] < min) {
                min = tastatur[i];
            }
        }
        return min;
    }

    public int teuerstenGegenstand() {
        int max = Integer.MIN_VALUE;
        for (int i=0; i < usb.length; i++) {
            if (usb[i] > max) {
                max = usb[i];
            }
        }
        for  (int i=0; i < tastatur.length; i++) {
            if (tastatur[i] > max) {
                max = tastatur[i];
            }
        }
        return max;
    }

    public int teuersteNachBudget() {
        int max = Integer.MIN_VALUE;
        for (int i=0; i < usb.length; i++) {
            if (usb[i] > max && usb[i] <= markusBudget) {
                max = usb[i];
            }
        }
        return max;
    }

}
