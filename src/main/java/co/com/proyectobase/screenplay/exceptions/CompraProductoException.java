package co.com.proyectobase.screenplay.exceptions;

public class CompraProductoException extends AssertionError {
    public static final String COMPRA_FALLIDA = "La compra no se realizo correctamente.";


    public CompraProductoException(String mensaje){
        super(mensaje);
    }

    public CompraProductoException(String mensaje, Throwable cause){
        super(mensaje, cause);
    }

}
