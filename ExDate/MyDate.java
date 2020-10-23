package ExDate;

import java.util.Date;

public class MyDate {
    private Date anoNascimento;
    public MyDate () {
        Date nascimento = new Date(630376800000L);
        this.anoNascimento = nascimento;}
    public Integer comparaDatas (Date dataComparada){
        return anoNascimento.compareTo(dataComparada);
    }
    public Date getAnoNascimento(){
        return anoNascimento;
    }
    public static void main( String[] args){
        MyDate anoNascimento = new MyDate();
        Date dataComparada = new Date(1273974000000L);
        Integer a = anoNascimento.comparaDatas(dataComparada);
        if(a==-1){
            System.out.println(String.format(" A data %s é anterior a %s", anoNascimento.getAnoNascimento(), dataComparada));
        }
        else if (a==0){
            System.out.println(String.format(" A data %s é igual a %s", anoNascimento.getAnoNascimento(), dataComparada));
        }
        else{
            System.out.println(String.format(" A data %s é superior a %s", anoNascimento.getAnoNascimento(), dataComparada));
        }
        

    }
}
