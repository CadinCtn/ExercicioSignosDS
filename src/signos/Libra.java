package signos;

import java.util.ArrayList;

import aula4.rand;

public class Libra {
    static byte c = (byte) rand.d5();
    public static void libra() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Libra � diplom�tico e busca o equil�brio em todas as situa��es.");
        frases.add("Libra � charmoso e tem uma personalidade encantadora que atrai as pessoas.");
        frases.add("Libra � indeciso e pode ter dificuldade em tomar decis�es.");
        frases.add("Libra � amante da beleza e aprecia a arte e a est�tica.");
        frases.add("Libra � gentil e preocupa-se com o bem-estar dos outros.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
