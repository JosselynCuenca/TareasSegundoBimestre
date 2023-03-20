
package excep.practica;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EXcepPractica {

    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de arreglos : "));
        int[] nr = new int[num];
        System.out.println("Digite los numeros del arreglo");
        try {
            for (int i = 0; i < num; i++) {
                System.out.println((i + 1) + "Digite un numero: ");
                nr[i] = entrar.nextInt();
            }
            System.out.println("\n Los numeros son: ");
            for (int i = 0; i < num; i++) {
                System.out.println(nr[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("No se permite el uso de Letras");
        }

        //aarray y excepciones
    }

}
