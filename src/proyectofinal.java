import  java.util.Scanner;
public class proyectofinal {
    public static void main(String[] args) 
    {
      String nomnbre;
   double tc, compra1,compra2,compra3, pc,igv,mb, total; //mb  monto base
         Scanner lectura =  new Scanner (System.in);
      
      System.out.println("Nombre de empleado ");
     nomnbre = lectura.next();
     
     System.out.print("compra 1 : ");
     compra1 = lectura.nextDouble(); 
     
     System.out.print("compra 2 :  ");
     compra2 = lectura.nextDouble(); 
   
       System.out.print("compra 3 :  ");
       compra3 = lectura.nextDouble(); 
     tc = compra1+compra2+compra3;
     pc = tc/3;   
     mb = tc / 1.18;          // monto base
     igv = mb * 0.18;         // IGV correcto
     total = igv + mb;
     System.out.println("nombre: " +nomnbre);
     System.out.println("total de compra: " +tc);
     System.out.println("Promedio compras : " +pc);  
      System.out.println("igv : " +igv );  
       System.out.println("monto base : " +mb );    
         System.out.println("validar el monto  : " +total );
    }
}
