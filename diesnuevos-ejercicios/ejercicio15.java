import java.util.Scanner;
class ejercicio15{
static Scanner teclado=new Scanner(System.in);
static void sueldosemanal(){
//Definir variables y otros
System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
String descuenta="";//jajajajajajajaa
//datos de entrada
int ganancias= teclado.nextInt();
if(ganancias<=150){
descuenta="0.5";
}else if (ganancias>150 && ganancias<300){
 descuenta="0.7";}
 else if (ganancias>300 && ganancias<450){
 descuenta="0.9";}
  //Datos de salida:
  System.out.println("se le descuenta : "+descuenta);
}
public static void main(String[] arg){sueldosemanal();}
}
