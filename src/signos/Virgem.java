package signos;
import java.util.ArrayList;

import aula4.rand;

public class Virgem {
    static byte c = (byte) rand.d5();
    public static void virgem() {

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Virgem � meticuloso e detalhista, prestando aten��o aos m�nimos detalhes.");
        frases.add("Virgem � organizado e tem uma natureza perfeccionista, buscando a excel�ncia em tudo o que faz.");
        frases.add("Virgem � observador e possui uma mente anal�tica, sempre em busca de solu��es e melhorias.");
        frases.add("Virgem � confi�vel e respons�vel, cumprindo com suas obriga��es e compromissos.");
        frases.add("Virgem � cauteloso e preocupado com a sa�de e o bem-estar, mantendo h�bitos saud�veis.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }

}
