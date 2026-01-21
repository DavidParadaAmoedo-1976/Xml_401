import controlador.ControladorXML401;
import vista.VistaXML401;

public class Programa {

    static void main(String[] args) {
        VistaXML401 vista = new VistaXML401();
        ControladorXML401 controlador = new ControladorXML401(vista);

        controlador.ejecuta();
    }

}
