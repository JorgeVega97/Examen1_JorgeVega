package examen.pkg1_jorgevegam;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GRAFICOS extends javax.swing.JFrame {

    public GRAFICOS() {
        initComponents();
        
        DefaultComboBoxModel cbmodel = (DefaultComboBoxModel) cb_tipo.getModel();
        
        cbmodel.addElement("Gerente");
        cbmodel.addElement("Persona General");
        cb_tipo.setModel(cbmodel);
        
        cb_tipo.setSelectedIndex(1);
        jl_usuario.setVisible(false);
        jl_cargo.setVisible(false);
        jl_contra.setVisible(false);
        jl_modificableU.setVisible(false);
        tf_usuario.setVisible(false);
        tf_contra.setVisible(false);
        rb_planta.setVisible(false);
        rb_sucursal.setVisible(false);
        
        DefaultComboBoxModel art_model = (DefaultComboBoxModel) lista_ARTICULOS.getModel();
        art_model.addElement("ZAPATOS");
        art_model.addElement("ROPA");
        art_model.addElement("OBJETOS DE HOGAR");
        lista_ARTICULOS.setModel(art_model);
        lista_ARTICULOS.setSelectedIndex(0);
        
        jl_edicion.setVisible(false);
        L8.setVisible(false);
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sexo = new javax.swing.ButtonGroup();
        bg_estadoCivil = new javax.swing.ButtonGroup();
        bg_cargo = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cb_tipo = new javax.swing.JComboBox<>();
        ff_identificacion = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ff_edad = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rb_soltero = new javax.swing.JRadioButton();
        rb_casado = new javax.swing.JRadioButton();
        rb_divorciado = new javax.swing.JRadioButton();
        rb_viudo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        ff_altura = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        ff_peso = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_usuario = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jl_contra = new javax.swing.JLabel();
        tf_contra = new javax.swing.JTextField();
        rb_sucursal = new javax.swing.JRadioButton();
        rb_planta = new javax.swing.JRadioButton();
        jl_cargo = new javax.swing.JLabel();
        jl_ocupacion = new javax.swing.JLabel();
        tf_ocupacion = new javax.swing.JTextField();
        tf_horario = new javax.swing.JTextField();
        jl_horario = new javax.swing.JLabel();
        ff_tiempo = new javax.swing.JFormattedTextField();
        jl_tiempo = new javax.swing.JLabel();
        jl_semanas = new javax.swing.JLabel();
        jb_crear = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        cb_personas = new javax.swing.JComboBox<>();
        ff_sueldo = new javax.swing.JFormattedTextField();
        jl_sueldo = new javax.swing.JLabel();
        jl_modificableU = new javax.swing.JLabel();
        jl_modificableS = new javax.swing.JLabel();
        jb_modificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lista_ARTICULOS = new javax.swing.JComboBox<>();
        PALETA_COLORES = new javax.swing.JButton();
        L4 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        TIPO_ARTI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        INTRU_HOGAR = new javax.swing.JTextArea();
        L9 = new javax.swing.JLabel();
        ESTILO = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        TALLA_TAMANO = new javax.swing.JFormattedTextField();
        BARRA_COMODIDAD = new javax.swing.JSlider();
        L5 = new javax.swing.JLabel();
        jl_estado = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JFormattedTextField();
        USU_REGIS = new javax.swing.JComboBox<>();
        L11 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        jl_edicion = new javax.swing.JLabel();
        jl_volumen = new javax.swing.JLabel();
        GARANTIA_DEVOLUCIONES = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        INTRU_ROPA = new javax.swing.JTextArea();
        L6 = new javax.swing.JLabel();
        MARCA = new javax.swing.JTextField();
        MESS1 = new javax.swing.JLabel();
        MADE_IN = new javax.swing.JTextField();
        L7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        INTRU_ZAPA = new javax.swing.JTextArea();
        DESCRI1 = new javax.swing.JLabel();
        CREAR_BUTTON = new javax.swing.JButton();
        MODI_BUTTON = new javax.swing.JButton();
        BORRAR_BUTTON = new javax.swing.JButton();
        MESS4 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        DESCRI3 = new javax.swing.JLabel();
        DESCRI2 = new javax.swing.JLabel();
        MESS2 = new javax.swing.JLabel();
        MESS3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        cb_emisor = new javax.swing.JComboBox<>();
        cb_receptor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        cb_tipo.setBackground(new java.awt.Color(255, 51, 51));
        cb_tipo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        cb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoItemStateChanged(evt);
            }
        });

        ff_identificacion.setBackground(new java.awt.Color(153, 153, 255));
        try {
            ff_identificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ff_identificacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        tf_nombre.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        ff_edad.setBackground(new java.awt.Color(153, 153, 255));
        ff_edad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EDAD");

        rb_masculino.setBackground(new java.awt.Color(153, 0, 0));
        bg_sexo.add(rb_masculino);
        rb_masculino.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        rb_masculino.setForeground(new java.awt.Color(255, 255, 255));
        rb_masculino.setText("M");
        rb_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_masculinoActionPerformed(evt);
            }
        });

        rb_femenino.setBackground(new java.awt.Color(153, 0, 0));
        bg_sexo.add(rb_femenino);
        rb_femenino.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        rb_femenino.setForeground(new java.awt.Color(255, 255, 255));
        rb_femenino.setText("F");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTADO CIVIL");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENERO");

        rb_soltero.setBackground(new java.awt.Color(153, 0, 0));
        bg_estadoCivil.add(rb_soltero);
        rb_soltero.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_soltero.setForeground(new java.awt.Color(255, 255, 255));
        rb_soltero.setText("SOLTERO");

        rb_casado.setBackground(new java.awt.Color(153, 0, 0));
        bg_estadoCivil.add(rb_casado);
        rb_casado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_casado.setForeground(new java.awt.Color(255, 255, 255));
        rb_casado.setText("CASADO");

        rb_divorciado.setBackground(new java.awt.Color(153, 0, 0));
        bg_estadoCivil.add(rb_divorciado);
        rb_divorciado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_divorciado.setForeground(new java.awt.Color(255, 255, 255));
        rb_divorciado.setText("DIVORCIADO");

        rb_viudo.setBackground(new java.awt.Color(153, 0, 0));
        bg_estadoCivil.add(rb_viudo);
        rb_viudo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_viudo.setForeground(new java.awt.Color(255, 255, 255));
        rb_viudo.setText("VIUDO");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ALTURA");

        ff_altura.setBackground(new java.awt.Color(153, 153, 255));
        ff_altura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CM");

        ff_peso.setBackground(new java.awt.Color(153, 153, 255));
        ff_peso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("KILOS");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PESO");

        jl_usuario.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_usuario.setText("USUARIO");

        tf_usuario.setBackground(new java.awt.Color(153, 153, 255));

        jl_contra.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_contra.setForeground(new java.awt.Color(255, 255, 255));
        jl_contra.setText("PASSWORD");

        tf_contra.setBackground(new java.awt.Color(153, 153, 255));

        rb_sucursal.setBackground(new java.awt.Color(153, 0, 0));
        bg_cargo.add(rb_sucursal);
        rb_sucursal.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_sucursal.setForeground(new java.awt.Color(255, 255, 255));
        rb_sucursal.setText("GERENTE SUCURSAL");

        rb_planta.setBackground(new java.awt.Color(153, 0, 0));
        bg_cargo.add(rb_planta);
        rb_planta.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        rb_planta.setForeground(new java.awt.Color(255, 255, 255));
        rb_planta.setText("GERENTE PLANTA");

        jl_cargo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_cargo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cargo.setText("PUESTO");

        jl_ocupacion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_ocupacion.setForeground(new java.awt.Color(255, 255, 255));
        jl_ocupacion.setText("OCUPACION");

        tf_ocupacion.setBackground(new java.awt.Color(153, 153, 255));

        tf_horario.setBackground(new java.awt.Color(153, 153, 255));

        jl_horario.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_horario.setForeground(new java.awt.Color(255, 255, 255));
        jl_horario.setText("HORARIO LABORAL");

        ff_tiempo.setBackground(new java.awt.Color(153, 153, 255));
        ff_tiempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jl_tiempo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_tiempo.setForeground(new java.awt.Color(255, 255, 255));
        jl_tiempo.setText("ANTIGUEDAD");

        jl_semanas.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jl_semanas.setForeground(new java.awt.Color(255, 255, 255));
        jl_semanas.setText("SEMANAS");

        jb_crear.setBackground(new java.awt.Color(0, 0, 0));
        jb_crear.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_crear.setForeground(new java.awt.Color(255, 255, 255));
        jb_crear.setText("CREAR");
        jb_crear.setBorderPainted(false);
        jb_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearActionPerformed(evt);
            }
        });

        jb_eliminar.setBackground(new java.awt.Color(0, 0, 0));
        jb_eliminar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("ELIMINAR");
        jb_eliminar.setBorderPainted(false);
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        cb_personas.setBackground(new java.awt.Color(255, 51, 51));
        cb_personas.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        cb_personas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_personas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_personasItemStateChanged(evt);
            }
        });
        cb_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_personasActionPerformed(evt);
            }
        });

        ff_sueldo.setBackground(new java.awt.Color(153, 153, 255));
        ff_sueldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jl_sueldo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_sueldo.setForeground(new java.awt.Color(255, 255, 255));
        jl_sueldo.setText("SALARIO");

        jl_modificableU.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        jl_modificableU.setForeground(new java.awt.Color(255, 204, 204));
        jl_modificableU.setText("modificable");

        jl_modificableS.setFont(new java.awt.Font("Tw Cen MT", 1, 11)); // NOI18N
        jl_modificableS.setForeground(new java.awt.Color(255, 204, 204));
        jl_modificableS.setText("modificable");

        jb_modificar.setBackground(new java.awt.Color(0, 0, 0));
        jb_modificar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("MODIFICAR");
        jb_modificar.setBorderPainted(false);
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_ocupacion)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ff_edad)
                                    .addComponent(tf_ocupacion)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ff_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                            .addComponent(ff_altura))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jl_tiempo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ff_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jl_semanas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(49, 49, 49)
                                    .addComponent(ff_identificacion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_femenino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_horario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_sueldo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(ff_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_casado)
                                    .addComponent(rb_soltero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_divorciado)
                                    .addComponent(rb_viudo)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_cargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_planta)
                                    .addComponent(rb_sucursal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_contra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_modificableS))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_usuario)
                                .addGap(18, 18, 18)
                                .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jl_modificableU)
                                .addGap(46, 46, 46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jb_modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_personas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ff_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_femenino, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_masculino, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_ocupacion)
                                    .addComponent(tf_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ff_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ff_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ff_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_tiempo)
                            .addComponent(ff_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_semanas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_horario)
                            .addComponent(tf_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_sueldo)
                            .addComponent(ff_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jl_modificableU, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_contra)
                            .addComponent(tf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_modificableS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_cargo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_planta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_sucursal)))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_soltero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_divorciado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_casado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_viudo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(67, 67, 67))))
        );

        jTabbedPane1.addTab("ADMIN PERSONAS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista_ARTICULOS.setBackground(new java.awt.Color(0, 0, 0));
        lista_ARTICULOS.setForeground(new java.awt.Color(255, 255, 255));
        lista_ARTICULOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lista_ARTICULOSItemStateChanged(evt);
            }
        });
        lista_ARTICULOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_ARTICULOSActionPerformed(evt);
            }
        });
        jPanel2.add(lista_ARTICULOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, -1));

        PALETA_COLORES.setBackground(new java.awt.Color(255, 0, 0));
        PALETA_COLORES.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PALETA_COLORES.setBorderPainted(false);
        PALETA_COLORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PALETA_COLORESActionPerformed(evt);
            }
        });
        jPanel2.add(PALETA_COLORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 30, 28));

        L4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L4.setForeground(new java.awt.Color(255, 255, 255));
        L4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L4.setText("    Color");
        jPanel2.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 140, 80, -1));

        L1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L1.setText("Elija la clasificacion de Articulo");
        jPanel2.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        TIPO_ARTI.setBackground(new java.awt.Color(255, 153, 153));
        TIPO_ARTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIPO_ARTIActionPerformed(evt);
            }
        });
        jPanel2.add(TIPO_ARTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 125, -1));

        INTRU_HOGAR.setBackground(new java.awt.Color(204, 204, 255));
        INTRU_HOGAR.setColumns(20);
        INTRU_HOGAR.setRows(5);
        jScrollPane1.setViewportView(INTRU_HOGAR);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 280, 90));

        L9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L9.setForeground(new java.awt.Color(255, 255, 255));
        L9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L9.setText("ESTILO (Formal, Casual, Verano, Invierno, Gala)");
        jPanel2.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        ESTILO.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.add(ESTILO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 147, -1));

        L3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setText("Talla o Tamano");
        jPanel2.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        TALLA_TAMANO.setBackground(new java.awt.Color(255, 153, 153));
        TALLA_TAMANO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        TALLA_TAMANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TALLA_TAMANOActionPerformed(evt);
            }
        });
        jPanel2.add(TALLA_TAMANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, -1));

        BARRA_COMODIDAD.setBackground(new java.awt.Color(153, 0, 0));
        BARRA_COMODIDAD.setMaximum(10);
        BARRA_COMODIDAD.setMinimum(1);
        jPanel2.add(BARRA_COMODIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        L5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L5.setForeground(new java.awt.Color(255, 255, 255));
        L5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L5.setText("Comodidad     1   2   3   4   5   6   7   8   9   10");
        jPanel2.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 310, -1));

        jl_estado.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_estado.setForeground(new java.awt.Color(153, 0, 0));
        jl_estado.setText("Comodidad");
        jPanel2.add(jl_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        L10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L10.setForeground(new java.awt.Color(255, 255, 255));
        L10.setText("Codigo");
        jPanel2.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        CODIGO.setBackground(new java.awt.Color(255, 153, 153));
        CODIGO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jPanel2.add(CODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 147, -1));

        USU_REGIS.setBackground(new java.awt.Color(0, 0, 0));
        USU_REGIS.setForeground(new java.awt.Color(255, 255, 255));
        USU_REGIS.setModel(cb_personas.getModel());
        USU_REGIS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                USU_REGISItemStateChanged(evt);
            }
        });
        jPanel2.add(USU_REGIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 140, -1));

        L11.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L11.setForeground(new java.awt.Color(255, 255, 255));
        L11.setText("Empleado que lo registro");
        jPanel2.add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        L8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L8.setForeground(new java.awt.Color(255, 255, 255));
        L8.setText("Meses de validez para cambio o garantia del articulo:");
        jPanel2.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jl_edicion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_edicion.setForeground(new java.awt.Color(255, 255, 255));
        jl_edicion.setText("Meses de validez para cambio o garantia del articulo:");
        jPanel2.add(jl_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jl_volumen.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jl_volumen.setForeground(new java.awt.Color(255, 255, 255));
        jl_volumen.setText("Meses de validez para cambio o garantia del articulo:");
        jPanel2.add(jl_volumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        GARANTIA_DEVOLUCIONES.setBackground(new java.awt.Color(255, 153, 153));
        GARANTIA_DEVOLUCIONES.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel2.add(GARANTIA_DEVOLUCIONES, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 70, -1));

        jScrollPane2.setBackground(new java.awt.Color(0, 204, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 204, 204));

        INTRU_ROPA.setBackground(new java.awt.Color(204, 204, 255));
        INTRU_ROPA.setColumns(20);
        INTRU_ROPA.setRows(5);
        jScrollPane2.setViewportView(INTRU_ROPA);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 280, 90));

        L6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L6.setForeground(new java.awt.Color(255, 255, 255));
        L6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L6.setText("Marca");
        jPanel2.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        MARCA.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.add(MARCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 130, -1));

        MESS1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        MESS1.setForeground(new java.awt.Color(255, 255, 255));
        MESS1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MESS1.setText("Describa la zuela del zapato");
        jPanel2.add(MESS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        MADE_IN.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.add(MADE_IN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, -1));

        L7.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L7.setForeground(new java.awt.Color(255, 255, 255));
        L7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L7.setText("Pais de fabricacion");
        jPanel2.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        INTRU_ZAPA.setBackground(new java.awt.Color(204, 204, 255));
        INTRU_ZAPA.setColumns(20);
        INTRU_ZAPA.setRows(5);
        jScrollPane3.setViewportView(INTRU_ZAPA);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 280, 90));

        DESCRI1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DESCRI1.setForeground(new java.awt.Color(255, 255, 255));
        DESCRI1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DESCRI1.setText("DESCRIPCION PARA ZAPATOS");
        jPanel2.add(DESCRI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        CREAR_BUTTON.setBackground(new java.awt.Color(0, 0, 0));
        CREAR_BUTTON.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        CREAR_BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        CREAR_BUTTON.setText("CREAR");
        CREAR_BUTTON.setBorderPainted(false);
        CREAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREAR_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(CREAR_BUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 110, 80));

        MODI_BUTTON.setBackground(new java.awt.Color(0, 0, 0));
        MODI_BUTTON.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        MODI_BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        MODI_BUTTON.setText("MODIFICAR");
        MODI_BUTTON.setBorderPainted(false);
        MODI_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODI_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(MODI_BUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 110, 80));

        BORRAR_BUTTON.setBackground(new java.awt.Color(0, 0, 0));
        BORRAR_BUTTON.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        BORRAR_BUTTON.setForeground(new java.awt.Color(255, 255, 255));
        BORRAR_BUTTON.setText("BORRAR");
        BORRAR_BUTTON.setBorderPainted(false);
        BORRAR_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRAR_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(BORRAR_BUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 110, 80));

        MESS4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        MESS4.setForeground(new java.awt.Color(255, 255, 255));
        MESS4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MESS4.setText("y Lugar del hogar donde se utiliza)");
        jPanel2.add(MESS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        L2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L2.setText("Ingrese Articulo  Eje. ( tacones, chaqueta, lavadora)");
        jPanel2.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        DESCRI3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DESCRI3.setForeground(new java.awt.Color(255, 255, 255));
        DESCRI3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DESCRI3.setText("DESCRIPCION PARA OBJETOS DE HOGAR");
        jPanel2.add(DESCRI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        DESCRI2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DESCRI2.setForeground(new java.awt.Color(255, 255, 255));
        DESCRI2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DESCRI2.setText("DESCRIPCION PARA ROPA");
        jPanel2.add(DESCRI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        MESS2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        MESS2.setForeground(new java.awt.Color(255, 255, 255));
        MESS2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MESS2.setText("Describa el tipo de tela");
        jPanel2.add(MESS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        MESS3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        MESS3.setForeground(new java.awt.Color(255, 255, 255));
        MESS3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MESS3.setText("( Describa Instrucciones de Funcionamiento ");
        jPanel2.add(MESS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 260, 30));

        jTabbedPane1.addTab("ADMIN ARTICULOS", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTA DE PERSONAS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        text.setColumns(20);
        text.setRows(5);
        jScrollPane5.setViewportView(text);

        cb_emisor.setBackground(new java.awt.Color(255, 0, 51));
        cb_emisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_emisor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_emisorItemStateChanged(evt);
            }
        });
        cb_emisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_emisorActionPerformed(evt);
            }
        });

        cb_receptor.setBackground(new java.awt.Color(255, 0, 51));
        cb_receptor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_receptor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_receptorItemStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMISOR");

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RECEPTOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_emisor, 0, 132, Short.MAX_VALUE)
                                    .addComponent(cb_receptor, 0, 132, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel11)))
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cb_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(5, 5, 5)
                        .addComponent(cb_receptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMULADOR MENSAJES", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emisor", "Reeptor", "Mensaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTA DE MENSAJES", jPanel5);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearActionPerformed
        
        if (entrar()) {
            long identificacion;
            int edad, altura, peso;
            String nombrePersona, sexo, estadoCivil;
            
            try {
                String id = ff_identificacion.getText();
                identificacion = Long.parseLong(id.substring(0, 4) + id.substring(5, 9) + id.substring(10));
                edad = Integer.parseInt(ff_edad.getText());
                altura = Integer.parseInt(ff_altura.getText());
                peso = Integer.parseInt(ff_peso.getText());
                
                nombrePersona = tf_nombre.getText();
                
                sexo = (rb_masculino.isSelected()) ? "Masculino" : "Femenino";
                
                if (rb_soltero.isSelected()) {
                    estadoCivil = "Soltero";
                } else if (rb_casado.isSelected()) {
                    estadoCivil = "Casado";
                } else if (rb_divorciado.isSelected()) {
                    estadoCivil = "Divorciado";
                } else {
                    estadoCivil = "Viudo";
                }
                
                if (cb_tipo.getSelectedIndex() == 0) {
                    
                    String usuario, contra, cargo;
                    usuario = tf_usuario.getText();
                    contra = tf_contra.getText();
                    cargo = (rb_planta.isSelected()) ? "Gerente de planta" : "Gerente de sucursal";
                    
                    Persona p = new Gerente(usuario, contra, cargo, identificacion, nombrePersona, edad, sexo, estadoCivil, altura, peso);
                    
                    contactos.add(p);
                    DefaultComboBoxModel m = (DefaultComboBoxModel) cb_personas.getModel();
                    m.addElement(p);
                    
                    DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
                    
                    
                    
                    estadoOperacion(true);
                } else if (cb_tipo.getSelectedIndex() == 1) {
                    String ocupacion, horario;
                    int tiempo;
                    float sueldo;
                    
                    ocupacion = tf_ocupacion.getText();
                    horario = tf_horario.getText();
                    tiempo = Integer.parseInt(ff_tiempo.getText());
                    sueldo = Float.parseFloat(ff_sueldo.getText());
                    Persona p = new PersonaGeneral(ocupacion, horario, tiempo, sueldo, identificacion, nombrePersona, edad, sexo, estadoCivil, altura, peso);
                    
                    contactos.add(p);
                    DefaultComboBoxModel m = (DefaultComboBoxModel) cb_personas.getModel();
                    m.addElement(p);
                    
                    
                    
                    estadoOperacion(true);
                }
                
            } catch (Exception e) {
                estadoOperacion(false);
            }
            limpiarCampos();
        }
    }//GEN-LAST:event_jb_crearActionPerformed

    private void cb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoItemStateChanged
        if (evt.getStateChange() == 2) {
            if (cb_tipo.getSelectedIndex() == 0) {
                jl_usuario.setVisible(true);
                jl_cargo.setVisible(true);
                jl_contra.setVisible(true);
                jl_modificableU.setVisible(true);
                tf_usuario.setVisible(true);
                tf_contra.setVisible(true);
                rb_planta.setVisible(true);
                rb_sucursal.setVisible(true);

                //Set not visible the others
                jl_ocupacion.setVisible(false);
                jl_horario.setVisible(false);
                jl_tiempo.setVisible(false);
                jl_semanas.setVisible(false);
                jl_sueldo.setVisible(false);
                jl_modificableS.setVisible(false);
                tf_ocupacion.setVisible(false);
                tf_horario.setVisible(false);
                ff_tiempo.setVisible(false);
                ff_sueldo.setVisible(false);
            } else if (cb_tipo.getSelectedIndex() == 1) {
                jl_ocupacion.setVisible(true);
                jl_horario.setVisible(true);
                jl_tiempo.setVisible(true);
                jl_semanas.setVisible(true);
                jl_sueldo.setVisible(true);
                jl_modificableS.setVisible(true);
                tf_ocupacion.setVisible(true);
                tf_horario.setVisible(true);
                ff_tiempo.setVisible(true);
                ff_sueldo.setVisible(true);

                //Set not visible the others
                jl_usuario.setVisible(false);
                jl_cargo.setVisible(false);
                jl_contra.setVisible(false);
                jl_modificableU.setVisible(false);
                tf_usuario.setVisible(false);
                tf_contra.setVisible(false);
                rb_planta.setVisible(false);
                rb_sucursal.setVisible(false);
            }
        }
    }//GEN-LAST:event_cb_tipoItemStateChanged

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        if (entrar()) {
            try{
                if (cb_personas.getSelectedIndex() > 0) {
                    contactos.remove(cb_personas.getSelectedIndex() - 1);
                    DefaultComboBoxModel m = (DefaultComboBoxModel) cb_personas.getModel();
                    m.removeElementAt(cb_personas.getSelectedIndex());
                    estadoOperacion(true);
                }
            } catch(Exception e){
                estadoOperacion(false);        
            }
        }
        
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        
        if (entrar()) {
            long identificacion;
            int edad, altura, peso;
            String nombrePersona, sexo, estadoCivil;
            
            try {
                String id = ff_identificacion.getText();
                identificacion = Long.parseLong(id.substring(0, 4) + id.substring(5, 9) + id.substring(10));
                edad = Integer.parseInt(ff_edad.getText());
                altura = Integer.parseInt(ff_altura.getText());
                peso = Integer.parseInt(ff_peso.getText());
                
                nombrePersona = tf_nombre.getText();
                
                sexo = (rb_masculino.isSelected()) ? "Masculino" : "Femenino";
                
                if (rb_soltero.isSelected()) {
                    estadoCivil = "Soltero";
                } else if (rb_casado.isSelected()) {
                    estadoCivil = "Casado";
                } else if (rb_divorciado.isSelected()) {
                    estadoCivil = "Divorciado";
                } else {
                    estadoCivil = "Viudo";
                }
                
                if (contactos.get(cb_personas.getSelectedIndex() - 1) instanceof Gerente) {                    
                    String usuario = tf_usuario.getText();
                    Gerente g = ((Gerente) cb_personas.getSelectedItem());
                    g.setUsuario(usuario);
                    
                    g.setNombrePersona(nombrePersona);
                    g.setAltura(altura);
                    g.setEstadoCivil(estadoCivil);
                    g.setIdentificacion(identificacion);
                    g.setPeso(peso);
                    g.setSexo(sexo);
                    g.setEdad(edad);
                    
                    estadoOperacion(true);
                } else {
                    Float sueldo = Float.parseFloat(ff_sueldo.getText());
                    
                    PersonaGeneral g = ((PersonaGeneral) cb_personas.getSelectedItem());
                    g.setSueldo(sueldo);
                    
                    g.setNombrePersona(nombrePersona);
                    g.setAltura(altura);
                    g.setEstadoCivil(estadoCivil);
                    g.setIdentificacion(identificacion);
                    g.setPeso(peso);
                    g.setSexo(sexo);
                    g.setEdad(edad);
                    
                    estadoOperacion(true);
                }                
            } catch (Exception e) {
                estadoOperacion(false);
            }
            limpiarCampos();
        }
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void cb_personasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_personasItemStateChanged
        if (evt.getStateChange() == 2 && cb_personas.getSelectedIndex()>0) {
            
            if(cb_personas.getSelectedItem() instanceof Gerente){
                
                Gerente g = (Gerente) cb_personas.getSelectedItem();
                mostrarDatosPersona(g);
                
                //Set not visible 
                jl_ocupacion.setVisible(false);
                jl_horario.setVisible(false);
                jl_tiempo.setVisible(false);
                jl_semanas.setVisible(false);
                jl_sueldo.setVisible(false);
                jl_modificableS.setVisible(false);
                tf_ocupacion.setVisible(false);
                tf_horario.setVisible(false);
                ff_tiempo.setVisible(false);
                ff_sueldo.setVisible(false);
                
                jl_usuario.setVisible(true);
                jl_cargo.setVisible(true);
                jl_contra.setVisible(true);
                jl_modificableU.setVisible(true);
                
                tf_usuario.setVisible(true);
                tf_usuario.setText(g.getUsuario());
                
                tf_contra.setVisible(true);
                tf_contra.setText(g.getContraseña());
                
                rb_planta.setVisible(true);
                rb_sucursal.setVisible(true);
                if(g.getCargo().equals("Gerente de planta")){
                    rb_planta.setSelected(true);
                    rb_sucursal.setSelected(false);
                } else {
                    rb_planta.setSelected(false);
                    rb_sucursal.setSelected(true);
                }
            } else {
                PersonaGeneral p = (PersonaGeneral) cb_personas.getSelectedItem();
                mostrarDatosPersona(p);
                
                //Set not visible 
                jl_usuario.setVisible(false);
                jl_cargo.setVisible(false);
                jl_contra.setVisible(false);
                jl_modificableU.setVisible(false);
                tf_usuario.setVisible(false);
                tf_contra.setVisible(false);
                rb_planta.setVisible(false);
                rb_sucursal.setVisible(false);
                
                jl_ocupacion.setVisible(true);
                jl_horario.setVisible(true);
                jl_tiempo.setVisible(true);
                jl_semanas.setVisible(true);
                jl_sueldo.setVisible(true);
                jl_modificableS.setVisible(true);
                
                
                tf_ocupacion.setVisible(true);
                tf_ocupacion.setText(p.getOcupacion());
                
                tf_horario.setVisible(true);
                tf_horario.setText(p.getHorario());
                
                ff_tiempo.setVisible(true);
                ff_tiempo.setText(p.getSemanasContratado() + "");
                
                ff_sueldo.setVisible(true);
                ff_sueldo.setText(p.getSueldo() + "");
            }
        }
    }//GEN-LAST:event_cb_personasItemStateChanged

    private void PALETA_COLORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PALETA_COLORESActionPerformed

        PALETA_COLORES.setBackground(
            JColorChooser.showDialog(this, "Seleccione el color del carro.", PALETA_COLORES.getBackground())
        );

    }//GEN-LAST:event_PALETA_COLORESActionPerformed

    private void USU_REGISItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_USU_REGISItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_USU_REGISItemStateChanged

    private void CREAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREAR_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CREAR_BUTTONActionPerformed

    private void MODI_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODI_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODI_BUTTONActionPerformed

    private void BORRAR_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRAR_BUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BORRAR_BUTTONActionPerformed

    private void lista_ARTICULOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lista_ARTICULOSItemStateChanged
        if (evt.getStateChange() == 2) {
            if (cb_tipo.getSelectedIndex() == 0) {
                
                jl_estado.setVisible(true);
                BARRA_COMODIDAD.setVisible(true);
                MESS1.setVisible(true);
                INTRU_ROPA.setVisible(true);
                jl_volumen.setVisible(true);
                
                jl_edicion.setVisible(false);
                L6.setVisible(false);
                MARCA.setVisible(false);
                L7.setVisible(false);
                MADE_IN.setVisible(false);
                
                DESCRI1.setVisible(false);
                INTRU_ZAPA.setVisible(false);
                jl_tiempo.setVisible(false);
                
            } else if (cb_tipo.getSelectedIndex() == 1) {
                jl_estado.setVisible(false);
                BARRA_COMODIDAD.setVisible(false);
                MESS1.setVisible(false);
                INTRU_ROPA.setVisible(false);
                jl_volumen.setVisible(false);
                
                jl_edicion.setVisible(true);
                L6.setVisible(true);
                MARCA.setVisible(true);
                L7.setVisible(true);
                MADE_IN.setVisible(true);
                
                DESCRI1.setVisible(false);
                INTRU_ZAPA.setVisible(false);
                jl_tiempo.setVisible(false);
                
            } else {
                
                jl_estado.setVisible(false);
                BARRA_COMODIDAD.setVisible(false);
                MESS1.setVisible(false);
                INTRU_ROPA.setVisible(false);
                jl_volumen.setVisible(false);
                
                jl_edicion.setVisible(false);
                L6.setVisible(false);
                MARCA.setVisible(false);
                L7.setVisible(false);
                MADE_IN.setVisible(false);
                
                DESCRI1.setVisible(true);
                INTRU_ZAPA.setVisible(true);
                jl_tiempo.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_lista_ARTICULOSItemStateChanged

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        
        for(Persona p : contactos){
            
            String s = (p instanceof Gerente) ? "Gerente" : "Persona General";
                    
            String[] so = new String[]{
                p.getNombrePersona(),
                s
            };
            t.addRow(so);
            jTable1.setModel(t);
            
        }
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void cb_emisorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_emisorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_emisorItemStateChanged

    private void cb_receptorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_receptorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_receptorItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(entrar())
        {
            try{
                
                Mensaje m = new Mensaje((Persona)cb_emisor.getSelectedItem(), (Persona)cb_receptor.getSelectedItem(), text.getText());
                
                ((Persona)cb_emisor.getSelectedItem()).getMensajesEnviados().add(m);
                ((Persona)cb_receptor.getSelectedItem()).getMensajesRecibidos().add(m);
                
                DefaultTableModel t = (DefaultTableModel) jTable2.getModel();
                String [] r = new String[]{
                    ((Persona)cb_emisor.getSelectedItem()).getNombrePersona(),
                    ((Persona)cb_receptor.getSelectedItem()).getNombrePersona(),
                    text.getText()
                        };
                t.addRow(r);
                
                estadoOperacion(true);
            }catch(Exception e){
                estadoOperacion(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ff_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ff_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ff_identificacionActionPerformed

    private void lista_ARTICULOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_ARTICULOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lista_ARTICULOSActionPerformed

    private void TALLA_TAMANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TALLA_TAMANOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TALLA_TAMANOActionPerformed

    private void TIPO_ARTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIPO_ARTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIPO_ARTIActionPerformed

    private void cb_emisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_emisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_emisorActionPerformed

    private void cb_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_personasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_personasActionPerformed

    private void rb_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_masculinoActionPerformed

    private void mostrarDatosPersona(Persona p){
        
        String id = Long.toString(p.getIdentificacion());
        for(int i=13; i>id.length();i--){
            id = "0" + id;
        }
        try {       
            id = id.substring(0,4) + "-" + id.substring(4,8) + "-" + id.substring(8,13);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        ff_identificacion.setText(id);
        tf_nombre.setText(p.getNombrePersona());    
        ff_edad.setText(p.getEdad() + "");
        ff_altura.setText(p.getAltura()+ "");
        ff_peso.setText(p.getPeso() + "");
        
        if(p.getSexo().equals("Masculino")){
            rb_masculino.setSelected(true);
        }
        
        if(p.getEstadoCivil().equals("Soltero")){
            rb_soltero.setSelected(true);
        } else if(p.getEstadoCivil().equals("Casado")){
            rb_casado.setSelected(true);
        } else if(p.getEstadoCivil().equals("Divorciado")){
            rb_divorciado.setSelected(true);
        } else {
            rb_viudo.setSelected(true);
        }
        
    }
    
    
    private void modificarAtributo(){
            try{
                if(cb_personas.getSelectedIndex()>0){
                    
                    if(contactos.get(cb_personas.getSelectedIndex()-1)instanceof Gerente){
                        Gerente p = (Gerente)cb_personas.getSelectedItem();
                        
                        String usuario = JOptionPane.showInputDialog("Ingrese un nuevo usuario:");
                        p.setUsuario(usuario);
                    
                        estadoOperacion(true);
                    }else{
                        PersonaGeneral p = (PersonaGeneral)cb_personas.getSelectedItem();
                        
                        Float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un nuevo sueldo:"));
                        p.setSueldo(sueldo);
                        
                        estadoOperacion(true);
                    }        
                }
            
            }catch(Exception e){
                estadoOperacion(false);
            }
    }
         



        /**
         * @param args the command line arguments
         */
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
            java.util.logging.Logger.getLogger(GRAFICOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRAFICOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRAFICOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRAFICOS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRAFICOS().setVisible(true);
            }
        });
    }
    
    public boolean entrar() {
        try{
            String password = JOptionPane.showInputDialog(this, "Ingrese la contraseña:", "Verificación.", JOptionPane.QUESTION_MESSAGE);
            boolean flag;
            if (password.equals("unitec1234")) {
                JOptionPane.showMessageDialog(null, "Contraseña correcta.", "Validación de Contraseña.", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta.", "Validación de Contraseña.", JOptionPane.ERROR_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public void estadoOperacion(boolean b) {
        if (b) {
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito.", "Estado de Operación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La operación no pudo ser realizada.", "Estado de Operación", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiarCampos(){
        ff_identificacion.setText("");
        tf_nombre.setText(""); 
        ff_edad.setText("");
        ff_altura.setText("");
        ff_peso.setText("");
        rb_masculino.setSelected(true);
        rb_soltero.setSelected(true);
        
        tf_ocupacion.setText("");
        tf_horario.setText("");
        ff_tiempo.setText("");
        ff_sueldo.setText("");
        
        tf_usuario.setText("");
        tf_contra.setText("");
        rb_planta.setSelected(true);
        
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider BARRA_COMODIDAD;
    private javax.swing.JButton BORRAR_BUTTON;
    private javax.swing.JFormattedTextField CODIGO;
    private javax.swing.JButton CREAR_BUTTON;
    private javax.swing.JLabel DESCRI1;
    private javax.swing.JLabel DESCRI2;
    private javax.swing.JLabel DESCRI3;
    private javax.swing.JTextField ESTILO;
    private javax.swing.JFormattedTextField GARANTIA_DEVOLUCIONES;
    private javax.swing.JTextArea INTRU_HOGAR;
    private javax.swing.JTextArea INTRU_ROPA;
    private javax.swing.JTextArea INTRU_ZAPA;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JTextField MADE_IN;
    private javax.swing.JTextField MARCA;
    private javax.swing.JLabel MESS1;
    private javax.swing.JLabel MESS2;
    private javax.swing.JLabel MESS3;
    private javax.swing.JLabel MESS4;
    private javax.swing.JButton MODI_BUTTON;
    private javax.swing.JButton PALETA_COLORES;
    private javax.swing.JFormattedTextField TALLA_TAMANO;
    private javax.swing.JTextField TIPO_ARTI;
    private javax.swing.JComboBox<String> USU_REGIS;
    private javax.swing.ButtonGroup bg_cargo;
    private javax.swing.ButtonGroup bg_estadoCivil;
    private javax.swing.ButtonGroup bg_sexo;
    private javax.swing.JComboBox<String> cb_emisor;
    private javax.swing.JComboBox<String> cb_personas;
    private javax.swing.JComboBox<String> cb_receptor;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JFormattedTextField ff_altura;
    private javax.swing.JFormattedTextField ff_edad;
    private javax.swing.JFormattedTextField ff_identificacion;
    private javax.swing.JFormattedTextField ff_peso;
    private javax.swing.JFormattedTextField ff_sueldo;
    private javax.swing.JFormattedTextField ff_tiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JLabel jl_cargo;
    private javax.swing.JLabel jl_contra;
    private javax.swing.JLabel jl_edicion;
    private javax.swing.JLabel jl_estado;
    private javax.swing.JLabel jl_horario;
    private javax.swing.JLabel jl_modificableS;
    private javax.swing.JLabel jl_modificableU;
    private javax.swing.JLabel jl_ocupacion;
    private javax.swing.JLabel jl_semanas;
    private javax.swing.JLabel jl_sueldo;
    private javax.swing.JLabel jl_tiempo;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JLabel jl_volumen;
    private javax.swing.JComboBox<String> lista_ARTICULOS;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton rb_casado;
    private javax.swing.JRadioButton rb_divorciado;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_planta;
    private javax.swing.JRadioButton rb_soltero;
    private javax.swing.JRadioButton rb_sucursal;
    private javax.swing.JRadioButton rb_viudo;
    private javax.swing.JTextArea text;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_horario;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_ocupacion;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables

    ArrayList<Persona> contactos = new ArrayList();
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    DefaultTableModel tableModel = new DefaultTableModel();
}
