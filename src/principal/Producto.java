/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Nico
 */
public class Producto {
    private String nombre, descripcion, fecha;
    private double precio, costo;
    private int codigo, stock, codProveedor, rubro, subRubro;

    public Producto(String nombre, String descripcion, double precio, double costo ,int stock, int codProveedor, int rubro, int subRubro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        //this.fecha = fecha; ponerle fecha de hoy
        this.precio = precio;
        this.costo = costo;
        this.stock = 0;
        this.codProveedor = codProveedor;
        this.rubro = rubro;
        this.subRubro = subRubro;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getRubro() {
        return rubro;
    }

    public void setRubro(int rubro) {
        this.rubro = rubro;
    }

    public int getSubRubro() {
        return subRubro;
    }

    public void setSubRubro(int subRubro) {
        this.subRubro = subRubro;
    }
    
    
}
