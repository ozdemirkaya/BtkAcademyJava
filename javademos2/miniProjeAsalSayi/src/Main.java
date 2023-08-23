public class Main {
    public static void main(String[] args) {

        int number = 2;
        int remainder = number % 2;
        System.out.println(remainder);

        boolean asalMi=false;


        if (remainder == 0) {
             asalMi = false;

        }else if (number==2){
             asalMi=true;

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
