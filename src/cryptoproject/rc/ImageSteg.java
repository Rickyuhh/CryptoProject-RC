/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cryptoproject.rc;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ricksoncosta
 */
public class ImageSteg extends javax.swing.JFrame {

    /**
     * Creates new form ImageSteg
     * @param lbl
     * @param f
     */
    public void placeImage(JLabel lbl, File f) {
            try {
            Image img = ImageIO.read(f);
            if (img != null) {
                Image imgScaled = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
                lbl.setIcon(new ImageIcon(imgScaled));  // Set icon on the passed label, not specifically lblImageGuest
            } else {
                JOptionPane.showMessageDialog(this, "File is not a valid image", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ImageSteg() {
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

        lblImageGuest = new javax.swing.JLabel();
        lblGuest = new javax.swing.JLabel();
        lblImageHost = new javax.swing.JLabel();
        lblHost = new javax.swing.JLabel();
        lblEncrypted = new javax.swing.JLabel();
        lblImageEncrypted = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuGstImg = new javax.swing.JMenuItem();
        jMenuHstImg = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImageGuest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblGuest.setText("Guest Image");

        lblImageHost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHost.setText("Host Image");

        lblEncrypted.setText("Encrypted Image");

        lblImageEncrypted.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");

        jMenuGstImg.setText("Select Guest Image");
        jMenuGstImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGstImgActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGstImg);

        jMenuHstImg.setText("Select Host Image");
        jMenuHstImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHstImgActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuHstImg);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Encrypt Image");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(lblGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHost)
                .addGap(370, 370, 370))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lblImageGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblImageHost, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEncrypted)
                        .addGap(532, 532, 532))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImageEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImageHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImageGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(lblEncrypted)
                .addGap(18, 18, 18)
                .addComponent(lblImageEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGstImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGstImgActionPerformed
        File f = null;
        JFileChooser fc = new JFileChooser();
        FileFilter ff = new FileNameExtensionFilter("Image File", "jpeg", "jpg", "png", "tif");
        fc.setFileFilter(ff);
        //        fc.addChoosableFileFilter(new FileNameExtensionFilter("Image File", "jpeg", "jpg", "png", "tif"));
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            f = fc.getSelectedFile();
        }
        placeImage(lblImageGuest, f);
        //for text
        //btnOpenTextFile
        //File f = new File (filel.txt);
    }//GEN-LAST:event_jMenuGstImgActionPerformed

    private void jMenuHstImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHstImgActionPerformed
        File f1 = null;
        JFileChooser fc = new JFileChooser();
        FileFilter ff = new FileNameExtensionFilter("Image File", "jpeg", "jpg", "png", "tif");
        fc.setFileFilter(ff);
        //        fc.addChoosableFileFilter(new FileNameExtensionFilter("Image File", "jpeg", "jpg", "png", "tif"));
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            f1 = fc.getSelectedFile();
        }
        placeImage(lblImageHost, f1);
        //for text
        //btnOpenTextFile
        //File f = new File (filel.txt);
    }//GEN-LAST:event_jMenuHstImgActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(ImageSteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageSteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageSteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageSteg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ImageSteg().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGstImg;
    private javax.swing.JMenuItem jMenuHstImg;
    private javax.swing.JLabel lblEncrypted;
    private javax.swing.JLabel lblGuest;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblImageEncrypted;
    private javax.swing.JLabel lblImageGuest;
    private javax.swing.JLabel lblImageHost;
    // End of variables declaration//GEN-END:variables
}
