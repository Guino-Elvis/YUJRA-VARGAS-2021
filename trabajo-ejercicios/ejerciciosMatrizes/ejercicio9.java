package ejerciciosMatrizes;

public class ejercicio9 {
    public void transformada2(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + c); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        Transformadas tm=new Transformadas();  
        tm.imprimirContenidoMatrizCadena(matriz);  
    }
    public static void main(String[] args) {    
        ejercicio9 tm=new ejercicio9();  
        tm.transformada2(10, 1);  
}
}