package signos;

import java.util.ArrayList;

import aula4.rand;

public class Leao {
static byte c = (byte) rand.d5();
    public static void leao() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Le�o � o rei da selva zodiacal, confiante e cheio de autoridade.");
        frases.add("Le�o adora estar no centro das aten��es e tem uma personalidade carism�tica.");
        frases.add("Le�o � generoso e gosta de compartilhar seu sucesso com os outros.");
        frases.add("Le�o adora o luxo e o glamour, aprecia os prazeres da vida");
        frases.add("Le�o � corajoso e destemido, enfrenta desafios com confian�a e determina��o.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }
}
