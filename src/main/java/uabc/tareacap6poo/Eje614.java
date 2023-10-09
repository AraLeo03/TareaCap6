package uabc.tareacap6poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Leonel Araujo
 */
public class Eje614 {

    public Eje614() {
        
    }
    
    public static void main(String[] args) {
        
    }
    
    public void printOneRandom(){
        Random rmd = new Random();
        System.out.println("1 Numero random: "+rmd.nextInt(10));
    }
    
    public void printMultiRandom(int cuantos){
        Random rmd = new Random();
        for (int i = 0; i < cuantos; i++) {
            System.out.println(cuantos+" Numero(s) random: "+rmd.nextInt(10));
        }
    }
}
