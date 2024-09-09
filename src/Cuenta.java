public class Cuenta {

    private int saldo;

    public Cuenta(int saldoInicial){
        this.saldo = saldoInicial;
    }

    public int getSaldoActual(){
        return saldo;
    }

    public void retiroCuenta(int monto){
        saldo -= monto;
    }

}
