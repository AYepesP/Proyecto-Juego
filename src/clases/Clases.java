/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author Alejandro Yepes
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        LinkedList<Carro> carros = new LinkedList <Carro> ();
        System.out.println("cuantos carros quieres comparar");
        int numero = sc.nextInt();
        LinkedList<String> nombres = new LinkedList <String>();
        nombres.add("Ford");
        nombres.add("Audi");
        nombres.add("BMW");
        nombres.add("GMC");
        nombres.add("Mercedes Benz");
        nombres.add("Jeep");
        nombres.add("Nissan");
        nombres.add("Toyota");
        nombres.add("Mazda");
        nombres.add("Mini Cooper");
        double rand = Math.random()*10;
        int random = (int)rand;
              
        for (int i = 0; i<numero;i++)
        {
            Carro cualquiera = new Carro ();
            cualquiera.V0to100 = Math.random()*10;
            carros.add(cualquiera);  
       
        }
        double acum = 0;
        for (Carro i:carros)
        {
            acum= acum+i.V0to100; 
        }
        System.out.println("El nombre del carro es: " + nombres.get(random));
    }
    
}
