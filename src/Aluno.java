public class Aluno {
    public String nome;
    public String disc;
    private double aulas;
    private double faltas;
    private String mencao;
    
    public double getAulas(){
        return this.aulas;
    }
    
    public void setAulas(double tt){
        this.aulas=tt;
    }
    
    public double getFaltas(){
        return this.faltas;
    }
    
    public void setFaltas(double nf){
        this.faltas=nf;
    }
    
    public String getMencao(){
        return this.mencao;
    }
    
    public void setMencao(String m){
        this.mencao=m;
    }
    
    public double VerificarFaltas () {
        double p=(this.faltas * 100) / this.aulas;
        return p;
    }
    
    public String VerificarSit (double perc) {
        if (mencao.equals("I")|| perc >= 25){
            return "Reprovado";
        }
        else {
            return "Aprovado";
        }
    }
}