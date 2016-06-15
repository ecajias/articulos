/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derecho.rnegocio.clases;

/**
 *
 * @author Xavier
 */
public class Articulo {
    private int codigo;
    private String articulo;
    private String nombre;
    private String descripcion;
    private String sancion_min;
    private String sancion_max;
    private String multa_min;
    private String multa_max;
    private String clave;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSancion_min() {
        return sancion_min;
    }

    public void setSancion_min(String sancion_min) {
        this.sancion_min = sancion_min;
    }

    public String getSancion_max() {
        return sancion_max;
    }

    public void setSancion_max(String sancion_max) {
        this.sancion_max = sancion_max;
    }

    public String getMulta_min() {
        return multa_min;
    }

    public void setMulta_min(String multa_min) {
        this.multa_min = multa_min;
    }

    public String getMulta_max() {
        return multa_max;
    }

    public void setMulta_max(String multa_max) {
        this.multa_max = multa_max;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

 
    
    
    
    
}
