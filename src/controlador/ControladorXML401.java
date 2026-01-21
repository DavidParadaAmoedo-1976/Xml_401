package controlador;

import modelo.MenuEnum;
import vista.VistaXML401;

public class ControladorXML401 {

    private final VistaXML401 vista;

    public ControladorXML401(VistaXML401 vista) {
        this.vista = vista;
    }

    public void ejecuta() {
        MenuEnum opcion;
        while (true) {
            vista.mostrarMenu();
            int seleccion = solicitarInt("\nIntroduce una opción: ", 0, MenuEnum.values().length - 1);
            opcion = MenuEnum.values()[seleccion];
            switch (opcion) {

                case SALIR -> {
                    vista.mostrarMensaje("Saliendo del programa ....");
                    cerrarAplicacion();
                    return;
                }
            }
        }
    }

    private void cerrarAplicacion() {
    }

    private int solicitarInt(String mensaje, int min, int max) {
        while (true) {
            String input = vista.solicitarEntrada(mensaje);
            try {
                int valor = Integer.parseInt(input);
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    vista.mostrarMensaje("!!! ERROR !!!  El valor debe estar entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                vista.mostrarMensaje("!!! ERROR !!!  Introduce un número entero válido.");
            }
        }
    }
}
