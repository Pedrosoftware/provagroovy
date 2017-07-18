package groovy.dao

import groovy.entity.Produto

/**
 * Created by pedro on 18/07/17.
 */
class ProdutoDao {

    Map<String, Produto> produtos
    PromocaoDao dao

    ProdutoDao(){
        dao = new PromocaoDao()
        Produto a = new Produto("A", 50, dao.get(1))
        a.setPromocoes(dao.get(5))
        Produto b = new Produto("B", 30, dao.get(2))
        Produto c = new Produto("C", 20, dao.get(3))
        Produto d = new Produto("D", 15, dao.get(4))

        produtos = [:]
        produtos.a = a
        produtos.b = b
        produtos.c = c
        produtos.d = d
    }

    Produto get(String nome){
        return produtos.get(nome.toLowerCase())
    }

}
