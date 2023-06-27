/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulado2;

/**
 *
 * @author cefet
 */
public class Simulado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            BigDog brutos = new BigDog("brutos");
            
            brutos.greets();
            brutos.greets(brutos);
    }
    
}
