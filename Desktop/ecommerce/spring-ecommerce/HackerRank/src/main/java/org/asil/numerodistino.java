package org.asil;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class numerodistino {
    public static void main(String[] args) throws ParseException {
        List<Integer> a= Arrays.asList(34,95 ,34 ,64, 45 ,95 ,16, 80, 80, 75 ,3,25 ,75, 25 ,31 ,3 ,64 ,16 ,31);
        lonelyinteger(a);
        System.out.println(a);

    }

    public static int lonelyinteger(List<Integer> a) {
        Collections.sort(a);

        int numero=0;

        for (int i =0; i <= a.size()-2; i++) {
            if (!a.get(i).equals(a.get(i+1)) &&  !a.get(i).equals(a.get(i-1))) {
                    numero = a.get(i);

                }



            }
        if(numero==0 || !a.get(a.size()-1).equals(a.get(a.size()-2))){
            numero= a.get(a.size()-1);
        }


        return numero;


    }
}