package co.com.proyectobase.screenplay.exceptions;

public class AutenticacionFallidaException extends AssertionError {
    public static final String AUTENTICACION_FALLIDA = "No se realizó la autenticación correctamente.";

    public AutenticacionFallidaException(String mensaje){
        super(mensaje);
    }

    public AutenticacionFallidaException(String mensaje, Throwable cause){
        super(mensaje, cause);
    }
}

