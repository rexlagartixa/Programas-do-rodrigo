package aula2023;

public class Polinomio {
    private double[] coefs;
    
    public Polinomio(double[] coefs){
        this.coefs = coefs;
    }
    
    public double calcular(double x){
        double y = 0.0;
        for(int i = 0; i < coefs.length; i++){
            y = y + coefs[i]*Math.pow(x, i);
        }
        return y;
    }
    
    public String toString(){
        String p = "";
        for(int i = 0; i < coefs.length; i++){
            p = p + coefs[i] + " x^" + i + " + ";
        }
        return p;
    }
}
