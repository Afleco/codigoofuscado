package actividadesETS.UT4.A2_DisenoModular_Clases;

/**
 * Clase Prisma, crea un objeto prisma y permite calcular sus dimensiones
 */
public class Prisma implements Comparable<Prisma>{
    private String nombre;
    private int baseTriangulo;
    private int alturaPrisma;

        // Constructor
    public Prisma(String nombre, int triangleBase, int prismHeight) {
        this.nombre = nombre;
        this.baseTriangulo = triangleBase;
        this.alturaPrisma = prismHeight;
    }
        // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    // Métodos
    /**
     * Calcula la altura del triángulo utilizando su base
     * @return devuelve la altura ya calculada con la formula indicada y casteada a float
     */
    public float alturaTriangulo () {
        return (float) ((Math.sqrt(3) / 2) * baseTriangulo);
    }

    /**
     * Calcula el area de la base del prisma teniendo en cuenta la altura del triángulo y la base del triángulo
     * @return devuelve el resultado que es el area de la base del prisma utilizando la fórmula indicada
     */
    public float areaBase () {
        float alturaTriangulo = alturaTriangulo();
        return (baseTriangulo * alturaTriangulo) / 2;
    }

    /**
     * Calcula el perimetro del prisma teniendo en cuenta la base del triángulo
     * @return devuelve el valor de este, multiplicando por 3 la base del triángulo
     */
    public float perimetro () {
        return 3 * baseTriangulo;
    }

    /**
     * Calcula el area lateral del prisma, teniendo en cuenta su altura y el perimetro
     * @return devuelve su valor utilizando la multiplicación de altura * perimetro
     */
    public float areaLateral () {
        float perimetro = perimetro();
        return alturaPrisma * perimetro;

    }

    /**
     * Calcula el area total del prisma, utilizando el resto de métodos, sacando así el area de la base y
     * el area lateral.
     * @return devuelve el valor utilizando la fórmula indicada.
     */
    public float areaTotal () {
        float areaBase = areaBase();
        float areaLateral = areaLateral();
        return 2 * areaBase + areaLateral;
    }

    /**
     * Compara dos objetos Prisma en base a su area total, permitiendo ordenarlos de mayor a menor
     * @param o Objeto Prisma con el que se quiere comparar
     * @return devuelve el resultado de la resta del area total del objeto que se pasa por parametros
     * menos el area total del objeto con el que llamamos a la función.
     */
    @Override
    public int compareTo(Prisma o) {
        return Float.compare(o.areaTotal(), this.areaTotal());
    }


}
