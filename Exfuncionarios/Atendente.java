package ExFuncionarios;

public class Atendente extends Funcionarios{
    public Atendente( Double sal){
        super(sal);
    }
    public Double impostoSalario(){
        return getSalario()*0.01;
    }
    
}
