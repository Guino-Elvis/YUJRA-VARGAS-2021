package ejerciciosMatrizes;

public class ejercicio5 {
    
    public void transformada28(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];//j=filas, i=columnas
        for (int j = matriz.length-1; j >=0; j--) {
            if(j%2==0){
                for (int i = 0; i < (matriz[0].length); i++) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }else{
                for (int i = matriz[0].length-1; i >=0 ; i--) {            
                    matriz[j][i]=""+numInit;
                    numInit++;
                }
            }
        }
        Transformadas tm=new Transformadas();
        tm.imprimirContenidoMatrizCadena(matriz);
    }    

    public static void main(String[] args) {    
        ejercicio5 tm=new ejercicio5();  
        tm.transformada28(10, 1);  
}
}