package primerProyecto;

import java.util.Scanner;

public class Menu { 

    public void desayunar(){
        int x=0;
    Scanner MiScanner = new Scanner (System.in);
    int opcion; bolean salir=false;
    do{
    System.out.println("Vienvenido al Restauran LA ACADEMIA");
    System.out.print("elige lo que quieres para comer");
    System.out.print("1-Tacos fritos");
    System.out.print("2-enchiladas");
    System.out.print("3-carne asada");

    opcion=miScanner.nextInt();
    swich (opcion){
        case 1;
        System.out.println("ya le traemos sus tacos fritos");
        break;

        case 2;
        System.out.println("ya le traemos sus enchiladas");
        break;

        case 3;
        System.out.println("ya le traemos su carne asada");
        break; 

        case 4;
        System.out.println("le gustaria algo para tomar");
        salir=true;
        break;
    }
    }
    while (salir!=true);
    }
}
    public void bebidas(){
        Scanner miScanner = new Scanner (System.in);
        int x;
        do{

        System.out.println("elige tu bebida");

        System.out.println("5-coca cola");
        System.out.println("6-pepsi");
        System.out.println("7-horchata");
        System.out.println("8-salir");
        x=miScanner.nextInt();
        switch (x){

        case 5;
        System.out.println("ya le traemos su coca cola");
        break; 

        case 6;
        System.out.println("ya le traemos su pepsi");
        break; 

        case 7;
        System.out.println("ya le traemos su horchata");
        break; 

        case 8;
        System.out.println("gracias por venir a comer, hasta pronto");
        break; 
        System.exit(0);
        break;
        case 9;
        System.out.println("adios");
        System.exit(0);
        break;
        }

        while (x!=11);
        }
    }
    
