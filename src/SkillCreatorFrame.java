/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Peixoto
 */
public class SkillCreatorFrame extends javax.swing.JFrame {

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
                {null, null, null, null}
            },
            new String [] {
                "LaneType", "Lane maxIndex", "Lane width", "Lane height"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
            spriteInfoTable.getColumnModel().getColumn(2).setResizable(false);
            spriteInfoTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout interpreterPanelLayout = new javax.swing.GroupLayout(interpreterPanel);
        interpreterPanel.setLayout(interpreterPanelLayout);
        interpreterPanelLayout.setHorizontalGroup(
            interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interpreterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(interpreterPanelLayout.createSequentialGroup()
                        .addComponent(stepsNumbersLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spriteInfoScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(interpreterInformationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(interpreterPanelLayout.createSequentialGroup()
                        .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enumNameLabel)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(interpreterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enumNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stepsNumberSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(spriteInfoScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        spritePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        spriteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spriteLabel.setText("Click to add an sprite");
        spriteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spriteLabelMouseClicked(evt);
            }
        });
        spriteScrollPanel.setViewportView(spriteLabel);

        javax.swing.GroupLayout spritePanelLayout = new javax.swing.GroupLayout(spritePanel);
        spritePanel.setLayout(spritePanelLayout);
        spritePanelLayout.setHorizontalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spriteScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        spritePanelLayout.setVerticalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spriteScrollPanel)
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
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillNameLabel)
                    .addComponent(skillNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(interpreterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stepsNumberSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stepsNumberSpinnerStateChanged
        if(spriteInfoTable.getRowCount() != (int)stepsNumberSpinner.getValue()) {
            Object[][] data = new Object[((int)(stepsNumberSpinner.getValue()))][4];
            String[] collumNames = {"LaneType", "Lane maxIndex", "Lane width", "Lane height"};
            
            for(int i = 0; i < (int)stepsNumberSpinner.getValue(); i++) {
                if(i < spriteInfoTable.getRowCount()) {
                    data[i][0] = spriteInfoTable.getValueAt(i, 0);
                    data[i][1] = spriteInfoTable.getValueAt(i, 1);
                    data[i][2] = spriteInfoTable.getValueAt(i, 2);
                    data[i][3] = spriteInfoTable.getValueAt(i, 3);                    
                }
                else {
                    data[i][0] = null;
                    data[i][0] = null;
                    data[i][0] = null;
                    data[i][0] = null;
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
    private javax.swing.JMenu editMenu;
    private javax.swing.JTextField enumNameField;
    private javax.swing.JLabel enumNameLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel interpreterInformationLabel;
    private javax.swing.JPanel interpreterPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField skillNameField;
    private javax.swing.JLabel skillNameLabel;
    private javax.swing.JScrollPane spriteInfoScrollPanel;
    private javax.swing.JTable spriteInfoTable;
    private javax.swing.JLabel spriteLabel;
    private javax.swing.JPanel spritePanel;
    private javax.swing.JScrollPane spriteScrollPanel;
    private javax.swing.JSpinner stepsNumberSpinner;
    private javax.swing.JLabel stepsNumbersLabel;
    // End of variables declaration//GEN-END:variables
}
