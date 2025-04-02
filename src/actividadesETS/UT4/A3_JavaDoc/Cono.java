package actividadesETS.UT4.A3_JavaDoc;

/**
 * Representa un cono tridimensional con una base circular,
 * una altura y un color determinado.
 */
public class Cono {
    private Circulo base; // Base del cono (un círculo)
    private float altura; // Altura del cono
    private String color; // Color del cono

    /**
     * Constructor para crear un cono con una base circular, altura y color.
     * @param cX Coordenada X del centro de la base.
     * @param cY Coordenada Y del centro de la base.
     * @param r  Radio de la base.
     * @param h  Altura del cono.
     * @param color Color del cono.
     */
    public Cono(float cX, float cY, float r, float h, String color) {
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Obtiene la base del cono.
     * @return Un objeto de tipo Circulo que representa la base del cono.
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Establece una nueva base para el cono.
     * @param base Un objeto de tipo Circulo que representa la nueva base.
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Obtiene la altura del cono.
     * @return La altura del cono.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del cono.
     * @param altura Nueva altura del cono.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Obtiene el color del cono.
     * @return El color del cono como una cadena de texto.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece un nuevo color para el cono.
     * @param color Nuevo color del cono.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Imprime la información del cono, incluyendo la base, la altura y el color.
     */
    public void imprimir() {
        base.imprimir(); // Llama al método imprimir de la clase Circulo
        System.out.println(" h=" + altura + " c=" + color);
    }
}