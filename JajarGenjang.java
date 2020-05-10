import java.util.Scanner;

class JajarGenjang {

        public static void main(String [] args){
            Scanner input = new Scanner(System.in);  // Input
            System.out.print("Masukan angka (ganjil) : ");
            JajarGenjang apps = new JajarGenjang();
            int inputAngkaGanjil = Integer.parseInt(input.nextLine());
            if(inputAngkaGanjil%2==0){
                System.out.print("Mohon masukan angka ganjil");
                System.exit(-1);
            }
            int batasKiri = inputAngkaGanjil;
            int batasKanan = inputAngkaGanjil*2;
            for(int x = 1; x<=inputAngkaGanjil;x++){
                for(int y = 1; y<=inputAngkaGanjil*2;y++){
                    if(y > batasKiri && y <= batasKanan){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                batasKiri--;
                batasKanan--;
                System.out.println("");
            }
        }


}