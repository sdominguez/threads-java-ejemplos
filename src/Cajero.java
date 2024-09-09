public class Cajero implements Runnable{

    private Cuenta cuenta;


    public Cajero(int saldoInicial){
        cuenta = new Cuenta(saldoInicial);
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            retirarDinero(10);
            if(cuenta.getSaldoActual()<0){
                System.out.println("Su cuenta tiene saldo negativo");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {}
        }
    }

    private synchronized void  retirarDinero(int valorRetiro){
        if(cuenta.getSaldoActual()>=valorRetiro){
            System.out.println("Saldo actual: "+cuenta.getSaldoActual());
            System.out.println("El usuario "+Thread.currentThread().getName()+
                    " está retirando $"+valorRetiro+" MXN");
            cuenta.retiroCuenta(valorRetiro);
            System.out.println("Retiro existoso");
            System.out.println("El nuevo saldo es: $"+cuenta.getSaldoActual()
                    +" MXN\n");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
