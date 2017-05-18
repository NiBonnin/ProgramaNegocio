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
        this.fecha = fecha;//ponerle fecha de hoy
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
