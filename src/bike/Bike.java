/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

/**
 *
 * @author edson
 */
public class Bike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();
        System.out.print("Estado inicial:"+bike.imprimirEstados()+"\n");
        for (int i = 0; i < 103; i++) {
            bike.acelerar();
            System.out.print("Aumentando velocidade"+bike.imprimirEstados()+"\n");
        }
        for (int i = 0; i < 20; i++) {
            bike.frear(); 
            System.out.print("Diminuindo velocidade"+bike.imprimirEstados()+"\n");
        }
    }
    
}
