public class Principal {

    public static void main(String[] args) throws InterruptedException{
        Thread p1 = new Thread(new Subproceso(), "p1");
        p1.start();
        synchronized (p1){
            p1.wait();
        }
        System.out.println("La espera ha finalizado");
    }
}
