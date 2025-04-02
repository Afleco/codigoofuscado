package actividadesETS.UT4.A3_JavaDoc;

/**
 * Representa un círculo 2D,
 * definido por su centro (x, y) y su radio.
 */
public class Circulo {
    private float x, y; // Coordenadas del centro del círculo
    private float radio; // Radio del círculo

    /**
     * Constructor para crear un círculo con un centro y un radio específicos.
     * @param cX Coordenada X del centro del círculo.
     * @param cY Coordenada Y del centro del círculo.
     * @param r  Radio del círculo.
     */
    public Circulo(float cX, float cY, float r) {
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Obtiene la coordenada X del centro del círculo.
     * @return La coordenada X.
     */
    public float getX() { return x; }

    /**
     * Establece la coordenada X del centro del círculo.
     * @param x Nueva coordenada X.
     */
    public void setX(float x) { this.x = x; }

    /**
     * Obtiene la coordenada Y del centro del círculo.
     * @return La coordenada Y.
     */
    public float getY() { return y; }

    /**
     * Establece la coordenada Y del centro del círculo.
     * @param y Nueva coordenada Y.
     */
    public void setY(float y) { this.y = y; }

    /**
     * Obtiene el radio del círculo.
     * @return El radio del círculo.
     */
    public float getRadio() { return radio; }

    /**
     * Establece un nuevo radio para el círculo.
     * @param radio Nuevo radio del círculo.
     */
    public void setRadio(float radio) { this.radio = radio; }

    /**
     * Calcula el área del círculo utilizando la fórmula A = π * r².
     * @return El área del círculo.
     */
    public float area() { return (float) Math.PI * radio * radio; }

    /**
     * Imprime la información del círculo, incluyendo su centro, radio y área.
     */
    public void imprimir() {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
