package ejerciciosMatrizes;

public class ejercicio7 {

    public void transformada13(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);  
    }
    public static void main(String[] args) {    
        ejercicio7 tm=new ejercicio7();  
        tm.transformada13(10, 1);  
}
}

