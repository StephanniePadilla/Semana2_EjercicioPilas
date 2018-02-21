import java.util.Stack;
//import java.lang.Excepciones;

public class StackImpl <E> extends Stack<E>{
    private E [] elemento;
    private int ocupacion;
    //METODOS
    //push (añadir)
    public void push1 (E e) { //Añadir excepcion de pila llena
        this.elemento[this.ocupacion] = e;
        this.ocupacion++;
    }
    //pop (sacar)
    public E pop () {//Añadir la excepcion de pila vacia
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
