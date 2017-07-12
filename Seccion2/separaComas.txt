/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gateway
 */
import java.text.DecimalFormat;

public class separaComas {
    public static void main(String arg[]){
        int numSeparar = 1235000;
    separar(numSeparar);
    System.out.println(separar(numSeparar));
    }
    public static String separar(int numSeparar){
        //numSeparar = 1235000;
        
        DecimalFormat df = new DecimalFormat("###,###,###");        
        String fNum = df.format(numSeparar);
        return fNum;
    }
}
