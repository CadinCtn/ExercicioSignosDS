package signos;

import aula4.rand;
import java.util.ArrayList;

public class Sagitario {
    static byte c = (byte) rand.d5();
    public static void sagitario(){
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Sagitário é aventureiro e está sempre em busca de novas experiências e aventuras");
        frases.add("Sagitário é otimista e possui uma visão positiva da vida.");
        frases.add("Sagitário é sincero e direto, não tem medo de falar o que pensa.");
        frases.add("Sagitário é intelectual e está sempre em busca de conhecimento e aprendizado.");
        frases.add("Sagitário é entusiasta e contagia os outros com sua energia e paixão.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }
}
