/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derecho.rnegocio.funciones;
import derecho.accesodatos.*;
import derecho.rnegocio.clases.Articulo;
import java.util.ArrayList;
/**
 *
 * @author Xavier
 */
public class FArticulo {
    public static boolean insertar(Articulo obj ) throws  Exception { 
 boolean band= false;
 String sql = "insert into public.articulos values (?,?,?,?,?,?,?,?,?)";
ArrayList<Parametro> lstpar= new ArrayList<Parametro>();

//campos con referencias


//campos sin referencias

 lstpar.add(new Parametro(1,obj.getCodigo()));
 lstpar.add(new Parametro(2,obj.getArticulo()));
 lstpar.add(new Parametro(3,obj.getNombre()));
 lstpar.add(new Parametro(4,obj.getDescripcion()));
 lstpar.add(new Parametro(5,obj.getSancion_min()));
 lstpar.add(new Parametro(6,obj.getSancion_max()));
 lstpar.add(new Parametro(7,obj.getMulta_min()));
 lstpar.add(new Parametro(8,obj.getMulta_max()));
 lstpar.add(new Parametro(9,obj.getClave()));
 
 
try { 
   band = AccesoDatos.ejecutaComando1(sql, lstpar);
} catch (Exception ex) { 
throw ex;}
 return band; 
}



 public static boolean modificar(Articulo obj ) throws  Exception { 
 boolean band= false;
 String sql = "update public.articulos set articulo=?,nombre=?,descripcion=?,sancion_min=?,sancion_max=?,multa_min=?,multa_max=?,clave=? where codigo=?  ";
ArrayList<Parametro> lstpar= new ArrayList<Parametro>();

//campos con referencias


//campos sin referencias

 
 lstpar.add(new Parametro(9,obj.getCodigo()));
 lstpar.add(new Parametro(1,obj.getArticulo()));
 lstpar.add(new Parametro(2,obj.getNombre()));
 lstpar.add(new Parametro(3,obj.getDescripcion()));
 lstpar.add(new Parametro(4,obj.getSancion_min()));
 lstpar.add(new Parametro(5,obj.getSancion_max()));
 lstpar.add(new Parametro(6,obj.getMulta_min()));
 lstpar.add(new Parametro(7,obj.getMulta_max()));
 lstpar.add(new Parametro(8,obj.getClave()));
 
 
try { 
   band = AccesoDatos.ejecutaComando1(sql, lstpar);
} catch (Exception ex) { 
throw ex;}
 return band; 
}


 
 public static boolean eliminar(Articulo obj ) throws  Exception { 
 boolean band= false;
 String sql = "delete from public.articulos where codigo=? ";
ArrayList<Parametro> lstpar= new ArrayList<Parametro>();

//campos con referencias


//campos sin referencias

 lstpar.add(new Parametro(1,obj.getCodigo()));
try { 
   band = AccesoDatos.ejecutaComando1(sql, lstpar);
} catch (Exception ex) { 
throw ex;}
 return band; 
}



 public static Articulo obtener (int pid) throws Exception  {  
 Articulo miUsuario = null;
try{ 
 String sql = "select codigo,articulo,nombre,descripcion,sancion_min,sancion_max,multa_min,multa_max,clave from public.articulos where   codigo=? ";
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
 lstpar.add(new Parametro(1,pid));
ConjuntoResultado rs= AccesoDatos.ejecutaQuery(sql,lstpar);
ArrayList<Articulo> lst=llenarArticulo(rs);
 for (Articulo c : lst){
 miUsuario= c;
 } 

} catch (Exception ex) { 
throw ex; }
return  miUsuario;
}


 public static ArrayList<Articulo> obtener () throws Exception  {  
 ArrayList<Articulo> lst=new ArrayList<>();
try{ 
 String sql = "select codigo,articulo,nombre,descripcion,sancion_min,sancion_max,multa_min,multa_max,clave from public.articulos ";
ConjuntoResultado rs= AccesoDatos.ejecutaQuery(sql);
 lst=llenarArticulo(rs);

} catch (Exception ex) { 
throw ex; }
return  lst;
}


 private static ArrayList<Articulo> llenarArticulo(ConjuntoResultado cr)  throws  Exception { 
 ArrayList<Articulo> lst = new ArrayList<Articulo>();
 Articulo obj=null;
try { 
  while(cr.next()){
 obj = new Articulo();

//campos con referencias


//campos sin referencias

obj.setCodigo(cr.getInt(1));
obj.setArticulo(cr.getString(2));
obj.setNombre(cr.getString(3));
obj.setDescripcion(cr.getString(4));
obj.setSancion_min(cr.getString(5));
obj.setSancion_max(cr.getString(6));
obj.setMulta_min(cr.getString(7));
obj.setMulta_max(cr.getString(8));
obj.setClave(cr.getString(9));

lst.add(obj);

 }
} catch (Exception ex) { 
throw ex;}
 return lst;}

 
}
