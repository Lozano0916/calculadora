
package calculadora;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @lozano0916
 */
public class calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    String cadenaNumeros = "";
    String operacion = "nula";
    double primerNumero, resultado;
    boolean activado = true;
    boolean punto = true;

    public calculadora() {
        initComponents();
        setIconImage(getIconImage());

    }

    //icono calculadora
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero1 = new javax.swing.JButton();
        Numero2 = new javax.swing.JButton();
        Numero3 = new javax.swing.JButton();
        panel = new javax.swing.JLabel();
        signomas = new javax.swing.JButton();
        signomenos = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        signIoigual = new javax.swing.JButton();
        panelMuestra = new javax.swing.JLabel();
        signomultiplicar = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        Borrartodo = new javax.swing.JButton();
        signodividir = new javax.swing.JButton();
        signopunto = new javax.swing.JButton();
        masomenosnega = new javax.swing.JButton();
        Borrarletra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Botonraiz = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Trigonometria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero1.setBackground(new java.awt.Color(48, 52, 49));
        numero1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero1.setForeground(new java.awt.Color(255, 255, 255));
        numero1.setText("1");
        numero1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numero1KeyPressed(evt);
            }
        });
        getContentPane().add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 248, 71, 56));

        Numero2.setBackground(new java.awt.Color(48, 52, 49));
        Numero2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Numero2.setForeground(new java.awt.Color(255, 255, 255));
        Numero2.setText("2");
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 248, 71, 56));

        Numero3.setBackground(new java.awt.Color(48, 52, 49));
        Numero3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Numero3.setForeground(new java.awt.Color(255, 255, 255));
        Numero3.setText("3");
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });
        getContentPane().add(Numero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 248, 71, 56));

        panel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, 302, 88));

        signomas.setBackground(new java.awt.Color(48, 52, 49));
        signomas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signomas.setForeground(new java.awt.Color(255, 255, 255));
        signomas.setText("+");
        signomas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                signomasStateChanged(evt);
            }
        });
        signomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signomasActionPerformed(evt);
            }
        });
        getContentPane().add(signomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 306, 71, 56));

        signomenos.setBackground(new java.awt.Color(48, 52, 49));
        signomenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signomenos.setForeground(new java.awt.Color(255, 255, 255));
        signomenos.setText("-");
        signomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signomenosActionPerformed(evt);
            }
        });
        getContentPane().add(signomenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 367, 71, 56));

        numero4.setBackground(new java.awt.Color(48, 52, 49));
        numero4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero4.setForeground(new java.awt.Color(255, 255, 255));
        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        getContentPane().add(numero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 306, 71, 56));

        numero5.setBackground(new java.awt.Color(48, 52, 49));
        numero5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero5.setForeground(new java.awt.Color(255, 255, 255));
        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });
        getContentPane().add(numero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 306, 71, 56));

        numero6.setBackground(new java.awt.Color(48, 52, 49));
        numero6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero6.setForeground(new java.awt.Color(255, 255, 255));
        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });
        getContentPane().add(numero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 306, 71, 56));

        numero7.setBackground(new java.awt.Color(48, 52, 49));
        numero7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero7.setForeground(new java.awt.Color(255, 255, 255));
        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        getContentPane().add(numero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 367, 71, 56));

        numero8.setBackground(new java.awt.Color(48, 52, 49));
        numero8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero8.setForeground(new java.awt.Color(255, 255, 255));
        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });
        getContentPane().add(numero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 367, 71, 56));

        numero9.setBackground(new java.awt.Color(48, 52, 49));
        numero9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero9.setForeground(new java.awt.Color(255, 255, 255));
        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });
        getContentPane().add(numero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 367, 71, 56));

        signIoigual.setBackground(new java.awt.Color(102, 204, 255));
        signIoigual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signIoigual.setText("=");
        signIoigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIoigualActionPerformed(evt);
            }
        });
        getContentPane().add(signIoigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 426, 71, 56));

        panelMuestra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelMuestra.setForeground(new java.awt.Color(255, 255, 255));
        panelMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(panelMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 6, 186, 39));

        signomultiplicar.setBackground(new java.awt.Color(48, 52, 49));
        signomultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signomultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        signomultiplicar.setText("X");
        signomultiplicar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                signomultiplicarStateChanged(evt);
            }
        });
        signomultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signomultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(signomultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 248, 71, 56));

        numero0.setBackground(new java.awt.Color(48, 52, 49));
        numero0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero0.setForeground(new java.awt.Color(255, 255, 255));
        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });
        getContentPane().add(numero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 426, 71, 56));

        Borrartodo.setBackground(new java.awt.Color(48, 52, 49));
        Borrartodo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Borrartodo.setForeground(new java.awt.Color(255, 255, 255));
        Borrartodo.setText("CE");
        Borrartodo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BorrartodoStateChanged(evt);
            }
        });
        Borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrartodoActionPerformed(evt);
            }
        });
        getContentPane().add(Borrartodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 186, 71, 56));

        signodividir.setBackground(new java.awt.Color(48, 52, 49));
        signodividir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signodividir.setForeground(new java.awt.Color(255, 255, 255));
        signodividir.setText("÷");
        signodividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signodividirActionPerformed(evt);
            }
        });
        getContentPane().add(signodividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 186, 71, 56));

        signopunto.setBackground(new java.awt.Color(48, 52, 49));
        signopunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signopunto.setForeground(new java.awt.Color(255, 255, 255));
        signopunto.setText(".");
        signopunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signopuntoActionPerformed(evt);
            }
        });
        getContentPane().add(signopunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 426, 71, 56));

        masomenosnega.setBackground(new java.awt.Color(48, 52, 49));
        masomenosnega.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        masomenosnega.setForeground(new java.awt.Color(255, 255, 255));
        masomenosnega.setText("+/-");
        masomenosnega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masomenosnegaActionPerformed(evt);
            }
        });
        getContentPane().add(masomenosnega, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 426, 71, 56));

        Borrarletra.setBackground(new java.awt.Color(48, 52, 49));
        Borrarletra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Borrarletra.setForeground(new java.awt.Color(255, 255, 255));
        Borrarletra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/image.png"))); // NOI18N
        Borrarletra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BorrarletraStateChanged(evt);
            }
        });
        Borrarletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarletraActionPerformed(evt);
            }
        });
        getContentPane().add(Borrarletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 186, 71, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estándar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 110, 39));

        Botonraiz.setBackground(new java.awt.Color(48, 52, 49));
        Botonraiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Botonraiz.setForeground(new java.awt.Color(255, 255, 255));
        Botonraiz.setText("√");
        Botonraiz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotonraizStateChanged(evt);
            }
        });
        Botonraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonraizActionPerformed(evt);
            }
        });
        getContentPane().add(Botonraiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 186, 71, 56));

        jPanel1.setBackground(new java.awt.Color(29, 34, 31));

        Trigonometria.setBackground(new java.awt.Color(48, 52, 49));
        Trigonometria.setForeground(new java.awt.Color(255, 255, 255));
        Trigonometria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trigonometria", "sin", "cos", "X^2", "tan", "pi" }));
        Trigonometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrigonometriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Trigonometria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Trigonometria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // boton del numero 1:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora

    }//GEN-LAST:event_numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        // boton del numero 2:

        if (panel.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
        // boton del numero 3:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_Numero3ActionPerformed

    private void signomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signomasActionPerformed
        // boton del signo mas:
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText(cadenaNumeros + "+");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;

        }
    }//GEN-LAST:event_signomasActionPerformed

    private void signomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signomenosActionPerformed
        //Boton sigo menos:
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText(cadenaNumeros + " -");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
            punto = true;

        }
    }//GEN-LAST:event_signomenosActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        // Boton numero 4:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        //Boton numero 5:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        //Boton numero 6:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora

    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        //Boton numero 7:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        //Boton numero 8:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        //Boton numero 9:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero9ActionPerformed

    private void signomasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_signomasStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_signomasStateChanged

    private void signIoigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIoigualActionPerformed
        // Boton igual:
        double segundoNumero;
        if (operacion.equals("nula")) {
            panel.setText(cadenaNumeros);
        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            panel.setText(String.format("% .0f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convertir a string
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            panel.setText(String.format("% .0f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convertir a string
            operacion = "nula";
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            panel.setText(String.format("% .0f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convertir a string
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                panel.setText("Error");
            } else {
                resultado = primerNumero / segundoNumero;
                panel.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);//convertir a string
                operacion = "nula";
            }
        }
        panelMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_signIoigualActionPerformed

    private void panelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAncestorAdded

    private void signomultiplicarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_signomultiplicarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_signomultiplicarStateChanged

    private void signomultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signomultiplicarActionPerformed
        //Signo multiplicar:
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText(cadenaNumeros + " x");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;

        }
    }//GEN-LAST:event_signomultiplicarActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
        // Numero 0:
        if (panel.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        panel.setText(cadenaNumeros);
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_numero0ActionPerformed

    private void BorrartodoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BorrartodoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrartodoStateChanged

    private void BorrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrartodoActionPerformed
        //Borrar todo:
        panel.setText("");
        panelMuestra.setText("");
        cadenaNumeros = "";
        operacion = "nula";
        punto = true;
        activado = true;//si es true voy a poder usar la calculadora
    }//GEN-LAST:event_BorrartodoActionPerformed

    private void signodividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signodividirActionPerformed
        //Signo dividir:
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText(cadenaNumeros + " ÷");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false;
        }
    }//GEN-LAST:event_signodividirActionPerformed

    private void signopuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signopuntoActionPerformed
        //Signo punto:
        if (punto == true) {
            if (cadenaNumeros.equals("")) {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
            panel.setText(cadenaNumeros);
        }
        punto = false;
        activado = true;
    }//GEN-LAST:event_signopuntoActionPerformed

    private void masomenosnegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masomenosnegaActionPerformed
        // Mas o menos negativo:
        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        panel.setText(cadenaNumeros);
    }//GEN-LAST:event_masomenosnegaActionPerformed

    private void BorrarletraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BorrarletraStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarletraStateChanged

    private void BorrarletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarletraActionPerformed
        // Borrar una sola letra:
        int tamanio = cadenaNumeros.length();
        if (tamanio > 0) {
            if (tamanio == 1) {
                cadenaNumeros = "";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            }
            panel.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_BorrarletraActionPerformed

    private void BotonraizStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotonraizStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonraizStateChanged

    private void BotonraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonraizActionPerformed
        //Boton para raiz:
        primerNumero = Double.parseDouble(cadenaNumeros);
        panelMuestra.setText("√ (" + cadenaNumeros + ")");
        resultado = Math.sqrt(primerNumero);
        panel.setText(String.format("% .2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
    }//GEN-LAST:event_BotonraizActionPerformed

    private void numero1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1KeyPressed

    private void TrigonometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrigonometriaActionPerformed
        // TODO add your handling code here:
        String menu = Trigonometria.getSelectedItem().toString();
        if (menu.equals("sin")) {
            primerNumero = Integer.parseInt(cadenaNumeros);
            primerNumero=Math.toRadians(primerNumero); 
            panelMuestra.setText("sin (" + cadenaNumeros + ")");
            resultado = Math.sin(primerNumero);
            panel.setText(String.format("% .3f", resultado));
            cadenaNumeros = String.valueOf(resultado);
        } else if (menu.equals("cos")) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            primerNumero=Math.toRadians(primerNumero); 
            panelMuestra.setText("cos (" + cadenaNumeros + ")");
            resultado = Math.cos(primerNumero);
            panel.setText(String.format("% .3f", resultado));
            cadenaNumeros = String.valueOf(resultado);
        } else if (menu.equals("X^2")) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText(cadenaNumeros + "X^2");
            resultado = Math.pow(primerNumero, 2);
            panel.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
        } else if (menu.equals("tan")) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            primerNumero=Math.toRadians(primerNumero); 
            panelMuestra.setText("tan (" + cadenaNumeros + ")");
            resultado = Math.tan(primerNumero);
            panel.setText(String.format("% .3f", resultado));
            cadenaNumeros = String.valueOf(resultado);
        }else if (menu.equals("pi")) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            panelMuestra.setText("pi (" + cadenaNumeros + ")");
            resultado = Math.PI * (primerNumero);
            panel.setText(String.format("% .3f", resultado));
            cadenaNumeros = String.valueOf(resultado);
 }
    }//GEN-LAST:event_TrigonometriaActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrarletra;
    private javax.swing.JButton Borrartodo;
    private javax.swing.JButton Botonraiz;
    private javax.swing.JButton Numero2;
    private javax.swing.JButton Numero3;
    private javax.swing.JComboBox<String> Trigonometria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton masomenosnega;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JLabel panel;
    private javax.swing.JLabel panelMuestra;
    private javax.swing.JButton signIoigual;
    private javax.swing.JButton signodividir;
    private javax.swing.JButton signomas;
    private javax.swing.JButton signomenos;
    private javax.swing.JButton signomultiplicar;
    private javax.swing.JButton signopunto;
    // End of variables declaration//GEN-END:variables
}
