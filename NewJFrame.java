/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class NewJFrame extends javax.swing.JFrame {

    Font grito;
    Font padrao;
    Font ita;
    Font sub;
    float tamanho;

    public NewJFrame() {
        initComponents();
        Map<TextAttribute,Integer> fontAtrributes= new HashMap<>();
        fontAtrributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        grito = new Font("Serif", Font.BOLD, 12);
        ita = new Font("Serif", Font.ITALIC, 12);
        padrao = new Font("Serif", Font.PLAIN, 12);
        sub= new Font("Serif",Font.BOLD,12).deriveFont(fontAtrributes);
        campo.setFont(padrao);
        tamanho = 12;
        campo.setText("Seu texto aqui");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        negrito = new javax.swing.JMenuItem();
        italico = new javax.swing.JMenuItem();
        normal = new javax.swing.JMenuItem();
        sublinhado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        amarelo = new javax.swing.JMenuItem();
        vermelho = new javax.swing.JMenuItem();
        azul = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        diminuir = new javax.swing.JMenuItem();
        aumenta = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campo.setColumns(20);
        campo.setRows(5);
        jScrollPane1.setViewportView(campo);

        jMenu1.setText("Estilo");

        negrito.setText("Negrito");
        negrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritoActionPerformed(evt);
            }
        });
        jMenu1.add(negrito);

        italico.setText("Italico");
        italico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italicoActionPerformed(evt);
            }
        });
        jMenu1.add(italico);

        normal.setText("Normal");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        jMenu1.add(normal);

        sublinhado.setText("Sublinhado");
        sublinhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sublinhadoActionPerformed(evt);
            }
        });
        jMenu1.add(sublinhado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cores");

        amarelo.setText("Amarelo");
        amarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amareloActionPerformed(evt);
            }
        });
        jMenu2.add(amarelo);

        vermelho.setText("Vermelho");
        vermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermelhoActionPerformed(evt);
            }
        });
        jMenu2.add(vermelho);

        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });
        jMenu2.add(azul);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tamanho");

        diminuir.setText("Diminuir");
        diminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirActionPerformed(evt);
            }
        });
        jMenu3.add(diminuir);

        aumenta.setText("Aumentar");
        aumenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaActionPerformed(evt);
            }
        });
        jMenu3.add(aumenta);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void negritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negritoActionPerformed
        campo.setFont(grito.deriveFont(tamanho));

    }//GEN-LAST:event_negritoActionPerformed

    private void italicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italicoActionPerformed
        campo.setFont(ita.deriveFont(tamanho));
    }//GEN-LAST:event_italicoActionPerformed

    private void amareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amareloActionPerformed
        campo.setForeground(Color.YELLOW);
    }//GEN-LAST:event_amareloActionPerformed

    private void vermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermelhoActionPerformed
        campo.setForeground(Color.RED);
    }//GEN-LAST:event_vermelhoActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        campo.setForeground(Color.BLUE);
    }//GEN-LAST:event_azulActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        campo.setFont(padrao.deriveFont(tamanho));
    }//GEN-LAST:event_normalActionPerformed

    private void sublinhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sublinhadoActionPerformed
        Font valor = campo.getFont();
        campo.setFont(sub.deriveFont(tamanho));

    }//GEN-LAST:event_sublinhadoActionPerformed

    private void aumentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaActionPerformed
        Font valor = campo.getFont();
        campo.setFont(valor.deriveFont(tamanho + 1));
        tamanho++;
    }//GEN-LAST:event_aumentaActionPerformed

    private void diminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirActionPerformed
        Font valor = campo.getFont();
        if (tamanho == 1) {
            JOptionPane.showMessageDialog(null, "Tamanho de fonte: 1 , não pode ser menor que isso");
        } else {
            campo.setFont(valor.deriveFont(tamanho - 1));
            tamanho--;
        }
    }//GEN-LAST:event_diminuirActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem amarelo;
    private javax.swing.JMenuItem aumenta;
    private javax.swing.JMenuItem azul;
    private javax.swing.JTextArea campo;
    private javax.swing.JMenuItem diminuir;
    private javax.swing.JMenuItem italico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem negrito;
    private javax.swing.JMenuItem normal;
    private javax.swing.JMenuItem sublinhado;
    private javax.swing.JMenuItem vermelho;
    // End of variables declaration//GEN-END:variables
}
