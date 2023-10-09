/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.tareacap6poo;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Eje617 {
    private ArrayList<String> respuestas = new ArrayList();

    public Eje617() {
        respuestas.add("yes");
        respuestas.add("no");
        respuestas.add("maybe");
    }
    
    public String getResponse(){
        Random rmd = new Random();
        return respuestas.get(rmd.nextInt(respuestas.size()));//Modifico el parametro recibido para generar el numero, haciendolo que sea el tamaño del array
    }
}
