import java.util.Scanner;
class ejercicio5{
static Scanner teclado=new Scanner(System.in);
public static void AhorrodetodoslosdiasAnualmente() {
    //variables 
    double AhorrodetodoslosdiasAnualmente;
    //datos de entrada 
    double ahorro1Enero=3;//dia 1
   //sabiendo que un año tiene 365 dias
    for (int dia = 1; dia <= 365; dia++) {
        System.out.println("lo ahorrado en el");
        AhorrodetodoslosdiasAnualmente=Math.pow(ahorro1Enero,dia);
        System.out.println("dia "+dia+" es "+AhorrodetodoslosdiasAnualmente+ " pesos");
    //datos de salida
    System.out.println("la persona ahorra en pesos diariamente : "+dia);
    }  
    public static void main(String[] arg){AhorrodetodoslosdiasAnualmente();
}
}