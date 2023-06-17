package signos;
import java.util.ArrayList;

import aula4.rand;

public class Virgem {
    static byte c = (byte) rand.d5();
    public static void virgem() {

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Virgem é meticuloso e detalhista, prestando atenção aos mínimos detalhes.");
        frases.add("Virgem é organizado e tem uma natureza perfeccionista, buscando a excelência em tudo o que faz.");
        frases.add("Virgem é observador e possui uma mente analítica, sempre em busca de soluções e melhorias.");
        frases.add("Virgem é confiável e responsável, cumprindo com suas obrigações e compromissos.");
        frases.add("Virgem é cauteloso e preocupado com a saúde e o bem-estar, mantendo hábitos saudáveis.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }

    }

}
