/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //System.out.println("Calculadora Polaca Inversa App");
         JOptionPane.showMessageDialog(null, "Bienvenido", "Calculadora Polaca Inversa App", JOptionPane.WARNING_MESSAGE);
         //Scanner Teclado = new Scanner(System.in);
         //double NumA, NumB;
         //String Signo;
         
          String NumA_ = JOptionPane.showInputDialog("Escribe un numero");
          String NumB_ = JOptionPane.showInputDialog("Escribe otro numero");
          String Signo = JOptionPane.showInputDialog("Escribe un signo aritmetico: (puede ser + - * / ^ %)");
          
          
	  int NumA = Integer.parseInt(NumA_);	
          int NumB = Integer.parseInt(NumB_);	
        //System.out.println("Digite el primer operando: ");
        //NumA = Teclado.nextDouble();
        //System.out.println("Digite el segundo operando: ");
        //NumB = Teclado.nextDouble();
        
        //System.out.println("Digite un signo aritmetico: (puede ser + - * / ^ %)");
        //Signo = Teclado.next();
 
        switch  (Signo){
            
            case "+":
                NumA=NumA+NumB;
                break;
            case "-":
                NumA=NumA-NumB;
                break;
            case "*":
                NumA=NumA*NumB;
                break;
            case "/":
                NumA=NumA/NumB;
                break;
            case "^":
                NumA=(int)Math.pow(NumA, NumB);
                break;
            case "%":
                NumA= NumA%NumB;
                break;
            default:
                break;
        }
        
        String resouesta = Integer.toString(NumA);
        JOptionPane.showMessageDialog(null, "La respuesta es: "+NumA, "Listo", JOptionPane.WARNING_MESSAGE);
        //System.out.println("La respuesta es: "+NumA);
       
    
    }
    
}
