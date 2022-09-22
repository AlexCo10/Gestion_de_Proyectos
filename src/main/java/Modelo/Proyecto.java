
package Modelo;


public class Proyecto {
    
    private Integer codigo;
    private String titulo;
    private String resumen;

    public Proyecto() {
    }

    public Proyecto(Integer codigo, String titulo, String resumen) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumen = resumen;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    
}
