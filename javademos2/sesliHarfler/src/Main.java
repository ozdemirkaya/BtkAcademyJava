public class Main {
    public static void main(String[] args) {

        char character = 'E';
        String mesajKalin = "Harf Kalın Seslidir.";
        String mesajInce = "Harf İnce Seslidir";

        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(mesajKalin);
                break;
            default:
                System.out.println(mesajInce);

        }

    }
}