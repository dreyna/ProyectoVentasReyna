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
import javax.swing.JOptionPane;
import pe.edu.uoeu.proyectoventas.config.Conexion;

/**
 *
 * @author admin-harold.rojas
 */
public class ProductoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    int op = 0;
    public int registrarProducto(int idc, String prod, double pr, int cant){
        sql = "INSERT INTO Producto VALUES(null,'"+prod+"','"+pr+"','"+cant+"','"+idc+"')";
        try {   cx = Conexion.getConex();
                st = cx.createStatement();
                op = st.executeUpdate(sql);
                cx.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: "+ex);
            }    
    return op;
    }
}
