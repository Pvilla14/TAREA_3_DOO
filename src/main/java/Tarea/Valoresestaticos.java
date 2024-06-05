package Tarea;

public enum Valoresestaticos {
    /**
     * se definen los distintos pruductos y su precio, y en el main se selecciona el producto q se quiere y en el costructor se le asosia su precio
     */
    COCA(1200),
    SPRITE(1000),
    FANTA(100),
    SERRANITA(500),
    SNICKERS(1500),
    SUPER8(200);

    private final int coste;

    public int getCoste() {//getter que retorna coste, q se define en el constructor
        return coste;
    }

    private Valoresestaticos(final int aux){
        coste = aux;
    }
}