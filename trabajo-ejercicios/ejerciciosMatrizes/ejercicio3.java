package ejerciciosMatrizes;

public class ejercicio3 {
    public void transformada18(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = matriz [0]. length -1 ; j >=0; j-- ) {
            for (int i = 0; i < (matriz.length)-j; i++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        Transformadas tm=new Transformadas();
        tm.imprimirContenidoMatrizCadena(matriz);
    }
    public static void main(String[] args) {    
        ejercicio3 tm=new ejercicio3();  
        tm.transformada18(10, 1);  
}
}