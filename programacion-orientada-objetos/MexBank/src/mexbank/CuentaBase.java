package mexbank;


public class CuentaBase {
    private double montoActual;
    
    CuentaBase(double montoActual) {
        this.montoActual = montoActual;
    }
    
    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    
    public double getMontoActual() {
        return this.montoActual;
    }
    
    public void depositar(double cantidad) {
        this.setMontoActual(this.montoActual + cantidad);
    }
}
