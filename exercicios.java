
public class exercicios {

    public void main(String[] args) {
        // para testar os exercicios
        System.out.println("Teste para o exericio 1 ");
        System.out.println("Fatorial de 6 é " + fatorial(6));

        System.out.println("Teste para o exercicio 2");
        System.out.println("Somatorio de 5 é "+somatorio(5));

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

    

}