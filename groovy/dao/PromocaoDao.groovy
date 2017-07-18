package groovy.dao

import groovy.entity.Promocao
import groovy.entity.PromocaoLeveXpagueY
import groovy.entity.PromocaoLeveXporY
import groovy.entity.PromocaoNulla

/**
 * Created by pedro on 18/07/17.
 */
class PromocaoDao {

    Map<Integer, Promocao> promocoes;

    PromocaoDao(){

        Promocao a = new PromocaoLeveXporY(1,50,3,130)
        Promocao a2 = new PromocaoLeveXporY(5,50,7,300)
        Promocao b = new PromocaoLeveXporY(2,30,2,45)
        Promocao c = new PromocaoLeveXpagueY(3,20,3,2)
        Promocao d = new PromocaoNulla(15)
        promocoes = [:]
        promocoes[1] = a
        promocoes[2] = b
        promocoes[3] = c
        promocoes[4] = d
        promocoes[5] = a2
    }

    Promocao get(key){
        return promocoes.get(key)
    }
}
