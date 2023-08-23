public class Main {
    public static void main(String[] args) {

        int number = 0;
        int remainder = number % 2;
        //System.out.println(remainder);

        boolean asalMi=false;
        

        if (number==1){
            System.out.println("Sayı Asal Değildir");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }

        if (number==2){
            asalMi=true;

        }else if
            (remainder == 0) {
                asalMi = false;

        }else {
            asalMi=true;

        }
        if (asalMi==true){
            System.out.println("Sayı Asaldır");
        }else {
            System.out.println("Sayı Asal Değildir");
        }

    }

}
