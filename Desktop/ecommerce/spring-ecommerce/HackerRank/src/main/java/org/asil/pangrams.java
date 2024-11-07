package org.asil;

import java.util.*;

public class pangrams {
    public static void main(String[] args) {

        String frase="We promptly judged antique ivory buckles for the next prize";


        System.out.println(pangrams(frase));

    }

    public static String pangrams(String s) {
        char[] achar = s.toCharArray();
        Arrays.sort(achar);
        String ordenado = new String(achar);
        String minuscula = ordenado.toLowerCase();

        char[] ordenadochar = minuscula.toCharArray();

        Set<Character> setcaracteres = new HashSet<>();
        for (int i = 1; i < ordenadochar.length; i++) {
            setcaracteres.add(ordenadochar[i]);
        }
        List<Character> lista = new ArrayList<>(setcaracteres);
        lista.remove((Character) ' ');
        lista.remove((Character) ',');
        Set<Character> set = new HashSet<>();
        Set<Character> setcomparativa = new HashSet<>(lista);
        int contador = 0;
        for (char i = 'a'; i <= 'z'; i++) {

                set.add(i);


            }
        System.out.println(set);
        System.out.println(setcomparativa);
            if (set.size() == setcomparativa.size()) {
                return "pangram";
            } else {
                return "not pangram";
            }


        }


    }
