package mexbank;


public class TarjetaCredito extends CuentaBase{
    TarjetaCredito(double apertura) {
        // La tarjeta de crédito tiene saldo negativo
        super(-apertura);
    }
    
    public void sumaInteres(double cantidad) {
        double interesActual = this.getMontoActual() * 0.15;
        // Aumento del 15% a la deuda actual
        this.setMontoActual(this.getMontoActual() + interesActual);
    }
}
