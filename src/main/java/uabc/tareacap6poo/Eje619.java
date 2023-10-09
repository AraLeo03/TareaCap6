package uabc.tareacap6poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
/**
 *
 * @author Dell
 */
public class Eje619 {

    public Eje619() {
    }
    
    public int randomTester(int max){
        Random rmd = new Random();
        return rmd.nextInt(max)+1;
    }
    
    public int randomTester(int min, int max){
        Random rmd = new Random();
        int rango = max-min+1;
        return rmd.nextInt(rango)+min;
    }
}
