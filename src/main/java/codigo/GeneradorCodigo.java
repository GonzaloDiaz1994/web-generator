package codigo;

import java.util.List;

public class GeneradorCodigo implements IEstructura, INav{

    private final List<String> secciones;
    private final String nombrePagina;
    private final String logo;

    public GeneradorCodigo(List<String> secciones, String nombrePagina, String logo){
        this.secciones = secciones;
        this.nombrePagina = nombrePagina;
        this.logo = logo;
    }

    /**
     * Genera el codigo que va a tener todas las paginas de la web.
     * **/
    public String generarCodigo(){
        return this.openPage() +
                this.title(this.nombrePagina) +
                this.navBar(this.logo, this.nombrePagina, this.secciones) +
                this.openBody() + this.footer() + this.closeBody() + this.closePage();
    }
}
