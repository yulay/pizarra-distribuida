import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class Aplicacion extends JFrame
{
    public Aplicacion()
    {
        initComponents();
        
        //Establecemos el botón por defecto
        this.getRootPane().setDefaultButton(btnLimpiarPizarra);
        
        vtr = new Vector();
        clr = Color.WHITE;
        gpc = jPanel1.getGraphics();
        gpc.setColor(clr);
        
        //hilo = new HiloReceptor();
        //hilo.start();
        
        conectar();
        
        txtaComentarios.requestFocus();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpUnirseAbandonar = new javax.swing.ButtonGroup();
        pumMenuEmergente = new javax.swing.JPopupMenu();
        pumMnuItCopiar = new javax.swing.JMenuItem();
        pumMnuItPegar = new javax.swing.JMenuItem();
        pumMnuItBorrar = new javax.swing.JMenuItem();
        pumMnuItSeleccionar = new javax.swing.JMenuItem();
        jPanel1 = new MiJPanel();
        lblPizarra = new javax.swing.JLabel();
        lblComentarios = new javax.swing.JLabel();
        spaneDesplazamiento = new javax.swing.JScrollPane();
        txtaComentarios = new javax.swing.JTextArea();
        btnLimpiarPizarra = new javax.swing.JButton();
        mbarBarraDeMenus = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuItAbrir = new javax.swing.JMenuItem();
        mnuItGuardar = new javax.swing.JMenuItem();
        sepSeparador1 = new javax.swing.JSeparator();
        mnuItSalir = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mnuItColorPizarra = new javax.swing.JMenuItem();
        mnuItColorTiza = new javax.swing.JMenuItem();
        sepSeparador2 = new javax.swing.JSeparator();
        mnuItEnviarArchivo = new javax.swing.JMenuItem();
        sepSeparador3 = new javax.swing.JSeparator();
        mnuGrupo = new javax.swing.JMenu();
        rbtnMnuItUnirse = new javax.swing.JRadioButtonMenuItem();
        rbtnMnuItAbandonar = new javax.swing.JRadioButtonMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuItAcercaDe = new javax.swing.JMenuItem();

        pumMnuItCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        pumMnuItCopiar.setText("Copiar");
        pumMnuItCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumMnuItCopiarActionPerformed(evt);
            }
        });
        pumMenuEmergente.add(pumMnuItCopiar);

        pumMnuItPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pumMnuItPegar.setText("Pegar");
        pumMnuItPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumMnuItPegarActionPerformed(evt);
            }
        });
        pumMenuEmergente.add(pumMnuItPegar);

        pumMnuItBorrar.setText("Borrar");
        pumMnuItBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumMnuItBorrarActionPerformed(evt);
            }
        });
        pumMenuEmergente.add(pumMnuItBorrar);

        pumMnuItSeleccionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        pumMnuItSeleccionar.setText("Seleccionar todo");
        pumMnuItSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumMnuItSeleccionarActionPerformed(evt);
            }
        });
        pumMenuEmergente.add(pumMnuItSeleccionar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizarra distribuida");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.desktop);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        lblPizarra.setFont(new java.awt.Font("DejaVu Sans", 1, 24));
        lblPizarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPizarra.setText("Pizarra");

        lblComentarios.setText("Comentarios:");

        txtaComentarios.setColumns(20);
        txtaComentarios.setLineWrap(true);
        txtaComentarios.setRows(5);
        txtaComentarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtaComentariosMousePressed(evt);
            }
        });
        txtaComentarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaComentariosKeyReleased(evt);
            }
        });
        spaneDesplazamiento.setViewportView(txtaComentarios);

        btnLimpiarPizarra.setMnemonic('i');
        btnLimpiarPizarra.setText("Limpiar pizarra");
        btnLimpiarPizarra.setToolTipText("Clic aquí para limpiar la pizarra");
        btnLimpiarPizarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPizarraActionPerformed(evt);
            }
        });

        mnuArchivo.setText("Archivo");

        mnuItAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuItAbrir.setText("Abrir");
        mnuItAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItAbrirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItAbrir);

        mnuItGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuItGuardar.setText("Guardar");
        mnuItGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItGuardarActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItGuardar);
        mnuArchivo.add(sepSeparador1);

        mnuItSalir.setText("Salir");
        mnuItSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItSalir);

        mbarBarraDeMenus.add(mnuArchivo);

        mnuOpciones.setText("Opciones");

        mnuItColorPizarra.setText("Cambiar color pizarra");
        mnuItColorPizarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorPizarra(evt);
            }
        });
        mnuOpciones.add(mnuItColorPizarra);

        mnuItColorTiza.setText("Cambiar color tiza");
        mnuItColorTiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarColorTiza(evt);
            }
        });
        mnuOpciones.add(mnuItColorTiza);
        mnuOpciones.add(sepSeparador2);

        mnuItEnviarArchivo.setText("Enviar archivo");
        mnuOpciones.add(mnuItEnviarArchivo);
        mnuOpciones.add(sepSeparador3);

        mnuGrupo.setText("Grupo");

        btnGrpUnirseAbandonar.add(rbtnMnuItUnirse);
        rbtnMnuItUnirse.setSelected(true);
        rbtnMnuItUnirse.setText("Unirse al grupo");
        rbtnMnuItUnirse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnMnuItUnirseItemStateChanged(evt);
            }
        });
        mnuGrupo.add(rbtnMnuItUnirse);

        btnGrpUnirseAbandonar.add(rbtnMnuItAbandonar);
        rbtnMnuItAbandonar.setText("Abandonar el grupo");
        rbtnMnuItAbandonar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnMnuItAbandonarItemStateChanged(evt);
            }
        });
        mnuGrupo.add(rbtnMnuItAbandonar);

        mnuOpciones.add(mnuGrupo);

        mbarBarraDeMenus.add(mnuOpciones);

        mnuAyuda.setText("Ayuda");

        mnuItAcercaDe.setText("Acerca de");
        mnuItAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuItAcercaDe);

        mbarBarraDeMenus.add(mnuAyuda);

        setJMenuBar(mbarBarraDeMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarPizarra))
                    .addComponent(spaneDesplazamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(lblPizarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComentarios)
                    .addComponent(btnLimpiarPizarra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneDesplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        int x = evt.getX(), y = evt.getY();
        plg = new Polygon();
        plg.addPoint(x, y);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        vtr.add(plg);
        btnLimpiarPizarra.setEnabled(true);
        enviarPizarra();
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getX(), y = evt.getY();
        plg.addPoint(x, y);
        gpc.drawPolyline(plg.xpoints, plg.ypoints, plg.npoints);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnLimpiarPizarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPizarraActionPerformed
        vtr.removeAllElements();
        vtr.clear();
        jPanel1.setVector(vtr);
        jPanel1.repaint();
        btnLimpiarPizarra.setEnabled(false);
        enviarPizarra();
}//GEN-LAST:event_btnLimpiarPizarraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnLimpiarPizarra.setEnabled(false);
        txtaComentarios.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtaComentariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaComentariosKeyReleased
        enviarPizarra();
}//GEN-LAST:event_txtaComentariosKeyReleased

    private void mnuItSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItSalirActionPerformed
        cerrarRecursos();
        System.exit(0);
    }//GEN-LAST:event_mnuItSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarRecursos();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void cambiarColorPizarra(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorPizarra
        Color clrTmp = JColorChooser.showDialog(this, "Cambiar color pizarra", jPanel1.getBackground());
        
        if(clrTmp != null)
            jPanel1.setBackground(clrTmp);
    }//GEN-LAST:event_cambiarColorPizarra

    private void cambiarColorTiza(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarColorTiza
        Color clrTmp = JColorChooser.showDialog(this, "Cambiar color tiza", clr);
        
        if(clrTmp != null)
        {
            clr = clrTmp;
            gpc.setColor(clr);
            jPanel1.setColor(clr);
            jPanel1.repaint();
        }
    }//GEN-LAST:event_cambiarColorTiza

    private void txtaComentariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaComentariosMousePressed
        /*El método getButton devuelve un entero que identifica el botón pulsado del ratón, 
          si el botón pulsado es el derecho, el objeto pumMenuEmergente invoca su método show 
          para visualizar el menú emergente que encapsula*/
        if(evt.getButton() == java.awt.event.MouseEvent.BUTTON3)
        {
            habilitarInhabilitarOrdenes();
            pumMenuEmergente.show(txtaComentarios, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_txtaComentariosMousePressed

    private void pumMnuItCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumMnuItCopiarActionPerformed
        txtaComentarios.copy();
    }//GEN-LAST:event_pumMnuItCopiarActionPerformed

    private void pumMnuItPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumMnuItPegarActionPerformed
        txtaComentarios.paste();
    }//GEN-LAST:event_pumMnuItPegarActionPerformed

    private void pumMnuItBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumMnuItBorrarActionPerformed
        txtaComentarios.replaceSelection("");
    }//GEN-LAST:event_pumMnuItBorrarActionPerformed

    private void pumMnuItSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumMnuItSeleccionarActionPerformed
        txtaComentarios.requestFocus();
        txtaComentarios.selectAll();
    }//GEN-LAST:event_pumMnuItSeleccionarActionPerformed

    private void mnuItAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItAcercaDeActionPerformed
        new AcercaDe(this, true).setVisible(true);
    }//GEN-LAST:event_mnuItAcercaDeActionPerformed

    private void rbtnMnuItUnirseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnMnuItUnirseItemStateChanged
        try
        {
            if (rbtnMnuItUnirse.isSelected())
            {
                mcs.joinGroup(grupo);//GEN-LAST:event_rbtnMnuItUnirseItemStateChanged
                System.out.println();
                System.out.println("-----------------rbtnMnuItUnirseItemStateChanged(java.awt.event.ItemEvent evt)-----------------");
                System.out.println("Unido al grupo exitosamente");
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println();
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Método rbtnMnuItUnirseItemStateChanged(java.awt.event.ItemEvent evt)");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
    }                                                

    private void rbtnMnuItAbandonarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnMnuItAbandonarItemStateChanged
        try
        {
            if (rbtnMnuItAbandonar.isSelected())
            {
                mcs.leaveGroup(grupo);
                System.out.println();
                System.out.println("-----------------rbtnMnuItAbandonarItemStateChanged(java.awt.event.ItemEvent evt)-----------------");
                System.out.println("El grupo ha sido abandonado exitosamente");
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println();
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Método rbtnMnuItAbandonarItemStateChanged(java.awt.event.ItemEvent evt)");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
    }//GEN-LAST:event_rbtnMnuItAbandonarItemStateChanged

    private void mnuItAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItAbrirActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_mnuItAbrirActionPerformed

    private void mnuItGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItGuardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_mnuItGuardarActionPerformed
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Aplicacion().setVisible(true);
            }
        });
    }
    
    //---------------------Mis métodos------------------------------------------
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        jPanel1.setVector(vtr);
        jPanel1.setColor(clr);
    }
    
    public void conectar()
    {
        try
        {
            puerto = 60500;
            dirMulticast = "225.4.5.6";
            grupo = InetAddress.getByName(dirMulticast);
            mcs = new MulticastSocket(puerto);
            mcs.joinGroup(grupo);
            mcs.setLoopbackMode(true);
            mcs.setTimeToLive(100);
            System.out.println();
            System.out.println("-----------------conectar()-----------------");
            System.out.println("Conectado exitosamente con los siguientes parámetros");
            System.out.println("Puerto: 60500");
            System.out.println("Dirección de multicast: 225.4.5.6");
            System.out.println("Unido al grupo");
            System.out.println("Desactivada la interfaz de bucle local");
            System.out.println("Time to Live: 100");
            System.out.println("--------------------------------------------");
            System.out.println();
        }
        catch(UnknownHostException uhe)
        {
            System.out.println("Método Aplicacion()");
            System.out.println("Excepción UnknownHostException capturada: " + uhe.getMessage());
        }
        catch(SocketException se)
        {
            System.out.println("Método Aplicacion()");
            System.out.println("Excepción SocketException capturada: " + se.getMessage());
        }
        catch(IOException ioe)
        {
            System.out.println("Método Aplicacion()");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
    }
    
    public void enviarPizarra()
    {
        Trama tTrama = new Trama();
        
        tTrama.setVector(vtr);
        tTrama.setString(txtaComentarios.getText());
        
        enviarDatagrama(tTrama);
    }
    
    private byte[] objetoAByte(Trama obj)
    {
        byte bytes[] = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        
        try
        {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();
            bytes = baos.toByteArray();
            baos.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Método byte[] objetoAByte(Trama obj)");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
        
        return bytes;
    }
    
    private Trama byteAObjeto(byte[] bytes)
    {
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        Trama obj = null;
        
        try
        {
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);

            obj = (Trama) ois.readObject();
            ois.close();
            bais.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Método Trama byteAObjeto(byte[] bytes)");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("Método Trama byteAObjeto(byte[] bytes)");
            System.out.println("Excepción ClassNotFoundException capturada: " + cnfe.getMessage());
        }
        
        return obj;
    }
    
    private void enviarDatagrama(Trama obj)
    {
        DatagramPacket dp = null;
        byte buffer[] = null;
        buffer = objetoAByte(obj);
        
        try
        {
            dp = new DatagramPacket(buffer, buffer.length, grupo, puerto);
            mcs.send(dp);
            System.out.println();
            System.out.println("-----------------enviarDatagrama()-----------------");
            System.out.println("Se ha enviado un mensaje a: " + dp.getAddress().toString() + ":" + dp.getPort());
            System.out.println("La longitud del mensaje es de: " + dp.getLength());
            System.out.println("----------------------------------------------------");
            System.out.println();
        }
        catch (IOException ioe)
        {
            System.out.println("Método enviarDatagrama(byte[] bytes)");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
    }
    
    private Trama recibirDatagrama()
    {
        DatagramPacket dp = null;
        Trama obj = null;
        
        try
        {
            byte[] buffer = new byte[99999999];
            dp = new DatagramPacket(buffer, buffer.length);
            mcs.receive(dp);
            System.out.println();
            System.out.println("-----------------recibirDatagrama()-----------------");
            System.out.println("Se ha recibido un mensaje de: " + dp.getAddress().toString() + ":" + dp.getPort());
            System.out.println("La longitud del mensaje es de: " + dp.getLength());
            System.out.println("----------------------------------------------------");
            System.out.println();
            obj = (Trama)byteAObjeto(dp.getData());
        }
        catch (IOException ioe)
        {
            System.out.println("Método Trama recibirDatagrama()");
            System.out.println("Excepción IOException capturada: " + ioe.getMessage());
        }
        
        return obj;
    }
    
    public void habilitarInhabilitarOrdenes()
    {
        //Si no hay ningún texto seleccionado deshabilitamos las órdenes: Copiar y Borrar
        if(txtaComentarios.getSelectedText() == null)
        {
            pumMnuItCopiar.setEnabled(false);
            pumMnuItBorrar.setEnabled(false);
        }
        else
        {
            pumMnuItCopiar.setEnabled(true);
            pumMnuItBorrar.setEnabled(true);
        }
        
        //Si no hay texto escrito sobre la caja de texto, entonces deshabilitamos la órden: Seleccionar
        if(txtaComentarios.getText().length() == 0)
            pumMnuItSeleccionar.setEnabled(false);
        else
            pumMnuItSeleccionar.setEnabled(true);
    }
    
    public void abrirArchivo()
    {
        JFileChooser fcAbrir = new JFileChooser(System.getProperty("user.dir"));
        
        //Establecemos ciertas propiedades para el diálogo
        fcAbrir.setDialogTitle("Abrir");
        fcAbrir.setMultiSelectionEnabled(false);
        fcAbrir.setAcceptAllFileFilterUsed(false);
        fcAbrir.addChoosableFileFilter(new FiltrosFicheros());
        
        /*El método getChoosableFileFilters devuelve una matriz de objetos FileFilter que contiene los filtros 
          asignados. El método setFileFilter fija el filtro que será visualizado cuando se muestre el diálogo*/
        fcAbrir.setFileFilter(fcAbrir.getChoosableFileFilters()[0]);
        
        //Mostramos el diálogo invocando a showOpenDialog
        int iOpcion = fcAbrir.showOpenDialog(this);
        
        //Si se selecciono el botón de aceptar
        if(iOpcion == JFileChooser.APPROVE_OPTION)
        {
            //El método getSelectedFile devuelve un objeto File que contiene el nombre del fichero elegido
            File fAbrir = fcAbrir.getSelectedFile();
            
            if(fAbrir.exists())
            {
                try
                {
                    FileInputStream fisFlujo = new FileInputStream(fAbrir);
                    ObjectInputStream oisFlujo = new ObjectInputStream(fisFlujo);
                    Trama tTemp = (Trama) oisFlujo.readObject();

                    vtr = tTemp.getVector();
                    jPanel1.setVector(vtr);
                    txtaComentarios.setText(tTemp.getString());
                    txtaComentarios.requestFocus();
                    txtaComentarios.setSelectionEnd(txtaComentarios.getText().length());
                    jPanel1.repaint();

                    oisFlujo.close();
                    fisFlujo.close();
                }
                catch(FileNotFoundException fnfe)
                {
                    System.out.println("Método abrirArchivo()");
                    System.out.println("Excepción FileNotFoundException capturada: " + fnfe.getMessage());
                }
                catch(IOException ioe)
                {
                    System.out.println("Método abrirArchivo()");
                    System.out.println("Excepción IOException capturada: " + ioe.getMessage());
                }
                catch(ClassNotFoundException cnfe)
                {
                    System.out.println("Método abrirArchivo()");
                    System.out.println("Excepción ClassNotFoundException capturada: " + cnfe.getMessage());
                }
            }
        }
    }
    
    public void guardarArchivo()
    {
        JFileChooser fcGuardar = new JFileChooser(System.getProperty("user.dir"));
        
        //Establecemos ciertas propiedades para el diálogo
        fcGuardar.setDialogTitle("Guardar");
        fcGuardar.setMultiSelectionEnabled(false);
        fcGuardar.setAcceptAllFileFilterUsed(false);
        fcGuardar.addChoosableFileFilter(new FiltrosFicheros());
        
        /*El método getChoosableFileFilters devuelve una matriz de objetos FileFilter que contiene los filtros 
         asignados. El método setFileFilter fija el filtro que será visualizado cuando se muestre el diálogo*/
        fcGuardar.setFileFilter(fcGuardar.getChoosableFileFilters()[0]);
        
        //Mostramos el diálogo invocando a showSaveDialog
        int iOpcion = fcGuardar.showSaveDialog(this);
        
        //Si se selecciono el botón de aceptar
        if(iOpcion == JFileChooser.APPROVE_OPTION)
        {
            //El método getSelectedFile devuelve un objeto File que contiene el nombre del fichero elegido
            File fGuardar = fcGuardar.getSelectedFile();
            
            if(fGuardar.exists())
            {
                if((JOptionPane.showConfirmDialog(this, "El archivo: " + fcGuardar.getSelectedFile().getName() + " ya existe" + "\n" + "Desea reemplazarlo", "Guardar", JOptionPane.YES_NO_OPTION)) == javax.swing.JOptionPane.NO_OPTION)
                    return;
            }
            
            if(fGuardar != null)
            {
                try
                {
                    String strNombreArchivo = fcGuardar.getSelectedFile().getName();
                    
                    if (!strNombreArchivo.endsWith(".dat"))
                        strNombreArchivo = strNombreArchivo + ".dat";
                    
                    File fArchivo = new File(fcGuardar.getCurrentDirectory(), strNombreArchivo);
                    
                    FileOutputStream fosFlujo = new FileOutputStream(fArchivo);
                    ObjectOutputStream oosFlujo = new ObjectOutputStream(fosFlujo);
                    
                    Trama tTrama = new Trama();
                    
                    tTrama.setVector(vtr);
                    tTrama.setString(txtaComentarios.getText());
                    
                    oosFlujo.writeObject(tTrama);
                    
                    JOptionPane.showMessageDialog(this, "El archivo: " + strNombreArchivo + " ha sido guardado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
                    
                    oosFlujo.close();
                    fosFlujo.close();
                }
                catch(FileNotFoundException fnfe)
                {
                    System.out.println("Método guardarArchivo()");
                    System.out.println("Excepción FileNotFoundException capturada: " + fnfe.getMessage());
                }
                catch(IOException ioe)
                {
                    System.out.println("Método guardarArchivo()");
                    System.out.println("Excepción IOException capturada: " + ioe.getMessage());
                }
            }
        }
    }
    
    public void cerrarRecursos()
    {
        if(mcs != null)
        {
            try
            {
                mcs.leaveGroup(grupo);
                mcs.close();
            }
            catch(IOException ioe)
            {
                System.out.println("Método void formWindowClosing(java.awt.event.WindowEvent evt)");
                System.out.println("Excepción IOException capturada: " + ioe.getMessage());
            }
        }
        
        /*if(hilo != null)
        {
            hilo.stop();
            
            try
            {
                hilo.join();
                hilo = null;
            }
            catch(InterruptedException ie)
            {
                System.out.println("Método void formWindowClosing(java.awt.event.WindowEvent evt)");
                System.out.println("Excepción InterruptedException capturada: " + ie.getMessage());
            }
        }*/
    }
    
    //----------------------------Mis variables---------------------------------
    private Polygon plg = null;
    private Vector vtr = null;
    private Graphics gpc = null;
    private Color clr = null;
    //private HiloReceptor hilo = null;
    
    // Variables asociadas a la comunicación
    private int puerto = 0;
    private String dirMulticast = "";
    private InetAddress grupo = null;
    private MulticastSocket mcs = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpUnirseAbandonar;
    private javax.swing.JButton btnLimpiarPizarra;
    private MiJPanel jPanel1;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblPizarra;
    private javax.swing.JMenuBar mbarBarraDeMenus;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuGrupo;
    private javax.swing.JMenuItem mnuItAbrir;
    private javax.swing.JMenuItem mnuItAcercaDe;
    private javax.swing.JMenuItem mnuItColorPizarra;
    private javax.swing.JMenuItem mnuItColorTiza;
    private javax.swing.JMenuItem mnuItEnviarArchivo;
    private javax.swing.JMenuItem mnuItGuardar;
    private javax.swing.JMenuItem mnuItSalir;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JPopupMenu pumMenuEmergente;
    private javax.swing.JMenuItem pumMnuItBorrar;
    private javax.swing.JMenuItem pumMnuItCopiar;
    private javax.swing.JMenuItem pumMnuItPegar;
    private javax.swing.JMenuItem pumMnuItSeleccionar;
    private javax.swing.JRadioButtonMenuItem rbtnMnuItAbandonar;
    private javax.swing.JRadioButtonMenuItem rbtnMnuItUnirse;
    private javax.swing.JSeparator sepSeparador1;
    private javax.swing.JSeparator sepSeparador2;
    private javax.swing.JSeparator sepSeparador3;
    private javax.swing.JScrollPane spaneDesplazamiento;
    private javax.swing.JTextArea txtaComentarios;
    // End of variables declaration//GEN-END:variables
}

/*
 * Recuerda buscar como evitar que el mensaje que envia mi máquina me llegue por la interfaz; es decir 
 * unicamente hacer el envio del mensaje sin recibirlo
 * 
 * Recuerda que falta hacer el dialogo color para permitir que la aplicación elija el color para las 
 * líneas de la pizarra; será necesario añadir una barra de menus
 
 * Recuerda hacer una opción que permita guardar todo el objeto Trama sobre el disco duro y 
 * otra para poder restablecer la aplicación a partir de un archivo en el disco duto; habrá que añadir
 * una opción el el menú archivo
 * 
 * Recuerda cambiar el icono del mouse cuando este este encima de la pizarra; será necesario 
 * asociar un icono tipo tiza, esto con la intención de dar una apariencia más bonita
 * 
 * Añadir un menú contextual al JPanel para conseguir que este muestre opciones como limpiar pizarra
 * comabiar color del lápiz
 * 
 * Añadir un menú contextual al JTextArea para conseguir que se muestren opciones como seleccionar todo 
 * el texto, copiar texto, pegar texto, borrar todo el texto
 * 
 * Añadir dentro del menú archivo alguna opción que me permita seleccionar un archivo para compartir con 
 * todos los miembros del grupo; por ejemplo: un archivo de texto, un archivo de audio, etc...
 */