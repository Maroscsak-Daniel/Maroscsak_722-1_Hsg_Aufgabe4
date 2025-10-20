public class EShop {

    public int[] tastatur;

    public EShop(int[] tastatur) {
        this.tastatur = tastatur;
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

}
