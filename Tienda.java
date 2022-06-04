package Actividad_C1_A2_01;

public class Tienda {
    Pedido pedido;
    byte op;
    String nombre;
    Cliente cliente;

    public Tienda(byte op, String nombre) {

        this.op = op;
        this.nombre = nombre;
    }
    public Pedido SendPedido(){
        return pedido = new Pedido(cliente = new Cliente(nombre),op);
    }
}
