import  java.util.Scanner;
public class proyectofinal {
    public static void main(String[] args) 
    {
      String nomnbre;
      double tc, compra1,compra2,compra3, pc;
         Scanner lectura =  new Scanner (System.in);
      
      System.out.println("Nombre de empleado ");
     nomnbre = lectura.next();
     
     System.out.println("compra 1 : ");
     compra1 = lectura.nextDouble(); 
     
     System.out.println("compra 2 :  ");
     compra2 = lectura.nextDouble(); 
   
       System.out.println("compra 3 :  ");
       compra3 = lectura.nextDouble(); 
   
     tc = compra1+compra2+compra3;
     pc = tc/3;   
     System.out.println("nombre: " +nomnbre);
     System.out.println("total de compra: " +tc);
     System.out.println("Promedio compras : " +pc);  
    }
}
