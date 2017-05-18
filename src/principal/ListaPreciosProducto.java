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
public class ListaPreciosProducto {
    private double precio;
    private String fecha;

    public ListaPreciosProducto(double precio, String fecha){
        this.fecha = fecha;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return this.getPrecio()+" "+this.getFecha();
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }
    
}
