package pe.edu.upeu.arreglos;

import java.util.Scanner;

/**
 * EjemploVectores
 */
public class ejemplovectores {


    public static void conceptosVectores() {
        //Denifinir un vector
        int[] vectorX;
        int   []vectorY;
        //Definir tamanho de una vector
        vectorX=new int[10];
        vectorX[0]=20;//[0] indice/posicion
        vectorX[1]=8;//[1] indice/posicion
        //vectorX[0]=40;//[0] indice/posicion
        //15-17   int[] vectorX={20,8};

        //vectorX[2]=5;
        System.out.println("Imprimiento valores del vector x");
        System.out.println(vectorX[0]);//imprimeinto valor o elemento del vector vectorX[0]
        //Asignando valores directos a un vector
        int[] vA={12,2,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{12,2,3,4,5,6,7,8,9,10, 45, 16, 32};
        //conocer el tamanho de un vector
        System.out.println("Tamanho/longitud del vector vB="+vB.length);        
    }


    //Crea un array de 10 posiciones de números con valores pedidos por teclado. 
    //Muestra por consola el indice y el valor al que corresponde. 
    //Haz dos métodos, uno para rellenar valores y otro para mostrar.


    public static void mostrarValores(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= "+vector[i]+"   Su indice es: "+i+" Su valor es:"+vector[i]);        
        }
    }

    public static int[] rellenarVector(int tv) {
       int[] vector=new int[tv]; 
       Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese el valor del indice "+i+":");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores(vector);
        return vector;
    }

    public static void otrosejemplos() {
        double[] vectorA={12,45,878,5,4,5,6};
        System.out.println("Tamanho/longitud del vector vB="+vectorA.length);  
        String[]vectorB={"s","d","d","d","s","s","s","s"};
        System.out.println("Tamanho/longitud del vector vB="+vectorB.length);  
        Object[]vectorx={1,2,2,2,2,"a",2.2};
        System.out.println("Tamanho/longitud del vector vB="+vectorx.length);  
        

        
    }

    public static void main(String[] args) {
        conceptosVectores();
        System.out.println("Ejercicio 01");
        rellenarVector(10);
        otrosejemplos();
    }

}