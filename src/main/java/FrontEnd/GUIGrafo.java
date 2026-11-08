package FrontEnd;

import BackEnd.Arista;
import BackEnd.Grafo;
import BackEnd.GrafoException;
import BackEnd.Vertice;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Ventana principal. El diseño se edita en la pestaña Design de NetBeans (GUIGrafo.form).
 */
public class GUIGrafo extends javax.swing.JFrame {

    private final PanelGrafo panelGrafo = new PanelGrafo();
    private Grafo grafo;

    public GUIGrafo() {
        initComponents();
        panelLienzo.add(panelGrafo, java.awt.BorderLayout.CENTER);
        setLocationRelativeTo(null);
        actualizarEstado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelControl = new javax.swing.JPanel();
        lblTipoGrafo = new javax.swing.JLabel();
        cmbTipoGrafo = new javax.swing.JComboBox<>();
        btnCrearGrafo = new javax.swing.JButton();
        btnDestruirGrafo = new javax.swing.JButton();
        lblEstadoGrafo = new javax.swing.JLabel();
        panelVertice = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblEstadoRegion = new javax.swing.JLabel();
        txtEstadoRegion = new javax.swing.JTextField();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnAgregarVertice = new javax.swing.JButton();
        btnBuscarVertice = new javax.swing.JButton();
        btnEliminarVertice = new javax.swing.JButton();
        panelArista = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnAgregarArista = new javax.swing.JButton();
        btnEliminarArista = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        lblNodoInicial = new javax.swing.JLabel();
        txtNodoInicial = new javax.swing.JTextField();
        btnBFS = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        btnConectividad = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        panelLienzo = new javax.swing.JPanel();
        scrollSalida = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de rutas con grafos");

        panelControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafo"));

        lblTipoGrafo.setText("Tipo:");
        cmbTipoGrafo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No dirigido", "Dirigido" }));
        btnCrearGrafo.setText("Crear grafo");
        btnCrearGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearGrafo(evt);
            }
        });
        btnDestruirGrafo.setText("Destruir grafo");
        btnDestruirGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destruirGrafo(evt);
            }
        });
        lblEstadoGrafo.setText("Estado: grafo sin crear");

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelControlLayout.createSequentialGroup()
                            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTipoGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbTipoGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelControlLayout.createSequentialGroup()
                            .addComponent(btnCrearGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDestruirGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addComponent(lblEstadoGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTipoGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCrearGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDestruirGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblEstadoGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelVertice.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicación (vértice)"));

        lblId.setText("Identificador:");
        lblNombre.setText("Nombre:");
        lblTipo.setText("Tipo:");
        lblEstadoRegion.setText("Estado / zona:");
        lblCapacidad.setText("Capacidad:");
        btnAgregarVertice.setText("Agregar");
        btnAgregarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarVertice(evt);
            }
        });
        btnBuscarVertice.setText("Buscar");
        btnBuscarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVertice(evt);
            }
        });
        btnEliminarVertice.setText("Eliminar");
        btnEliminarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVertice(evt);
            }
        });

        javax.swing.GroupLayout panelVerticeLayout = new javax.swing.GroupLayout(panelVertice);
        panelVertice.setLayout(panelVerticeLayout);
        panelVerticeLayout.setHorizontalGroup(
            panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVerticeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelVerticeLayout.createSequentialGroup()
                            .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstadoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelVerticeLayout.createSequentialGroup()
                            .addComponent(btnAgregarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        panelVerticeLayout.setVerticalGroup(
            panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVerticeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstadoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEstadoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelVerticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelArista.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruta (arista)"));

        lblOrigen.setText("Origen:");
        lblDestino.setText("Destino:");
        lblPeso.setText("Peso / distancia:");
        btnAgregarArista.setText("Agregar ruta");
        btnAgregarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarArista(evt);
            }
        });
        btnEliminarArista.setText("Eliminar ruta");
        btnEliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArista(evt);
            }
        });

        javax.swing.GroupLayout panelAristaLayout = new javax.swing.GroupLayout(panelArista);
        panelArista.setLayout(panelAristaLayout);
        panelAristaLayout.setHorizontalGroup(
            panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAristaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAristaLayout.createSequentialGroup()
                            .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelAristaLayout.createSequentialGroup()
                            .addComponent(btnAgregarArista, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminarArista, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        panelAristaLayout.setVerticalGroup(
            panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAristaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelAristaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregarArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Recorridos y análisis"));

        lblNodoInicial.setText("Nodo inicial:");
        btnBFS.setText("Recorrido BFS");
        btnBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBFS(evt);
            }
        });
        btnDFS.setText("Recorrido DFS");
        btnDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDFS(evt);
            }
        });
        btnMatriz.setText("Matriz");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMatriz(evt);
            }
        });
        btnConectividad.setText("Conectividad");
        btnConectividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarConectividad(evt);
            }
        });
        btnVisualizar.setText("Ver estructura del grafo");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarGrafo(evt);
            }
        });

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOperacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelOperacionesLayout.createSequentialGroup()
                            .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNodoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelOperacionesLayout.createSequentialGroup()
                            .addComponent(btnBFS, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDFS, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(panelOperacionesLayout.createSequentialGroup()
                            .addComponent(btnMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConectividad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(panelOperacionesLayout.createSequentialGroup()
                            .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOperacionesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConectividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLienzo.setBorder(javax.swing.BorderFactory.createTitledBorder("Representación gráfica"));
        panelLienzo.setLayout(new java.awt.BorderLayout());

        txtSalida.setEditable(false);
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtSalida.setRows(5);
        scrollSalida.setViewportView(txtSalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelVertice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                        .addComponent(scrollSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearGrafo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearGrafo
        if (grafo != null && !grafo.estaVacio()
                && !confirmar("El grafo actual tiene datos y se perderán. ¿Crear uno nuevo?")) {
            return;
        }
        boolean dirigido = cmbTipoGrafo.getSelectedIndex() == 1;
        grafo = new Grafo(dirigido);
        panelGrafo.setGrafo(grafo);
        limpiarCampos();
        actualizarEstado();
        exito("Grafo " + (dirigido ? "dirigido" : "no dirigido") + " creado y listo para usarse.");
    }//GEN-LAST:event_crearGrafo

    private void agregarVertice(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVertice
        ejecutar(() -> {
            String nombre = obligatorio(txtNombre, "nombre");
            String tipo = obligatorio(txtTipo, "tipo");
            String estado = obligatorio(txtEstadoRegion, "estado");
            Vertice vertice = new Vertice(txtId.getText(), nombre, tipo, estado,
                    leerNumero(txtCapacidad, "capacidad"));
            grafo.agregarVertice(vertice);
            exito("Ubicación agregada -> " + vertice);
            limpiarCamposVertice();
        });
    }//GEN-LAST:event_agregarVertice

    private void buscarVertice(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVertice
        ejecutar(() -> exito("Ubicación encontrada -> " + grafo.buscarVertice(txtId.getText())));
    }//GEN-LAST:event_buscarVertice

    private void eliminarVertice(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVertice
        ejecutar(() -> {
            String id = txtId.getText().trim();
            int rutas = grafo.eliminarVertice(id);
            exito("Ubicación '" + id + "' eliminada junto con " + rutas + " ruta(s) conectada(s).");
            limpiarCamposVertice();
        });
    }//GEN-LAST:event_eliminarVertice

    private void agregarArista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarArista
        ejecutar(() -> {
            double peso = leerNumero(txtPeso, "peso");
            grafo.agregarArista(txtOrigen.getText(), txtDestino.getText(), peso);
            exito("Ruta agregada: " + txtOrigen.getText().trim() + (grafo.esDirigido() ? " -> " : " <-> ")
                    + txtDestino.getText().trim() + " (peso " + Grafo.formatear(peso) + ").");
            limpiarCamposArista();
        });
    }//GEN-LAST:event_agregarArista

    private void eliminarArista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArista
        ejecutar(() -> {
            grafo.eliminarArista(txtOrigen.getText(), txtDestino.getText());
            exito("Ruta eliminada: " + txtOrigen.getText().trim() + " - " + txtDestino.getText().trim() + ".");
            limpiarCamposArista();
        });
    }//GEN-LAST:event_eliminarArista

    private void mostrarBFS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBFS
        ejecutar(() -> mostrarRecorrido("BFS", grafo.recorridoBFS(txtNodoInicial.getText())));
    }//GEN-LAST:event_mostrarBFS

    private void mostrarDFS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDFS
        ejecutar(() -> mostrarRecorrido("DFS", grafo.recorridoDFS(txtNodoInicial.getText())));
    }//GEN-LAST:event_mostrarDFS

    private void mostrarMatriz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMatriz
        ejecutar(() -> escribir("Matriz de adyacencia (0 = sin ruta):\n" + grafo.matrizComoTexto()));
    }//GEN-LAST:event_mostrarMatriz

    private void evaluarConectividad(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarConectividad
        ejecutar(() -> {
            Grafo.Conectividad resultado = grafo.evaluarConectividad();
            String nota = !grafo.esDirigido() && resultado == Grafo.Conectividad.FUERTEMENTE_CONECTADO
                    ? " (en un grafo no dirigido equivale a conexo)" : "";
            exito("Conectividad del grafo: " + resultado + nota + ".");
        });
    }//GEN-LAST:event_evaluarConectividad

    private void visualizarGrafo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarGrafo
        ejecutar(() -> escribir("Estructura del grafo (lista de adyacencia):\n" + grafo.estructuraComoTexto()));
    }//GEN-LAST:event_visualizarGrafo

    private void destruirGrafo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destruirGrafo
        if (grafo == null) {
            error("Primero debe crear el grafo.");
            return;
        }
        if (!grafo.estaVacio() && !confirmar("¿Eliminar todas las ubicaciones y rutas?")) {
            return;
        }
        grafo.destruir();
        limpiarCampos();
        txtSalida.setText("");
        panelGrafo.repaint();
        actualizarEstado();
        exito("Grafo destruido: quedó sin ubicaciones ni rutas.");
    }//GEN-LAST:event_destruirGrafo

    /** Ejecuta una operación y presenta cualquier error de validación en el área de texto. */
    private void ejecutar(Runnable operacion) {
        if (grafo == null) {
            error("Primero debe crear el grafo.");
            return;
        }
        try {
            operacion.run();
        } catch (GrafoException ex) {
            error(ex.getMessage());
        }
        panelGrafo.repaint();
        actualizarEstado();
    }

    private String obligatorio(JTextField campo, String nombre) {
        if (campo.getText().isBlank()) {
            throw new GrafoException("El campo " + nombre + " es obligatorio.");
        }
        return campo.getText().trim();
    }

    private double leerNumero(JTextField campo, String nombre) {
        String texto = obligatorio(campo, nombre);
        if (!texto.matches("[+-]?\\d+(\\.\\d+)?([eE][+-]?\\d+)?")) {
            throw new GrafoException("El campo " + nombre + " debe ser numérico (ejemplo: 12.5).");
        }
        return Double.parseDouble(texto);
    }

    private void mostrarRecorrido(String nombre, List<String> secuencia) {
        String mensaje = "Recorrido " + nombre + " desde " + secuencia.get(0) + ": "
                + String.join(" -> ", secuencia);
        int faltantes = grafo.numeroVertices() - secuencia.size();
        if (faltantes > 0) {
            mensaje += "  (" + faltantes + " ubicación(es) no alcanzable(s) desde este origen)";
        }
        escribir(mensaje);
    }

    private void limpiarCamposVertice() {
        txtId.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
        txtEstadoRegion.setText("");
        txtCapacidad.setText("");
    }

    private void limpiarCamposArista() {
        txtOrigen.setText("");
        txtDestino.setText("");
        txtPeso.setText("");
    }

    private void limpiarCampos() {
        limpiarCamposVertice();
        limpiarCamposArista();
        txtNodoInicial.setText("");
    }

    private void actualizarEstado() {
        if (grafo == null) {
            lblEstadoGrafo.setText("Estado: grafo sin crear");
            return;
        }
        List<Arista> rutas = grafo.getAristas();
        lblEstadoGrafo.setText("Estado: " + (grafo.esDirigido() ? "dirigido" : "no dirigido")
                + " | Ubicaciones: " + grafo.numeroVertices() + " | Rutas: " + rutas.size());
    }

    private void exito(String mensaje) {
        escribir("[OK] " + mensaje);
    }

    private void error(String mensaje) {
        escribir("[ERROR] " + mensaje);
    }

    private void escribir(String mensaje) {
        txtSalida.append(mensaje + "\n\n");
        txtSalida.setCaretPosition(txtSalida.getDocument().getLength());
    }

    protected boolean confirmar(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new GUIGrafo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArista;
    private javax.swing.JButton btnAgregarVertice;
    private javax.swing.JButton btnBFS;
    private javax.swing.JButton btnBuscarVertice;
    private javax.swing.JButton btnConectividad;
    private javax.swing.JButton btnCrearGrafo;
    private javax.swing.JButton btnDFS;
    private javax.swing.JButton btnDestruirGrafo;
    private javax.swing.JButton btnEliminarArista;
    private javax.swing.JButton btnEliminarVertice;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cmbTipoGrafo;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEstadoGrafo;
    private javax.swing.JLabel lblEstadoRegion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNodoInicial;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoGrafo;
    private javax.swing.JPanel panelArista;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelLienzo;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelVertice;
    private javax.swing.JScrollPane scrollSalida;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEstadoRegion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNodoInicial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
