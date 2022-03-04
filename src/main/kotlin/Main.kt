fun main(args: Array<String>) {

   /* 3) Crie uma classe produto eletrônico e apresente os
    atributos e métodos referentes esta classe, em seguida crie
    um objeto produto eletrônico, defina as instancias deste objeto e
    apresente as informações deste objeto no console.
*/

    val celular =ProdutoEletronico()

    celular.marca="Sansung"
    celular.modelo= "S20"
    celular.cor = "Preto"
    celular.tipo = "Smartphone"
    celular.Qmemoria= "32 Gigas"



    println("Marca do Celular - ${celular.marca}")
    println("Modelo do Celular - ${celular.modelo}")
    println("Cor - ${celular.cor}")
    println("Tipo de Celular - ${celular.tipo}")
    println("Quantidade de Memória - ${celular.Qmemoria}")





    val cel = EletroMet()

    cel.TipodeRede = 1
    cel.Tipocamera = "16 megapixels"
    cel.Valor = 1800.0
    println("\n")




    cel.eletroC()








}