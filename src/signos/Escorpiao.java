package signos;



import java.util.ArrayList;

import aula4.rand;

public class Escorpiao {
    static byte c = (byte) rand.d5();
    public static void escorpiao() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Escorpião é intenso e apaixonado em tudo o que faz.");
        frases.add("Escorpião é determinado e obstinado, não desiste facilmente de seus objetivos.");
        frases.add("Escorpião é corajoso e enfrenta os desafios de frente, sem medo.");
        frases.add("Escorpião é um investigador nato, sempre em busca de descobrir a verdade.");
        frases.add("Escorpião é resiliente e é capaz de se recuperar de qualquer adversidade.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
