
import src.pe.edu.upeu.util.TecladoRead;
import src.pe.edu.upeu.util.ejemplorecursivo;
import src.pe.edu.upeu.util.subprogramaGYV;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("eres arte bb no lo olvides nunca :v");
       
        subprogramaGYV gino =new subprogramaGYV();
       gino.calcularFuncionExponecial();
       ejemplorecursivo lol =new ejemplorecursivo();
       TecladoRead lolp=new  TecladoRead();
       int numero=lolp.read(0, "Indroducir un numero:");
       System.out.println("factorial iterativo: "+lol.factorialBig(numero)); 
       System.out.println("factorial Recursivo: "+lol.factorialBigRecur(numero));
       System.out.println("fibonaci iterativo: "+lol.fibonaci(numero)); 
       System.out.println("fibonaci Recursivo: "+lol.fibonaciRecur(numero)); 
      
    }
}
