package Tarea.mensajeerror;

public class ProductoNoRetiradoException extends Exception{
    public ProductoNoRetiradoException(){
        super("Tiene que retiar el producto antes de comprar uno nuevamente");
    }
}
