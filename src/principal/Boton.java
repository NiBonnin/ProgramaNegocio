/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vistas.VPrincipal;

/**
 *
 * @author Nico
 */
public class Boton {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet, resultSetListaPrecio;
    String BDProducto = "Productos";
    String BDProveedor = "Proveedor";
    String BDCliente = "Cliente";
    String BDListaPrecio = "listaPrecioProducto";
    

    public void listar(JTable tabla,DefaultTableModel modelo, String sentencia){
        try {
            vaciarTabla(tabla,modelo);
            connection = Conectar.getConnection();
            preparedStatement = connection.prepareStatement(sentencia);
            resultSet = preparedStatement.executeQuery();
            int objnum = tabla.getColumnCount();
            Object[] fila = new Object[objnum];//Creamos un Objeto con tantos parámetros como datos retorne cada fila de la consulta
            while(resultSet.next()){
                for (int i = 0; i< objnum; i++){
                    fila[i] = resultSet.getObject(i + 1);
                }
                modelo.addRow(fila); // Añade una fila al final del modelo de la tabla
            }
            resultSet.close();
            tabla.updateUI();//Actualiza la tabla
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
    }
    
    public void agregarProveedor(String nombre, String direccion, String cp, String tel, String cuit, String codigo){
        try {
              connection = Conectar.getConnection();
              preparedStatement = connection.prepareStatement("INSERT INTO "+BDProveedor+" VALUES (?,?,?,?,?,?)");
              preparedStatement.setString(1, nombre);
              preparedStatement.setString(2, direccion);
              preparedStatement.setString(3, cp);
              preparedStatement.setString(4, tel);
              preparedStatement.setString(5, cuit);
              preparedStatement.setString(6, codigo);
              preparedStatement.executeUpdate();
              JOptionPane.showMessageDialog(null, nombre+ " fue agregado a la base de datos con exito!");
          } catch (SQLException ex) {
              Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    public void agregarProducto(String nombre, String descripcion, String precio, String codigo, String stock, String codproveedor, String rubro, String subrubro){
        try {
              connection = Conectar.getConnection();
              preparedStatement = connection.prepareStatement("INSERT INTO "+BDProducto+" VALUES (?,?,?,?,?,?,?,?,?,?,?)");
              preparedStatement.setString(1, nombre);
              preparedStatement.setString(2, descripcion);
              preparedStatement.setString(3, fechaDeHoy());
              preparedStatement.setString(4, precio);
              preparedStatement.setString(5, codigo);
              preparedStatement.setString(6, stock);
              preparedStatement.setString(7, codproveedor);
              preparedStatement.setString(8, rubro);
              preparedStatement.setString(9, subrubro);
              preparedStatement.setBoolean(10, true);
              preparedStatement.setString(11, fechaDeHoy());
              preparedStatement.executeUpdate();
              JOptionPane.showMessageDialog(null, "Su "+nombre+ " fue agregado a la base de datos con exito!");
          } catch (SQLException ex) {
              Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Ups! Hubo un error agregando su "+nombre+ " a la base de datos! Verifique si los campos tenian el formato requerido");
          }
          
      }
    
    public void agregarCliente(String nombre, String direccion, String cp, String tel, String dni, String codigo, String saldo){
        try {
              connection = Conectar.getConnection();
              preparedStatement = connection.prepareStatement("INSERT INTO "+BDCliente+" VALUES (?,?,?,?,?,?,?)");
              preparedStatement.setString(1, nombre);
              preparedStatement.setString(2, direccion);
              preparedStatement.setString(3, cp);
              preparedStatement.setString(4, tel);
              preparedStatement.setString(5, dni);
              preparedStatement.setString(6, codigo);
              preparedStatement.setString(7, saldo);
              preparedStatement.executeUpdate();
              JOptionPane.showMessageDialog(null, nombre+ " fue agregado a la base de datos con exito!");
          } catch (SQLException ex) {
              Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("error add cliente");
          }
    }
    
    public void agregarUnPrecio(String codigo, String precio){
        try {
              connection = Conectar.getConnection();
              preparedStatement = connection.prepareStatement("INSERT INTO "+BDListaPrecio+" VALUES (?,?,?)");
              preparedStatement.setString(1, codigo);
              preparedStatement.setString(2, precio);
              preparedStatement.setString(3, fechaDeHoy());
              preparedStatement.executeUpdate();
          } catch (SQLException ex) {
              Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("error agregar precio");
          }
    }
    
    public void agregarATabla(JTable tabla,DefaultTableModel modelo, Object[] fila){
        int objnum = tabla.getColumnCount();
        fila = new Object[objnum];
        for (int i = 0; i< objnum; i++){
            fila[i] = "";
        }
        modelo.addRow(fila);
    }
    
    public void vaciarTabla(JTable tabla,DefaultTableModel modelo){
        for (int i = 0; i < tabla.getRowCount(); i++) {
        modelo.removeRow(i);
        i-=1;
        }
    }
    
    public String fechaDeHoy(){
        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH));
        String año = Integer.toString(c1.get(Calendar.YEAR));
        if ((c1.get(Calendar.DATE)) < 10) {dia = "0" + Integer.toString(c1.get(Calendar.DATE));}
        if ((c1.get(Calendar.MONTH)) < 10) {mes = "0" + Integer.toString(c1.get(Calendar.MONTH));}
        String fechaParaSql = año + mes + dia;
        return fechaParaSql;
    }
    
    public String ultimoCodigo(String tabla) throws SQLException{//devuelve el ultimo codigo +1 de los que se tienen guardados en la db
       String codSig= "SELECT MAX(Codigo)+1 FROM "+ BDProducto;
       connection = Conectar.getConnection();
       switch (tabla){
           case "producto": codSig= "SELECT MAX(Codigo)+1 FROM "+ BDProducto; break;
           case "proveedor": codSig ="SELECT MAX(CodProveedor)+1 FROM "+BDProveedor; break;
           case "cliente": codSig ="SELECT MAX(CodCliente)+1 FROM "+BDCliente; break;
       }
       preparedStatement = connection.prepareStatement(codSig); 
       resultSet = preparedStatement.executeQuery();
       resultSet.next();
       codSig = resultSet.getString(1);
       resultSet.close();
       return codSig;
   }
    
    public void agregarDatosATabla(JTable tabla,DefaultTableModel modelo,String nombre, String precio, String codigo, String stock, String codProveedor, String rubro, String subRubro, String descripcion){
          Object[] fila = new Object[9];
          fila[0]= codigo;
          fila[1]= nombre;
          fila[2]= precio;
          fila[3]= stock;
          fila[4]= codProveedor;
          fila[5]= rubro;
          fila[6]= subRubro;
          fila[7]= descripcion;
          fila[8]= fechaDesdeSql(fechaDeHoy());
          modelo.addRow(fila);
          tabla.updateUI();
    }
          
    
    public String fechaDesdeSql(Object fechaObj){
        //String s = formatter.format(date);
        String fechaDeSql=(String) fechaObj;
        String fecha;
        if (fechaDeSql.length()==8){
         fecha = ""+fechaDeSql.charAt(4)+fechaDeSql.charAt(5)+"/"+fechaDeSql.charAt(6)+fechaDeSql.charAt(7)+"/"+fechaDeSql.charAt(0)+fechaDeSql.charAt(1)+fechaDeSql.charAt(2)+fechaDeSql.charAt(3);
        } else{fecha = ""+fechaDeSql.charAt(5)+fechaDeSql.charAt(6)+"/"+fechaDeSql.charAt(8)+fechaDeSql.charAt(9)+"/"+fechaDeSql.charAt(0)+fechaDeSql.charAt(1)+fechaDeSql.charAt(2)+fechaDeSql.charAt(3);
            }
        return fecha;
        }
}
