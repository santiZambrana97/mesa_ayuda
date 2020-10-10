/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMTipoInstancia;

import Controller.ControladorABMTipoInstancia;
import DTO.DTOAgregarTipoInstancia;
import DTO.DTOModificarTipoInstancia;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class ModificarTipoInstancia extends javax.swing.JFrame {

    /**
     * Creates new form ModificarTipoInstancia
     */
    
    ControladorABMTipoInstancia control = new ControladorABMTipoInstancia();
    public ModificarTipoInstancia(int codTIModi) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Modificar TipoInstancia");
        DTOModificarTipoInstancia dtoModificar = control.buscarPorCodTipoInstancia(codTIModi);
        inicializarDatos(dtoModificar);
        
    }

    private ModificarTipoInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void inicializarDatos (DTOModificarTipoInstancia dtoModificar){
        
        inputcodTImod.setText(Integer.toString(dtoModificar.getCodTipoInstancia()));
        inputnombTImod.setText(dtoModificar.getNombreTipoInstancia());
        inputcodSecmod.setText(Integer.toString(dtoModificar.getCodSector()));
        outnombSecmod.setForeground(Color.GRAY);
        outnombSecmod.setText(dtoModificar.getNombreSector());
        inputcodTTmod.setText(Integer.toString(dtoModificar.getCodTipoTarea()));
        outnombTTmod.setForeground(Color.GRAY);
        outnombTTmod.setText(dtoModificar.getNombreTipoTarea());
        inputnombTImod.selectAll();
        inputnombTImod.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        outnombSecmod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inputcodTImod = new javax.swing.JTextField();
        outnombTTmod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputnombTImod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputcodSecmod = new javax.swing.JTextField();
        volverABMAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        confirmarAgregar = new javax.swing.JButton();
        inputcodTTmod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(119, 148, 166));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_edit_black_18dp.png"))); // NOI18N
        jLabel5.setText("MODIFICAR TIPO INSTANCIA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre Sector:");

        outnombSecmod.setEditable(false);
        outnombSecmod.setBackground(new java.awt.Color(255, 255, 255));
        outnombSecmod.setBorder(null);
        outnombSecmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombSecmodActionPerformed(evt);
            }
        });
        outnombSecmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombSecmodKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cod. Tipo Instancia:");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre Tipo Tarea:");

        inputcodTImod.setEditable(false);
        inputcodTImod.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTImod.setBorder(null);
        inputcodTImod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTImodActionPerformed(evt);
            }
        });
        inputcodTImod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTImodKeyTyped(evt);
            }
        });

        outnombTTmod.setEditable(false);
        outnombTTmod.setBackground(new java.awt.Color(255, 255, 255));
        outnombTTmod.setBorder(null);
        outnombTTmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outnombTTmodActionPerformed(evt);
            }
        });
        outnombTTmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                outnombTTmodKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Tipo Instancia:");

        inputnombTImod.setBackground(new java.awt.Color(255, 255, 255));
        inputnombTImod.setBorder(null);
        inputnombTImod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputnombTImodKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cod. Sector:");

        inputcodSecmod.setBackground(new java.awt.Color(255, 255, 255));
        inputcodSecmod.setBorder(null);
        inputcodSecmod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodSecmodFocusLost(evt);
            }
        });
        inputcodSecmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodSecmodActionPerformed(evt);
            }
        });
        inputcodSecmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodSecmodKeyTyped(evt);
            }
        });

        volverABMAgregar.setBackground(new java.awt.Color(204, 204, 204));
        volverABMAgregar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverABMAgregar.setForeground(new java.awt.Color(0, 0, 0));
        volverABMAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        volverABMAgregar.setMnemonic('v');
        volverABMAgregar.setText("Volver");
        volverABMAgregar.setBorder(null);
        volverABMAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverABMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverABMAgregarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cod. Tipo Tarea:");

        confirmarAgregar.setBackground(new java.awt.Color(204, 204, 204));
        confirmarAgregar.setForeground(new java.awt.Color(0, 0, 0));
        confirmarAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_check_black_18dp.png"))); // NOI18N
        confirmarAgregar.setMnemonic('c');
        confirmarAgregar.setText("Confirmar");
        confirmarAgregar.setBorder(null);
        confirmarAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmarAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarAgregarActionPerformed(evt);
            }
        });

        inputcodTTmod.setBackground(new java.awt.Color(255, 255, 255));
        inputcodTTmod.setBorder(null);
        inputcodTTmod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputcodTTmodFocusLost(evt);
            }
        });
        inputcodTTmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodTTmodActionPerformed(evt);
            }
        });
        inputcodTTmod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputcodTTmodKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(volverABMAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputcodTTmod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                        .addComponent(outnombSecmod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputcodSecmod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputnombTImod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputcodTImod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(outnombTTmod)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(inputcodTImod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputnombTImod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputcodSecmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outnombSecmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputcodTTmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outnombTTmod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarAgregar)
                    .addComponent(volverABMAgregar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outnombSecmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombSecmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecmodActionPerformed

    private void outnombSecmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombSecmodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombSecmodKeyTyped

    private void inputcodTImodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTImodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTImodActionPerformed

    private void inputcodTImodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTImodKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACKSPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputcodTImodKeyTyped

    private void outnombTTmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outnombTTmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTmodActionPerformed

    private void outnombTTmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_outnombTTmodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_outnombTTmodKeyTyped
     public void MostrarSectorFil(String codSecModi){
       /*List<DTOAgregarTipoInstancia> lista = control.filtradoSector(codSecModi);
        for (int i = 0; i < lista.size(); i++) {
           DTOAgregarTipoInstancia tI = (DTOAgregarTipoInstancia) lista.get(i);
           outnombSecmod.setText(tI.getNombreSector());
           
        }*/
       String nombreSector = control.buscarNombSector(codSecModi);
       if(nombreSector == "No se encontro el Sector"){
           outnombSecmod.setText("");
           outnombSecmod.setText(nombreSector);
           JOptionPane.showMessageDialog(this, "No se encontro el Sector, ingrese otro código");    
       }else{
         outnombSecmod.setText("");
         outnombSecmod.setForeground(Color.GRAY);
         outnombSecmod.setText(nombreSector);
        }
    }
    private void inputnombTImodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputnombTImodKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACKSPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_inputnombTImodKeyTyped
    public void MostrarTTFil(String codTTModi){
       /*List<DTOAgregarTipoInstancia> lista = control.filtradoTT(codTTModi);
        for (int i = 0; i < lista.size(); i++) {
           DTOAgregarTipoInstancia tI = (DTOAgregarTipoInstancia) lista.get(i);
           outnombTTmod.setText(tI.getNombreTipoTarea());
            System.out.println(tI.getNombreTipoTarea());
           
        }*/
       String nombreTT = control.buscarNombTipoTarea(codTTModi);
       if(nombreTT == "No se encontro el TipoTarea"){
           outnombTTmod.setText("");
           outnombTTmod.setText(nombreTT);
           JOptionPane.showMessageDialog(this, "No se encontro el TipoTarea, ingrese otro código");    
       }else{
         outnombTTmod.setText("");
         outnombTTmod.setForeground(Color.GRAY);
         outnombTTmod.setText(nombreTT);
       }
    }
    private void inputcodSecmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodSecmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodSecmodActionPerformed

    private void inputcodSecmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodSecmodKeyTyped
        //Declaramos una variable y asignamos un evento
    }//GEN-LAST:event_inputcodSecmodKeyTyped

    private void volverABMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverABMAgregarActionPerformed
        //Botón para volver al menú de TipoInstancia
        ABMTipoInstancia abmTI = new ABMTipoInstancia();
        abmTI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverABMAgregarActionPerformed

    private void confirmarAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarAgregarActionPerformed
        //Método para agregar un Tipo de Instancia
        DTOModificarTipoInstancia dtoModificar = new DTOModificarTipoInstancia();
        dtoModificar.setCodTipoInstancia(Integer.parseInt(inputcodTImod.getText()));
        dtoModificar.setNombreTipoInstancia(inputnombTImod.getText());
        dtoModificar.setCodSector(Integer.parseInt(inputcodSecmod.getText()));
        dtoModificar.setNombreSector(outnombSecmod.getText());
        dtoModificar.setCodTipoTarea(Integer.parseInt(inputcodTTmod.getText()));
        dtoModificar.setNombreTipoTarea(outnombTTmod.getText());
        control.modificarTipoInstancia(dtoModificar);

        ABMTipoInstancia abmti = new ABMTipoInstancia();
        abmti.tablaTI("");
        JOptionPane.showMessageDialog(null,"El tipoInstancia fue modificado con éxito");
        abmti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_confirmarAgregarActionPerformed

    private void inputcodTTmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodTTmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTTmodActionPerformed

    private void inputcodTTmodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputcodTTmodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodTTmodKeyTyped

    private void inputcodSecmodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodSecmodFocusLost
        // TODO add your handling code here:
        
         if (!inputcodSecmod.getText().isEmpty()){
            MostrarSectorFil(inputcodSecmod.getText());
        }
         else{
             JOptionPane.showMessageDialog(this, "Por favor ingrese el código sector", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
                                                   
        ///lost
    }//GEN-LAST:event_inputcodSecmodFocusLost

    private void inputcodTTmodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputcodTTmodFocusLost
     
        if (!inputcodTTmod.getText().isEmpty()){
        MostrarTTFil(inputcodTTmod.getText());
         }else{JOptionPane.showMessageDialog(this, "Por favor ingrese el código tipo tarea", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);}

    
    }//GEN-LAST:event_inputcodTTmodFocusLost

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
            java.util.logging.Logger.getLogger(ModificarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarTipoInstancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarTipoInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarAgregar;
    private javax.swing.JTextField inputcodSecmod;
    private javax.swing.JTextField inputcodTImod;
    private javax.swing.JTextField inputcodTTmod;
    private javax.swing.JTextField inputnombTImod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField outnombSecmod;
    private javax.swing.JTextField outnombTTmod;
    private javax.swing.JButton volverABMAgregar;
    // End of variables declaration//GEN-END:variables
}
