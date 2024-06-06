package Tarea;
import Tarea.clasebebida.CocaCola;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;
import Tarea.clasedulces.*;
import Tarea.clasebebida.Bebida;
import Tarea.clasebebida.Fanta;
import Tarea.clasebebida.Sprite;

public class Expendedor {
    private Deposito<Bebida> coca;//Depositos de Bebida sabor cocacola
    private Deposito<Bebida> sprite;//Depositos de Bebida sabor sprite
    private Deposito<Bebida> fanta;//Depositos de Bebida sabor fanta
    private Deposito<Dulces> serranita;//Depositos de Dulces tipo serranita
    private Deposito<Dulces> snickers;//Depositos de Dulces tipo snickers
    private Deposito<Dulces> super8;//Depositos de Dulces tipo super8
    private Deposito<Moneda> monVu;//Depositos de Monedas para el vuelto
    private Producto Compra;

    public Deposito<Moneda> getVuelto(){
        return monVu;//retorna las monedas q se encuentran en el deposito de monedas
    }
    public void vaciarVuelto(){
        monVu.vaciar();
    }
    /**
     * metodo que, de ser posible, compra un producto y lo guarda en Compra
     * @author Pablo Villagrán-Lucas Morales
     * @param saldo es el valor total de las monedas q hay en  la billetera
     * @param producto es el tipo de producto se pide, viene con el precio de este y se instancia en el main
     * @throws Exception manda la excepción de PagoIncorectoException si se usa una moneda no instanciada o de tipo null
     */
    public void comprarProducto(int saldo, Valoresestaticos producto, Deposito<Moneda> billetera) throws Exception{
        if(saldo == 0 || billetera == null){//si la moneda no tiene valor o no está definida manda una excepcion del tipo PagoIncorrectoException
            throw new PagoIncorrectoException();
        }
        if(producto == null){//manda la excepción si se intenta comprar un elemento null o algo no definido en Valoresestaticos
            throw new ProductoInexistenteException();
        }
        if( saldo < producto.getCoste()){//si el valor de la moneda el menor al precio del producto manda un excepción del tipo
            for(int i = 0; i < saldo; i+= 100){//agrega monedas hasta que la cantidad sea igual a la diferencia entre el
                monVu.addElemento(new Moneda100(1));                  //precio del producto y el valor de la moneda dada
            }
            billetera.vaciar();
            throw new PagoInsuficienteException();
        }
        billetera.vaciar();

        for(int i = producto.getCoste(); i < saldo; i+= 100){//agrega monedas hasta que la cantidad sea igual a la diferencia entre el
            monVu.addElemento(new Moneda100(1));                  //precio del producto y el valor de la moneda dada
        }

        Bebida auxBebida = null;
        Dulces auxDulces = null;

        switch (producto) {//segun el tipo de producto q se escogio entra a los distintos swich
            case COCA: //retorna una bebida de tipo cocacola si no manda excepción
                auxBebida = coca.getElemento();
                if (auxBebida == null){
                    throw new NoHayProductoException();
                }
                else{
                    Compra = auxBebida;//guarda el producto en el deppsoto del producto
                }
                break;

            case SPRITE: //retorna una bebida de tipo sprite si no manda excepción
                auxBebida = sprite.getElemento();
                if (auxBebida == null) {
                    throw new NoHayProductoException();
                }
                Compra = sprite.getElemento();//retorna el producto
                break;

            case FANTA: //retorna una bebida de tipo fanta si no manda excepción
                auxBebida = fanta.getElemento();
                if(auxBebida == null){
                    throw new NoHayProductoException();
                }
                else {
                    Compra = auxBebida;//retorna el producto
                }
                break;

            case SERRANITA: //retorna un dulce de tipo serranita si no manda excepción
                auxDulces = serranita.getElemento();
                if(auxDulces == null){
                    throw new NoHayProductoException();
                }
                Compra = auxDulces;//retorna el producto}
                break;

            case SNICKERS: //retorna un dulce de tipo calugas si no manda excepción
                auxDulces = snickers.getElemento();
                if(auxDulces == null){
                    throw new NoHayProductoException();
                }
                Compra = auxDulces;//retorna el producto
                break;

            case SUPER8: //retorna un dulce de tipo oreos si no manda excepción
                auxDulces = super8.getElemento();
                if(auxDulces == null){
                    throw new NoHayProductoException();
                }
                Compra = auxDulces;//retorna el producto
                break;

            default: throw new ProductoInexistenteException();//no retorna nada en caso de que no se escojiera un tipo de producto
        }
    }

    /**
     * entrega el producto comprado
     * @author Lucas MOrales
     * @return el producto q se compro en ComprarProducto
     */
    public Producto getCompra(){
        return Compra;
    }

    /**
     * Metodo para obtener uno de los depositos de xpendedor, y poder imprimir en JPanelExpendedor
     * @param tipo, un int para saber q deposito se busca
     * @return el deposito dependiendo del número
     */
    public Deposito getDepositos(int tipo){
        switch (tipo){
            case 1:
                return coca;
            case 2:
                return fanta;
            case 3:
                return sprite;
            case 4:
                return serranita;
            case 5:
                return snickers;
            case 6:
                return super8;
            default:
                return null;
        }
    }
    /**
     *@author Pablo Villagrán-Lucas Morales1    1
     * @param a se entrega el parametro para ver la cantidad de elementos con los q se llenan los depositos
     */
    public Expendedor(int a) {//se crean los distintos tipos de depositos
        coca = new Deposito<Bebida>();//tipo cocacola
        sprite = new Deposito<Bebida>();//tipo sprite
        fanta = new Deposito<Bebida>();//tipo fanta
        serranita = new Deposito<Dulces>();//tipo serranita
        snickers = new Deposito<Dulces>();//tipo calugas
        super8 = new Deposito<Dulces>();//tipo oreos
        monVu = new Deposito<Moneda>();//tipo monedas para el vuelto

        if (a > 0){
            for (int i = 0; i < a; i++) {//se crean las productos para llenar los depositos
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida fan = new Fanta(i);
                Dulces ser = new Serranita(i);
                Dulces cal = new Snickers(i);
                Dulces sup = new Super8(i);
                coca.addElemento(coc);//se agregan los productos a sus respectivos depositos
                sprite.addElemento(spi);
                fanta.addElemento(fan);
                serranita.addElemento(ser);
                snickers.addElemento(cal);
                super8.addElemento(sup);
            }
        }
    }
}