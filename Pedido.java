import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private ArrayList<ItemPedido> listaItens;
    private double total;

    public Pedido(){

    }
    
    public Pedido(int num, ArrayList<ItemPedido> listaItens){
        this.numero = num;
        this.listaItens = listaItens;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public static void main(String[] args) {
        // Lista de itens do pedido 1
        ItemPedido item1 = new ItemPedido(50.0);
        ItemPedido item2 = new ItemPedido(50.0);
        ItemPedido item3 = new ItemPedido(50.0);
        ArrayList<ItemPedido> listaItens1 = new ArrayList<>();
        listaItens1.add(item1);
        listaItens1.add(item2);
        listaItens1.add(item3);
        // Lista de itens de pedido 2
        ItemPedido item4 = new ItemPedido(12.0);
        ItemPedido item5 = new ItemPedido(3.0);
        ItemPedido item6 = new ItemPedido(1230.0);
        ArrayList<ItemPedido> listaItens2 = new ArrayList<>();
        listaItens2.add(item4);
        listaItens2.add(item5);
        listaItens2.add(item6);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1,listaItens1));
        pedidos.add(new Pedido(2,listaItens2));
        for(Pedido pedido : pedidos){
            ArrayList<ItemPedido> listaItens = pedido.getListaItens();
            double total = 0;
            for(ItemPedido item : listaItens){
                total += item.getValor();
            }
            pedido.setTotal(total);
            System.out.println("Total pedido numero "+pedido.getNumero()+": "+total);
            if(total > 500){
                System.out.println("O pedido de numero "+pedido.getNumero()+" é maior que 500");
            }
        }
    }

}

