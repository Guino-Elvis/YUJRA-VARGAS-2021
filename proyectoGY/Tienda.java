




import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Tienda {
 
	 static String comprador;
	 static String vendedor;
	 static String codigoP;
           static String nombreP;
 
	static int acum=0;
	int aacum;
 
	int resp;
	int ini_vector=0;
	static int tama_vec=5;
	static int posicion;
	private static char[][] ventas;
	private static int i;
 
 
	public static void main(String[] args) {
 
		int ventas[]= new int [5];
		Scanner sc= new Scanner(System.in);
 
			try{
				System.out.println("elige una opcion:\n "+
			              "1. Agregar venta del dia"+
						  "2. informe de la venta"+
			              "3. buscar venta"+
						  " salir"+
			              "elija una opcion:  ");
				int opcion = sc.nextInt();
				switch(opcion){
				case 1:
					agregarVenta(ventas);
				break;
				case 2:
					informe(ventas);
					break;
				case 3:
					buscar(ventas);
					break;
				case 0:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Numero no reconocido");
				}
				System.out.println("\n");
			}catch(Exception e){
				System.out.println("Error!");
			}
		}
	
 
	public static void agregarVenta(int v[]){
		int i;
		for(i=1;i<=5;i++){
			int[] ventas;
			System.out.println("Digite valor de la venta: "+ ventas[i]);
			acum=acum+ventas[i];
			System.out.println("Nombre del comprador: " + comprador);
			System.out.println("Nombre del vendedor: " + vendedor);
			System.out.println("Codigo del producto: " + codigoP);
			System.out.println("Nombre del producto: " + nombreP);
		}
	}
 
	public static void buscar(int v[]){
		System.out.println("Digite la venta que desea buscar: " + posicion);
		for(int i=1;i<=tama_vec;i++){
			int[] ventas;
			if(ventas[i]==posicion){
				System.out.println("el elemento que busco es: "+ posicion+ "y se encuentra en:"+i);
			}else{
				System.out.println("el valor "+ posicion +" no se encuentra almacenado");
			}
		}
	}
	public static void informe(int v[]){
		System.out.println(comprador);
		System.out.println(vendedor);
		System.out.println(codigoP);
		System.out.println(nombreP);
		System.out.println(ventas[i]);
	}
}

