package ExLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataFuturo {
    LocalDateTime agora = LocalDateTime.of(2010, 05, 15,10,00,0);
    LocalDateTime agoraMais4anos = agora.plusYears(4).plusMonths(6).plusHours(13);

    public void getMais4anos(){
        System.out.println(this.agoraMais4anos);;
    }

    public static void main( String [] args){
        DataFuturo data = new DataFuturo();
        data.getMais4anos();
    }

    
}
