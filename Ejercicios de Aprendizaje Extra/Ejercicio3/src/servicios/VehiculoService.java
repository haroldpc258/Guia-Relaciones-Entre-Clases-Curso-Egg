package servicios;


import entidades.Vehiculo;

import java.util.Scanner;

public class VehiculoService {

    public Vehiculo registrarVehiculo(Scanner scanner) {

        System.out.println("\nREGISTRANDO VEHÍCULO.");

        Vehiculo nuevoVehiculo = new Vehiculo();

        System.out.print("Ingrese la marca: ");
        nuevoVehiculo.setMarca(scanner.next());

        System.out.print("Ingrese el modelo: ");
        nuevoVehiculo.setModelo(scanner.next());

        System.out.print("Ingrese el año de fabricación: ");
        nuevoVehiculo.setAnio(scanner.nextInt());

        System.out.print("Ingrese el número de motor: ");
        nuevoVehiculo.setNumeroMotor(scanner.next());

        System.out.print("Ingrese el número de chasis: ");
        nuevoVehiculo.setChasis(scanner.next());

        System.out.print("Ingrese el color: ");
        nuevoVehiculo.setColor(scanner.next());

        System.out.print("Ingrese el tipo: ");
        nuevoVehiculo.setTipo(scanner.next());

        System.out.println("\nSe ha registrado la información correctamente...");

        return nuevoVehiculo;
    }
}
