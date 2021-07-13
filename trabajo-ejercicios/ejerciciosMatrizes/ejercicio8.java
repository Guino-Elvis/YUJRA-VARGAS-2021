package ejerciciosMatrizes;

public class ejercicio8 {
    public void transformada24(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);  
    }
    public static void main(String[] args) {    
        ejercicio8 tm=new ejercicio8();  
        tm.transformada24(10, 1);  
}
}