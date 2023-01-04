import java.awt.*;
import java.io.*;
import java.util.*;

public class MiJPanel extends javax.swing.JPanel
{
    public MiJPanel()
    {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Mis métodos
    @Override
    public void paintComponent(Graphics g)
    {
        Polygon pol;
        
        //Llamamos al método paintComponent de la clase base
        super.paintComponent(g);
        
        //Establecemos que el color de primer plano para el objeto Graphics sea blanco
        g.setColor(clr);
        
        if((vect != null) && (vect.size() > 0))
        {
            for(int i = 0; i < vect.size(); i++)
            {
                pol = (Polygon)vect.elementAt(i);
                g.drawPolyline(pol.xpoints, pol.ypoints, pol.npoints);
            }
        }
    }
    
    public void setVector(Vector v)
    {
        vect = v;
    }
    
    public void setColor(Color c)
    {
        clr = c;
    }
    
    //Mis variables
    private Vector vect = null;
    private Color clr = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}