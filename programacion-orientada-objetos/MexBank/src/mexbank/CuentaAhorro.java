package mexbank;


public class CuentaAhorro extends CuentaBase {
    CuentaAhorro(double apertura) {
        super(apertura);
    }
    
    public void invertir(double cantidad) {
        double inversionActual = this.getMontoActual() * 0.1;
        // Aumento del 10% al monto actual
        this.setMontoActual(this.getMontoActual() + inversionActual);
    }
}
