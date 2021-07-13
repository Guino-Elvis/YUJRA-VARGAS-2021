package ejercicios;
import java.util.Scanner;
class costodemascota{
static Scanner teclado=new Scanner(System.in);
static void ejemplopropuestodegino(){ 
  //Definir variables y otros
  System.out.println("Ejemplo estructura trabajo ejercicios en Java");
  String presupuesto="";//labandocarros=L, limpiando=D, mandados=M
  double perro=0, gato=0, conejo=0, tortuga=0, precio=0; 
  //Datos de Entrada 
  System.out.println(" ingrese el precio de la mascota:"); presupuesto=teclado.next();
  System.out.println("Ingrese el precio de perro:"); perro=teclado.nextDouble();
  System.out.println("Ingrese el precio de gato:"); gato=teclado.nextDouble();
  System.out.println("Ingrese el precio de conejo:"); conejo=teclado.nextDouble();
  System.out.println("Ingrese la nota de tortuga:");tortuga=teclado.nextDouble(); 
  //Proceso 
   switch(presupuesto){
    case "L": precio=(perro*0.10+gato*0.20+conejo*0.30+tortuga*0.40); presupuesto="labandocarros";
    break;
    case "D": precio=(gato*0.30+conejo*0.15+tortuga*0.15+perro*0.40); presupuesto="limpiando";
    break;
    case "M": precio=(conejo*0.10+tortuga*0.30+perro*0.20+gato*0.40); presupuesto="mandados"; 
    break;
    default: System.out.println("No Existe la Opción!!..intente nuevamente!"); break; 
  }
  //Datos de salida:
  System.out.println("el presupuesto para comprar una mascota es de: "+precio+" y se comprara una mascota de: "+presupuesto);
}
public static void main(String[] arg){
 //ejercicio01();
 ejemplopropuestodegino();
}
}