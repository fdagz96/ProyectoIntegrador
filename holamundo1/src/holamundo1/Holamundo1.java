
package holamundo1;

public class Holamundo1 {

    public static void main(String[] args) {

       boolean isTrue;
       isTrue = true;
       boolean isFalse = false;
       System.out.println("El valor de isTrue: " + isTrue);
       System.out.println("El valor de isFalse: " + isFalse);
        
       byte b1 = -128;
       System.out.println(b1);
        
       char letra = 'c';
       char letraNum = 99; // se imprime 'c' por el código ascii
        
       System.out.println(letra);
       System.out.println(letraNum);
      
       double d1 = 1.393939d;
       float f1 = 1.393939f;
       
       int i1 = 8+3+2;
       System.err.println("El valor de i1 es:" +i1);
        
       // Manejo de operadores
       int a = 3, b = 3;
       int c = a + b;
       int d = a * b;
       int e = a / b;
       int f = a % b;
       
       System.out.println("El valor de a: " + a);
       System.out.println("El valor de 6: " + b);
       System.out.println("El valor de c: " + c);
       System.out.println("El valor de d: " + d);
       System.out.println("El valor de e: " + e);
       System.out.println("El valor de f: " + f);
       
       // Concatenación
       System.out.println(" c: " + c + " d: " + d + " e: " + e + " f: " + f);
        
       System.out.println("incremento después de " + "la variable:" + a++);
       System.out.println("incremento antes de " + "la variable:" + ++b);

       boolean esVerdadero = false;
       String ternary = esVerdadero ? "verdadero": "falso"; // es como un if
       System.out.println(ternary);
              
                 
    }
    
}
