
public class Stack<E> extends StackImpl{
    //atributos
    private E [] elemento;
    public int ocupacion;

    //push (añadir)
    public void push (E e) { //Añadir la excepcion
        this.elemento[this.ocupacion] = e;
        this.ocupacion ++;
    }
    //pop (sacar)
    public E pop (){//Añadir la excepcion
        E e = this.elemento[this.ocupacion-1];
        this.elemento[this.ocupacion - 1] = null;
        this.ocupacion--;
        return e;
    }
    //size
    public int size (E e){
        return this.ocupacion;
    }
}