import java.util.ArrayList;

/**
 * Representa una persona veterinaria de la clínica.
 *
 * @author Rebeca Hodgson
 * @version 1.0
 */
public class Persona{

    /** Nombre de la persona veterinaria. */
    private String nombre;

    /** Código de licencia profesional. */
    private String codigoLicencia;

    /** Lista de mascotas asignadas a la persona veterinaria. */
    private ArrayList<Mascota> misMascotas;

    /**
     * Construye una persona veterinaria.
     *
     * @param pNombre nombre de la persona veterinaria
     * @param pCodigoLicencia código de licencia profesional
     */
    public Persona(String pNombre, String pCodigoLicencia){
        nombre=pNombre;
        codigoLicencia=pCodigoLicencia;
        misMascotas= new ArrayList<Mascota>();
    }

    /**
     * Asigna una mascota a la persona veterinaria.
     *
     * @param pMascota mascota que se asignará
     */
    public void asignarMascota(Mascota pMascota){
        misMascotas.add(pMascota);
    }

    /**
     * Consulta los nombres de las mascotas asignadas.
     *
     * @return nombres de las mascotas asignadas
     */
    public String consultarNombreMisMascotas(){
        String nombres="";

        for (Mascota mascota: misMascotas){
            nombres+=mascota.getNombre()+" ";
        }

        return nombres;
    }

    /**
     * Obtiene el nombre de la persona veterinaria.
     *
     * @return nombre de la persona veterinaria
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Obtiene el estado de la persona veterinaria.
     *
     * @return información de la persona veterinaria
     */
    public String toString(){
        String msg= "Persona\n";
        msg+= "Nombre: "+nombre+"\n";
        msg+= "Código de licencia: "+codigoLicencia+"\n";
        msg+= "Mascotas: "+consultarNombreMisMascotas();

        return msg;
    }
}