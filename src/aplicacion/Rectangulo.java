
package aplicacion;


public class Rectangulo {
   private float base;
   private float altura;
   
   public Rectangulo(){
       
   }
   public Rectangulo(float b, float al){
       base= b;
       altura = al;
   } 
   public float calcularArea(){
       return base* altura;
   }
   public float calcularPerimetro(){
      return 2*base+2*altura ;  
   }

}

