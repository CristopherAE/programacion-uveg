package mexbank;


public class MexBank {

    public static void main(String[] args) {
        System.out.println("Tarjeta de débito.");
        // Se abre una cuenta de debito con un monto inicial de 1,000 pesos
        TarjetaDebito cuentaDebito = new TarjetaDebito(1000);
        System.out.println("Monto inicial: " + cuentaDebito.getMontoActual());
        // Se depositan 5,000 pesos a la cuenta de la tarjeta de débito
        double depositoDebito = 5000;
        cuentaDebito.depositar(depositoDebito);
        System.out.println("Depósito: " + depositoDebito);
        System.out.println("Monto actual: " + cuentaDebito.getMontoActual());
        
        System.out.println();
        
        System.out.println("Tarjeta de crédito.");
        // Se abre una cuenta de crédito con una deuda inicial de 2,000 pesos
        TarjetaCredito cuentaCredito = new TarjetaCredito(2000);
        System.out.println("Deuda incial: " + cuentaCredito.getMontoActual());
        // Pasa un mes y la deuda aumenta en 15%
        cuentaCredito.sumaInteres(0);
        System.out.println("Deuda tras el primer mes: " + cuentaCredito.getMontoActual());
        
        System.out.println();
        
        System.out.println("Tarjeta de débito.");
        System.out.println("Monto actual: " + cuentaDebito.getMontoActual());
        // Se retiran 3,000 pesos de la tarjeta de débito
        double primerRetiro = cuentaDebito.retirar(3000);
        System.out.println("Retirar: " + primerRetiro);
        System.out.println("Monto actual: " + cuentaDebito.getMontoActual());
        
        System.out.println();
        // Se usan los 3,000 pesos retirados para pagar parte de la deuda
        // e iniciar una cuenta de ahorro
        System.out.println("Tarjeta de crédito.");
        System.out.println("Deuda actual: " + cuentaCredito.getMontoActual());
        
        double depositoCredito = 2000;
        primerRetiro -= depositoCredito;
        double inicioCuentaAhorro = primerRetiro;
        
        cuentaCredito.depositar(depositoCredito);
        System.out.println("Depósito: " + depositoCredito);
        System.out.println("Deuda actual: " + cuentaCredito.getMontoActual());
        System.out.println();
        // Se abre una cuenta de ahorro con 1,000 pesos iniciales
        System.out.println("Cuenta de ahorro.");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(inicioCuentaAhorro);
        System.out.println("Ahorro inicial: " + cuentaAhorro.getMontoActual());
        // Se deja pasar un mes y la cuenta de ahorro aumenta en un 10%.
        cuentaAhorro.invertir(0);
        System.out.println("Ahorro tras un mes de inversión: " + cuentaAhorro.getMontoActual());
        // Asimismo, la deuda de la tarjeta de crédito también aumenta durante este mes
        System.out.println();
        System.out.println("Tarjeta de crédito.");
        System.out.println("Deuda actual: " + cuentaCredito.getMontoActual());
        cuentaCredito.sumaInteres(0);
        System.out.println("Deuda tras pasar otro mes: " + cuentaCredito.getMontoActual());
        
        // Se retiran otros 500 pesos de la tarjeta de débito y se depositan en
        // la cuenta de ahorro
        System.out.println();
        System.out.println("Tarjeta de débito.");
        System.out.println("Monto actual: " + cuentaDebito.getMontoActual());
        double segundoRetiro = cuentaDebito.retirar(500);
        System.out.println("Retiro: " + segundoRetiro);
        System.out.println("Monto actual: " + cuentaDebito.getMontoActual());
        System.out.println();
        System.out.println("Cuenta de ahorro.");
        System.out.println("Ahorro actual: " + cuentaAhorro.getMontoActual());
        cuentaAhorro.depositar(segundoRetiro);
        System.out.println("Depósito: " + segundoRetiro);
        System.out.println("Ahorro actual: " + cuentaAhorro.getMontoActual());
        
        // Estado final de las cuentas tras las transacciones
        System.out.println();
        System.out.println("Estado final de las cuentas.");
        System.out.println("Tarjeta de débito: " + cuentaDebito.getMontoActual());
        System.out.println("Tarjeta de crédito: " + cuentaCredito.getMontoActual());
        System.out.println("Cuenta de ahorro: " + cuentaAhorro.getMontoActual());
    }
    
}
