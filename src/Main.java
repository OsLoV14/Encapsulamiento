public class Main {

    public static void main(String[] args) {

        // Crear instancia de la clase CuentaBancaria
        CuentaBancaria cuentaDebito = new CuentaBancaria("Oscar Lozada", 2500);

        // Retirar
        cuentaDebito.retiro(500);

        // Depositar
        cuentaDebito.deposito(5000);

        // Retirar
        cuentaDebito.retiro(2000);

        // Imprimir el nombre del propietario
        // Imprimir el saldo final del propietario
        System.out.println("Nombre del propietario: " + cuentaDebito.getNombrePropietario());
        System.out.println("Saldo final en la cuenta: $ " + cuentaDebito.getSaldoCuenta());
    }
}