package mexbank;


public class TarjetaDebito extends CuentaBase{
    TarjetaDebito(double apertura) {
        super(apertura);
    }
    
    public double retirar(double cantidad) {
        // Resta la cantidad del monto actual
        this.setMontoActual(this.getMontoActual() - cantidad);
        return cantidad;
    }
}
