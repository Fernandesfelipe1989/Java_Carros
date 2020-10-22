package ExFuncionarios;

public class Funcionarios {
    private Double salario;

    public Funcionarios(Double sal){
        this.salario = sal;
    }

    public Double impostoSalario(){
        return this.salario*0.01;
    }
    public Double getSalario(){
        return salario;
    }

    public void alteraSalario(Double sal){
        this.salario = sal;
    }
    public static void main(String[] args){
        Atendente atendente = new Atendente(1000.0);
        System.out.println(String.format("O imposto do atendente é de: %s", atendente.impostoSalario()));
        Supervisor supervisor = new Supervisor(1000.0);
        System.out.println(String.format("O imposto do supervisor é de: %s", supervisor.impostoSalario()));
        Gerente gerente = new Gerente(1000.0);
        System.out.println(String.format("O imposto do gerente é de: %s", gerente.impostoSalario()));



        
    }
    
}
