
public class Code{
    public static void main(String args[]){

        // №1
        final int BOTTOM_NUMBER = 2;
        final int TOP_NUMBER = 18;

        short a[] = new short[(TOP_NUMBER - BOTTOM_NUMBER) / 2 + 1];
        for(int i = BOTTOM_NUMBER; i <= TOP_NUMBER; i += 2){
            a[i/2 - 1] = (short)(TOP_NUMBER + 2 - i);
        }

        // №2
        final int RANGE_BOTTOM = -15;
        final int RANGE_TOP = 14;

        float x[] = new float[20];
        for(int i = 0; i < 20; i++){
                x[i] = (float)(Math.random()*(RANGE_TOP-RANGE_BOTTOM) + RANGE_BOTTOM);
        }

        // №3
        double b[][] = new double[9][20];

        for(int i = 0; i < 9; i++){
            if(a[i] == 4){
                for(int j = 0; j < 20; j++){
                    b[i][j] = Math.cos(Math.asin(Math.pow((x[j] - 0.5) / 29, 2)));
                }
            }
            else if(a[i] == 2 || a[i] == 6 || a[i] == 12 || a[i] == 16){
                for(int j = 0; j < 20; j++){
                    b[i][j] = Math.asin(Math.pow((x[j] - 0.5) / 29, 2));
                }
            }
            else{
                for(int j = 0; j < 20; j++){
                    b[i][j] = Math.pow(2 * (Math.atan(Math.sin(Math.pow(Math.E, Math.cos(x[j]))))) / 3 - 1,3);
                }
            }
        }

        for(int i = 0; i < 9; i++){
            System.out.printf("%d)", i);
            for(int j = 0; j < 20; j++){
                System.out.printf("%.5f ", b[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
