package groovy.entity

abstract class Promocao{

    private int idPromocao
    private int qtdParaCombo
    private double precoUnitario
    private double qtdCobrarNoCombo
    private double valorCombo
    private int totalCombos
    private int totalProdAlemCombo

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


    protected double getPrecoUnitario() {
        return precoUnitario
    }

    protected double getQtdCobrarNoCombo() {
        return qtdCobrarNoCombo
    }

    protected double getValorCombo() {
        return valorCombo
    }

    protected int getTotalCombos() {
        return totalCombos
    }

    protected int getTotalProdAlemCombo() {
        return totalProdAlemCombo
    }



}