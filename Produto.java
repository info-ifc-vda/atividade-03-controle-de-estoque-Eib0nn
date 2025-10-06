public class Produto {

    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int estoqueMinimo;

    public Produto(String codigo, String nome, double preco, int quantidadeEstoque, int estoqueMinimo) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco); 
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
    }

    
    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return;
        }

        if (quantidade > quantidadeEstoque) {
            System.out.println("Não há estoque suficiente para vender essa quantidade.");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso. Estoque atual: " + quantidadeEstoque);
        }

        
        if (verificarEstoqueBaixo()) {
            System.out.println("Atenção: Estoque abaixo do mínimo!");
        }
    }

   
    public void repor(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }
        quantidadeEstoque += quantidade;
        System.out.println("Reposição realizada com sucesso. Estoque atual: " + quantidadeEstoque);
    }

    
    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual de desconto inválido.");
            return;
        }

        preco -= preco * (percentual / 100);
        System.out.println("Desconto aplicado. Novo preço: R$ " + preco);
    }

    
    private boolean verificarEstoqueBaixo() {
        return quantidadeEstoque < estoqueMinimo;
    }

    
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo. O preço não foi alterado.");
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
 
    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", estoqueMinimo=" + estoqueMinimo +
                '}';
    }
}

