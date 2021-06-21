package pe.edu.upeu.geyv.examengeyv;

import java.util.Scanner;
public class examen02GEYV{
static Scanner teclado=new Scanner(System.in);
private static void ejercicio01() {





    System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
    String montodisponible="0";

   
    int V1,V2,V3,montodisponible;
    double montoP=0;
    
    if(montodisponible<=500){
    montoP=V1*0.12;
    }
    else if (montodisponible>=500){
        montoP=V2*0.8;
    }else if (montodisponible>=101 && montodisponible<=250){
        montoP=V3*0.5;
        
    }

    System.out.println("impuesto a pagar es : "+montoP);
}
    public static void main(String[] arg){
        ejercicio01();
    }
    
    }

