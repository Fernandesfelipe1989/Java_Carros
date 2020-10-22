package ExFuncionarios;

public class Supervisor extends Funcionarios{
    public Supervisor(Double sal){
        alteraSalario(sal);
    }
    public Double impostoSalario(){
        return getSalario()*0.05;
    }
    
}
