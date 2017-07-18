package groovy.entity

/**
 * Created by pedro on 18/07/17.
 */
class Item {

    Produto produto
    private int qtd

    Item(Produto produto) {
        this.produto = produto
        qtd = 1
    }

    int getQtd(){
        return qtd
    }

    void incrementarQtd(){
        qtd++
    }
    void decrementarQtd(){
        qtd--
    }
}
