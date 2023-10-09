package uabc.tareacap6poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Dell
 */
public class TareaCap6POO {
    
    public static void main(String[] args) {
        Eje614 ejercicio614 = new Eje614();
        Eje616 ejercicio616 = new Eje616();
        Eje617 ejercicio617 = new Eje617();
        Eje619 ejercicio619 = new Eje619();
        MapTester map=new MapTester();
        
        System.out.println("Ejercicio 6.14");
        ejercicio614.printOneRandom();
        
        ejercicio614.printMultiRandom(5);
        
        System.out.println("Ejercicio 6.16");
        System.out.println(ejercicio616.throwDice());
        
        System.out.println("Ejercicio 6.17");
        System.out.println(ejercicio617.getResponse());
        
        System.out.println("Ejercicio 6.19");
        System.out.println("Numero entre 1 y maximo(18): "+ejercicio619.randomTester(18));
        System.out.println("Numero entre minimo(12) y maximo(18): "+ejercicio619.randomTester(12,18));
        
        System.out.println("Ejercici 6.27");
        
    }
}
