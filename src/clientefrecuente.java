public class clientefrecuente extends cliente {

    private int numerocompras;

    public clientefrecuente(String nombre, String id, double valor, int numerocompras) {
        super(nombre, id, valor);
        this.numerocompras = numerocompras;
    }

    @Override
    public double calculartotalcompra() {

        double desc;

        if (numerocompras > 20) {
            desc = 30;
        } else if (numerocompras > 10) {
            desc = 20;
        } else {
            desc = 10;
        }

        double total = valorcompra - descontar(desc);

        if (compraalta()) {
            total -= descontar(5);
        }

        return total;
    }
}