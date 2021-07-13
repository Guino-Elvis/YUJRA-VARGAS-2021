package ejerciciosMatrizes;

public class ejercicio6 {
    public void transformada05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);  
    }
    
    
   
    public static void main(String[] args) { 
           
        ejercicio6 tm=new ejercicio6();  
        tm.transformada05(10, 1); 
         
}
}

