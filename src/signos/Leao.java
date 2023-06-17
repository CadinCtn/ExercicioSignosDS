package signos;

import java.util.ArrayList;

import aula4.rand;

public class Leao {
static byte c = (byte) rand.d5();
    public static void leao() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Leão é o rei da selva zodiacal, confiante e cheio de autoridade.");
        frases.add("Leão adora estar no centro das atenções e tem uma personalidade carismática.");
        frases.add("Leão é generoso e gosta de compartilhar seu sucesso com os outros.");
        frases.add("Leão adora o luxo e o glamour, aprecia os prazeres da vida");
        frases.add("Leão é corajoso e destemido, enfrenta desafios com confiança e determinação.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }
}
