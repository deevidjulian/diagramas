public class cliente{
    protected  String nombre ;
    protected  String identificacion;
    protected  double valorcompra;


    public cliente(String nombre,String identificacion, double valorcompra){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.valorcompra = valorcompra;
    }


 //constructor
    public double calculartotalcompra(){
    return valorcompra;
    }

    public double descontar(double porcentaje){
        return valorcompra * (porcentaje / 100);
    }

    public double aumentar(double porcentaje) {
        return valorcompra * (porcentaje / 100);
    }

    public boolean compraalta() {
        return valorcompra > 300000;
    }

    public  void imprimirresumen(double total) {
        System.out.println("###############################");
        System.out.println("nombre:" + nombre);
        System.out.println("ID:" + identificacion);
        System.out.println("precio compra original:$$" + valorcompra);
        System.out.println("VALOR FINAL:" + total);
        System.out.println("###############################");
    }

    //gheters
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
}




