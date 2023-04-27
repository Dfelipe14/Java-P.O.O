package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CuentaServicios {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta C1 = new Cuenta();

        System.out.println("Ingresar Su numero de DNI-mostrara su numero de cuenta bancaria");
        C1.setDniCliente(leer.nextLong());

        C1.setNumeroCuenta(ThreadLocalRandom.current().nextInt(10000, 99999));
        System.out.println("Su numero de cuenta es: " + C1.getNumeroCuenta());

        C1.setSaldoActual(0);
        System.out.println("Su saldo Actual es:" + C1.getSaldoActual());
        return C1;

    }

    public void Ingresar(Cuenta Ingreso) {
        double saldo;
        System.out.println("Ingresar Saldo");
        saldo = leer.nextDouble();
        Ingreso.setSaldoActual(saldo + Ingreso.getSaldoActual());
        System.out.println("Su saldo actual es: " + Ingreso.getSaldoActual());
    }

    public void Retirar(Cuenta Retiro) {
        double saldo;
        System.out.println("Ingresar el saldo a Retirar");
        saldo = leer.nextDouble();
        if (saldo > Retiro.getSaldoActual()) {
            System.out.println("Fondos insuficientes se entrego el valor maximo disponible en la cuenta:" + Retiro.getSaldoActual());
            Retiro.setSaldoActual(0);

        } else {
            Retiro.setSaldoActual(Retiro.getSaldoActual() - saldo);

        }
        System.out.println("Su Saldo es de: " + Retiro.getSaldoActual());

    }

    public void extraccionRapida(Cuenta Rapido) {
        double saldo;
        System.out.println("Esta opcion de Extraccion Rapida solo le permitira sacar el 20% de saldo");
        System.out.println("Su saldo actual es de: " + Rapido.getSaldoActual());
        saldo = Rapido.getSaldoActual() * 20 / 100;
        System.out.println("Se le entregara: " + saldo);
        Rapido.setSaldoActual(Rapido.getSaldoActual() - saldo);
        System.out.println("Su saldo quedo en: " + Rapido.getSaldoActual());
    }

    public void consultarSaldo(Cuenta Saldo) {
        System.out.println("Su Saldo Actual es de: " + Saldo.getSaldoActual());
    }

    public void consultarDatos(Cuenta Datos) {
        System.out.println("Datos de la cuenta:");
        System.out.println("Dni del Usuario: " + Datos.getDniCliente());
        System.out.println("Numero de cuenta: " + Datos.getNumeroCuenta());
        System.out.println("Saldo Actual: " + Datos.getSaldoActual());
    }
}
