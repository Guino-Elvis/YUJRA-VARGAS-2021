package ejerciciosMatrizes;

public class ejercicio4 {
    public void transformada21(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);        
    }

    public static void main(String[] args) {

       ejercicio4 tm=new ejercicio4();  
        tm.transformada21(10, 1);   
    }
}
