package ejerciciosMatrizes;

public class ejercicio2 {
    public void transformada12(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+numInit;
                numInit++;
            }
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }


  
    public static void main(String[] args) {    
        ejercicio2 tm=new ejercicio2();  
        tm.transformada12(10, 1);  
}
}
   


  
    
   
    