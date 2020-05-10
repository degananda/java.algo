import java.util.Arrays;

public class BalikArray {

    public static void main(String [] args){
        BalikArray apps = new BalikArray();
        int [] angkaArray = {19,22,3,28,26,17,18,4,28,0};
        System.out.println("Input : " + Arrays.toString(angkaArray));
        int[] hasilArrayKebalik = apps.balikArray(angkaArray);
        System.out.println("Output : " + Arrays.toString(hasilArrayKebalik));
    }

    private int[] balikArray (int[] angkaArray) {
        int [] arrayKebalik = new int[angkaArray.length];
        int indexKebalik = 0;
        for(int i =(angkaArray.length-1); i>=0;i--){
            arrayKebalik[indexKebalik++] = angkaArray[i];
        }
        return arrayKebalik;
    }

}