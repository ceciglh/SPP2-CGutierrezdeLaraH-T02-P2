/*//Cecilia Gutierrez de Lara Herandez-A01410404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.t02.p2;
import java.util.Scanner;

/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Bienvenido!");
           op();
    }
    
    static int data (String valor) {
    Scanner kb = new Scanner (System.in);
    
    System.out.print("Ingrese " +valor + ": ");
    int datos = kb.nextInt();
    
    return datos;
}  
    
    static void div(int valor){
    if ((valor%2)==0){
        System.out.println(valor+" es un número par.");
    } if ((valor%3)==0){
          System.out.println(valor+" es un número divisible entre 3.");
        } if ((valor%5)==0) {
            System.out.println(valor+" es un número divisible entre 5.\n");
            } else {}
}
    
static void op(){
    int valinf = data("Valor inferior");
    int valsup = data("Valor superior");
    int count = valinf - 1;
    System.out.println("Valores entre "+valinf+" y "+valsup+" son: ");
    while (count < valsup){
        System.out.println(count=count+1);
    }
    
    div(valinf);
    div(valsup);
    
}

}
    

