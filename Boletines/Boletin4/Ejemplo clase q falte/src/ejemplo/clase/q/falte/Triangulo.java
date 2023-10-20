
package ejemplo.clase.q.falte;


public class Triangulo {
    //primero atributos
    
    private float base;
    private float altura;
    
    //metodos
    
    //crear constructores
    public Triangulo(float b,float al){
        base=b;
        altura=al;
    }
    
    //metodos de acceso
    
    public void calcularArea(){
        float area=base*altura/2;
        System.out.println("area = "+area);
    }
    
}
