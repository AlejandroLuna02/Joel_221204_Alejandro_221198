package Actividad_C1_A2_01;

public class Pedido {
    Cliente cliente;
    CatalagoPizza piza = new CatalagoPizza();
    byte op;


    public Pedido(Cliente cliente, byte op) {
        this.cliente = cliente;
        this.op = op;
    }

    public Pizza SendPizza(){
        Pizza pizza1 = piza.sendPizza((byte) ((byte)op));
        return pizza1;
    }
    public Cliente getCliente(){
        return cliente;
    }


}
