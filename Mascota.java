import java.time.LocalDate;

/**
 * Representa una mascota atendida en la clínica veterinaria canina.
 *
 * @author Rebeca Hodgson
 * @version 1.0
 */
public class Mascota{

    /** Nombre de la mascota. */
    private String nombre;

    /** Raza de la mascota. */
    private String raza;

    /** Año de nacimiento de la mascota. */
    private int anioNacimiento=0;

    /** Persona veterinaria asignada a la mascota. */
    private Persona veterinario;

    /**
     * Construye una mascota sin año de nacimiento registrado.
     *
     * @param pNombre nombre de la mascota
     * @param pRaza raza de la mascota
     */
    public Mascota(String pNombre, String pRaza){
        nombre=pNombre;
        raza=pRaza;
    }

    /**
     * Construye una mascota con su año de nacimiento.
     *
     * @param pNombre nombre de la mascota
     * @param pRaza raza de la mascota
     * @param pAnioNacimiento año de nacimiento de la mascota
     */
    public Mascota(String pNombre, String pRaza, int pAnioNacimiento){
        nombre=pNombre;
        raza=pRaza;
        anioNacimiento=pAnioNacimiento;
    }

    /**
     * Consulta el nombre de la persona veterinaria asignada.
     *
     * @return nombre de la persona veterinaria
     */
    public String consultarNombreVeterinario(){
        String nombreVeterinario="";

        if (veterinario!=null){
            nombreVeterinario=veterinario.getNombre();
        }

        return nombreVeterinario;
    }

    /**
     * Asigna una persona veterinaria a la mascota.
     *
     * @param pVet persona veterinaria que se asignará
     */
    public void asignarVeterinario(Persona pVet){
        veterinario=pVet;
    }

    /**
     * Calcula la edad canina actual de la mascota.
     *
     * @return edad canina actual
     */
    private int calcularEdadCanina(){
        int edadCanina=0;

        if(anioNacimiento!=0){
            edadCanina=calcularAnioActual()-anioNacimiento;
        }

        return edadCanina;
    }

    /**
     * Calcula el equivalente de la edad de la mascota en años humanos.
     *
     * @return edad humana equivalente
     */
    private int calcularEdadHumana(){
        int edadHumana=calcularEdadCanina()*7;

        return edadHumana;
    }

    /**
     * Obtiene el año actual.
     *
     * @return año actual
     */
    private int calcularAnioActual(){
        int anioActual=LocalDate.now().getYear();

        return anioActual;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return nombre de la mascota
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene el estado de la mascota.
     *
     * @return información de la mascota
     */
    public String toString(){
        String msg= "Mascota\n";
        msg+= "Nombre: "+nombre+"\n";
        msg+="Raza: "+raza+"\n";
        msg+="Año de nacimiento: "+anioNacimiento+"\n";
        msg+="Edad canina: "+calcularEdadCanina()+"\n";
        msg+="Edad humana: "+calcularEdadHumana()+"\n";
        msg+="Veterinario: "+consultarNombreVeterinario();

        return msg;
    }
}