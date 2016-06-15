/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derecho.control;
import derecho.rnegocio.clases.Articulo;
import derecho.accesodatos.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import derecho.rnegocio.funciones.FArticulo;
import java.util.*;
import javax.faces.context.FacesContext;
/**
 *
 * @author Xavier
 */
@ManagedBean
@SessionScoped
public class CArticulo {
    private List<Articulo> lista;
    private Articulo prNew;
    private Articulo prSel;

    public CArticulo() throws Exception {
        lista=FArticulo.obtener();
        prNew=new Articulo();
    
    }
    
    public String cargarArticulo() throws Exception {
        Map requestMap = FacesContext.getCurrentInstance().
                getExternalContext().getRequestParameterMap();
        String codPre = (String) requestMap.get("articulo");
        prSel = FArticulo.obtener(Integer.parseInt(codPre));


        return "articuloinfo";
    }
    public String insertar() throws Exception {
        
        FArticulo.insertar(prNew);
        lista = FArticulo.obtener();
        return "articulo?transition=slide";
    }
    
    public String delete() throws Exception {
        
        
        try {
            if (FArticulo.eliminar(prSel)) {
                System.out.println("Dato eliminado");                       
                
                
            } else {
                System.out.println("Error al eliminar los datos");                       
                
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar los datos");                       
            
            System.out.println("Error:" + e.getMessage());
        }
        lista = FArticulo.obtener();
        return "articulo?transition=slide";
    }

    public String modificar() throws Exception {        
         try {
            if (FArticulo.modificar(prSel)) {
                System.out.println("Datos Modificados");                       
                
            } else {
                System.out.println("Error al modificar los datos");                       
                
            }
        } catch (Exception e) {
            System.out.println("Error al modificar los datos");                       
            
            System.out.println("Error:" + e.getMessage());
        }
         lista = FArticulo.obtener();
         return "articulo?transition=slide";
    }
    
    
    
    public List<Articulo> getLista() {
        return lista;
    }

    public void setLista(List<Articulo> lista) {
        this.lista = lista;
    }

    public Articulo getPrNew() {
        return prNew;
    }

    public void setPrNew(Articulo prNew) {
        this.prNew = prNew;
    }

    public Articulo getPrSel() {
        return prSel;
    }

    public void setPrSel(Articulo prSel) {
        this.prSel = prSel;
    }
    
    
    
    
}
