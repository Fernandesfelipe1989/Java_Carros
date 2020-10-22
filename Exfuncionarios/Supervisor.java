package Exfuncionarios;

public class Supervisor extends Funcionarios{
    public Supervisor(Double sal){
        super(sal);
    }
    public Double impostoSalario(){
        return getSalario()*0.05;
    }
    
}
