package ExCalendar;

import java.util.Calendar;





public class Vencimento {
    private Calendar dataVencimento = Calendar.getInstance();
    private Calendar dataAtual = Calendar.getInstance();
    public Vencimento(int data, int mes, int ano){
        this.dataVencimento.set(Calendar.DAY_OF_MONTH, data);
        this.dataVencimento.set(Calendar.MONTH,  mes-1);
        this.dataVencimento.set(Calendar.YEAR, ano);
    }
    public Calendar getVencimento(){
        return dataVencimento;
    }
    public long vereficaVencimento(){
        long diasParaPagar =0;     
        dataVencimento.add(Calendar.DATE, 10);

        if (dataVencimento.get(Calendar.DAY_OF_WEEK) == 1){
            dataVencimento.add(Calendar.DAY_OF_MONTH, 1);
           
        }
        else if (dataVencimento.get(Calendar.DAY_OF_WEEK) == 7){
            dataVencimento.add(Calendar.DAY_OF_MONTH, 2);
            
        }
        diasParaPagar = ((dataVencimento.getTimeInMillis() - dataAtual.getTimeInMillis()) / 1000) /(3600*24)+1;
        return diasParaPagar;
    }

    public static void main (String[] args){
        Vencimento data = new Vencimento(23, 9, 2020);
        long diasParavencer = data.vereficaVencimento();
        if(diasParavencer>=0){
            System.out.println(String.format("Tem %s dias para pagar a fatura", diasParavencer));
        }
        else{
            System.out.println(" A fatura está vencida");
        }
        


    }

    
}
