package aula4;
import signos.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        byte z;
        for(z=0;z<2;) {

            Scanner le = new Scanner(System.in);
      
            System.out.println("Digite o dia do seu aniversario");
            byte dia = le.nextByte();
      
            System.out.println("Digite o mes de seu anivers�rio:");
            byte mes = le.nextByte();
            
            switch (mes) {
                case 1:
                    if(dia <=20) {
                    	System.out.println("Capric�rnio!");
                    	Capricornio.capricornio();
                    } else {
                    	System.out.println("Aqu�rio!");
                    	Aquario.aquario();
                    }
                	
                    break;

                case 2:
                    if(dia <= 19) {
                    	System.out.println("Aqu�rio!");
                    	Aquario.aquario();
                    } else {
                    	System.out.println("Peixes!");
                    	Pexe.pexe();
                    }
                    break;

                case 3:
                	if(dia <= 20) {
                		System.out.println("Peixes!");
                		Pexe.pexe();
                	} else {
                		System.out.println("�ries!");
                		Aries.aries();
                	}
                    break;

                case 4:
                    if(dia <= 20) {
                    	System.out.println("�ries!");
                    	Aries.aries();
                    } else {
                    	System.out.println("Touro!");
                    	Touro.touro();
                    }
                    break;

                case 5:
                    if(dia <= 20) {
                    	System.out.println("Touro!");
                    	Touro.touro();
                    } else {
                    	System.out.println("G�meos!");
                    	Gemeos.gemeos();
                    }
                    break;

                case 6:
                    if(dia <= 20) {
                    	System.out.println("G�meos!");
                    	Gemeos.gemeos();
                    }else {
                    	System.out.println("C�ncer!");
                    	Cancer.cancer();
                    }
                    break;

                case 7:
                    if(dia <= 22) {
                    	System.out.println("C�ncer!");
                    	Cancer.cancer();
                    } else {
                    	System.out.println("Le�o!");
                    	Leao.leao();
                    }
                    break;

                case 8:
                    if(dia <= 22) {
                    	System.out.println("Le�o!");
                    	Leao.leao();
                    } else {
                    	System.out.println("Virgem!");
                    	Virgem.virgem();
                    }
                    break;

                case 9:
                    if(dia <= 22) {
                    	System.out.println("Virgem!");
                    	Virgem.virgem();
                    } else {
                    	System.out.println("Libra!");
                    	Libra.libra();
                    }
                    break;

                case 10:
                    if(dia <= 22) {
                    	System.out.println("Libra!");
                    	Libra.libra();
                    }else {
                    	System.out.println("Escorpi�o!");
                    	Escorpiao.escorpiao();
                    }
                    break;

                case 11:
                    if(dia <= 21) {
                    	System.out.println("Escorpi�o!");
                    	Escorpiao.escorpiao();
                    }else {
                    	System.out.println("Sagit�rio!");
                    	Sagitario.sagitario();
                    }
                    break;

                case 12:
                    if(dia <= 21) {
                    	System.out.println("Sagit�rio!");
                    	Sagitario.sagitario();
                    } else {
                    	System.out.println("Capric�rnio");
                    	Capricornio.capricornio();
                    }
                    break;
                    
               default:
            	   System.out.println("Essa n�o � uma data valida");
            }


        }
    }
}