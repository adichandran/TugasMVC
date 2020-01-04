/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adichandra.latihanmvc.controller;

import edu.adichandra.latihanmvc.model.PelangganModel;
import edu.adichandra.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PelangganController {
    
    private PelangganModel Model;

    public void setModel(PelangganModel Model) {
        this.Model = Model;
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTelp.equals("")) {
            
        } else
        {
            Model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        } else {
            Model.simpanForm();
        }
        
    }
    
    
}
