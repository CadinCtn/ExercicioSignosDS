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
      
            System.out.println("Digite o mes de seu aniversário:");
            byte mes = le.nextByte();
            
            switch (mes) {
                case 1:
                    if(dia <=20) {
                    	System.out.println("Capricórnio!");
                    	Capricornio.capricornio();
                    } else {
                    	System.out.println("Aquário!");
                    	Aquario.aquario();
                    }
                	
                    break;

                case 2:
                    if(dia <= 19) {
                    	System.out.println("Aquário!");
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
                		System.out.println("Áries!");
                		Aries.aries();
                	}
                    break;

                case 4:
                    if(dia <= 20) {
                    	System.out.println("Áries!");
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
                    	System.out.println("Gêmeos!");
                    	Gemeos.gemeos();
                    }
                    break;

                case 6:
                    if(dia <= 20) {
                    	System.out.println("Gêmeos!");
                    	Gemeos.gemeos();
                    }else {
                    	System.out.println("Câncer!");
                    	Cancer.cancer();
                    }
                    break;

                case 7:
                    if(dia <= 22) {
                    	System.out.println("Câncer!");
                    	Cancer.cancer();
                    } else {
                    	System.out.println("Leão!");
                    	Leao.leao();
                    }
                    break;

                case 8:
                    if(dia <= 22) {
                    	System.out.println("Leão!");
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
                    	System.out.println("Escorpião!");
                    	Escorpiao.escorpiao();
                    }
                    break;

                case 11:
                    if(dia <= 21) {
                    	System.out.println("Escorpião!");
                    	Escorpiao.escorpiao();
                    }else {
                    	System.out.println("Sagitário!");
                    	Sagitario.sagitario();
                    }
                    break;

                case 12:
                    if(dia <= 21) {
                    	System.out.println("Sagitário!");
                    	Sagitario.sagitario();
                    } else {
                    	System.out.println("Capricórnio");
                    	Capricornio.capricornio();
                    }
                    break;
                    
               default:
            	   System.out.println("Essa não é uma data valida");
            }


        }
    }
}