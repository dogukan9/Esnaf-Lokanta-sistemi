
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doğukan
 */
public class Rapor extends javax.swing.JFrame {
private int murat,ali,erdem,mehmet,muhat;
 public void yazdir(int murat,int ali,int erdem,int mehmet,int muhat){
  
        urfali.setText("MURAT= "+String.valueOf(murat)+"TL");
      ALICO.setText("ALİ= "+String.valueOf(ali)+"TL");
        YETMISBES.setText("ERDEM= "+String.valueOf(erdem)+"TL");
         KURT.setText("MEHMET= "+String.valueOf(mehmet)+"TL");
          TURKMEN.setText("MUHAT= "+String.valueOf(muhat)+"TL"); }
    
 
  

    public int getMurat() {
        return murat;
    }

    public void setMurat(int murat) {
        this.murat = murat;
    }

    public int getAli() {
        return ali;
    }

    public void setAli(int ali) {
        this.ali = ali;
    }

    public int getErdem() {
        return erdem;
    }

    public void setErdem(int erdem) {
        this.erdem = erdem;
    }

    public int getMehmet() {
        return mehmet;
    }

    public void setMehmet(int mehmet) {
        this.mehmet = mehmet;
    }

    public int getMuhat() {
        return muhat;
    }

    public void setMuhat(int muhat) {
        this.muhat = muhat;
    }
    public Rapor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        urfali = new javax.swing.JLabel();
        ALICO = new javax.swing.JLabel();
        YETMISBES = new javax.swing.JLabel();
        KURT = new javax.swing.JLabel();
        TURKMEN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        urfali.setText("MURAT=");

        ALICO.setText("ALİ=");

        YETMISBES.setText("ERDEM=");

        KURT.setText("MEHMET=");

        TURKMEN.setText("MUHAT=");

        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YETMISBES)
                    .addComponent(KURT)
                    .addComponent(TURKMEN)
                    .addComponent(urfali)
                    .addComponent(ALICO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(urfali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ALICO)
                .addGap(27, 27, 27)
                .addComponent(YETMISBES)
                .addGap(18, 18, 18)
                .addComponent(KURT)
                .addGap(33, 33, 33)
                .addComponent(TURKMEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        setVisible(false);        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rapor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ALICO;
    private javax.swing.JLabel KURT;
    private javax.swing.JLabel TURKMEN;
    private javax.swing.JLabel YETMISBES;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel urfali;
    // End of variables declaration                   
}
