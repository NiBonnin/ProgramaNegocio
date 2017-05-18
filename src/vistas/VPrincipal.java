/*//GEN-FIRST:event_formWindowActivated
 * To change this license header, choose License Headers in Project Properties.//GEN-LAST:event_formWindowActivated
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Boton;
import principal.Conectar;

/**
 *
 * @author Nico
 */
public class VPrincipal extends javax.swing.JFrame {


    public VPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        VistaListaProducto.setLocationRelativeTo(null);
        VistaListaProducto.setFocusable(true);
        VistaAgregarProducto.setFocusable(true);
        VistaListaProveedor.setFocusable(true);
        VistaAgregarProveedor.setFocusable(true);
        VistaListaCliente.setFocusable(true);
        VistaAgregarCliente.setFocusable(true);
        VistaAgregarProducto.setLocationRelativeTo(null);
        VistaListaProveedor.setLocationRelativeTo(null);
        VistaAgregarProveedor.setLocationRelativeTo(null);
        VistaListaCliente.setLocationRelativeTo(null);
        VistaAgregarCliente.setLocationRelativeTo(null);
        VistaProducto.setLocationRelativeTo(null);
        VistaProducto.setFocusable(true);
        VistaCambiarDato.setFocusable(true);
        VistaCambiarDato.setLocationRelativeTo(null);
        VistaHistorialDePrecio.setFocusable(true);
        VistaHistorialDePrecio.setLocationRelativeTo(null);
        agregarColumnasATablas();
        llenarCBNombreProveedor();
    }


    String BDProducto = "Productos";
    String BDProveedor = "Proveedor";
    String BDCliente = "Cliente";
    String BDListaPrecio = "listaPrecioProducto";
       
    private void agregarColumnasATablas(){
        modeloProductos.addColumn("Codigo");
        modeloProductos.addColumn("Nombre");
        modeloProductos.addColumn("Descripcion");
        modeloProductos.addColumn("Precio");
        modeloProductos.addColumn("Stock");
        modeloProductos.addColumn("Fecha");
        modeloProductos.addColumn("CodProveedor");
        modeloProveedores.addColumn("Codigo");
        modeloProveedores.addColumn("Nombre");
        modeloProveedores.addColumn("Direccion");
        modeloProveedores.addColumn("Codigo Postal");
        modeloProveedores.addColumn("Telefono");
        modeloProveedores.addColumn("Cuit");
        modeloClientes.addColumn("Codigo");
        modeloClientes.addColumn("Nombre");
        modeloClientes.addColumn("Direccion");
        modeloClientes.addColumn("Codigo Postal");
        modeloClientes.addColumn("Telefono");
        modeloClientes.addColumn("DNI");
        modeloClientes.addColumn("Saldo");
        modeloPrecioProducto.addColumn("Precio");
        modeloPrecioProducto.addColumn("Fecha");
        modeloHistorialPrecio.addColumn("Codigo");
        modeloHistorialPrecio.addColumn("Precio");
        modeloHistorialPrecio.addColumn("Fecha");
        modeloAddProducto.addColumn("Codigo");
        modeloAddProducto.addColumn("Nombre");
        modeloAddProducto.addColumn("Precio");
        modeloAddProducto.addColumn("Stock");
        modeloAddProducto.addColumn("Proveedor");
        modeloAddProducto.addColumn("Rubro");
        modeloAddProducto.addColumn("SubRubro");
        modeloAddProducto.addColumn("Descripcion");
        modeloAddProducto.addColumn("Fecha");
        
        
    }
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet, resultSetDatoProducto;
    DefaultTableModel modeloProductos = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    
    
    DefaultTableModel modeloProveedores = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    
    DefaultTableModel modeloHistorialPrecio = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    
    DefaultTableModel modeloClientes = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    DefaultTableModel modeloPrecioProducto = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    
    DefaultTableModel modeloAddProducto = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; //Con esto conseguimos que la tabla no se pueda editar
                }
    };
    Boton button = new Boton();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        VistaListaProducto = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBTBuscarLProductos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFLCodigoProducto = new javax.swing.JTextField();
        TFLNombreProducto = new javax.swing.JTextField();
        TFLPrecioProducto = new javax.swing.JTextField();
        TFLStockProducto = new javax.swing.JTextField();
        TFCodProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFLDescripcionProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFLFechaDiaProducto1 = new javax.swing.JTextField();
        TFLFechaMesProducto1 = new javax.swing.JTextField();
        TFLFechaAñoProducto1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jBTSalirListaProductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jBTAgregarProductos = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        VistaAgregarProducto = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBTAgregarProductoAgregar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        TFACodigoProducto = new javax.swing.JTextField();
        TFANombreProducto = new javax.swing.JTextField();
        TFAPrecioProducto = new javax.swing.JTextField();
        TFAStockProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TFADescripcionProducto = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFARubroProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFASubRubroProducto = new javax.swing.JTextField();
        CBNombreProveedor = new javax.swing.JComboBox<>();
        jButtonSalirVAddProducto = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableAgregarProducto = new javax.swing.JTable();
        jBTAgregarProductoAceptar = new javax.swing.JButton();
        jBTAgregarProductoCancelar = new javax.swing.JButton();
        VistaAgregarProveedor = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jBTAgregarProveedor = new javax.swing.JButton();
        TFACodProveedor = new javax.swing.JTextField();
        TFANombreProveedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TFADirProveedor = new javax.swing.JTextField();
        TFACPProveedor = new javax.swing.JTextField();
        TFATelProveedor = new javax.swing.JTextField();
        TFACuitProveedor = new javax.swing.JTextField();
        jBTSalirAgregarProveedores = new javax.swing.JButton();
        VistaListaProveedor = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jBTBuscarLProveedores = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TFLNombreProveedor = new javax.swing.JTextField();
        TFLCodProveedor = new javax.swing.JTextField();
        TFLDirProveedor = new javax.swing.JTextField();
        TFLCPProveedor = new javax.swing.JTextField();
        TFLTelProveedor = new javax.swing.JTextField();
        TFLCuitProveedor = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jBTSalirListaProveedores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListaProveedores = new javax.swing.JTable();
        jBTAgregarProveedores = new javax.swing.JButton();
        VistaListaCliente = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jBTBuscarLClientes = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        TFLNombreCliente = new javax.swing.JTextField();
        TFLCodCliente = new javax.swing.JTextField();
        TFLDirCliente = new javax.swing.JTextField();
        TFLCPCliente = new javax.swing.JTextField();
        TFLTelCliente = new javax.swing.JTextField();
        TFLDNICliente = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        TFLSaldoCliente = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jBTSalirListaClientes = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableListaClientes = new javax.swing.JTable();
        jBTAgregarClientes = new javax.swing.JButton();
        VistaAgregarCliente = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jBTAgregarCliente = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        TFACodigoCliente = new javax.swing.JTextField();
        TFANombreCliente = new javax.swing.JTextField();
        TFACPCliente = new javax.swing.JTextField();
        TFATelCliente = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        TFADniCliente = new javax.swing.JTextField();
        TFASaldoCliente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TFADirCliente = new javax.swing.JTextField();
        jBTSalirAddCliente = new javax.swing.JButton();
        VistaProducto = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        TFVCodigoProducto = new javax.swing.JTextField();
        TFVNombreProducto = new javax.swing.JTextField();
        TFVPrecioProducto = new javax.swing.JTextField();
        TFVStockProducto = new javax.swing.JTextField();
        TFVCodProveedorProducto = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        TFVDescripcionProducto = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        TFVFechaIngresoProducto = new javax.swing.JTextField();
        BTAceptarCambiosVistaProducto = new javax.swing.JButton();
        BTCancelarCambiosVistaProducto = new javax.swing.JButton();
        TFVRubroProducto = new javax.swing.JTextField();
        TFVSubRubroProducto = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        BTVPCambiarCodigoProvProducto = new javax.swing.JButton();
        BTVPCambiarStockProducto = new javax.swing.JButton();
        BTVPCambiarPrecioProducto = new javax.swing.JButton();
        BTVPCambiarDescripcionProducto = new javax.swing.JButton();
        BTVPCambiarNombreProducto = new javax.swing.JButton();
        BTVPCambiarRubroProducto = new javax.swing.JButton();
        BTVPCambiarSubRubroProducto = new javax.swing.JButton();
        BTVPCambiarCodigoProducto = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        TFVFechaModificacionProducto = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableListaPrecioProducto = new javax.swing.JTable();
        jBTSalirListaClientes1 = new javax.swing.JButton();
        VistaCambiarDato = new javax.swing.JFrame();
        LabelCambiarDato = new javax.swing.JLabel();
        TFCambiarDato = new javax.swing.JTextField();
        BTCambiarDato = new javax.swing.JButton();
        VistaHistorialDePrecio = new javax.swing.JFrame();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        TFHCodigoProducto = new javax.swing.JTextField();
        TFHPrecioProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaHistorialPrecio = new javax.swing.JTable();
        jButtonSalirHistorialPrecio = new javax.swing.JButton();
        TFHFechaDiaProducto = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        TFHFechaMesProducto = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        TFHFechaAñoProducto = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jBTBuscarHLPrecio = new javax.swing.JButton();
        jButtonListaArticulos = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonListaProveedores = new javax.swing.JButton();
        jButtonListaClientes = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jButtonHistorialDePrecios = new javax.swing.JButton();

        VistaListaProducto.setSize(new java.awt.Dimension(1300, 515));
        VistaListaProducto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaListaProductoWindowActivated(evt);
            }
        });
        VistaListaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaListaProductoKeyPressed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock");

        jBTBuscarLProductos.setText("Buscar");
        jBTBuscarLProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTBuscarLProductosMouseClicked(evt);
            }
        });
        jBTBuscarLProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarLProductosActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Proveedor");

        TFLCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCodigoProductoKeyPressed(evt);
            }
        });

        TFLNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLNombreProductoKeyPressed(evt);
            }
        });

        TFLPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLPrecioProductoKeyPressed(evt);
            }
        });

        TFLStockProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLStockProductoKeyPressed(evt);
            }
        });

        TFCodProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCodProveedorKeyPressed(evt);
            }
        });

        jLabel3.setText("Descripcion");

        TFLDescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLDescripcionProductoKeyPressed(evt);
            }
        });

        jLabel7.setText("Fecha");

        TFLFechaDiaProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLFechaDiaProducto1KeyPressed(evt);
            }
        });

        TFLFechaMesProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLFechaMesProducto1KeyPressed(evt);
            }
        });

        TFLFechaAñoProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLFechaAñoProducto1KeyPressed(evt);
            }
        });

        jLabel8.setText("/");

        jLabel9.setText("/");

        jLabel10.setText("$");

        jLabel59.setText("anterior a");

        jLabel64.setText("dia");

        jLabel65.setText("mes");

        jLabel66.setText("año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(TFLStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TFLFechaDiaProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFLFechaMesProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel66))
                            .addComponent(TFLFechaAñoProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(TFCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jBTBuscarLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFLCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLFechaDiaProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLFechaMesProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLFechaAñoProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jBTBuscarLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jLabel65)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jBTSalirListaProductos.setText("X");
        jBTSalirListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirListaProductosActionPerformed(evt);
            }
        });

        jTableListaProductos.setModel(modeloProductos);
        jTableListaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaProductosMouseClicked(evt);
            }
        });
        jTableListaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListaProductosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListaProductos);

        jBTAgregarProductos.setText("Agregar Productos");
        jBTAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProductosActionPerformed(evt);
            }
        });

        jLabel63.setText("* la fecha hace referencia a el ultimo cambio de precio que tuvo el producto");

        javax.swing.GroupLayout VistaListaProductoLayout = new javax.swing.GroupLayout(VistaListaProducto.getContentPane());
        VistaListaProducto.getContentPane().setLayout(VistaListaProductoLayout);
        VistaListaProductoLayout.setHorizontalGroup(
            VistaListaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaListaProductoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBTSalirListaProductos))
            .addGroup(VistaListaProductoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(VistaListaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaListaProductoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(VistaListaProductoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jBTAgregarProductos)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaListaProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(399, 399, 399))
        );
        VistaListaProductoLayout.setVerticalGroup(
            VistaListaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaListaProductoLayout.createSequentialGroup()
                .addComponent(jBTSalirListaProductos)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VistaListaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaListaProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel63)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaListaProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );

        VistaAgregarProducto.setSize(new java.awt.Dimension(1163, 630));
        VistaAgregarProducto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaAgregarProductoWindowActivated(evt);
            }
        });
        VistaAgregarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaAgregarProductoKeyPressed(evt);
            }
        });

        jLabel14.setText("Codigo");

        jLabel15.setText("Nombre");

        jLabel16.setText("Precio");

        jLabel17.setText("Stock");

        jBTAgregarProductoAgregar.setText("Agregar");
        jBTAgregarProductoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProductoAgregarActionPerformed(evt);
            }
        });

        jLabel18.setText("Proveedor");

        TFACodigoProducto.setEditable(false);
        TFACodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACodigoProductoKeyPressed(evt);
            }
        });

        TFANombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFANombreProductoKeyPressed(evt);
            }
        });

        TFAPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFAPrecioProductoKeyPressed(evt);
            }
        });

        TFAStockProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFAStockProductoKeyPressed(evt);
            }
        });

        jLabel19.setText("Descripcion");

        TFADescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFADescripcionProductoKeyPressed(evt);
            }
        });

        jLabel23.setText("$");

        jLabel11.setText("Rubro");

        TFARubroProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFARubroProductoKeyPressed(evt);
            }
        });

        jLabel12.setText("SubRubro");

        TFASubRubroProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFASubRubroProductoKeyPressed(evt);
            }
        });

        CBNombreProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFACodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFANombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFAPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17)
                    .addComponent(TFAStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CBNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(TFARubroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(TFASubRubroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFADescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jBTAgregarProductoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFACodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFANombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFAPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFAStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFADescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(TFARubroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFASubRubroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTAgregarProductoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButtonSalirVAddProducto.setText("X");
        jButtonSalirVAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirVAddProductoActionPerformed(evt);
            }
        });

        jTableAgregarProducto.setModel(modeloAddProducto);
        jTableAgregarProducto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgregarProductoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableAgregarProducto);

        jBTAgregarProductoAceptar.setText("Aceptar");
        jBTAgregarProductoAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProductoAceptarActionPerformed(evt);
            }
        });

        jBTAgregarProductoCancelar.setText("Cancelar");
        jBTAgregarProductoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProductoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaAgregarProductoLayout = new javax.swing.GroupLayout(VistaAgregarProducto.getContentPane());
        VistaAgregarProducto.getContentPane().setLayout(VistaAgregarProductoLayout);
        VistaAgregarProductoLayout.setHorizontalGroup(
            VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProductoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProductoLayout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProductoLayout.createSequentialGroup()
                            .addComponent(jButtonSalirVAddProducto)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProductoLayout.createSequentialGroup()
                            .addComponent(jBTAgregarProductoAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(243, 243, 243)
                            .addComponent(jBTAgregarProductoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(354, 354, 354)))))
        );
        VistaAgregarProductoLayout.setVerticalGroup(
            VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaAgregarProductoLayout.createSequentialGroup()
                .addComponent(jButtonSalirVAddProducto)
                .addGroup(VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaAgregarProductoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(VistaAgregarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBTAgregarProductoAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTAgregarProductoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );

        VistaAgregarProveedor.setSize(new java.awt.Dimension(934, 392));
        VistaAgregarProveedor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaAgregarProveedorWindowActivated(evt);
            }
        });
        VistaAgregarProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaAgregarProveedorKeyPressed(evt);
            }
        });

        jLabel20.setText("Codigo");

        jLabel21.setText("Nombre");

        jBTAgregarProveedor.setText("Agregar");
        jBTAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProveedorActionPerformed(evt);
            }
        });

        TFACodProveedor.setEditable(false);
        TFACodProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACodProveedorKeyPressed(evt);
            }
        });

        TFANombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFANombreProveedorKeyPressed(evt);
            }
        });

        jLabel13.setText("Direccion");

        jLabel22.setText("Codigo Postal");

        jLabel24.setText("Telefono");

        jLabel25.setText("Cuit");

        TFADirProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFADirProveedorKeyPressed(evt);
            }
        });

        TFACPProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACPProveedorKeyPressed(evt);
            }
        });

        TFATelProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFATelProveedorKeyPressed(evt);
            }
        });

        TFACuitProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACuitProveedorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFACodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFANombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(TFADirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel22)
                    .addComponent(TFACPProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFATelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFACuitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(40, 40, 40)
                .addComponent(jBTAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel13)
                            .addComponent(jLabel25))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFACodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFANombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFADirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFACuitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jBTAgregarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(30, 30, 30)
                                .addComponent(TFACPProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(30, 30, 30)
                                .addComponent(TFATelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jBTSalirAgregarProveedores.setText("X");
        jBTSalirAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirAgregarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaAgregarProveedorLayout = new javax.swing.GroupLayout(VistaAgregarProveedor.getContentPane());
        VistaAgregarProveedor.getContentPane().setLayout(VistaAgregarProveedorLayout);
        VistaAgregarProveedorLayout.setHorizontalGroup(
            VistaAgregarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaAgregarProveedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VistaAgregarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTSalirAgregarProveedores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        VistaAgregarProveedorLayout.setVerticalGroup(
            VistaAgregarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarProveedorLayout.createSequentialGroup()
                .addComponent(jBTSalirAgregarProveedores)
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        VistaListaProveedor.setSize(new java.awt.Dimension(1231, 499));
        VistaListaProveedor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaListaProveedorWindowActivated(evt);
            }
        });
        VistaListaProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaListaProveedorKeyPressed(evt);
            }
        });

        jLabel27.setText("Nombre");

        jLabel28.setText("Codigo postal");

        jBTBuscarLProveedores.setText("Buscar");
        jBTBuscarLProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTBuscarLProveedoresMouseClicked(evt);
            }
        });
        jBTBuscarLProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarLProveedoresActionPerformed(evt);
            }
        });

        jLabel30.setText("Codigo Proveedor");

        jLabel31.setText("Direccion");

        TFLNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLNombreProveedorKeyPressed(evt);
            }
        });

        TFLCodProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCodProveedorKeyPressed(evt);
            }
        });

        TFLDirProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLDirProveedorKeyPressed(evt);
            }
        });

        TFLCPProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCPProveedorKeyPressed(evt);
            }
        });

        TFLTelProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLTelProveedorKeyPressed(evt);
            }
        });

        TFLCuitProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCuitProveedorKeyPressed(evt);
            }
        });

        jLabel40.setText("Cuit");

        jLabel39.setText("Telefono");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLDirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCPProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLTelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCuitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jBTBuscarLProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFLNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLDirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLCPProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLTelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLCuitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jBTBuscarLProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jBTSalirListaProveedores.setText("X");
        jBTSalirListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirListaProveedoresActionPerformed(evt);
            }
        });

        jTableListaProveedores.setModel(modeloProveedores);
        jTableListaProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListaProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListaProveedoresKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableListaProveedores);

        jBTAgregarProveedores.setText("Agregar Proveedor");
        jBTAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaListaProveedorLayout = new javax.swing.GroupLayout(VistaListaProveedor.getContentPane());
        VistaListaProveedor.getContentPane().setLayout(VistaListaProveedorLayout);
        VistaListaProveedorLayout.setHorizontalGroup(
            VistaListaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaListaProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBTSalirListaProveedores))
            .addGroup(VistaListaProveedorLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(VistaListaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaListaProveedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jBTAgregarProveedores)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        VistaListaProveedorLayout.setVerticalGroup(
            VistaListaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaListaProveedorLayout.createSequentialGroup()
                .addComponent(jBTSalirListaProveedores)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VistaListaProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaListaProveedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VistaListaProveedorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jBTAgregarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        VistaListaCliente.setSize(new java.awt.Dimension(1231, 499));
        VistaListaCliente.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaListaClienteWindowActivated(evt);
            }
        });
        VistaListaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaListaClienteKeyPressed(evt);
            }
        });

        jLabel41.setText("Nombre");

        jLabel42.setText("Codigo postal");

        jBTBuscarLClientes.setText("Buscar");
        jBTBuscarLClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBTBuscarLClientesMouseClicked(evt);
            }
        });
        jBTBuscarLClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarLClientesActionPerformed(evt);
            }
        });

        jLabel43.setText("Codigo Cliente");

        jLabel44.setText("Direccion");

        TFLNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLNombreClienteKeyPressed(evt);
            }
        });

        TFLCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCodClienteKeyPressed(evt);
            }
        });

        TFLDirCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLDirClienteKeyPressed(evt);
            }
        });

        TFLCPCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLCPClienteKeyPressed(evt);
            }
        });

        TFLTelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLTelClienteKeyPressed(evt);
            }
        });

        TFLDNICliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLDNIClienteKeyPressed(evt);
            }
        });

        jLabel45.setText("DNI");

        jLabel46.setText("Telefono");

        jLabel47.setText("Saldo");

        TFLSaldoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFLSaldoClienteKeyPressed(evt);
            }
        });

        jLabel48.setText("$");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLCPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFLDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFLSaldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jBTBuscarLClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel47)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFLNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLCPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFLSaldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTBuscarLClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jBTSalirListaClientes.setText("X");
        jBTSalirListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirListaClientesActionPerformed(evt);
            }
        });

        jTableListaClientes.setModel(modeloClientes);
        jTableListaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListaClientesKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTableListaClientes);

        jBTAgregarClientes.setText("Agregar Clientes");
        jBTAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaListaClienteLayout = new javax.swing.GroupLayout(VistaListaCliente.getContentPane());
        VistaListaCliente.getContentPane().setLayout(VistaListaClienteLayout);
        VistaListaClienteLayout.setHorizontalGroup(
            VistaListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaListaClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBTSalirListaClientes))
            .addGroup(VistaListaClienteLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(VistaListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaListaClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jBTAgregarClientes)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        VistaListaClienteLayout.setVerticalGroup(
            VistaListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaListaClienteLayout.createSequentialGroup()
                .addComponent(jBTSalirListaClientes)
                .addGroup(VistaListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaListaClienteLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VistaListaClienteLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jBTAgregarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        VistaAgregarCliente.setSize(new java.awt.Dimension(1286, 413));
        VistaAgregarCliente.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaAgregarClienteWindowActivated(evt);
            }
        });
        VistaAgregarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaAgregarClienteKeyPressed(evt);
            }
        });

        jLabel26.setText("Codigo");

        jLabel29.setText("Nombre");

        jLabel32.setText("Codigo Postal");

        jLabel33.setText("Telefono");

        jBTAgregarCliente.setText("Agregar");
        jBTAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAgregarClienteActionPerformed(evt);
            }
        });

        jLabel34.setText("DNI");

        TFACodigoCliente.setEditable(false);
        TFACodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACodigoClienteKeyPressed(evt);
            }
        });

        TFANombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFANombreClienteKeyPressed(evt);
            }
        });

        TFACPCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFACPClienteKeyPressed(evt);
            }
        });

        TFATelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFATelClienteKeyPressed(evt);
            }
        });

        jLabel37.setText("Saldo");

        TFADniCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFADniClienteKeyPressed(evt);
            }
        });

        TFASaldoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFASaldoClienteKeyPressed(evt);
            }
        });

        jLabel35.setText("$");

        jLabel36.setText("Direccion");

        TFADirCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFADirClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFACodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFANombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel36)
                    .addComponent(TFADirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFACPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TFATelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel34)
                    .addComponent(TFADniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel37)
                    .addComponent(TFASaldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jBTAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFASaldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFADniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFATelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFANombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFADirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFACPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(TFACodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel36)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBTAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jBTSalirAddCliente.setText("X");
        jBTSalirAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirAddClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaAgregarClienteLayout = new javax.swing.GroupLayout(VistaAgregarCliente.getContentPane());
        VistaAgregarCliente.getContentPane().setLayout(VistaAgregarClienteLayout);
        VistaAgregarClienteLayout.setHorizontalGroup(
            VistaAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VistaAgregarClienteLayout.createSequentialGroup()
                .addGap(0, 1164, Short.MAX_VALUE)
                .addComponent(jBTSalirAddCliente))
            .addGroup(VistaAgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VistaAgregarClienteLayout.setVerticalGroup(
            VistaAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaAgregarClienteLayout.createSequentialGroup()
                .addComponent(jBTSalirAddCliente)
                .addGap(80, 80, 80)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        VistaProducto.setSize(new java.awt.Dimension(765, 605));
        VistaProducto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                VistaProductoWindowActivated(evt);
            }
        });
        VistaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VistaProductoKeyPressed(evt);
            }
        });

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setText("Codigo");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 31, -1, -1));

        jLabel49.setText("Nombre");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 91, -1, -1));

        jLabel50.setText("Precio");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 161, -1, -1));

        jLabel51.setText("Stock");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 158, -1, -1));

        jLabel52.setText("Codigo Proveedor");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 31, -1, -1));

        TFVCodigoProducto.setEditable(false);
        jPanel7.add(TFVCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 70, -1));

        TFVNombreProducto.setEditable(false);
        jPanel7.add(TFVNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, 102, -1));

        TFVPrecioProducto.setEditable(false);
        jPanel7.add(TFVPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        TFVStockProducto.setEditable(false);
        jPanel7.add(TFVStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 179, 86, -1));

        TFVCodProveedorProducto.setEditable(false);
        jPanel7.add(TFVCodProveedorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 52, 70, -1));

        jLabel53.setText("Descripcion");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 240, -1, -1));

        TFVDescripcionProducto.setEditable(false);
        jPanel7.add(TFVDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 257, 225, 71));

        jLabel54.setText("Fecha ingreso");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 0, -1, -1));

        jLabel57.setText("$");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, -1, -1));

        TFVFechaIngresoProducto.setEditable(false);
        jPanel7.add(TFVFechaIngresoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 25, 106, -1));

        BTAceptarCambiosVistaProducto.setText("Aceptar");
        BTAceptarCambiosVistaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAceptarCambiosVistaProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTAceptarCambiosVistaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 437, 135, 50));

        BTCancelarCambiosVistaProducto.setText("Cancelar");
        BTCancelarCambiosVistaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCancelarCambiosVistaProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTCancelarCambiosVistaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 437, 135, 50));

        TFVRubroProducto.setEditable(false);
        jPanel7.add(TFVRubroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 73, -1));

        TFVSubRubroProducto.setEditable(false);
        jPanel7.add(TFVSubRubroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 227, 73, -1));

        jLabel55.setText("Rubro");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel56.setText("SubRubro");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 207, -1, -1));

        BTVPCambiarCodigoProvProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarCodigoProvProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarCodigoProvProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 50, 30, 20));

        BTVPCambiarStockProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarStockProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 178, 30, 20));

        BTVPCambiarPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarPrecioProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 30, 20));

        BTVPCambiarDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarDescripcionProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 287, 30, 20));

        BTVPCambiarNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarNombreProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 123, 30, 20));

        BTVPCambiarRubroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarRubroProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarRubroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 30, 20));

        BTVPCambiarSubRubroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarSubRubroProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarSubRubroProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 227, 30, 20));

        BTVPCambiarCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVPCambiarCodigoProductoActionPerformed(evt);
            }
        });
        jPanel7.add(BTVPCambiarCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, 20));

        jLabel58.setText("Ultima fecha de modificacion de precio");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 70, -1, -1));

        TFVFechaModificacionProducto.setEditable(false);
        jPanel7.add(TFVFechaModificacionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 90, 106, -1));

        jTableListaPrecioProducto.setModel(modeloPrecioProducto);
        jScrollPane5.setViewportView(jTableListaPrecioProducto);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 276, 340, 100));

        jBTSalirListaClientes1.setText("X");
        jBTSalirListaClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalirListaClientes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaProductoLayout = new javax.swing.GroupLayout(VistaProducto.getContentPane());
        VistaProducto.getContentPane().setLayout(VistaProductoLayout);
        VistaProductoLayout.setHorizontalGroup(
            VistaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaProductoLayout.createSequentialGroup()
                .addGroup(VistaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaProductoLayout.createSequentialGroup()
                        .addGap(708, 708, 708)
                        .addComponent(jBTSalirListaClientes1))
                    .addGroup(VistaProductoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VistaProductoLayout.setVerticalGroup(
            VistaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaProductoLayout.createSequentialGroup()
                .addComponent(jBTSalirListaClientes1)
                .addGap(14, 14, 14)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        VistaCambiarDato.setSize(new java.awt.Dimension(303, 265));

        LabelCambiarDato.setText("jLabel59");

        TFCambiarDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCambiarDatoKeyPressed(evt);
            }
        });

        BTCambiarDato.setText("Cambiar");
        BTCambiarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCambiarDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaCambiarDatoLayout = new javax.swing.GroupLayout(VistaCambiarDato.getContentPane());
        VistaCambiarDato.getContentPane().setLayout(VistaCambiarDatoLayout);
        VistaCambiarDatoLayout.setHorizontalGroup(
            VistaCambiarDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaCambiarDatoLayout.createSequentialGroup()
                .addGroup(VistaCambiarDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaCambiarDatoLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(LabelCambiarDato))
                    .addGroup(VistaCambiarDatoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(TFCambiarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VistaCambiarDatoLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(BTCambiarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        VistaCambiarDatoLayout.setVerticalGroup(
            VistaCambiarDatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaCambiarDatoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LabelCambiarDato)
                .addGap(41, 41, 41)
                .addComponent(TFCambiarDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(BTCambiarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        VistaHistorialDePrecio.setSize(new java.awt.Dimension(613, 355));

        jLabel67.setText("Codigo");

        jLabel68.setText("Precio");

        TFHCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFHCodigoProductoKeyPressed(evt);
            }
        });

        TFHPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFHPrecioProductoKeyPressed(evt);
            }
        });

        jTableListaHistorialPrecio.setModel(modeloHistorialPrecio);
        jScrollPane1.setViewportView(jTableListaHistorialPrecio);

        jButtonSalirHistorialPrecio.setText("X");
        jButtonSalirHistorialPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirHistorialPrecioActionPerformed(evt);
            }
        });

        TFHFechaDiaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFHFechaDiaProductoKeyPressed(evt);
            }
        });

        jLabel81.setText("dia");

        TFHFechaMesProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFHFechaMesProductoKeyPressed(evt);
            }
        });

        jLabel82.setText("mes");

        jLabel83.setText("año");

        TFHFechaAñoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFHFechaAñoProductoKeyPressed(evt);
            }
        });

        jLabel77.setText("/");

        jLabel78.setText("/");

        jLabel80.setText("anterior a");

        jLabel76.setText("Fecha");

        jBTBuscarHLPrecio.setText("Buscar");
        jBTBuscarHLPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarHLPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VistaHistorialDePrecioLayout = new javax.swing.GroupLayout(VistaHistorialDePrecio.getContentPane());
        VistaHistorialDePrecio.getContentPane().setLayout(VistaHistorialDePrecioLayout);
        VistaHistorialDePrecioLayout.setHorizontalGroup(
            VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addGap(574, 574, 574)
                .addComponent(jButtonSalirHistorialPrecio))
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel76))
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel67)
                .addGap(30, 30, 30)
                .addComponent(jLabel68)
                .addGap(96, 96, 96)
                .addComponent(jLabel80))
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(TFHCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFHPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFHFechaDiaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel81)))
                .addGap(10, 10, 10)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFHFechaMesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel82)))
                .addGap(4, 4, 4)
                .addComponent(jLabel77)
                .addGap(10, 10, 10)
                .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFHFechaAñoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel83)))
                .addGap(66, 66, 66)
                .addComponent(jBTBuscarHLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        VistaHistorialDePrecioLayout.setVerticalGroup(
            VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                .addComponent(jButtonSalirHistorialPrecio)
                .addGap(28, 28, 28)
                .addComponent(jLabel76)
                .addGap(6, 6, 6)
                .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80)
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))))
                .addGap(9, 9, 9)
                .addGroup(VistaHistorialDePrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(TFHCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(TFHPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(TFHFechaDiaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel81))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel78))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(TFHFechaMesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel82))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel77))
                    .addGroup(VistaHistorialDePrecioLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(TFHFechaAñoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel83))
                    .addComponent(jBTBuscarHLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButtonListaArticulos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonListaArticulos.setText("Lista de articulos");
        jButtonListaArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaArticulosActionPerformed(evt);
            }
        });

        jButtonSalir.setText("X");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonListaProveedores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonListaProveedores.setText("Lista de Proveedores");
        jButtonListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaProveedoresActionPerformed(evt);
            }
        });

        jButtonListaClientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonListaClientes.setText("Lista de Clientes");
        jButtonListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaClientesActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel60.setText("(F1)");
        jLabel60.setFocusable(false);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel61.setText("(F3)");
        jLabel61.setFocusable(false);

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel62.setText("(F2)");
        jLabel62.setFocusable(false);

        jButtonHistorialDePrecios.setText("Historial de precios");
        jButtonHistorialDePrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistorialDePreciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalir))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jButtonListaArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jButtonHistorialDePrecios)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonSalir)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListaArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButtonHistorialDePrecios)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonListaArticulosActionPerformed(java.awt.event.ActionEvent evt) {                                                      
     VistaListaProducto.setVisible(true);
     button.listar(jTableListaProductos,modeloProductos,sentencia("Productos"));
    }                                                     

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }                                            

    private void jBTSalirListaProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        VistaListaProducto.setVisible(false);
    }                                                      

    private void jBTBuscarLProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        button.listar(jTableListaProductos,modeloProductos,sentencia("Productos"));
    }                                                   

    private void jBTAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        VistaAgregarProducto.setVisible(true);
        try {
            TFACodigoProducto.setText(button.ultimoCodigo("producto"));
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                   

    private void jBTAgregarProductoAgregarActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        if (hayUnCampoVacio("Producto")){JOptionPane.showMessageDialog(null, "Ups! Falto llenar un campo");} 
        else{
          button.agregarDatosATabla(jTableAgregarProducto,modeloAddProducto,TFANombreProducto.getText(),TFAPrecioProducto.getText(), TFACodigoProducto.getText(), TFAStockProducto.getText(), devolverCodProveedor(), TFARubroProducto.getText(),TFASubRubroProducto.getText(), TFADescripcionProducto.getText());
          limpiarTextAddProducto();
        }
    }                                                         

    private void jButtonSalirVAddProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        VistaAgregarProducto.setVisible(false);
    }                                                        

    private void jBTAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        if (hayUnCampoVacio("Proveedor")){JOptionPane.showMessageDialog(null, "Falto llenar un campo");} 
        else{
              button.agregarProveedor(TFANombreProveedor.getText(), TFADirProveedor.getText(), TFACPProveedor.getText(), TFATelProveedor.getText(), TFACuitProveedor.getText(), TFACodProveedor.getText());
              llenarCBNombreProveedor();
      }
    }                                                   

    private void jButtonListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        VistaListaProveedor.setVisible(true);
        button.listar(jTableListaProveedores,modeloProveedores,"SELECT CodProveedor, Nombre, Direccion, CodigoPostal, Telefono, Cuit FROM "+ BDProveedor);
    }                                                       

    private void jBTBuscarLProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        button.listar(jTableListaProveedores, modeloProveedores, sentencia("Proveedores"));
    }                                                     

    private void jBTSalirListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        VistaListaProveedor.setVisible(false);
    }                                                        

    private void jBTAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        VistaAgregarProveedor.setVisible(true);
        try {
            TFACodProveedor.setText(button.ultimoCodigo("proveedor"));
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                     

    private void jBTSalirAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        VistaAgregarProveedor.setVisible(false);
    }                                                          

    private void jButtonListaClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        VistaListaCliente.setVisible(true);
        button.listar(jTableListaClientes, modeloClientes, sentencia("Clientes"));
    }                                                    

    private void jBTAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        button.agregarCliente(TFANombreCliente.getText(), TFADirCliente.getText(), TFACPCliente.getText(), TFATelCliente.getText(), TFADniCliente.getText(), TFACodigoCliente.getText(), TFASaldoCliente.getText());
    }                                                 

    private void jBTSalirAddClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        VistaAgregarCliente.setVisible(false);
    }                                                  

    private void jBTBuscarLClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        button.listar(jTableListaClientes, modeloClientes, sentencia("Clientes"));
    }                                                  

    private void jBTSalirListaClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        VistaListaCliente.setVisible(false);
    }                                                     

    private void jBTAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        VistaAgregarCliente.setVisible(true);
        try {
            TFACodigoCliente.setText(button.ultimoCodigo("cliente"));
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                  

    private void TFLCodClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                        

    private void TFLNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                           

    private void TFLDirClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                        

    private void TFLCPClienteKeyPressed(java.awt.event.KeyEvent evt) {                                        
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                       

    private void TFLTelClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                        

    private void TFLDNIClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                        

    private void TFLSaldoClienteKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedListar(evt, "Cliente", VistaListaCliente);
    }                                          

    private void TFLCodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedListar(evt, "Producto", VistaListaProducto); 
    }                                            

    private void TFLNombreProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                            

    private void TFLDescripcionProductoKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                                 

    private void TFLPrecioProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                            

    private void TFLStockProductoKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                           

    private void TFLFechaDiaProducto1KeyPressed(java.awt.event.KeyEvent evt) {                                                
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                               

    private void TFLFechaMesProducto1KeyPressed(java.awt.event.KeyEvent evt) {                                                
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                               

    private void TFLFechaAñoProducto1KeyPressed(java.awt.event.KeyEvent evt) {                                                
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                               

    private void TFCodProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                          
        keyPressedListar(evt, "Producto", VistaListaProducto);
    }                                         

    private void TFLCodProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                          

    private void TFLNombreProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                              
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                             

    private void TFLDirProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                          

    private void TFLCPProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                          
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                         

    private void TFLTelProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                          

    private void TFLCuitProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedListar(evt, "Proveedor", VistaListaProveedor);
    }                                           

    private void VistaListaProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedSalir(evt,VistaListaProveedor);        
    }                                              

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        if(evt.getKeyCode() == evt.VK_ESCAPE) {//salir del sistema???
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir de la aplicación?",
                "Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }else{if(evt.getKeyCode() == evt.VK_F1){ VistaListaProducto.setVisible(true);
                                                 button.listar(jTableListaProductos,modeloProductos,sentencia("Productos"));
                }else{if(evt.getKeyCode() == evt.VK_F2){VistaListaProveedor.setVisible(true);
                                                        button.listar(jTableListaProveedores,modeloProveedores,sentencia("Proveedores"));
                    }else {if(evt.getKeyCode() == evt.VK_F3){VistaListaCliente.setVisible(true);
                                                             button.listar(jTableListaClientes,modeloClientes,sentencia("Clientes"));}
                            }
                    }
            }
    }                               

    private void VistaListaProductoKeyPressed(java.awt.event.KeyEvent evt) {                                              
        keyPressedSalir(evt,VistaListaProducto);
    }                                             

    private void VistaAgregarProductoKeyPressed(java.awt.event.KeyEvent evt) {                                                
        keyPressedSalir(evt,VistaAgregarProducto);
    }                                               

    private void VistaAgregarProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                                 
        keyPressedSalir(evt,VistaAgregarProveedor);
    }                                                

    private void VistaListaClienteKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedSalir(evt,VistaListaCliente);
    }                                            

    private void VistaAgregarClienteKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedSalir(evt,VistaAgregarCliente);
    }                                              

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        this.requestFocus();
    }                                    

    private void VistaListaProductoWindowActivated(java.awt.event.WindowEvent evt) {                                                   
        VistaListaProducto.requestFocus();
    }                                                  

    private void VistaAgregarProductoWindowActivated(java.awt.event.WindowEvent evt) {                                                     
        VistaAgregarProducto.requestFocus();
    }                                                    

    private void VistaAgregarProveedorWindowActivated(java.awt.event.WindowEvent evt) {                                                      
        VistaAgregarProveedor.requestFocus();
    }                                                     

    private void VistaListaProveedorWindowActivated(java.awt.event.WindowEvent evt) {                                                    
        VistaListaProveedor.requestFocus();
    }                                                   

    private void VistaListaClienteWindowActivated(java.awt.event.WindowEvent evt) {                                                  
        VistaListaCliente.requestFocus();
    }                                                 

    private void VistaAgregarClienteWindowActivated(java.awt.event.WindowEvent evt) {                                                    
        VistaAgregarCliente.requestFocus();
    }                                                   

    private void jTableListaProductosMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        if (evt.getClickCount() == 2) {
            String dato=String.valueOf(modeloProductos.getValueAt(jTableListaProductos.getSelectedRow(),0));
            button.vaciarTabla(jTableListaPrecioProducto, modeloPrecioProducto);
            cargarVistaProducto(dato);
            VistaProducto.setVisible(true);
        }
    }                                                 

    private void jTableListaProductosKeyPressed(java.awt.event.KeyEvent evt) {                                                
        keyPressedSalir(evt, VistaListaProducto);
    }                                               

    private void jTableListaProveedoresKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        keyPressedSalir(evt, VistaListaProveedor);
    }                                                 

    private void jTableListaClientesKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedSalir(evt, VistaListaCliente);
    }                                              

    private void TFACodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                            

    private void TFANombreProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                            

    private void TFAPrecioProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                            

    private void TFAStockProductoKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                           

    private void TFARubroProductoKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                           

    private void TFASubRubroProductoKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                              

    private void TFADescripcionProductoKeyPressed(java.awt.event.KeyEvent evt) {                                                  
        keyPressedSalir(evt, VistaAgregarProducto);
    }                                                 

    private void TFACodProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                          

    private void TFANombreProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                              
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                             

    private void TFADirProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                          

    private void TFACPProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                          
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                         

    private void TFATelProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                          

    private void TFACuitProveedorKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedSalir(evt, VistaAgregarProveedor);
    }                                           

    private void TFACodigoClienteKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                           

    private void TFANombreClienteKeyPressed(java.awt.event.KeyEvent evt) {                                            
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                           

    private void TFADirClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                        

    private void TFACPClienteKeyPressed(java.awt.event.KeyEvent evt) {                                        
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                       

    private void TFATelClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                        

    private void TFADniClienteKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                        

    private void TFASaldoClienteKeyPressed(java.awt.event.KeyEvent evt) {                                           
        keyPressedSalir(evt, VistaAgregarCliente);
    }                                          

    private void TFCambiarDatoKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedSalir(evt,VistaCambiarDato);
        if(evt.getKeyCode() == evt.VK_ENTER) {
            cambiarDatoSingular(LabelCambiarDato.getText());
            VistaCambiarDato.setVisible(false);
        }
    }                                        

    private void BTCambiarDatoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        cambiarDatoSingular(LabelCambiarDato.getText());
        VistaCambiarDato.setVisible(false);
    }                                             

    private void jBTBuscarLProductosMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        VistaListaProducto.requestFocus();
    }                                                

    private void jBTBuscarLProveedoresMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        VistaListaProveedor.requestFocus();
    }                                                  

    private void jBTBuscarLClientesMouseClicked(java.awt.event.MouseEvent evt) {                                                
        VistaListaCliente.requestFocus();
    }                                               

    private void VistaProductoKeyPressed(java.awt.event.KeyEvent evt) {                                         
        keyPressedListar(evt, "Producto", VistaProducto);
    }                                        

    private void VistaProductoWindowActivated(java.awt.event.WindowEvent evt) {                                              
        VistaProducto.requestFocus();
    }                                             

    private void jBTSalirListaClientes1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        VistaProducto.setVisible(false);
    }                                                      

    private void BTVPCambiarCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        cambiarDatoLabel("Codigo");
    }                                                         

    private void BTVPCambiarSubRubroProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        cambiarDatoLabel("SubRubro");
    }                                                           

    private void BTVPCambiarRubroProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        cambiarDatoLabel("Rubro");
    }                                                        

    private void BTVPCambiarNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        cambiarDatoLabel("Nombre");
    }                                                         

    private void BTVPCambiarDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        cambiarDatoLabel("Descripcion");
    }                                                              

    private void BTVPCambiarPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        cambiarDatoLabel("Precio");
    }                                                         

    private void BTVPCambiarStockProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        cambiarDatoLabel("Stock");
    }                                                        

    private void BTVPCambiarCodigoProvProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        cambiarDatoLabel("Codigo Proveedor");
    }                                                             

    private void BTCancelarCambiosVistaProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        VistaProducto.setVisible(false);
    }                                                              

    private void BTAceptarCambiosVistaProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        aceptarCambios();
        VistaProducto.setVisible(false);
    }                                                             

    private void jButtonHistorialDePreciosActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        VistaHistorialDePrecio.setVisible(true);
        button.listar(jTableListaHistorialPrecio, modeloHistorialPrecio, "SELECT * FROM "+ BDListaPrecio);
    }                                                         

    private void TFHFechaAñoProductoKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedListar(evt, "HPrecio", VistaHistorialDePrecio);
    }                                              

    private void TFHFechaMesProductoKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedListar(evt, "HPrecio", VistaHistorialDePrecio);
    }                                              

    private void TFHFechaDiaProductoKeyPressed(java.awt.event.KeyEvent evt) {                                               
        keyPressedListar(evt, "HPrecio", VistaHistorialDePrecio);
    }                                              

    private void jButtonSalirHistorialPrecioActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        VistaHistorialDePrecio.setVisible(false);
    }                                                           

    private void TFHPrecioProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedListar(evt, "HPrecio", VistaHistorialDePrecio);
    }                                            

    private void TFHCodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {                                             
        keyPressedListar(evt, "HPrecio", VistaHistorialDePrecio);
    }                                            

    private void jBTBuscarHLPrecioActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        button.listar(jTableListaHistorialPrecio, modeloHistorialPrecio, sentencia("HPrecio"));
    }                                                 

    private void jBTAgregarProductoCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        VistaAgregarProducto.setVisible(false);
        button.vaciarTabla(jTableAgregarProducto,modeloAddProducto);
    }                                                          

    private void jBTAgregarProductoAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        if (JOptionPane.showConfirmDialog(null, "¿Desea realmente agregar estos datos?",
                "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            for (int f = 0; f < modeloAddProducto.getRowCount();f++){//codigo, nombre, precio, stock, codprov, rubro, subrubro, desc, fecha
                button.agregarProducto((String)modeloAddProducto.getValueAt(f,0), (String)modeloAddProducto.getValueAt(f,1), (String)modeloAddProducto.getValueAt(f,2),
                                      (String)modeloAddProducto.getValueAt(f,3), (String)modeloAddProducto.getValueAt(f,4), (String)modeloAddProducto.getValueAt(f,5),
                                      (String)modeloAddProducto.getValueAt(f,6), (String)modeloAddProducto.getValueAt(f,7));
            }
            }
    }                                                         

    private void jTableAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        if (evt.getClickCount() == 2) {
            String dato=String.valueOf(modeloAddProducto.getValueAt(jTableAgregarProducto.getSelectedRow(),0));
        if (JOptionPane.showConfirmDialog(null, "¿Desea eleminar este producto (cod "+dato+")? Tenga en cuenta que los codigos de los otros productos para agregar pueden cambiar",
                "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            modeloAddProducto.removeRow(jTableAgregarProducto.getSelectedRow()); 
        }
        }
        acomodarCodigoAddProducto();
    }                                                  

    private String sentencia(String nombreBD){
        String codigo;
        boolean op = false;
        switch(nombreBD){
            case "Productos":{
                codigo = "SELECT Codigo, Nombre, Descripcion, Precio, Stock, FechaModificacion, Proveedor FROM "+ BDProducto +" WHERE ";
                //si hay algo en el text field de codigo, lo agrega al codigo
                if (!(TFLCodigoProducto.getText().isEmpty())) {codigo += "Codigo = "+ TFLCodigoProducto.getText(); op = true;}
                //si hay algo en el text field de nombre y antes se habia escrito algo, lo agrega al codigo con un and, si no se habia escrito nada solo lo agrega
                if ((!(TFLNombreProducto.getText().isEmpty())) & (op == true)) {codigo += " and Nombre LIKE "+ ponerComillas(TFLNombreProducto.getText()+"%");} 
                else if (!(TFLNombreProducto.getText().isEmpty())){codigo += "Nombre LIKE "+ ponerComillas(TFLNombreProducto.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLPrecioProducto.getText().isEmpty())) & (op == true)) {codigo += " and Precio = "+ ponerComillas(TFLPrecioProducto.getText());}
                      else if (!(TFLPrecioProducto.getText().isEmpty())){codigo += "Precio = "+ ponerComillas(TFLPrecioProducto.getText()); op = true;}
                //idem ant
                if ((!(TFLStockProducto.getText().isEmpty())) & (op == true)) {codigo += " and Stock = "+ ponerComillas(TFLStockProducto.getText());}
                      else if (!(TFLStockProducto.getText().isEmpty())){codigo += "Stock = "+ ponerComillas(TFLStockProducto.getText()); op = true;}
                if ((!(TFLDescripcionProducto.getText().isEmpty())) & (op == true)) {codigo += " and Descripcion LIKE "+ ponerComillas(TFLDescripcionProducto.getText()+"%");}
                      else if (!(TFLDescripcionProducto.getText().isEmpty())){codigo += "Descripcion LIKE "+ ponerComillas(TFLDescripcionProducto.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLFechaAñoProducto1.getText().isEmpty())&(!(TFLFechaMesProducto1.getText().isEmpty()))&(!(TFLFechaDiaProducto1.getText().isEmpty()))) & (op == true)) {codigo += " and FechaModificacion = "+ ponerComillas(unirFecha("Producto"));} 
                        else if ((!(TFLFechaAñoProducto1.getText().isEmpty()))&(!(TFLFechaMesProducto1.getText().isEmpty()))&(!(TFLFechaDiaProducto1.getText().isEmpty()))){codigo += "FechaModificacion = "+ ponerComillas(unirFecha("Producto")); op = true;}
                if ((!(TFCodProveedor.getText().isEmpty())) & (op == true)) {codigo += " and Proveedor = "+ ponerComillas(TFCodProveedor.getText());} 
                        else if (!(TFCodProveedor.getText().isEmpty())){codigo += "Proveedor = "+ ponerComillas(TFCodProveedor.getText()); op = true;}
                //si en ninguno se escribio nada, se cambia el codigo para que no quede el "WHERE " solo y produja un error
                if (op == false) {codigo = "SELECT Codigo, Nombre, Descripcion, Precio, Stock, FechaModificacion, Proveedor FROM "+ BDProducto;} //codigo base
                break;                
            }
            
            case "Proveedores":{
                codigo = "SELECT CodProveedor, Nombre, Direccion, CodigoPostal, Telefono, Cuit FROM "+ BDProveedor +" WHERE ";
                //si hay algo en el text field de codigo, lo agrega al codigo
                if (!(TFLCodProveedor.getText().isEmpty())) {codigo += "CodProveedor = "+ TFLCodProveedor.getText(); op = true;}
                //si hay algo en el text field de nombre y antes se habia escrito algo, lo agrega al codigo con un and, si no se habia escrito nada solo lo agrega
                if ((!(TFLNombreProveedor.getText().isEmpty())) & (op == true)) {codigo += " and Nombre LIKE "+ ponerComillas(TFLNombreProveedor.getText()+"%");} 
                        else if (!(TFLNombreProveedor.getText().isEmpty())){codigo += "Nombre LIKE "+ ponerComillas(TFLNombreProveedor.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLDirProveedor.getText().isEmpty())) & (op == true)) {codigo += " and Direccion LIKE "+ ponerComillas(TFLDirProveedor.getText()+"%");}
                        else if (!(TFLDirProveedor.getText().isEmpty())){codigo += "Direccion LIKE "+ ponerComillas(TFLDirProveedor.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLCPProveedor.getText().isEmpty())) & (op == true)) {codigo += " and CodigoPostal = "+ ponerComillas(TFLCPProveedor.getText());}
                        else if (!(TFLCPProveedor.getText().isEmpty())){codigo += "CodigoPostal = "+ ponerComillas(TFLCPProveedor.getText()); op = true;}
                if ((!(TFLTelProveedor.getText().isEmpty())) & (op == true)) {codigo += " and Telefono LIKE "+ ponerComillas(TFLTelProveedor.getText()+"%");}
                        else if (!(TFLTelProveedor.getText().isEmpty())){codigo += "Telefono LIKE "+ ponerComillas(TFLTelProveedor.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLCuitProveedor.getText().isEmpty())) & (op == true)) {codigo += " and Cuit = "+ ponerComillas(TFLCuitProveedor.getText());} 
                        else if (!(TFLCuitProveedor.getText().isEmpty())){codigo += "Cuit = "+ ponerComillas(TFLCuitProveedor.getText()); op = true;}
                //si en ninguno se escribio nada, se cambia el codigo para que no quede el "WHERE " solo y produja un error
                if (op == false) {codigo = "SELECT CodProveedor, Nombre, Direccion, CodigoPostal, Telefono, Cuit FROM "+ BDProveedor;} //codigo base
                break;
            }
            
            case "Clientes":{
                codigo = "SELECT CodCliente, Nombre, Direccion, CodigoPostal, Telefono, DNI, Saldo FROM "+ BDCliente +" WHERE ";
                //si hay algo en el text field de codigo, lo agrega al codigo
                if (!(TFLCodCliente.getText().isEmpty())) {codigo += "CodProveedor = "+ TFLCodCliente.getText(); op = true;}
                //si hay algo en el text field de nombre y antes se habia escrito algo, lo agrega al codigo con un and, si no se habia escrito nada solo lo agrega
                if ((!(TFLNombreCliente.getText().isEmpty())) & (op == true)) {codigo += " and Nombre LIKE "+ ponerComillas(TFLNombreCliente.getText()+"%");} 
                        else if (!(TFLNombreCliente.getText().isEmpty())){codigo += "Nombre LIKE "+ ponerComillas(TFLNombreCliente.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLDirCliente.getText().isEmpty())) & (op == true)) {codigo += " and Direccion LIKE "+ ponerComillas(TFLDirCliente.getText()+"%");}
                        else if (!(TFLDirCliente.getText().isEmpty())){codigo += "Direccion = "+ ponerComillas(TFLDirCliente.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLCPCliente.getText().isEmpty())) & (op == true)) {codigo += " and CodigoPostal = "+ ponerComillas(TFLCPCliente.getText());}
                        else if (!(TFLCPCliente.getText().isEmpty())){codigo += "CodigoPostal = "+ ponerComillas(TFLCPCliente.getText()); op = true;}
                if ((!(TFLTelCliente.getText().isEmpty())) & (op == true)) {codigo += " and Telefono LIKE "+ ponerComillas(TFLTelCliente.getText()+"%");}
                        else if (!(TFLTelCliente.getText().isEmpty())){codigo += "Telefono LIKE "+ ponerComillas(TFLTelCliente.getText()+"%"); op = true;}
                //idem ant
                if ((!(TFLDNICliente.getText().isEmpty())) & (op == true)) {codigo += " and DNI LIKE "+ ponerComillas(TFLDNICliente.getText()+"%");} 
                        else if (!(TFLDNICliente.getText().isEmpty())){codigo += "DNI LIKE "+ ponerComillas(TFLDNICliente.getText()+"%"); op = true;}
                if ((!(TFLSaldoCliente.getText().isEmpty())) & (op == true)) {codigo += " and Saldo = "+ ponerComillas(TFLSaldoCliente.getText());} 
                        else if (!(TFLSaldoCliente.getText().isEmpty())){codigo += "Saldo = "+ ponerComillas(TFLSaldoCliente.getText()); op = true;}
                //si en ninguno se escribio nada, se cambia el codigo para que no quede el "WHERE " solo y produja un error
                if (op == false) {codigo = "SELECT CodCliente, Nombre, Direccion, CodigoPostal, Telefono, DNI, Saldo FROM "+ BDCliente;} //codigo base
                break;
            }
            case "HPrecio":{
                codigo = "SELECT * FROM " + BDListaPrecio +" WHERE ";
                if (!(TFHCodigoProducto.getText().isEmpty())) {codigo += "codigoProducto = "+ ponerComillas(TFHCodigoProducto.getText()); op = true;}
                if ((!(TFHPrecioProducto.getText().isEmpty())) & (op == true)) {codigo += " and precio = "+ ponerComillas(TFHPrecioProducto.getText());} 
                        else if (!(TFHPrecioProducto.getText().isEmpty())){codigo += "precio = "+ ponerComillas(TFHPrecioProducto.getText()); op = true;}
                if ((!(TFHFechaAñoProducto.getText().isEmpty())&(!(TFHFechaMesProducto.getText().isEmpty()))&(!(TFHFechaDiaProducto.getText().isEmpty()))) & (op == true)) {codigo += " and fecha = "+ ponerComillas(unirFecha("HPrecio"));} 
                        else if ((!(TFHFechaAñoProducto.getText().isEmpty()))&(!(TFHFechaMesProducto.getText().isEmpty()))&(!(TFHFechaDiaProducto.getText().isEmpty()))){codigo += "fecha = "+ ponerComillas(unirFecha("HPrecio")); op = true;}
                if (op == false){codigo= "SELECT * FROM " + BDListaPrecio;}
                break;
            }
            default: codigo ="";
    }
       return codigo; 
    }
    
    private void keyPressedListar(java.awt.event.KeyEvent evt, String nomLista, JFrame vista){
        if(evt.getKeyCode() == evt.VK_ENTER) {
            switch(nomLista){
                case "Producto":{button.listar(jTableListaProductos, modeloProductos, sentencia("Productos"));}
                case "Proveedor":{button.listar(jTableListaProveedores, modeloProveedores, sentencia("Proveedores"));}
                case "Cliente":{button.listar(jTableListaClientes, modeloClientes, sentencia("Clientes"));}
                case "HPrecio":{button.listar(jTableListaHistorialPrecio, modeloHistorialPrecio, sentencia("HPrecio"));}
            }            
        }
        if(evt.getKeyCode() == evt.VK_ESCAPE) {
            vista.setVisible(false);
        }
    }
    private void keyPressedSalir(java.awt.event.KeyEvent evt, JFrame vista){
        if(evt.getKeyCode() == evt.VK_ESCAPE) {
            vista.setVisible(false);
        }
    }
    
    private String unirFecha(String nomLista){//en la vista de lista productos hay 3 fechas, esas son las que uno,para asi devolver una fecha igual a la de la BD
        String fecha="";
        switch(nomLista){
            case "Producto":fecha = TFLFechaAñoProducto1.getText() + "-"+ TFLFechaMesProducto1.getText() + "-"+ TFLFechaDiaProducto1.getText();
            case "HPrecio":fecha = TFHFechaAñoProducto.getText() + "-"+ TFHFechaMesProducto.getText() + "-"+ TFHFechaDiaProducto.getText();
        }
        return fecha;
    }
    
    private void cambiarDatoLabel(String datoACambiar){
        VistaCambiarDato.setVisible(true);
        LabelCambiarDato.setText(datoACambiar);
        TFCambiarDato.requestFocus();
    }
    
    private void aceptarCambios(){
        try {
            String nombre = (String) resultSetDatoProducto.getObject("Nombre");
            String precio = ""+ resultSetDatoProducto.getObject("Precio");;
            String proveedor = (String) resultSetDatoProducto.getObject("Proveedor");
            String stock = ""+ resultSetDatoProducto.getObject("Stock");
            String descripcion = (String) resultSetDatoProducto.getObject("Descripcion");
            String rubro = (String) resultSetDatoProducto.getObject("Rubro");
            String subRubro = (String) resultSetDatoProducto.getObject("SubRubro");
            String codigo = (String) resultSetDatoProducto.getObject("Codigo");
            if (nombre != TFVNombreProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET nombre= "
                        +ponerComillas(TFVNombreProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (precio != TFVPrecioProducto.getText()){
                button.agregarUnPrecio(TFVCodigoProducto.getText(), TFVPrecioProducto.getText());
                cumplirSentenciaUpdate("UPDATE productos SET precio= "
                        +ponerComillas(TFVPrecioProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
                cumplirSentenciaUpdate("UPDATE productos SET FechaModificacion= "
                        +ponerComillas(button.fechaDeHoy())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (proveedor != TFVCodProveedorProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET proveedor= "
                        +ponerComillas(TFVCodProveedorProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (stock != TFVStockProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET stock= "
                        +ponerComillas(TFVStockProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (descripcion != TFVDescripcionProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET descripcion= "
                        +ponerComillas(TFVDescripcionProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (rubro != TFVRubroProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET rubro= "
                        +ponerComillas(TFVRubroProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (subRubro != TFVSubRubroProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET subRubro= "
                        +ponerComillas(TFVSubRubroProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
            if (codigo != TFVCodigoProducto.getText()){
                cumplirSentenciaUpdate("UPDATE productos SET Codigo= "
                        +ponerComillas(TFVCodigoProducto.getText())+
                        " WHERE Codigo = "+ponerComillas(codigo));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void acomodarCodigoAddProducto(){
        int codigo=0;
        try {
            codigo = Integer.parseInt(button.ultimoCodigo(BDProducto));
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i<modeloAddProducto.getRowCount();i++){
            modeloAddProducto.setValueAt(codigo++, i, 0);
        }
    }
    
    private void cambiarDatoSingular(String nombreLabel){
        if (!(TFCambiarDato.getText().isEmpty())){
        switch (nombreLabel){
            case "Nombre":{TFVNombreProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Precio":{TFVPrecioProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Codigo Proveedor":{TFVCodProveedorProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Stock":{TFVStockProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Descripcion":{TFVDescripcionProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Rubro":{TFVRubroProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "SubRubro":{TFVSubRubroProducto.setText(TFCambiarDato.getText());
                break;
            }
            case "Codigo":{TFVCodigoProducto.setText(TFCambiarDato.getText());
                break;
            }
        }
        TFCambiarDato.setText("");
    }
        
    }
    
    private void cumplirSentenciaUpdate(String sentencia){
        try {
            connection = Conectar.getConnection();
            preparedStatement = connection.prepareStatement(sentencia);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargarVistaProducto(String codigoProducto){
        try {
            connection = Conectar.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM " + BDProducto +" WHERE Codigo = " + ponerComillas(codigoProducto));
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            TFVNombreProducto.setText(resultSet.getString("Nombre"));
            TFVDescripcionProducto.setText(resultSet.getString("Descripcion"));
            TFVFechaIngresoProducto.setText(resultSet.getString("Fecha"));
            TFVPrecioProducto.setText(resultSet.getString("Precio"));
            TFVCodigoProducto.setText(resultSet.getString("Codigo"));
            TFVStockProducto.setText(resultSet.getString("Stock"));
            TFVCodProveedorProducto.setText(resultSet.getString("Proveedor"));
            TFVRubroProducto.setText(resultSet.getString("Rubro"));
            TFVSubRubroProducto.setText(resultSet.getString("SubRubro"));
            resultSetDatoProducto = resultSet; //lo guardo en datoproducto para poder usarlo en aceptarCambios()
            preparedStatement = connection.prepareStatement("SELECT fecha FROM " + BDListaPrecio +" WHERE CodigoProducto = " + ponerComillas(codigoProducto));
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            TFVFechaModificacionProducto.setText(resultSet.getString("Fecha"));
            button.listar(jTableListaPrecioProducto,modeloPrecioProducto,"SELECT precio, fecha FROM " + BDListaPrecio +" WHERE CodigoProducto = " + ponerComillas(codigoProducto));
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Un pequeño aviso y te dejo seguir con tus cosas! No hay historial de precio para este producto!");
        }
    }
    
    private String devolverCodProveedor(){
        String codigoProveedor ="";
        try {
            connection = Conectar.getConnection();
            preparedStatement = connection.prepareStatement("SELECT CodProveedor FROM " + BDProveedor +" WHERE Nombre = " + ponerComillas((String) CBNombreProveedor.getSelectedItem()));
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            codigoProveedor = resultSet.getString("CodProveedor");
            resultSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigoProveedor;
    }
    
    private boolean hayUnCampoVacio(String nombre){
        boolean esVacio = false;
        switch (nombre){
            case "Proveedor":{
                if ((TFACodProveedor.getText().isEmpty()) || (TFANombreProveedor.getText().isEmpty()) || (TFACodProveedor.getText().isEmpty())
                || (TFATelProveedor.getText().isEmpty()) || (TFACuitProveedor.getText().isEmpty()) || (TFACPProveedor.getText().isEmpty())) {esVacio = true;}
            }
            case "Producto":{
               if ((TFACodigoProducto.getText().isEmpty()) || (TFANombreProducto.getText().isEmpty()) || (TFAPrecioProducto.getText().isEmpty())||(TFAStockProducto.getText().isEmpty()) ||
                (TFARubroProducto.getText().isEmpty()) || (TFASubRubroProducto.getText().isEmpty()) || (TFADescripcionProducto.getText().isEmpty())) {esVacio = true;}
            }
        }
        return esVacio;
        
    }

    private String ponerComillas(String palabra){
        String palabraConComillas ="'" + palabra + "'";
        return palabraConComillas;
    }
    
    private void llenarCBNombreProveedor(){
        connection = Conectar.getConnection();
        int itemCount = CBNombreProveedor.getItemCount();
        for(int i=0;i<itemCount;i++){
            CBNombreProveedor.removeItemAt(0);
        }
        try {
            preparedStatement = connection.prepareStatement("SELECT Nombre FROM "+ BDProveedor);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                CBNombreProveedor.addItem(resultSet.getString("Nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void limpiarTextAddProducto(){
        int codigo = Integer.parseInt(TFACodigoProducto.getText()) + 1 ;
        TFACodigoProducto.setText(""+ codigo);
        TFANombreProducto.setText("");
        TFADescripcionProducto.setText("");
        TFAPrecioProducto.setText("");
        TFAStockProducto.setText("");
        TFARubroProducto.setText("");
        TFASubRubroProducto.setText("");
        }
    
            
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BTAceptarCambiosVistaProducto;
    private javax.swing.JButton BTCambiarDato;
    private javax.swing.JButton BTCancelarCambiosVistaProducto;
    private javax.swing.JButton BTVPCambiarCodigoProducto;
    private javax.swing.JButton BTVPCambiarCodigoProvProducto;
    private javax.swing.JButton BTVPCambiarDescripcionProducto;
    private javax.swing.JButton BTVPCambiarNombreProducto;
    private javax.swing.JButton BTVPCambiarPrecioProducto;
    private javax.swing.JButton BTVPCambiarRubroProducto;
    private javax.swing.JButton BTVPCambiarStockProducto;
    private javax.swing.JButton BTVPCambiarSubRubroProducto;
    private javax.swing.JComboBox<String> CBNombreProveedor;
    private javax.swing.JLabel LabelCambiarDato;
    private javax.swing.JTextField TFACPCliente;
    private javax.swing.JTextField TFACPProveedor;
    private javax.swing.JTextField TFACodProveedor;
    private javax.swing.JTextField TFACodigoCliente;
    private javax.swing.JTextField TFACodigoProducto;
    private javax.swing.JTextField TFACuitProveedor;
    private javax.swing.JTextField TFADescripcionProducto;
    private javax.swing.JTextField TFADirCliente;
    private javax.swing.JTextField TFADirProveedor;
    private javax.swing.JTextField TFADniCliente;
    private javax.swing.JTextField TFANombreCliente;
    private javax.swing.JTextField TFANombreProducto;
    private javax.swing.JTextField TFANombreProveedor;
    private javax.swing.JTextField TFAPrecioProducto;
    private javax.swing.JTextField TFARubroProducto;
    private javax.swing.JTextField TFASaldoCliente;
    private javax.swing.JTextField TFAStockProducto;
    private javax.swing.JTextField TFASubRubroProducto;
    private javax.swing.JTextField TFATelCliente;
    private javax.swing.JTextField TFATelProveedor;
    private javax.swing.JTextField TFCambiarDato;
    private javax.swing.JTextField TFCodProveedor;
    private javax.swing.JTextField TFHCodigoProducto;
    private javax.swing.JTextField TFHFechaAñoProducto;
    private javax.swing.JTextField TFHFechaDiaProducto;
    private javax.swing.JTextField TFHFechaMesProducto;
    private javax.swing.JTextField TFHPrecioProducto;
    private javax.swing.JTextField TFLCPCliente;
    private javax.swing.JTextField TFLCPProveedor;
    private javax.swing.JTextField TFLCodCliente;
    private javax.swing.JTextField TFLCodProveedor;
    private javax.swing.JTextField TFLCodigoProducto;
    private javax.swing.JTextField TFLCuitProveedor;
    private javax.swing.JTextField TFLDNICliente;
    private javax.swing.JTextField TFLDescripcionProducto;
    private javax.swing.JTextField TFLDirCliente;
    private javax.swing.JTextField TFLDirProveedor;
    private javax.swing.JTextField TFLFechaAñoProducto1;
    private javax.swing.JTextField TFLFechaDiaProducto1;
    private javax.swing.JTextField TFLFechaMesProducto1;
    private javax.swing.JTextField TFLNombreCliente;
    private javax.swing.JTextField TFLNombreProducto;
    private javax.swing.JTextField TFLNombreProveedor;
    private javax.swing.JTextField TFLPrecioProducto;
    private javax.swing.JTextField TFLSaldoCliente;
    private javax.swing.JTextField TFLStockProducto;
    private javax.swing.JTextField TFLTelCliente;
    private javax.swing.JTextField TFLTelProveedor;
    private javax.swing.JTextField TFVCodProveedorProducto;
    private javax.swing.JTextField TFVCodigoProducto;
    private javax.swing.JTextField TFVDescripcionProducto;
    private javax.swing.JTextField TFVFechaIngresoProducto;
    private javax.swing.JTextField TFVFechaModificacionProducto;
    private javax.swing.JTextField TFVNombreProducto;
    private javax.swing.JTextField TFVPrecioProducto;
    private javax.swing.JTextField TFVRubroProducto;
    private javax.swing.JTextField TFVStockProducto;
    private javax.swing.JTextField TFVSubRubroProducto;
    private javax.swing.JFrame VistaAgregarCliente;
    private javax.swing.JFrame VistaAgregarProducto;
    private javax.swing.JFrame VistaAgregarProveedor;
    private javax.swing.JFrame VistaCambiarDato;
    private javax.swing.JFrame VistaHistorialDePrecio;
    private javax.swing.JFrame VistaListaCliente;
    private javax.swing.JFrame VistaListaProducto;
    private javax.swing.JFrame VistaListaProveedor;
    private javax.swing.JFrame VistaProducto;
    private javax.swing.JButton jBTAgregarCliente;
    private javax.swing.JButton jBTAgregarClientes;
    private javax.swing.JButton jBTAgregarProductoAceptar;
    private javax.swing.JButton jBTAgregarProductoAgregar;
    private javax.swing.JButton jBTAgregarProductoCancelar;
    private javax.swing.JButton jBTAgregarProductos;
    private javax.swing.JButton jBTAgregarProveedor;
    private javax.swing.JButton jBTAgregarProveedores;
    private javax.swing.JButton jBTBuscarHLPrecio;
    private javax.swing.JButton jBTBuscarLClientes;
    private javax.swing.JButton jBTBuscarLProductos;
    private javax.swing.JButton jBTBuscarLProveedores;
    private javax.swing.JButton jBTSalirAddCliente;
    private javax.swing.JButton jBTSalirAgregarProveedores;
    private javax.swing.JButton jBTSalirListaClientes;
    private javax.swing.JButton jBTSalirListaClientes1;
    private javax.swing.JButton jBTSalirListaProductos;
    private javax.swing.JButton jBTSalirListaProveedores;
    private javax.swing.JButton jButtonHistorialDePrecios;
    private javax.swing.JButton jButtonListaArticulos;
    private javax.swing.JButton jButtonListaClientes;
    private javax.swing.JButton jButtonListaProveedores;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalirHistorialPrecio;
    private javax.swing.JButton jButtonSalirVAddProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableAgregarProducto;
    private javax.swing.JTable jTableListaClientes;
    private javax.swing.JTable jTableListaHistorialPrecio;
    private javax.swing.JTable jTableListaPrecioProducto;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTable jTableListaProveedores;
    // End of variables declaration                   
}
