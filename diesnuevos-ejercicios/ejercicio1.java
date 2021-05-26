import java.util.Scanner;
public class ejercicio1 {
    static Scanner tecladoj=new Scanner(System.in);
     public static void salario() {
       //definir variables y otros gyv
         int añosgyv=1;
    double salario=1500;
       //proseso
      while (añosgyv<=6) {
       salario=(salario*0.1)+salario;
       //datos de salida
       System.out.println("su salario del año es:"+añosgyv+"es:"+salario);
       añosgyv++;   
      }
    }


    public static void main(String[] args) {
        salario();
}
}