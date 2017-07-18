package groovy.entity

abstract class Promocao{

    int idPromocao
    int qtdParaCombo
    double precoUnitario
    double qtdCobrarNoCombo
    double valorCombo
    int totalCombos
    int totalProdAlemCombo


    Promocao(int precoUnitario){
        this.precoUnitario = precoUnitario
    }


    Promocao(int idPromocao, int precoUnitario, double qtdParaCombo, int qtdCobrarNoCombo){
        this(precoUnitario)
        this.idPromocao = idPromocao
        this.qtdParaCombo = qtdParaCombo
        this.qtdCobrarNoCombo = qtdCobrarNoCombo
    }

    Promocao(int idPromocao, int precoUnitario, double qtdParaCombo, double valorCombo){
        this(precoUnitario)
        this.idPromocao = idPromocao
        this.qtdParaCombo = qtdParaCombo
        this.valorCombo = valorCombo
    }
    
    abstract double aplicar(int qtdProdutos)

    private definirTotalCombos(qtdProdutos){
        totalCombos = 0
        if(qtdProdutos >= this.qtdParaCombo && this.qtdParaCombo > 0) {
            totalCombos = qtdProdutos / this.qtdParaCombo
        }
    }

    private definirTotalAlemCombo(qtdProdutos){
        totalProdAlemCombo = qtdProdutos - (totalCombos * qtdParaCombo)
    }

    protected definirComboEResto(qtdProdutos){
        definirTotalCombos(qtdProdutos)
        definirTotalAlemCombo(qtdProdutos)
    }
}