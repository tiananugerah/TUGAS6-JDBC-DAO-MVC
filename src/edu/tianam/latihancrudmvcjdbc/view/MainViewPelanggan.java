/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tianam.latihancrudmvcjdbc.view;

import edu.tianam.latihancrudmvcjdbc.error.PelangganException;
import java.sql.SQLException;

/**
 *
 * @author TOSHIBA
 * NIM      : 10116473
 * NAMA     : Tian Anugerah Mulyana
 * KELAS    : PBO11
 */
public class MainViewPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form MainViewPelanggan
     */
    public MainViewPelanggan() {
        initComponents();
        
        
    }

    public void loadDatabase() throws SQLException, PelangganException {
        pelangganView1.loadDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pelangganView1 = new edu.tianam.latihancrudmvcjdbc.view.PelangganView();
        pelangganView3 = new edu.tianam.latihancrudmvcjdbc.view.PelangganView();
        pelangganView4 = new edu.tianam.latihancrudmvcjdbc.view.PelangganView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pelangganView4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(pelangganView4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.tianam.latihancrudmvcjdbc.view.PelangganView pelangganView1;
    private edu.tianam.latihancrudmvcjdbc.view.PelangganView pelangganView3;
    private edu.tianam.latihancrudmvcjdbc.view.PelangganView pelangganView4;
    // End of variables declaration//GEN-END:variables
}
