package ex2p1_samuelzorto;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex2P1_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menunu();
    }

    public static void menunu() {
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        granja gr = new granja("");
        boolean fin = true;
        int dia = 1;
        int numcos = 0;
        boolean cos = false;
        int diacos = 0;
        boolean cosda = false;

        do {
            System.out.println("<~~~~~~~~~~~~~~~~ DIA " + dia + " ~~~~~~~~~~~~~~~~>");
            if (cos) {
                if(cosda){
                    System.out.println("Puedes recolectar tu cosecha!");
                }else{
                    System.out.println("Faltan " + diacos + " para que esten las listas las cosechas!");
                }
                
            } else if (cosda) {
                System.out.println("Puedes recolectar tu cosecha!");
            } else {
                System.out.println("No hay cosechas");
            }
            //if que identifica si hay cosechas
            System.out.println("Que desea hacer?");
            System.out.println("[1] Plantar Cosechas");
            System.out.println("[2] Cosechar las cosechas");
            System.out.println("[3] Conseguir animales");
            System.out.println("[4] Vender Cosas");
            System.out.println("[5] Dormir");
            System.out.println("[6] Casate");
            // sout de fin
            int dec = entrada.nextInt();

            switch (dec) {
                case 1:
                    if (cos == false) {
                        cos = true;
                        diacos = 5;
                        System.out.println("Cuantas platas va a cosechar?");
                        numcos = entrada.nextInt();
                        
                        //asignar numcos a la clase de vegetales
                        System.out.println("PLANTANDO COSECHAS...");
                        System.out.println("Las cosechas tardan 5 dias en estar!");
                    } else {
                        System.out.println("YA ESTA COSECHANDO");
                    }
                    break;
                case 2:
                    if(cos){
                        if(cosda){
                            cosda = false;
                            cos = false;
                            System.out.println("Recolectaste tu cosecha");
                            for (int i = 0; i < numcos; i++) {
                                gr.addCos();   
                            }
                        }else{
                            System.out.println("Aun no se ha cosechado tu cosecha...");
                        }
                    }else{
                        System.out.println("No tienes nada cosechando...");
                    }
                    cosda = false;
                    
                    break;
                case 3:
                    System.out.println("Cantidad de dinero actual: " + gr.dinero);
                    gr.printVender();
                    int comp = entrada.nextInt();
                    int cant = 0;
                    switch(comp){
                        case 1:
                            System.out.println("Cuantos conejos desea?");
                            cant = entrada.nextInt();
                            if(gr.dinero < (cant * 150)){
                                System.out.println("ESTA MUY POBRE PARA COMPRAR HAHAHAHAHAHAHHAAHAHAHAHAHAHAHAH");
                            }else{
                                gr.dinero -= 150 * cant;
                                System.out.println("Conejos comprados $$$");
                                for (int i = 0; i < cant; i++) {
                                    System.out.println("Ingrese el nombre de su nuevo conejo:");
                                    String nomb = entrad.nextLine();
                                    gr.addCJ(nomb);
                                    System.out.println(nomb + " ha sid@ enciada a la granja!");
                                }
                            }
                            
                            break;
                        case 2:
                            System.out.println("Cuantas vacas desea?");
                            cant = entrada.nextInt();
                            if(gr.dinero < (cant * 350)){
                                System.out.println("ESTA MUY POBRE PARA COMPRAR HAHAHAHAHAHAHHAAHAHAHAHAHAHAHAH");
                            }else{
                                gr.dinero -= 350 * cant;
                                System.out.println("Vacas comprados $$$");
                                for (int i = 0; i < cant; i++) {
                                    System.out.println("Ingrese el nombre de su nueva vaca:");
                                    String nomb = entrad.nextLine();
                                    gr.addVC(nomb);
                                    System.out.println(nomb + " ha sida enciada a la granja!");
                                }
                            }
                            
                            break;
                    }
                    System.out.println("Tu nueva cantidad de dinero: " + gr.dinero);
                    break;
                case 4:
                    gr.printGranja();
                    int vend = entrada.nextInt();
                    int vender = 0;
                    switch (vend) {
                        case 1:
                            if (gr.vg.isEmpty()) {
                                System.out.println("NO TIENES VEGETALES QUE VENDER");
                            } else {
                                System.out.println("La cantidad de vegetales es: " + gr.vg.size());
                                System.out.println("Ingrese la cantidad a vender: ");
                                if(vender > gr.vc.size()){
                                    System.out.println("no puede vender lo que no tiene...");
                                }else{
                                    for (int i = 0; i < vender; i++) {
                                        gr.vg.remove(i);
                                    }
                                    System.out.println("Se han vendido " + vender + " conejos");
                                    gr.dinero += vender * 400;
                                    System.out.println("Tu nueva cantidad de dinero es: " + gr.dinero);
                                }
                                
                            }

                            break;
                        case 2:
                            if (gr.vc.isEmpty()) {
                                System.out.println("NOT TIENES VACAS QUE VENDER");
                            } else {
                                System.out.println("La cantidad de vacas es: " + gr.vc.size());
                                System.out.println("Y sus nombres son: ");
                                gr.nombVC();
                                System.out.println("Ingrese la cantidad a vender: ");
                                vender = entrada.nextInt();
                                if(vender > gr.vc.size()){
                                    System.out.println("no puede vender lo que no tiene...");
                                }else{
                                    for (int i = 0; i < vender; i++) {
                                        gr.printVacas();
                                        gr.vc.remove(i);
                                    }
                                    System.out.println("Se han vendido " + vender + " conejos");
                                    gr.dinero += vender * 400;
                                    System.out.println("Tu nueva cantidad de dinero es: " + gr.dinero);
                                }
                            }

                            break;
                        case 3:
                            if (gr.cj.isEmpty()) {
                                System.out.println("NOT TIENES CONEJOS QUE VENDER");
                            } else {
                                System.out.println("La cantidad de conjeos es: " + gr.cj.size());
                                System.out.println("Y sus nombres son: ");
                                gr.nombCJ();
                                System.out.println("Ingrese la cantidad a vender: ");
                                if(vender > gr.cj.size()){
                                    System.out.println("no puede vender lo que no tiene...");
                                }else{
                                    for (int i = 0; i < vender; i++) {
                                        gr.printConejos();
                                        gr.cj.remove(i);
                                    }
                                    System.out.println("Se han vendido " + vender + " conejos");
                                    gr.dinero += vender * 400;
                                    System.out.println("Tu nueva cantidad de dinero es: " + gr.dinero);
                                }
                            }

                            break;
                    }
                    break;
                case 5:
                    break;
                case 6:
                    fin = false;
                    System.out.println("Despues de tanto tiempo trabajando, te terminas casando con una mujer llamada Ana.");
                    System.out.println("Ana y usted pasaron muchos años casados. Disfrutaron todo el tiempo que tenian juntos.");
                    System.out.println("Un día, Ana se enfermo y termino en el hospital. Al tratar de salvarla, sacrifico un bus");
                    System.out.println("de niños en un ritual para dar su vida a cambio de la de Ana. Al final, el ritual no funciono1");
                    System.out.println("y Ana murio. Usted entro en tremenda depresion y alcoholismo. Murio por intoxicación");
                    System.out.println("de alcohol. El fin.");
                    break;
            }
            dia++;
            if (cos) {
                diacos--;
                if (diacos == 0) {
                    cosda = true;
                }
            }
            System.out.println("<~~~~~~~~~~~~~ FIN DEL DIA ~~~~~~~~~~~~~>");
            if(gr.dinero >= 1000000){
                System.out.println("Eres un millonario ahora!!!");
                System.out.println("ahora solo falta morir :D");
                fin = false;
            }
        } while (fin);

    }
}
