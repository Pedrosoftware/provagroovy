package groovy.entity

import groovy.dao.ProdutoDao

/**
 * Created by pedro on 18/07/17.
 */
class Carrinho {

    private Map<String, Item> itens
    private ProdutoDao dao
    private Item item
    Carrinho(){
        itens = [:]
        dao = new ProdutoDao()
    }

    void add(String prodNome){
        item = itens.get(prodNome)
        if(item){
            item.incrementarQtd()
            return
        }
        Produto p = dao.get(prodNome)
        itens[p.nome] = new Item(p)
    }

    void remove(String produto){
        item = itens.get(produto)
        if(item.qtd>1){
            item.decrementarQtd()
        }else{
            itens -= item
        }
    }

    Map<String, Item> getItens(){
        return itens
    }
}
