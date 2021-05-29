package com.digitalinovation.santanderdevweek.data.local

import com.digitalinovation.santanderdevweek.data.Cartao
import com.digitalinovation.santanderdevweek.data.Cliente
import com.digitalinovation.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta{
        val cliente = Cliente("Lua")
        var cartao = Cartao("0000")
        val conta = Conta("000000-0","000-1","0.00","1.000",cliente,cartao)
        return conta
    }

}