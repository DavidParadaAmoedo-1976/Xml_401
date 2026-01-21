package vista;

import modelo.MenuEnum;

import java.util.Scanner;

public class VistaXML401 {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        MenuEnum[] opciones = MenuEnum.values();
        System.out.println("\n" + "*** Menú de opciones ***" + "\n");
        for (int i = 1; i < opciones.length; i++) {
            System.out.println(i + ".\t" + opciones[i].getTexto());
        }
        System.out.println("0.\tSalir.");
    }

    public String solicitarEntrada(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine().trim();
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
