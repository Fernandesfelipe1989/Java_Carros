package ExSimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAtual {
    Date agora = new Date();
    SimpleDateFormat agoraData = new SimpleDateFormat("DD/MM/YYYY' 'HH:MM:SS:sss");
    String data = agoraData.format(agora);
    public String getDataAtual(){
        return this.data;
    }

    public static void main(String [] args){
        DataAtual data = new DataAtual();
        System.out.println(data.getDataAtual());
    }
}
