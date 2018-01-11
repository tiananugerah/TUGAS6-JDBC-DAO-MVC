/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tianam.latihancrudmvcjdbc.service;

import edu.tianam.latihancrudmvcjdbc.entity.Pelanggan;
import edu.tianam.latihancrudmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author TOSHIBA
 * NIM      : 10116473
 * NAMA     : Tian Anugerah Mulyana
 * KELAS    : PBO11
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    //unique
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    // Jika ingin meload semua data pelanggan
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

}
