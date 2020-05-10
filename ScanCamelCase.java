import java.util.Scanner;
public class ScanCamelCase {

    private int totalUpperCase = 1;

    public static void main(String [] args){
        /*
            Task : Hitung jumlah kata pada kalimat camelCase.
        */
        Scanner input = new Scanner(System.in);  // Input
        System.out.print("Masukan Kalimat : ");
        ScanCamelCase apps = new ScanCamelCase();
        String inputKalimat = input.nextLine();
        String camelCasePattern = "([a-z]+[A-Z]+\\w+)+"; 
        if(!inputKalimat.matches(camelCasePattern)){
            System.out.println("Input salah. Harus camelCase");
            System.exit(-1);
        }
        int panjangKalimat = inputKalimat.length();
        for(int i =0;i<panjangKalimat;i++){
            char currentChar = inputKalimat.charAt(i);
            apps.isCamelCase(currentChar);
        }
        System.out.println("Output : " + apps.totalUpperCase);
    }

    private void isCamelCase(char huruf){
        if(Character.isUpperCase(huruf)){
            totalUpperCase++;
        }
    }

}