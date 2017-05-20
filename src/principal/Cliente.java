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
public class Cliente {
    private String nombre, direccion, telefono, cuit;
    private int codigo, codigoPostal;
    private double saldo, deuda;

    public Cliente(String nombre, String direccion, int codigoPostal, String telefono, String cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.cuit = cuit;
        this.saldo = 0;
        this.deuda = 0;
    }
    
    public Cliente(){}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    
    
        
}
