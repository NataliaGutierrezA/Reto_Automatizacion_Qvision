package co.com.proyectobase.screenplay.exceptions;

public class AutenticacionExitosaException extends AssertionError {
    public static final String AUTENTICACION_EXITOSA = "No se presenta el mensaje esperado para la autenticación.";

    public  AutenticacionExitosaException(String mensaje){
        super(mensaje);
    }

    public AutenticacionExitosaException(String mensaje, Throwable cause){
    super(mensaje, cause);
    }
}
