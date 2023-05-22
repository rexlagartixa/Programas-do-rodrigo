package aula2023;

public class Aula2023 {

    public static void main(String[] args) {
    
        double[] grau = new double[3];
        grau[0] = 5.0;
        grau[1] = 0.0;
        grau[2] = 0.0;
        
        Polinomio p1 = new Polinomio(grau);
        System.out.println(p1.toString());
        
    }
    
}
