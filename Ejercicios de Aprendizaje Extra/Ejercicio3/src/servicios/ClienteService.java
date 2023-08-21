package servicios;

import entidades.Cliente;
import entidades.Vehiculo;

import java.util.Scanner;

public class ClienteService {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Cliente registrarCliente() {

        System.out.println("\nREGISTRANDO CLIENTE.");

        Cliente nuevoCliente = new Cliente();

        System.out.print("Ingrese el nombre: ");
        nuevoCliente.setNombre(scanner.next());

        System.out.print("Ingrese el apellido: ");
        nuevoCliente.setApellido(scanner.next());

        System.out.print("Ingrese el documento: ");
        nuevoCliente.setDocumento(scanner.nextInt());

        System.out.print("Ingrese el correo electrónico: ");
        nuevoCliente.setMail(scanner.next());

        System.out.print("Ingrese el domicilio: ");
        nuevoCliente.setDomicilio(scanner.next());

        System.out.print("Ingrese el número de teléfono: ");
        nuevoCliente.setTelefono(scanner.next());

        System.out.println("\nSe ha registrado la información correctamente...");

        return nuevoCliente;
    }

    public void registrarVehiculo(Cliente cliente, VehiculoService vs) {

        cliente.getVehiculos().add(vs.registrarVehiculo(scanner));
    }

    public void comprarPoliza(Cliente cliente, PolizaService ps) {

        System.out.println("\nCOMPRANDO PÓLIZA.");

        int indice = 1;
        for (Vehiculo vehiculo : cliente.getVehiculos()) {
            System.out.println(indice + ". " + vehiculo);
            indice++;
        }
        System.out.print("Seleccione el vehículo que desea asegurar: ");

        Vehiculo vehiculo =  cliente.getVehiculos().get(scanner.nextInt() - 1);

        if (vehiculo.getPoliza() == null) {
            vehiculo.setPoliza(ps.crearPoliza(scanner));
        } else {
            System.out.println("\nEl vehículo ya se encuentra asegurado...");
        }
    }

    public void mostrarPolizas(Cliente cliente) {

        System.out.println("\nLISTA DE PÓLIZAS ADQUIRIDAS POR EL CLIENTE.");
        int indice = 1;
        for (Vehiculo vehiculo : cliente.getVehiculos()) {
            if (vehiculo.getPoliza() != null) {
                System.out.println(indice + ". " + vehiculo + "\n" + vehiculo.getPoliza());
                indice++;
            }
        }
    }
}
