import java.util.Scanner;
class votacion{
static Scanner teclado=new Scanner(System.in);
static void ejercicio01(){
//Definir variables y otros
System.out.println("Ejemplo estructura Condicional Multiple 01 en Java");
String votacion="";//saber quienes pueden botar
int puedenbotar= teclado.nextInt();
if(puedenbotar>18){
  votacion="sipuedebotar";
}else if ( puedenbotar<=15){
 votacion="nopuedebotar";}
 //datos de salida
 System.out.println(" personas que puedenbotar: "+votacion);
}
public static void main(String[] arg){ejercicio01();}
}