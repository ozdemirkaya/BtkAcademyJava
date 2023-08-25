public class Main {
    public static void main(String[] args) {

        int number = 6;
        int toplam = 0;
        String mesaj = "Sayı Mükemmeldir.";
        String mesaj2 = "Sayı Mükemmel Değildir.";

        if (number == 0) {
            System.out.println(mesaj2);
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = i + toplam;
                //System.out.println(toplam); (nasıl çalıstığını anlamak için için)
            }
        }

        if (toplam == number) {
            System.out.println(mesaj);
        } else {
            System.out.println(mesaj2);
        }

    }
}