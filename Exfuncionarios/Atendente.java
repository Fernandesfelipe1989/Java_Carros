package ExFuncionarios;

public class Atendente extends Funcionarios{
    public Atendente( Double sal){
        alteraSalario(sal);
    }
    public Double impostoSalario(){
        return getSalario()*0.01;
    }
    
}
