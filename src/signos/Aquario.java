package signos;

import java.util.ArrayList;

import aula4.rand;


public class Aquario {
    static byte c = (byte) rand.d5();
        public static void aquario() {
            ArrayList<String> frases = new ArrayList<>();
            frases.add("Aqu�rio � independente e valoriza sua liberdade e individualidade.");
            frases.add("Aqu�rio � humanit�rio e preocupado com o bem-estar da sociedade como um todo.");
            frases.add("Aqu�rio � idealista e luta por causas sociais e pela igualdade.");
            frases.add("Aqu�rio � amig�vel e gosta de se envolver em grupos e comunidades.");
            frases.add("Aqu�rio � vision�rio e tem uma vis�o ampla e futurista.");

            System.out.println(frases.get(c));

            c++;
            if(c>=5){
                c=0;
            }
        }
}
