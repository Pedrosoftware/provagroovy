package groovy.entity

class Produto{
    private String nome
    private double precoUnit
    private List<Promocao> promocoes

    Produto(nome, precoUnit){
        promocoes = []
        this.nome = nome
        this.precoUnit = precoUnit
    }

    Produto(nome, precoUnit, promocao){
        this(nome,precoUnit)
        promocoes += promocao
    }

    void setPromocoes(promocao) {
        promocoes += promocao
    }
}