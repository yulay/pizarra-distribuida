public class FiltrosFicheros extends javax.swing.filechooser.FileFilter
{
    public FiltrosFicheros()
    {
    }
    
    //Aceptar todos los directorios y todos los ficheros .dat
    public boolean accept(java.io.File f)
    {
       if(f.isDirectory())
            return true;
       
       String nombre = f.getName().toLowerCase();
       
       if(nombre != null)
       {
           if(nombre.endsWith(".dat"))
               return true;
       }
       return false;
    }
    
    //Descripción del filtro
    public String getDescription()
    {
        return "Ficheros pizarra distribuida (*.dat)";
    }
}