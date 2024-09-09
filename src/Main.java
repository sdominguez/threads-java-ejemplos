public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero(75);

        Thread us1 = new Thread(cajero,"Eduardo");
        Thread us2 = new Thread(cajero,"Liam");
        Thread us3 = new Thread(cajero,"Edmundo");

        us1.start();
        us2.start();
        us3.start();
    }
}
