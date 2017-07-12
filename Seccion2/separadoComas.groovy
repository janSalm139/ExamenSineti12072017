/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen
import java.text.DecimalFormat;

/** @author Jose Nava **/

public class separadoComas {
    
    public String separar(int numSeparar){
        numSeparar = 1235000;
        
        DecimalFormat df = new DecimalFormat("###,###,###");        
        string fNum = df.format(numSeparar);
        return fNum;
    }
    
    public int metodoBurbuja(int arreglo)
    {
         arreglo = [5, 3, 4, 6];
         
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]);
        }
        return arreglo;
    }
    
}

