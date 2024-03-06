package LibreriaES;

import javax.swing.*;
import java.util.Scanner;

public class EntradaSalida {
    static Scanner scan = new Scanner(System.in);
    public static final int CONSOLA = 0;
    public static final int VENTANA = 1;
    public static Float entrada(String mensaje, int opcion){
        Float ent;
        ent = null;
        switch(opcion){
            case CONSOLA :
                System.out.println(mensaje);
                ent = scan.nextFloat();
                break;
            case VENTANA:
                ent = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
                break;
            default:
                break;
        }
        return ent;
    }
    public static void salida(String mensaje, int opcion){
        switch (opcion){
            case CONSOLA :
                System.out.println(mensaje);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null,mensaje);
                break;
            default:
                break;
        }
    }
}
