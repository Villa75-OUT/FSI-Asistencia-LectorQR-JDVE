

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;




public class FVerificador extends javax.swing.JFrame {

    Webcam webcam;// Obtiene las imagenes de la camara
    WebcamPanel panelWC;// Muestra las imagenes de la camara
    
    Conexion cnx = new Conexion();
    
    public FVerificador() {
        initComponents();
        setLocationRelativeTo(null);
        
        if (cnx.conectar("localhost", "guarderia", "root", "")==1) {
            JOptionPane.showMessageDialog(rootPane, "CONEXION EXITOSA :D");
        } else {
            JOptionPane.showMessageDialog(rootPane, "FALLO LA CONEXION D:");
            System.exit(0);
        }
        
        inicializarCamara();
        
        clock.start();

    }
    
    private void inicializarCamara(){
        webcam = Webcam.getWebcams().get(0);//se conecta a la camara por defecto
        webcam.setViewSize(new Dimension(176, 144));//define la resolución de la camara
        panelWC = new WebcamPanel(webcam);//indica que la camara se va desplegar en este panel
        pCamara.add(panelWC); //Agrega el panel de la cámara al panel del dialogo
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BNueva = new javax.swing.JButton();
        pCamara = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TLista = new javax.swing.JTable();
        Ltotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Lnombre = new javax.swing.JLabel();
        Ledad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Lcodigo = new javax.swing.JLabel();
        LTutor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Shora = new javax.swing.JSpinner();
        BAgregar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abarrotera Doña Ingrid");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 10, 60, 50);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guarderia Snoopy");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 260, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 80);

        BNueva.setText("NUEVA LISTA");
        BNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevaActionPerformed(evt);
            }
        });

        pCamara.setBackground(new java.awt.Color(0, 0, 102));
        pCamara.setMaximumSize(new java.awt.Dimension(480, 320));
        pCamara.setMinimumSize(new java.awt.Dimension(480, 320));
        pCamara.setPreferredSize(new java.awt.Dimension(480, 320));
        pCamara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pCamaraMousePressed(evt);
            }
        });
        pCamara.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NIÑ@S EN LAS INSTALACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        TLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "EDAD", "TUTOR", "HORA ENTRADA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TLista);
        if (TLista.getColumnModel().getColumnCount() > 0) {
            TLista.getColumnModel().getColumn(0).setResizable(false);
            TLista.getColumnModel().getColumn(1).setResizable(false);
            TLista.getColumnModel().getColumn(2).setResizable(false);
            TLista.getColumnModel().getColumn(3).setResizable(false);
            TLista.getColumnModel().getColumn(4).setResizable(false);
        }

        Ltotal.setBackground(new java.awt.Color(102, 153, 255));
        Ltotal.setText("0");
        Ltotal.setOpaque(true);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Infantes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(Ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Ltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFANTE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tutor:");

        Lnombre.setBackground(new java.awt.Color(102, 153, 255));
        Lnombre.setOpaque(true);

        Ledad.setBackground(new java.awt.Color(102, 153, 255));
        Ledad.setOpaque(true);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Código:");

        Lcodigo.setBackground(new java.awt.Color(102, 153, 255));
        Lcodigo.setOpaque(true);

        LTutor.setBackground(new java.awt.Color(102, 153, 255));
        LTutor.setOpaque(true);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("hora de entrada:");

        Shora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Lcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(LTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Lnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Ledad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Shora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Lcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(LTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Shora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ledad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        BAgregar.setText("ASISTENCIA");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });

        BEliminar.setText("ELIMINAR DE LA LISTA");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pCamara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BNueva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(58, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void pCamaraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCamaraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCamaraMousePressed

    private void BNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TLista.getModel();
        modelo.setRowCount(0);
       // calculatTotal();
       
       Ltotal.setText("0");
    }//GEN-LAST:event_BNuevaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TLista.getModel();
        
//        SimpleDateFormat s = SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        String feha = Shora.
        
        int valors = Integer.parseInt(Ltotal.getText());
    Ltotal.setText(String.valueOf(valors + 1));
        
       
        
        
        String cod = Lcodigo.getText();
        String nom = Lnombre.getText();
        String hore = Shora.getValue().toString();
        String edad = Ledad.getText();
        String tutor = LTutor.getText();
        
        // usar libreria en caso de estar de español españa para horario US
//        String preciof = String.format(java.util.Locale.US,"%.2f", grupo);
        
        modelo.addRow(new Object[]{cod,nom,edad,tutor,hore});
        //-----
        
        Lcodigo.setText("");
        Lnombre.setText("");
        Ledad.setText("");
        LTutor.setText("");
        Lcodigo.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TLista.getModel();
        int renglon = TLista.getSelectedRow();
        if(renglon>=0){
            
            
            
            int valors = Integer.parseInt(Ltotal.getText());
    Ltotal.setText(String.valueOf(valors - 1));
    
            modelo.removeRow(renglon);
        }
        
         if(renglon<0){
        JOptionPane.showMessageDialog(this, "Selecciona una fila owo");
         }
        
        
        //calculatTotal();
    }//GEN-LAST:event_BEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FVerificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVerificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVerificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVerificador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVerificador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BNueva;
    private javax.swing.JLabel LTutor;
    private javax.swing.JLabel Lcodigo;
    private javax.swing.JLabel Ledad;
    private javax.swing.JLabel Lnombre;
    private javax.swing.JLabel Ltotal;
    private javax.swing.JSpinner Shora;
    private javax.swing.JTable TLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pCamara;
    // End of variables declaration//GEN-END:variables

    Timer clock = new Timer(250, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Image imagen = webcam.getImage();//imagen de la camara
            try {
                
                BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
                        new BufferedImageLuminanceSource((BufferedImage) imagen)));//convertir la imagen de la camara a otro formato
                
                Result qrCodigo = new MultiFormatReader().decode(binaryBitmap);//Pasar la imagen al decodificador para obtener el codigo
                String codigoLeido = qrCodigo.getText();
                
                Lcodigo.setText(codigoLeido);
                Lcodigo.setBackground(Color.green);
                obtenerProductos(codigoLeido);
                

            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }

    });

    //----------------------
    
    private void obtenerProductos(String codigo){
        String noma="SELECT nombre FROM infantes WHERE clave = '"+codigo+"'";
        String tut="SELECT tutor FROM infantes WHERE clave = '"+codigo+"'";
        String edat="SELECT edad FROM infantes WHERE clave = '"+codigo+"'";
        
        
        String nombre=cnx.obtenerDato(noma);
        String tutor=cnx.obtenerDato(tut);
          String edad=cnx.obtenerDato(edat);
        
        Lnombre.setText(nombre);
        Ledad.setText(edad);
         LTutor.setText(tutor);
        
        
        
    }
    
     //----------------------
    
//    private void calculatTotal(){
//        DefaultTableModel modelo = (DefaultTableModel) TLista.getModel();
//        float total = 0;
//        for (int k = 0; k < modelo.getRowCount(); k++) {
//            String tt = modelo.getValueAt(k, 4).toString();
//            float tot = Float.valueOf(tt);
//            total +=tot;
//            
//        }
////        LTotal.setText(String.format("%.2f", total));
//    }

}
