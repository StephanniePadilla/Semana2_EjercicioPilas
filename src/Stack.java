
public class Stack<E> extends StackImpl{
    //atributos
    private E [] elemento;
    private int ocupacion;

    //push (añadir)
    public void push (E e) { //Añadir la excepcion
        this.elemento[this.ocupacion] = e;
        this.ocupacion ++;
    }
    //pop (sacar)
    public E pop (E e){//Añadir la excepcion
        return this.elemento[ocupacion-1];
        this.elemento[ocupacion - 1] = null;
        this.ocupacion--;
         }
    //size
    public int size (E e){
        return this.ocupacion;
    }
}
