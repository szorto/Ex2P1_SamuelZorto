package ex2p1_samuelzorto;

import java.util.ArrayList;

public class granja {

    public String nomb;
    public int dinero;
    public ArrayList<vacas> vc = new ArrayList<>();
    public ArrayList<conejos> cj = new ArrayList<>();
    public ArrayList<vegetales> vg = new ArrayList<>();

    public granja(String nomb) {
        this.vc = new ArrayList<>();
        this.cj = new ArrayList<>();
        this.vg = new ArrayList<>();
        this.dinero = 500;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<vacas> getVc() {
        return vc;
    }

    public void setVc(ArrayList<vacas> vc) {
        this.vc = vc;
    }

    public ArrayList<conejos> getCj() {
        return cj;
    }

    public void setCj(ArrayList<conejos> cj) {
        this.cj = cj;
    }

    public ArrayList<vegetales> getVg() {
        return vg;
    }

    public void setVg(ArrayList<vegetales> vg) {
        this.vg = vg;
    }

    public void printGranja() {
        System.out.println("Que deseas vender?");
        System.out.println("~~~~~~~~~~ ANAISIS DE GRANJA ~~~~~~~~~~");
        System.out.println("Tienes " + vg.size() + " Vegetales");
        System.out.println("Tienes " + vc.size() + " Vacas");
        System.out.println("Tienes " + cj.size() + " Conejos");
        System.out.println("Tienes " + dinero + " Monets");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Selecciona");
        System.out.println("[1] Vegetales");
        System.out.println("[2] Vacas");
        System.out.println("[3] Conejos");
    }
    
    public void nombVC(){
        for (vacas obj : vc) {
            System.out.println(obj.getNomb());
        }
    }
    
    public void nombCJ(){
        for (conejos obj : cj) {
            System.out.println(obj.getNomb());
        }
    }
    
    public void addCos(){
        vg.add(new vegetales());
    }
    
    public void addVC(String nomb){
        vc.add(new vacas(nomb));
    }
    
    public void addCJ(String nomb){
        cj.add(new conejos(nomb));
    }
    
    public void printVender(){
        System.out.println("Que animales desea?");
        System.out.println("[1] Conejos -> 150 monets");
        System.out.println("[2] Vacas   -> 350 monets");
    }
    
    public void printVacas(){
        for (vacas obj : vc) {
            System.out.println("Bye bye " + obj.getNomb());
        }
    }
    
    public void printConejos(){
        for (conejos obj : cj) {
            System.out.println("Bye bye " + obj.getNomb());
        }
    }
}
