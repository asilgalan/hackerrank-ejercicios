package org.asil;

import java.util.ArrayList;
import java.util.List;

public class sumadiagonales {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(9, 8, 9));
        System.out.println( diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int primera=0;
        int segunda=0;

         for (int i = 0; i<arr.size() ; i++) {
                  primera+=arr.get(i).get(i);
                    segunda+=arr.get(i).get(arr.size()-1-i);


            }


        int resultado=Math.abs(primera-segunda);


        return resultado;
   }
}
