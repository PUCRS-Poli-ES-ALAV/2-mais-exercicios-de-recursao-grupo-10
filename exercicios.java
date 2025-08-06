
public class exercicios {

    public void main(String[] args) {
        // para testar os exercicios
        System.out.println("Teste para o exericio 1 ");
        System.out.println("Fatorial de 6 é "+ fatorial(6));
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
    public static int fatorial(int n){
        if (n==0 || n==1){
            return 1;
        }
         return n* fatorial(n-1);
    }

}