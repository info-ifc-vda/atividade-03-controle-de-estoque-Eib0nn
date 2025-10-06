public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("001", "Camiseta", 50.0, 100, 10);

        System.out.println(produto);

        produto.vender(20); 
        produto.vender(150); 

        produto.repor(30); 

        produto.aplicarDesconto(10); 

        System.out.println(produto);
    }
}
