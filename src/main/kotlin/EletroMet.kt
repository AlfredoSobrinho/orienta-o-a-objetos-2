class EletroMet {

    var TipodeRede = 0 // 1 para 4g//2 para 5g
    var Tipocamera = ""
    var Valor = 0.0


    fun eletroC() {

        println(
            "Segue as informações do Eletronico:" +
                    "\nTipo de Rede - $TipodeRede" +
                    "\nTipo de camera - $Tipocamera" +
                    "\nValor - $Valor"
        )


    }
}