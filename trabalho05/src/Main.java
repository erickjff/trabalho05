
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        clientes.connect();
        clientes.createTable();
        clientes.insertClient("Rodrigo");
        System.out.println("Cliente inserido.");
        clientes.queryClients();
        System.out.println("Senha inserida.");
        clientes.queryClients();
        clientes.updateClient(1,"erick");
        System.out.println("Cliente atualizado.");
        clientes.insertsenha(12345, 1);
        clientes.insertcontato(1234567,1);
       // clientes.deleteClient(1);
        clientes.close();
    }

}




