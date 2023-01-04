import java.awt.*;
import java.io.*;
import java.util.*;

public class Trama implements Serializable
{
    private Vector vVector;
    private String sTexto;
    
    public Trama()
    {
        vVector = null;
        sTexto = "";
    }
    
    public Vector getVector()
    {
        return vVector;
    }
    
    public String getString()
    {
        return sTexto;
    }
    
    public void setVector(Vector v)
    {
        vVector = v;
    }
    
    public void setString(String cadena)
    {
        sTexto = cadena;
    }
}