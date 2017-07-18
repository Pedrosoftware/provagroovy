package groovy.entity
/**
 * Created by pedro on 18/07/17.
 */
class PromocaoLeveXporY extends Promocao{

    PromocaoLeveXporY(int idPromocao, int precoUnitario, double qtdParaCombo, double valorCombo) {
        super(idPromocao, precoUnitario, qtdParaCombo, valorCombo)
    }

    @Override
    double aplicar(int qtdProdutos) {
        super.definirComboEResto(qtdProdutos)
        double valorCombo = this.valorCombo * this.totalCombos
        double valorAlemCombo = this.precoUnitario * this.totalProdAlemCombo
        return valorCombo + valorAlemCombo
    }
}
