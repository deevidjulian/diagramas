public class clienteregular extends cliente {
    public clienteregular(String nombre, String identificacion, double valorcompra){
        super(nombre,identificacion,valorcompra);
    }
    public double calculartotalcompra(){
        if (valorcompra > 300000) return valorcompra - descontar(8);
        if (valorcompra > 150000) return valorcompra - descontar(5);
        if (valorcompra < 60000)  return valorcompra + aumentar(6);
        return valorcompra;
    }
}
