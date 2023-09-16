# Atividade do Professor Alan - Bicicleta

## Descrição
Este é um projeto de uma bicicleta desenvolvido como parte de uma atividade atribuída pelo Professor Alan. A bicicleta possui funcionalidades como acelerar, frear, aumentar e diminuir marchas, e é implementada em Java.

## Funcionalidades
- **Acelerar:** Aumenta a velocidade da bicicleta, aumentando a marcha automaticamente em certos limites de velocidade.
- **Frear:** Reduz a velocidade da bicicleta, diminuindo a marcha automaticamente em certos limites de velocidade.
- **Aumentar Marcha:** Aumenta manualmente a marcha da bicicleta, desde que não seja excedido o limite máximo de marchas (7).
- **Diminuir Marcha:** Diminui manualmente a marcha da bicicleta, desde que não seja inferior à marcha mais baixa (0).
- **Limites de Velocidade:** A velocidade da bicicleta é limitada a um máximo de 100 unidades de velocidade.
- **Limites de Marcha:** A bicicleta possui um máximo de 7 marchas e uma marcha mínima de 1.

## Como Usar
1. Compile e execute a classe `Bicicleta` para criar uma instância da bicicleta.
2. Use os métodos fornecidos para interagir com a bicicleta, como `acelerar`, `frear`, `aumentarMarcha` e `diminuirMarcha`.
3. Verifique a velocidade atual e a marcha com os métodos `getVelocidade` e `getMarcha`.

## Exemplo de Uso
```java
public static void main(String[] args) {
    Bicicleta bicicleta = new Bicicleta();
    
    bicicleta.acelerar();
    System.out.println(bicicleta.imprimirEstados()); // Imprime informações da bicicleta
    
    bicicleta.frear();
    System.out.println(bicicleta.imprimirEstados()); // Imprime informações da bicicleta após frear
}
```