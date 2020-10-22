package ExFuncionarios;

public class Gerente extends Funcionarios{
    public Gerente (Double sal){
        super(sal);
    }
    public Double impostoSalario (){
        return getSalario()*0.1;
    }
    
}
