package org.asil;

import java.util.ArrayList;
import java.util.List;

public class volterbits {
    public static void main(String[] args) {
        long n = 2147483647;
        flippingBits(n);
        System.out.println(flippingBits(n));
    }

    public static long flippingBits(long n) {
          long contador=32;
        List<Long> lista=new ArrayList<>();
        for (long i =contador-1; i >=0; i--) {

            if ((n & (1L << i))==0) {
                lista.add(1L);
            }else{
                lista.add(0L);
            }



        }

        long totalsumado=0;
        for (int i = 0; i <lista.size() ; i++) {

            if(1L==lista.get(i)){
                totalsumado+=(1L << (31-i));

            }


        }

        return totalsumado;

    }

}
