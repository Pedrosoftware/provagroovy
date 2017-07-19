package groovy.entity

/**
 * Created by pedro on 18/07/17.
 */
class Caixa {

    private Carrinho carrinho
    private double precoCompra = 0
    private double precoDesconto = 0

    Caixa(Carrinho carrinho){
        this.carrinho = carrinho
    }

    double getTotalDiscount(){
        this.calValues()
        return precoDesconto
    }

    private void calValues(){
        Produto produto
        double precoProdAtualComDesc
        double precoProdAtualSemDesc
        precoCompra = 0
        precoDesconto = 0
        for(item in carrinho.itens){
            produto = item.value.produto
            precoProdAtualComDesc = getPrecoProdComPromocao(produto,item.value.qtd)
            precoProdAtualSemDesc = produto.precoUnit * item.value.qtd
            precoCompra += precoProdAtualComDesc
            precoDesconto += precoProdAtualSemDesc - precoProdAtualComDesc
        }
    }

    double getTotalPrice(){
        this.calValues()
        return precoCompra
    }

    private static double getPrecoProdComPromocao(Produto produto, int qtd){
        double menorPreco = 0
        double precoPromocao
        for(promocao in produto.promocoes){
            precoPromocao = promocao.aplicar(qtd)
            if(!menorPreco || menorPreco > precoPromocao){
                menorPreco = precoPromocao
            }
        }
        return menorPreco
    }

}
