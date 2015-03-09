
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String apellido;
    private String nombre;
    
    private static final int VALORES_INICIALES = 0;
    private static final int TRES_PRI_LETRAS_APELLIDO = 3;
    private static final int TRES_PRI_LETRAS_NOMBR = 3;
    private static final int DOS_PRI_LETRAS_APELL_MADRE = 2;
    private static final int TRES_PRI_LETRAS_CIUDAD_NACI = 3;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        // initialise instance variables
       nombre = null;
       apellido = null;
    }
    
    public void generateStarWarsName(String apellido, String nombre, String apellidoMadre, String ciudadNacimiento)
    {
    System.out.println("Tu nombre en Star Wars es: " + apellido.substring(VALORES_INICIALES , TRES_PRI_LETRAS_APELLIDO) + nombre.substring(VALORES_INICIALES , TRES_PRI_LETRAS_NOMBR));
    System.out.println("Tu apellido en Star Wars es: " + apellidoMadre.substring(VALORES_INICIALES, DOS_PRI_LETRAS_APELL_MADRE) + ciudadNacimiento.substring(VALORES_INICIALES,TRES_PRI_LETRAS_CIUDAD_NACI));
    }

}
