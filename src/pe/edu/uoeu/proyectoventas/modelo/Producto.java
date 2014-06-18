/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.uoeu.proyectoventas.modelo;

/**
 *
 * @author admin-harold.rojas
 */
public class Producto {
    private int idp;
    private int idc;
    private String prod;
    private double precio;
    private int cant;

    public Producto() {
    }

    public Producto(int idc, String prod, double precio, int cant) {
        this.idc = idc;
        this.prod = prod;
        this.precio = precio;
        this.cant = cant;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
