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
public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }
    
    public void greets(){
        System.out.println("Au Au");
    }
    
    public void greets(Dog another){
        System.out.println("Au Au Au Au Au !");
    }
    
    public void greets(BigDog another){
        System.out.println("AUUUUUUUUUUUUUUUUUUUU");
    }
}
