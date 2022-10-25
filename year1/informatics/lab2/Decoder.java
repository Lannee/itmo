public class Decoder {
    public static void main(String[] args) {

        try{
            byte[] byteArray = Decoder.toByteArr(args[0]);
            Decoder.findMistake(byteArray);

        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("You must enter a message!");
        }
        catch(IllegalArgumentException e) {
            System.out.print("Number is not binary!");
        }
        catch(IndexOutOfBoundsException e) {
            System.out.print("Incorrect argument length!");
        }
    }

    private static void findMistake(byte[] arr) {

        int sumsAmount = (int)(Math.log10(arr.length + 1)/Math.log10(2));
        byte[] sums = new byte[sumsAmount];

        for(int i = 0; i < sumsAmount; i++) { sums[i] = 0; }

        int width;

        for(int i = 0; i < sumsAmount; i++) {

            width = (int)Math.pow(2, sumsAmount - i - 1);  

            for(int j = width - 1; j < arr.length; j += width * 2) {

                for(int h = 0; h < width; h++) {

                    sums[i] ^= arr[j + h];
                }
            }
        }

        int orderOfMistake = Decoder.binToDec(sums);

        if(orderOfMistake == 0) {
            System.out.println("There are no mistakes in transmitted message.");
        }
        else {
            arr[orderOfMistake - 1] ^= 1;
            System.out.println("There is a mistake in bit number " + orderOfMistake + ".");
        }

        byte[] informationBits = Decoder.getInformationBits(arr);
        
        System.out.print("Information bits are: ");
        for(byte bit : informationBits) {
            System.out.print(bit);
        }
    } 
    
    private static byte[] toByteArr(String str) {

        if((Math.log10(str.length() + 1) / Math.log10(2)) % 1 != 0.0) {
            throw new IndexOutOfBoundsException();
        }
        
        String[] strArr = str.split("");
        byte[] arr = new byte[str.length()];


        for(int i = 0; i < str.length(); i++){

            byte number = Byte.parseByte(strArr[i]);

            if(!(number == 0 || number == 1)) {
                throw new IllegalArgumentException();
            }

            arr[i] = number;
        }
        return arr;
    }

    private static byte[] getInformationBits(byte[] arr) {

        byte[] result = new byte[arr.length - (int)(Math.log10(arr.length + 1) / Math.log10(2))];

        int order = 0;
        for(int i = 0; i < arr.length; i++) {
            if((Math.log10(i + 1) / Math.log10(2)) % 1 != 0.0) {
                result[order++] = arr[i];
            }
        }

        return result;
    }

    private static int binToDec(byte[] arr) {

        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += (double)Math.pow(2, i) * arr[arr.length - i - 1];
        }

        return result;
    }
}