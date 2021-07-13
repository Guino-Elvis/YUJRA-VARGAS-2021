package ejerciciosMatrizes;

public class ejercicio10 {
    public void transformada01x(int dimension, int valorInicial) {
        int item=0;
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum< matriz.length; colum++) {
                if(colum<dimension-fila){
                item=valorInicial+(fila+colum)*(fila+colum+1)/2 + fila; 
                matriz[fila][colum]=""+item;
                }else{
                    matriz[fila][colum]="";
                }
            }
        }  

        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);    
    }           
        public static void main(String[] args) {    
            ejercicio10 tm=new ejercicio10();  
            tm.transformada01x(10, 1);  
    }
    }