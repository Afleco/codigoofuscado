package actividadesETS.UT4.A3_JavaDoc;

/**
 * Clase principal para demostrar la composición de un objeto Cono.
 */
public class ProgramaComposicionCono {

    /**
     * Método auxiliar para imprimir datos en la consola.
     * @param datos El objeto a imprimir en la consola.
     */
    private static void imprimir(Object datos) {
        System.out.println(datos);
    }

    /**
     * Método principal que ejecuta el programa.
     * Genera 5 objetos de la clase Cono con un radio aleatorio
     * y altura en base al número de iteración, luego los imprime.
     *
     *
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        java.util.Random aleatorio = new java.util.Random();

        // Se generan e imprimen 5 conos con valores aleatorios
        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1; // Radio entre 1 y 9
            Cono cono = new Cono(0, 0, radio, i, "Azul"); // Creación del cono
            cono.imprimir(); // Llamada al método imprimir de Cono
        }
    }
}
