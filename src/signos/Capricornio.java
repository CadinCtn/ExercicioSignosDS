package signos;
import java.util.ArrayList;

import aula4.rand;

public class Capricornio {
    static byte c = (byte) rand.d5();
    public static void capricornio() {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Capric�rnio � ambicioso e determinado, sempre buscando alcan�ar o sucesso.");
        frases.add("Capric�rnio � respons�vel e confi�vel, cumprindo com suas obriga��es e compromissos.");
        frases.add("Capric�rnio � disciplinado e organizado, tendo uma abordagem estruturada para a vida.");
        frases.add("Capric�rnio � ambicioso e trabalha duro para alcan�ar suas metas.");
        frases.add("Capric�rnio � prudente com o dinheiro e valoriza a estabilidade financeira.");

        System.out.println(frases.get(c));

        c++;
        if(c>=5){
            c=0;
        }
    }

}
