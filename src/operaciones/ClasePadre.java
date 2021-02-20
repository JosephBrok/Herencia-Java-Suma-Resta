
package operaciones;

import java.util.Scanner;

/**
 *
 * @author José Ignacio Pérez Luis
 */
public class ClasePadre {
    
    protected int valor1;
    protected int valor2;
    protected int resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }
    
    public void muestraResultado(){
        System.out.println(resultado);
    }  
}
