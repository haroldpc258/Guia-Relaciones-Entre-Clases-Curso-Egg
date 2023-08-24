package servicios;

import entidades.Couta;
import entidades.Poliza;

import java.util.Scanner;

public class PolizaService {

    private int id = 1;

    public Poliza crearPoliza(Scanner scanner) {

        System.out.println("\nCREANDO PÓLIZA.");

        System.out.print("Ingrese la forma de pago: ");
        String formaPago = scanner.next();

        System.out.print("Ingrese el monto a asegurar: ");
        double montoAsegurar = scanner.nextDouble();

        System.out.print("Ingrese el número de coutas: ");
        int cuotas = scanner.nextInt();

        System.out.print("Ingrese el tipo de cobertura: ");
        String tipoCobertura = scanner.next();

        System.out.print("¿Desea que la póliza incluya seguro por granizo? (S/N): ");

        Poliza poliza;
        if (scanner.next().equalsIgnoreCase("s")) {
            System.out.print("Ingrese el monto máximo a asegurar por granizo: ");
            double montoMaximoGranizo = scanner.nextDouble();
            poliza = new Poliza(id, cuotas, formaPago, montoAsegurar, true, montoMaximoGranizo, tipoCobertura);
        } else {
            poliza = new Poliza(id, cuotas, formaPago, montoAsegurar, tipoCobertura);
        }

        ajustarCuotas(poliza);
        id++;
        System.out.println("\nSe ha creado exitosamente la póliza...");

        return poliza;
    }

    private void ajustarCuotas(Poliza poliza) {

        Couta[] cuotas = poliza.getCuotas();
        for (int i = 0; i < cuotas.length; i++) {
            cuotas[i] = new Couta((i + 1), poliza.getValor()/cuotas.length, poliza.getFechaInicio().plusMonths(i + 1), poliza.getFormaPago());
        }
    }
}
