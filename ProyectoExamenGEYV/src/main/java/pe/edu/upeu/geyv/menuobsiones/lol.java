package pe.edu.upeu.geyv.menuobsiones;

public class lol {
    public static void menuMain() {
        String mensaje="Seleccion el algoritmo que desea probar:"+
        "\n1=suma10NumerosMientras"+
        "\n2=suma10NumerosHacerMientras"+
        "\n3=suma10NumerosPara"+
        "\n0=Salir del sistema"
        ;
        System.out.println(mensaje);
        int opciones=objTeclado.nextInt();         
        do {
            switch (opciones) {
                case 1: ejercicio01(); break;
                case 2: recursivo(20); break;
                case 3: isPerfect(); break;  
                case 4: numeroperfecto(); break;
                // profesor gracias por la ayuda disculpe 
                //este metodo solo funciona en el replit
                //creo por que a qui me manda error lo copie
                //tal como esta soy gino elvis yujra vargas 
                      
                default:System.out.println("Opcion no existe");   break;
            }            
            if (opciones!=0){ 
            System.out.println("Desea probar otraves? "+mensaje);
            opciones=objTeclado.nextInt(); 
            }            
        }while (opciones!=0);
    }

    public static void main(String[] args) { 
        menuMain();
    }
      
}
    

