public class Carro {
    String marca;
    String modelo;
    Integer ano;
    String variante;
    Integer numberMaxPassager;
    Integer numberPassager; 
    public Carro (String nome, Integer number, Integer max, String marc, Integer year, String info){
        numberMaxPassager = max;
        numberPassager = number;
        modelo = nome;
        marca = marc;
        ano = year;
        variante = info;

    }
    public String getNome(){
        return modelo;
    }
    public void outPassager (Integer outPassager){
        if(numberPassager - outPassager >=0)  {
            numberPassager -= outPassager;
        } 
        else { 
            numberPassager = 0 ;
        }
    }
    public void inPassager (Integer inPassager){
        if (numberPassager + inPassager <=numberMaxPassager ) 
        { numberPassager += inPassager;  }
        else {
            numberPassager = numberMaxPassager;
        }
    }
    public void info (){
        System.out.println(String.format("O carro da marcar %s, modelo %s e ano %s. Informacoes adicionais %s", marca, modelo, ano, variante));
        System.out.println(String.format("O carro %s tem espaço para %s passageiros e no momento ele tem %s passageiros", modelo, numberMaxPassager, numberPassager ));

    }


    
}

