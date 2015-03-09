
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
    private String apellidoMadre;
    private String ciudadNacimiento;
    private static final int TRES_PRI_LETRAS_APELLIDO = 0;
    private static final int TRES_PRI_LETRAS_APELLIDO_FINAL = 2;
    private static final int TRES_PRI_LETRAS_NOMBR = 0;
    private static final int TRES_PRI_LETRAS_NOMBR_FINAL = 2;
    private static final int DOS_PRI_LETRAS_APELL_MADRE = 0;
    private static final int DOS_PRI_LETRAS_APELL_MADRE_FINAL = 1;
    private static final int TRES_PRI_LETRAS_CIUDAD_NACI = 0;
    private static final int TRES_PRI_LETRAS_CIUDAD_NACI_FINAL = 2;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String apellido, String nombre, String apellidoMAdre, String ciudadNacimiento)
    {
        // initialise instance variables
       this.apellido = apellido;
       this.nombre = nombre;
       this.apellidoMadre = apellidoMadre;
       this.ciudadNacimiento = ciudadNacimiento;
    }

 
}
