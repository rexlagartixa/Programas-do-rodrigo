package aula2023;

public class ConversaoUnidadeArea {
    
    private ConversaoUnidadeArea(){}
    
    public static double metrosParaPes(double metros){
        return 10.76 * metros;
    }
    
    public static double pesParaCemtimetros(double pes){
        return 929 * pes;
    }
    
    public static double milhasParaAcres(double milhas){
        return 640 * milhas;
    }
    
    public static double AcreParaPes(double acre){
        return 43560 * acre;
    }
}
