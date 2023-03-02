public class CuentaBancaria {
    // Datos privados
    // Atributos de una cuenta bancaria de una tarjeta de débito
    private String nombrePropietario;
    private double saldoCuenta;

    // Constructor
    public CuentaBancaria(String nombrePropietario, double saldoInicial) {
        this.nombrePropietario = nombrePropietario;
        this.saldoCuenta = saldoInicial;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    // Método para retirar dinero
    public double retiro(double cantidadRetiro) {
        if(cantidadRetiro <= this.saldoCuenta) {
            this.saldoCuenta = this.saldoCuenta - cantidadRetiro;
            return cantidadRetiro;
        }
        return 0;
    }

    // Método para representar un depósito
    public double deposito(double cantidadDeposito) {
        this.saldoCuenta = this.saldoCuenta + cantidadDeposito;
        return cantidadDeposito;
    }
}
