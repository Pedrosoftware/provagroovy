package groovy.entity
/**
 * Created by pedro on 18/07/17.
 */
class PromocaoLeveXpagueY extends Promocao{

    PromocaoLeveXpagueY(int idPromocao, int precoUnitario, double qtdParaCombo, int qtdCobrarNoCombo) {
        super(idPromocao, precoUnitario, qtdParaCombo, qtdCobrarNoCombo)
    }

    @Override
    double aplicar(int qtdProdutos) {
        super.definirComboEResto(qtdProdutos)
        double valorCombo = this.qtdCobrarNoCombo * this.precoUnitario
        double valorAlemCombo = this.totalProdAlemCombo * this.precoUnitario
        return (valorCombo * this.totalCombos) + valorAlemCombo
    }
}
