/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derecho.tester;
import derecho.rnegocio.clases.Articulo;
import derecho.rnegocio.funciones.FArticulo;
import derecho.accesodatos.*;
import java.util.List;

/**
 *
 * @author Xavier
 */
public class tester {
     public static void main(String[] args) throws Exception {
        
        List<Articulo> lista = FArticulo.obtener();
        for(Articulo pres: lista)
        {
            
            System.out.println(pres.getDescripcion());
        }
        }
}
