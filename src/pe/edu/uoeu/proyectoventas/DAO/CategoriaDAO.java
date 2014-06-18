/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.uoeu.proyectoventas.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pe.edu.uoeu.proyectoventas.config.Conexion;
import pe.edu.uoeu.proyectoventas.modelo.Categoria;

/**
 *
 * @author admin-harold.rojas
 */
public class CategoriaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private int id;
    Categoria cd = new Categoria();
    public ArrayList<Categoria> listarCategoria(){
        ArrayList<Categoria> lista = new ArrayList();
        cx = Conexion.getConex();
        sql = "SELECT *From Categoria";
        try {
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            lista.add(cd.loadCategoria(rs));            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }        
    return lista;
    }
    public int devolverIdCategoria(String cat){        
     sql = "SELECT *From Categoria WHERE categoria='"+cat+"'";
        try {   cx = Conexion.getConex();
                st = cx.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                    id = rs.getInt("idCategoria");
                }
                cx.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex);
            }
    return id;
    }
}
