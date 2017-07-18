package groovy.entity

class Produto{
    String nome
    double precoUnit
    ArrayList<Promocao> promocoes

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