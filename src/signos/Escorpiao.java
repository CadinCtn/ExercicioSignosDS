package signos;



import java.util.ArrayList;

import aula4.rand;

public class Escorpiao {
    static byte c = (byte) rand.d5();
    public static void escorpiao() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Escorpi�o � intenso e apaixonado em tudo o que faz.");
        frases.add("Escorpi�o � determinado e obstinado, n�o desiste facilmente de seus objetivos.");
        frases.add("Escorpi�o � corajoso e enfrenta os desafios de frente, sem medo.");
        frases.add("Escorpi�o � um investigador nato, sempre em busca de descobrir a verdade.");
        frases.add("Escorpi�o � resiliente e � capaz de se recuperar de qualquer adversidade.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }
}
