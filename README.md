### 7. Identifique e explique o(s) erro(s) na classe abaixo:

```
class Registro De Eleitor
{
    /**
    * Declaração dos campos desta classe
    */
    int tituloDeEleitor; // número do título do eleitor
    String nome; // nome do eleitor
    short zonaEleitoral; // número da zona eleitoral
} // fim da classe
```

> O espaçamento entre as palavras no nome da classe.

***

### 8. Identifique e explique o(s) erro(s) na classe abaixo:

```
class Teste2
{
    /**
    * Declaração dos campos desta classe
    */
    int num1,num2;
    /**
    * Declaração dos métodos desta classe
    */
    int maior()
    {
    if (num1 > num2)
        
    else return false;
    }
        void menor()
    {
    if (num1 < num2)
        return num1;
    else return num2;
    }
} // fim da classe
```

> As váriaveis não foram inicializadas, então não é possivel fazer as comparações.

***

### 9. Identifique e explique o(s) erro(s) na classe abaixo.

```
class TesteImpressao
{
    main(String[] args)
    {
        System.out.println(“7+2=”+(7+2));
        System.out.println(“7-2=”+(7-2));
        System.out.println(“7*2=”+(7*2));
        System.out.println(“7/2=”+(7/2));
        return true;
    }
} // fim da classe
```

> A main foi inicializada de forma errada, o jeito certo seria:
```
public static boolean main(String[] args)
```
***

