package groovy.entity

/**
 * Created by pedro on 18/07/17.
 */
class PromocaoNulla extends Promocao{


    PromocaoNulla(int precoUnitario) {
        super(precoUnitario)
    }

    @Override
    double aplicar(int qtdProdutos) {
        return this.precoUnitario * qtdProdutos
    }
}
