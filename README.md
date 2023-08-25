# ExerciciosNT
Exercicios de Java.


 Exercicios da primeira semana de Java. Exercícios de lógica

1 -  Imprima todos números pares de 0 a 100.

2 -  Imprima todos os números primos de 0 a 1000.

3 -  Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.

4 -  Uma pessoa possui { nome cpf, rg, idade}

    Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
    Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
    Monte a estrutura de classes, instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista
    
5 -  Crie um método que receba um número inteiro e gere uma matriz identidade a partir deste número.
Exemplo: 
       
        Número: 3
            
        Matriz:
        
            1    0    0
            0    1    0
            0    0    1
            
6 - Crie um método que receba o custo e o pagamento, ele deve imprimir no console as seguintes informações:
Valor do troco:

Troco em menor quantidade de notas e moedas possíveis
        exemplo:
        
            custo:
                R$ 17,35
                
            pagamento:
                R$ 20,00
                
            troco:
                R$ 2,65
                
            menor troco:
                1 - nota de 2
                1 - moeda de 50
                1 - moeda de 10
                1 - moeda de 5 


                Exercicios da segunda semana de Java.

                1 - Implemente um método que receba um número e imprima o resultado do fatorial deste número.
2 - Implemente a cifra de César para criptografar e descriptografar uma mensagem.
    A aplicação deve:
        
COLETAR DADOS:

          • Receber um texto
          • Receber um número
          
OFERECER OPÇÕES:

        1 - para criptografar
        2- para descriptografar
        
REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:

3 -  Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
    A aplicação deve:
        
COLETAR DADOS:

          • Receber um texto
          • Receber uma palavra chave
          
OFERECER OPÇÕES:

        1 - para criptografar
        2- para descriptografar
        
REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:
4 - Crie uma interface chamada usuário, ela deve possuir os seguintes métodos:
        
METODOS DA INTERFACE

          + Double getValorDesconto(double valorProduto)

            + String getTipoUsuario()

            + String getValorFreteDesconto(double valorValorFrete, double valorProduto)
    Agora crie 3 classes que implemente esta interface 

USUARIO BASE

          getValorDesconto = ganha 5% se o valorProduto for maior que 300 reais
          getTipoUsuario = retorna que é base
          getValorFreteDesconto = ganha 5% se o valorProduto for maior que 300 reais
          
USUARIO STANDART

        getValorDesconto = ganha 15% se o valorProduto for maior que 200 reais
        getTipoUsuario = retorna que é standart
        getValorFreteDesconto = ganha 10% se o valorProduto for maior que 200 reais
        
USUARIO PREMIUM

      getValorDesconto = ganha 30% se o valorProduto for maior que 200 reais
      getTipoUsuario = retorna que é premium
      getValorFreteDesconto = ganha frete grátis se o valorProduto for maior que 100 reais

Crie um menu que instancie 3 usuário, cada um implementado com um tipo diferente, passe o mesmo valor de produto e frete para todos     Apresente a diferença no console 
