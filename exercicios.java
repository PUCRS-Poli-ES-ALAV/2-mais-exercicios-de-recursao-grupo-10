import java.util.ArrayList;

public class exercicios {

    public void main(String[] args) {
        // para testar os exercicios
        System.out.println("Teste para o exericio 1 ");
        System.out.println("Fatorial de 6 é " + fatorial(6));

        System.out.println("Teste para o exercicio 2");
        System.out.println("Somatorio de 5 é " + somatorio(5));

        System.out.println("Teste para o exercicio 3");
        System.out.println("o Fibonacci de 5 é " + fibo(5));

        System.out.println("Teste para o exercicio 4");
        System.out.println("o somatorio entre 3 e 5 é " + somatorioComRange(3, 5));

        System.out.println("Teste para o exercicio 5");
        System.out.println("a palavra arara é palindromo ?  " + isPal("arara"));

        System.out.println("Teste para o exercicio 6");
        System.out.println("o binario de 5 é  " + convBase2(5));

        System.out.println("Teste para o exercicio 7");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(5);
        System.out.println("o somatorio contido no array é " + somatorioArrayList(arrayList));

        System.out.println("Teste para o exercicio 8");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(6);
        arrayList2.add(3);
        arrayList2.add(5);
        arrayList2.add(6);
        System.out.println("o maior numero no array é " + findBiggest(arrayList2));

    }

    /**
     * 1. Modele e implemente um método recursivo que calcule o fatorial de um
     * número n passado como parâmetro.
     * 
     * MODELO
     * 1 -> Assinatura:
     * int fatorial(int n)
     * 
     * 2 -> oque ele faz:
     * ele retorna o fatorial de um numero passado por parametro. Exemplos de
     * fatoriais:
     * 5! = 5*4*3*2*1
     * 3! = 3*2*1
     * 
     * 3 -> casos de erro
     * numeros negativos
     * n<0
     * 4 -> casos base
     * n == 0 || n==1 -> retorna 1
     * 
     * 5 -> caso recursivo
     * n = 5
     * n! = 5x4x3x2x1
     * let(n)= n * let(n-1);
     */
    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório de um número
     * n (passado como parâmetro) até 0.
     * 1 -> Assinatura
     * int somatorio (n)
     * 
     * 2 oque ele faz ->
     * retorna o somatorio de um numero n até ele chegar ao zero, exemplo:
     * somatorio de 5 -> 5+4+3+2+1+0= 15
     * 
     * 3 caso de erro ->
     * não tem situações de erro, pois ele soma até numeros negativos
     * 
     * 4 caso base ->
     * n == 0 -> retorna 0;
     * 5 caso recursivo ->
     * n = 4
     * n = 4+3+2+1
     * caso recursivos
     * n5= 5 + 4 +3 +2 +1
     * 5 + somatorio 4 + somatoria 3 + somatorio 2...
     * ...
     * let(n)= n + let(n-1);
     */
    public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        }
        return n + somatorio(n - 1);
    }

    /**
     * 1. Modele e implemente um método recursivo que calcule o n-ésimo número da
     * sequência de fibonacci.
     * 
     * foi levado em consideração o indice 0...
     * Modelo
     * 1 Assinatura:
     * int fibo(n)
     * 
     * 2 oque ele faz
     * o metodo retorna o calculo do fibonacci para o numero informado como
     * parametro. Exemplo:
     * fibo(3) -> 0 1 1 2 -> 2
     * fibo(5) -> 0 1 1 2 3 5-> 5
     * ....
     * 
     * 3 casos de erro
     * numeros negativos
     * aceita a partir de n ==2, pois o 0 e 1 são casos bases
     * 
     * 4 casos base
     * n == 0 -> 0
     * n == 1 -> 1
     * 
     * 5 caso recursivo
     * 
     * 
     * fibo(n-1)+fibo(n-2)
     * 
     */
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório dos números
     * inteiros entre os números k e j, passados como parâmetro.
     * 
     * modelo
     * 
     * 1 Assinatura ->
     * int somatorioComRange(int k, int j)
     * 
     * 2 oque ele faz ->
     * calcula o somatorio entre dois numeros passados por parametro. Exemplo:
     * k=4 e j=8 -> 4+5+6+7+8 -> 30
     * 
     * 3 casos de erro ->
     * ele fala dois numeros inteiros, então isso cobre os numeros negativos
     * 
     * 4 caso base ->
     * k ==j -> k
     * 
     * 
     * 5 caso recursivo ->
     * quando k < j
     * soma(3,5)
     * 3 + somatorio (4,5)
     * 
     * 
     * k + somatorio (k+1, j)
     * 
     * 
     * quando k > j
     * inverte os parametros para ficar igual o caso do k < j
     * 
     */
    public static int somatorioComRange(int k, int j) {

        if (k > j) {
            return somatorioComRange(j, k);
        } else {
            if (k == j) {
                return k;
            } else {
                return k + somatorioComRange(k + 1, j);
            }
        }

    }

    /**
     * Modele e implemente um método recursivo que recebe um String em retorna true
     * se este String for um palíndrome, false caso contrário.
     * boolean isPal(String s)
     * 
     * modelo
     * 
     * 1 Assinatura ->
     * boolean isPal(String s)
     * 
     * 2 oque ele faz ->
     * ele recebe uma String e diz que é palindromo. Exemplo:
     * arara -> true
     * casa -> false
     * 
     * 3 caso de erro
     * n/a
     * 
     * 4 caso base
     * string.length == 0 -> true
     * string.length == 1 -> true
     * 
     * 5 caso recursivo
     * arara
     * a a -> ve se o primeiro e ultimo sao iguais e vai descendo até chegar na
     * metada ou
     * r r
     * a
     */
    public static boolean isPal(String palavra) {
        return isPal(palavra, 0, palavra.length() - 1);
    }

    public static boolean isPal(String palavra, int inicio, int finalpalavra) {

        if (inicio >= finalpalavra) {
            return true;
        }
        // Se os caracteres nas extremidades são diferentes, não é palíndromo
        if (palavra.charAt(inicio) != palavra.charAt(finalpalavra)) {
            return false;
        }
        // Chamada recursiva: verifica os próximos caracteres
        return isPal(palavra, inicio + 1, finalpalavra - 1);

    }

    /**
     * Modele e implemente um método recursivo que recebe um inteiro zero ou
     * positivo e retorna um String com o número em binário.
     * String convBase2(int n)
     * Modelo
     * 1 assnatura:
     * String convBase2(int n)
     * 
     * 2 oque ele faz:
     * o metodo recebe um numero interio positivo e retorna a string com o valor em
     * binario, por exemplo:
     * n=2 -> "0010"
     * n=3 -> "0011"
     * 
     * 3 casos de erro:
     * caso informe um numero negativo
     * 
     * 4 casos base:
     * n = 0 -> "0"
     * n= 1 -> "01"
     * 
     * 5 caso recursivo:
     * 5 /2 + 5%2
     * 3 + 1
     * 1 + 0 "1"
     * "1"+"0"+"1"
     */
    private String convBase2(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        int numero = n / 2;
        int numero2 = n % 2;
        return convBase2(numero) + convBase2(numero2);
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório dos números
     * contidos em um ArrayList de inteiros, passado como parâmetro.
     * 1 Assinatura:
     * int somatorioArrayList(ArrayList array)
     * 
     * 2 oque faz:
     * retorna um somatorio dos valores contidos de um array list. exemplo:
     * [2,3,4,5]-> 2+3+4+5= 14
     * 
     * 3 casos de erro:
     * erro se o array estiver vazio
     * 
     * 4 casos base:
     * array.size==1 -> return array.get(0)
     * 
     * 5 caso recursivo:
     * [2,3,5]
     * 5+[2,3]
     * 5+2+[3]
     * 5+2+3=9
     */
    private int somatorioArrayList(ArrayList<Integer> array) {
        if (array.size() == 1) {
            return array.get(0);
        }
        return array.remove(array.size() - 1) + somatorioArrayList(array);
    }

    /**
     * Modele e implemente um método recursivo para encontrar o maior elemento de um
     * ArrayList.
     * int findBiggest(ArrayList<Integer> ar)
     * modelo
     * 1 assinatura:
     * int findBiggest(ArrayList<Integer> ar)
     * 
     * 2 oque faz:
     * percorre um array a busca de encontrar o maior elemento. Exemplo:
     * [2,3,5]-> 5
     * [6,3,5] -> 6
     * 
     * 3 casos de erro
     * caso o array esteja vazio
     * 
     * 4 casos base
     * array.size==1 -> array.get(0)
     * 
     * 5 caso recursivo
     * [2,3]
     * 2 > [3]
     * ? 2 > 3 = 2:3;
     * 
     */
    public static int findBiggest(ArrayList<Integer> ar) {

        if (ar.size() == 1) {
            return ar.get(0);
        }

        int numeroAuxiliar = ar.remove(ar.size() - 1);

        if (numeroAuxiliar > findBiggest(ar)) {
            return numeroAuxiliar;
        } else {
            return ar.get(0);
        }

    }

}