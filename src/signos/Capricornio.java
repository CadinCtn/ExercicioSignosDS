package signos;
import java.util.ArrayList;

import aula4.rand;

public class Capricornio {
    static byte c = (byte) rand.d5();
    public static void capricornio() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Capricórnio é ambicioso e determinado, sempre buscando alcançar o sucesso.");
        frases.add("Capricórnio é responsável e confiável, cumprindo com suas obrigações e compromissos.");
        frases.add("Capricórnio é disciplinado e organizado, tendo uma abordagem estruturada para a vida.");
        frases.add("Capricórnio é ambicioso e trabalha duro para alcançar suas metas.");
        frases.add("Capricórnio é prudente com o dinheiro e valoriza a estabilidade financeira.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }

}
