package skillcreator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Peixoto
 */
public class SkillCreatorFrame extends javax.swing.JFrame {
    private int width, height;
    
    /**
     * Creates new form SkillCreatorFrame
     */
    public SkillCreatorFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skillNameLabel = new javax.swing.JLabel();
        skillNameField = new javax.swing.JTextField();
        interpreterPanel = new javax.swing.JPanel();
        interpreterInformationLabel = new javax.swing.JLabel();
        enumNameLabel = new javax.swing.JLabel();
        enumNameField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        stepsNumbersLabel = new javax.swing.JLabel();
        stepsNumberSpinner = new javax.swing.JSpinner();
        spriteInfoScrollPanel = new javax.swing.JScrollPane();
        spriteInfoTable = new javax.swing.JTable();
        skillWidthLabel = new javax.swing.JLabel();
        skillHeightLabel = new javax.swing.JLabel();
        skillWidthField = new javax.swing.JTextField();
        skillHeightField = new javax.swing.JTextField();
        delayByStepsLabel = new javax.swing.JLabel();
        delayByStepsField = new javax.swing.JTextField();
        skillCooldownLabel = new javax.swing.JLabel();
        skillCooldownField = new javax.swing.JTextField();
        spritePanel = new javax.swing.JPanel();
        spriteScrollPanel = new javax.swing.JScrollPane();
        spriteLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        skillNameLabel.setText("Nome do Skill: ");

        skillNameField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                skillNameFieldCaretUpdate(evt);
            }
        });

        interpreterPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        interpreterInformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        interpreterInformationLabel.setText("Informações do Interpreter");

        enumNameLabel.setText("Nome no Enum: ");

        enumNameField.setText(" ");

        idLabel.setText("Id:");

        idField.setText("               ");

        stepsNumbersLabel.setText("Numero de Steps:");

        stepsNumberSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        stepsNumberSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stepsNumberSpinnerStateChanged(evt);
            }
        });

        spriteInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(0), null}
            },
            new String [] {
                "Step Number", "Step Damage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spriteInfoTable.getTableHeader().setReorderingAllowed(false);
        spriteInfoScrollPanel.setViewportView(spriteInfoTable);
        if (spriteInfoTable.getColumnModel().getColumnCount() > 0) {
            spriteInfoTable.getColumnModel().getColumn(0).setResizable(false);
            spriteInfoTable.getColumnModel().getColumn(1).setResizable(false);
        }

        skillWidthLabel.setText("Width:");

        skillHeightLabel.setText("Height: ");

        skillWidthField.setText("10");
        skillWidthField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                skillWidthFieldCaretUpdate(evt);
            }
        });

        skillHeightField.setText("10");
        skillHeightField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                skillHeightFieldCaretUpdate(evt);
            }
        });

        delayByStepsLabel.setText("Delay por Step: ");

        delayByStepsField.setText("            ");

        skillCooldownLabel.setText("Cooldown: ");

        skillCooldownField.setText("            ");

        javax.swing.GroupLayout interpreterPanelLayout = new javax.swing.GroupLayout(interpreterPanel);
        interpreterPanel.setLayout(interpreterPanelLayout);
        interpreterPanelLayout.setHorizontalGroup(
            interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interpreterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spriteInfoScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(interpreterInformationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(interpreterPanelLayout.createSequentialGroup()
                        .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enumNameLabel)
                            .addComponent(idLabel)
                            .addComponent(stepsNumbersLabel)
                            .addComponent(skillWidthLabel)
                            .addComponent(skillHeightLabel)
                            .addComponent(delayByStepsLabel)
                            .addComponent(skillCooldownLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enumNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stepsNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(skillWidthField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(skillHeightField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(interpreterPanelLayout.createSequentialGroup()
                                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(skillCooldownField)
                                    .addComponent(delayByStepsField))
                                .addGap(197, 197, 197)))))
                .addContainerGap())
        );
        interpreterPanelLayout.setVerticalGroup(
            interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interpreterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(interpreterInformationLabel)
                .addGap(18, 18, 18)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enumNameLabel)
                    .addComponent(enumNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stepsNumbersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stepsNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillWidthLabel)
                    .addComponent(skillWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillHeightLabel)
                    .addComponent(skillHeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delayByStepsLabel)
                    .addComponent(delayByStepsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillCooldownLabel)
                    .addComponent(skillCooldownField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spriteInfoScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        spritePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        spriteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLabel.setText("Click to add an sprite");
        spriteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spriteLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spriteLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                spriteLabelMouseReleased(evt);
            }
        });
        spriteLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                spriteLabelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                spriteLabelMouseMoved(evt);
            }
        });
        spriteScrollPanel.setViewportView(spriteLabel);

        javax.swing.GroupLayout spritePanelLayout = new javax.swing.GroupLayout(spritePanel);
        spritePanel.setLayout(spritePanelLayout);
        spritePanelLayout.setHorizontalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spritePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spriteScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        spritePanelLayout.setVerticalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, spritePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spriteScrollPanel)
                .addContainerGap())
        );

        fileMenu.setText("File");
        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(interpreterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spritePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(skillNameLabel)
                        .addGap(21, 21, 21)
                        .addComponent(skillNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillNameLabel)
                    .addComponent(skillNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interpreterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stepsNumberSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stepsNumberSpinnerStateChanged
        if(spriteInfoTable.getRowCount() != (int)stepsNumberSpinner.getValue()) {
            Object[][] data = new Object[((int)(stepsNumberSpinner.getValue()))][2];
            String[] collumNames = {"Step Number", "Step Damage"};
            
            for(int i = 0; i < (int)stepsNumberSpinner.getValue(); i++) {
                if(i < spriteInfoTable.getRowCount()) {
                    data[i][0] = i;//spriteInfoTable.getValueAt(i, 0);
                    data[i][1] = spriteInfoTable.getValueAt(i, 1);                  
                }
                else {
                    data[i][0] = i;
                    data[i][1] = null;
                }
            }    
            spriteInfoTable.setModel(new DefaultTableModel(data, collumNames));                
        }
    }//GEN-LAST:event_stepsNumberSpinnerStateChanged

    private void skillNameFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_skillNameFieldCaretUpdate
        String enumName = skillNameField.getText();
        enumName = enumName.toUpperCase();
        enumName = enumName.replace(' ', '_');
        enumNameField.setText(enumName);
    }//GEN-LAST:event_skillNameFieldCaretUpdate

    private void spriteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spriteLabelMouseClicked
        JFileChooser JFC = new JFileChooser();
        JFC.setFileFilter(new FileNameExtensionFilter("Image types (*.png, .jpg, .bmp, .gif, (...) )", "png", "jpg", "jpeg", "bmp", "gif"));
        JFC.setBounds(0, 0, 500, 200);
        JOptionPane.showMessageDialog(this, JFC);

        boolean ready = false;

        while(!ready) {
            if(JFC.getSelectedFile() != null) {
                spriteLabel.setText(null);
                spriteLabel.setIcon(new ImageIcon(JFC.getSelectedFile().getPath()));
                ready = true;
            }
            if(JFC.isVisible()) break;
        }
    }//GEN-LAST:event_spriteLabelMouseClicked

    private void spriteLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spriteLabelMouseDragged
            Graphics g;                        
            g = this.spriteLabel.getGraphics();
            g.setColor(new Color(0, 0, 255, 50));
            g.fillRect(evt.getX(), evt.getY(), 100, 30);
    }//GEN-LAST:event_spriteLabelMouseDragged

    private void spriteLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spriteLabelMousePressed

    }//GEN-LAST:event_spriteLabelMousePressed

    private void spriteLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spriteLabelMouseReleased

    }//GEN-LAST:event_spriteLabelMouseReleased

    private void spriteLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spriteLabelMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_spriteLabelMouseMoved

    private void skillWidthFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_skillWidthFieldCaretUpdate
        width = Integer.parseInt(skillWidthField.getText());
        drawRect();
    }//GEN-LAST:event_skillWidthFieldCaretUpdate

    private void skillHeightFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_skillHeightFieldCaretUpdate
        height = Integer.parseInt(skillHeightField.getText());
        drawRect();
    }//GEN-LAST:event_skillHeightFieldCaretUpdate

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
            java.util.logging.Logger.getLogger(SkillCreatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkillCreatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkillCreatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkillCreatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkillCreatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField delayByStepsField;
    private javax.swing.JLabel delayByStepsLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JTextField enumNameField;
    private javax.swing.JLabel enumNameLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel interpreterInformationLabel;
    private javax.swing.JPanel interpreterPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField skillCooldownField;
    private javax.swing.JLabel skillCooldownLabel;
    private javax.swing.JTextField skillHeightField;
    private javax.swing.JLabel skillHeightLabel;
    private javax.swing.JTextField skillNameField;
    private javax.swing.JLabel skillNameLabel;
    private javax.swing.JTextField skillWidthField;
    private javax.swing.JLabel skillWidthLabel;
    private javax.swing.JScrollPane spriteInfoScrollPanel;
    private javax.swing.JTable spriteInfoTable;
    private javax.swing.JLabel spriteLabel;
    private javax.swing.JPanel spritePanel;
    private javax.swing.JScrollPane spriteScrollPanel;
    private javax.swing.JSpinner stepsNumberSpinner;
    private javax.swing.JLabel stepsNumbersLabel;
    // End of variables declaration//GEN-END:variables

    private void drawRect() {
        Graphics g = spriteLabel.getGraphics();
        g.drawRect(0, 0, width, height);
    }
}