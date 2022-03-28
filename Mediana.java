/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediana;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jouglas
 */
public class Mediana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 	    	
    List<Double> a = new ArrayList();
    a.add(-57.34);   
    a.add(-57.34);   
    a.add(-57.34);   
    a.add(-57.31448667);
    a.add(-57.31446699);
    a.add(-57.31444732);
    a.add(-57.28987964);
    a.add(-57.28984171);
    a.add(-57.28980378);
    Collections.sort(a);

        for(int i=0; i<a.size();i++){
            System.err.println(i+" "+a.get(i)+" "+a.size());

        }

        double m=0;

	if(a.size()%2==1)
	{
		m= a.get( ((a.size()+1)/2)-1 ); // 3x3

	}
	else
	{
            System.out.println("Não foi possivel calcular a mediana");	
	}
	
       System.out.println("Mediana :"+m);
    }
}
    

