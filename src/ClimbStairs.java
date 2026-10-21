
public class ClimbStairs {

    // Funcao recursiva que calcula as maneiras
    // de subir uma escada com passos de 1 ou 2 degraus.
    public static int calcularManeiras(int n) {

        // Validacao da entrada
        if (n < 1) {
            throw new IllegalArgumentException(
                    "O numero de degraus deve ser maior que zero."
            );
        }

        // Casos base
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        // Chamada recursiva
        return calcularManeiras(n - 1)
                + calcularManeiras(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("=== DESAFIO CLIMB STAIRS - EBAC ===");

        // Testes obrigatorios do enunciado
        testar(2, 2);
        testar(3, 3);
        testar(4, 5);

        // Testes adicionais
        testar(1, 1);
        testar(5, 8);
        testar(6, 13);
        testar(10, 89);

        System.out.println("\nTestes finalizados!");
    }

    // Metodo auxiliar para validar os resultados
    private static void testar(int degraus, int esperado) {

        int resultado = calcularManeiras(degraus);

        System.out.println(
                "Degraus: " + degraus
                        + " | Maneiras: " + resultado
                        + " | Esperado: " + esperado
        );

        if (resultado != esperado) {
            throw new AssertionError(
                    "Resultado incorreto para n = " + degraus
            );
        }
    }
}
