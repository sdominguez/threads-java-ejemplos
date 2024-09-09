import java.io.IOException;

public class Subproceso implements Runnable{

    @Override
    public void run() {
        System.out.println("Pulse \"ENTER\" para continuar...");

        try {
            System.in.read();
        }catch(IOException ex){}

        synchronized (this){
            this.notifyAll();
        }
    }
}
