import entidades.Cliente;
import servicios.ClienteService;
import servicios.PolizaService;
import servicios.VehiculoService;

public class Main {
    public static void main(String[] args) {

        ClienteService cs = new ClienteService();
        PolizaService ps = new PolizaService();
        VehiculoService vs = new VehiculoService();

        Cliente cliente1 = cs.registrarCliente();
        cs.registrarVehiculo(cliente1, vs);
        cs.registrarVehiculo(cliente1, vs);
        cs.comprarPoliza(cliente1, ps);
        cs.mostrarPolizas(cliente1);
    }
}