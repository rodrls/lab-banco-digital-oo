import java.util.ArrayList;
import java.util.List;
public class ListaClientes {
    //atributo
    private List<Cliente> listaClientes;

    public ListaClientes() {
        this.listaClientes = new ArrayList<>();
    }    
    public void adicionarCliente(String nome){
        listaClientes.add(new Cliente(nome));
    }
    public int totalClientes(){
        return listaClientes.size();
    }
    public void descreverClientes(){
        
        System.out.println(listaClientes);
    }

    public static void main(String[] args) {
        //cria nova lista
        ListaClientes listaClientes = new ListaClientes();

        //imprime quantidade de clientes na lista recem criada que esta zerada
        System.out.println("total de clientes: "+ listaClientes.totalClientes());

        //adiciona cliente1 na lista
        listaClientes.adicionarCliente("Cliente 1");

        //imprime total de clientes
        System.out.println("total de clientes: "+ listaClientes.totalClientes());

        //adiciona cliente2 na lista
        listaClientes.adicionarCliente("Cliente 2");

        //imprime total de clientes
        System.out.println("total de clientes: "+ listaClientes.totalClientes());

        listaClientes.descreverClientes();

        
    }

}


