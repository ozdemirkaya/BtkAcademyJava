public class Main {
    public static void main(String[] args) {
        //for

        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        //While
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i +=2;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While (şart sağlanmasada 1 kez ekrana yazdırır)
        int j=200;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}