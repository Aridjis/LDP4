public class Paciente {
    private double peso;
    private double estatura;
    
    public Paciente(double peso, double estatura){
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public double calcularIMC(){
        return peso/(estatura*estatura);
    }
    
    public String clasificarIMC(){
        double imc = calcularIMC();
        
        if (imc < 18.5){
            return "Bajo peso";
        }else if (imc >= 18.5 && imc < 25){
            return "Peso normal";
        }else if  (imc >= 25 && imc < 30){
            return "Sobrepeso";
        }else if (imc >=30 && imc < 35){
            return "Obesidad grado I";
        }else if (imc >= 35 && imc < 40) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III";
        }    
    }
}
