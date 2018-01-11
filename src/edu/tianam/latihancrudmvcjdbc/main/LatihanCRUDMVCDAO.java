/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tianam.latihancrudmvcjdbc.main;

import edu.tianam.latihancrudmvcjdbc.database.KingBarbershopDatabase;
import edu.tianam.latihancrudmvcjdbc.entity.Pelanggan;
import edu.tianam.latihancrudmvcjdbc.error.PelangganException;
import edu.tianam.latihancrudmvcjdbc.service.PelangganDao;
import edu.tianam.latihancrudmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author TOSHIBA
 * NIM      : 10116473
 * NAMA     : Tian Anugerah Mulyana
 * KELAS    : PBO11
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }  
            }
        });
        
    }
    
}
