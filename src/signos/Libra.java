package signos;

import java.util.ArrayList;

import aula4.rand;

public class Libra {
    static byte c = (byte) rand.d5();
    public static void libra() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Libra é diplomático e busca o equilíbrio em todas as situações.");
        frases.add("Libra é charmoso e tem uma personalidade encantadora que atrai as pessoas.");
        frases.add("Libra é indeciso e pode ter dificuldade em tomar decisões.");
        frases.add("Libra é amante da beleza e aprecia a arte e a estética.");
        frases.add("Libra é gentil e preocupa-se com o bem-estar dos outros.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
