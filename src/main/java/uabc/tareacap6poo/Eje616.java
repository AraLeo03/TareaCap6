/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.tareacap6poo;

import java.util.Random;
/**
 *
 * @author Dell
 */
public class Eje616 {

    public Eje616() {
    }
    
    public int throwDice(){
        Random rmd = new Random();
        
        return rmd.nextInt(6)+1;
    }
}
