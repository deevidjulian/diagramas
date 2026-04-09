public class clientemayorista extends cliente {
    private int cantidadproductos;

    public clientemayorista(String nombre, String id, double valor, int cantidad) {
        super(nombre, id, valor);
        this.cantidadproductos = cantidad;
    }

    @Override
    public double calculartotalcompra(){
        double total;
        if (cantidadproductos > 50) total = valorcompra * 0.50;
        else if (cantidadproductos > 20) total = valorcompra * 0.65;
        else total = valorcompra * 0.80;

        return (total > 500000) ? 500000 : total;
    }
}