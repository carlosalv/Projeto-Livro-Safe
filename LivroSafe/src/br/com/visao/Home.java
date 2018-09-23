/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

import br.com.bean.Livro;
import br.com.dao.LivroDao;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carlos
 */
public final class Home extends javax.swing.JFrame {
     
    /**
     * Creates new form Home
     */
    public  Home() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbl_dados_livros.getModel();
        tbl_dados_livros.setRowSorter(new TableRowSorter(modelo));
        setLocationRelativeTo(null);
        btn_editar.setEnabled(false);
        btn_deletar.setEnabled(false);
        
       
        
       recuperarTabela();
       
    }
    
    
    public void recuperarTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_dados_livros.getModel();
        modelo.setNumRows(0);
        LivroDao livroDao = new LivroDao();
        
        livroDao.listar().stream().forEach((Livro livro) -> {
            modelo.addRow(new Object[]{
                
                
                livro.getCodigoLivro(),
                livro.getNome_livro(),
                livro.getAutor(),
                livro.getImagem_livro(),
                livro.getAno_edicao(),
                livro.getNota_usuario(),
                livro.getResenha(),
                livro.getData_cadastro(),
                    
            });
        });
        
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btn_editar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dados_livros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campo_codigo = new javax.swing.JTextField();
        campo_imagem_capa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campo_nota_usuario = new javax.swing.JTextField();
        campo_nome_livro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campo_resenha = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campo_nome_autor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campo_data_cadastro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_cadastrar1 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        campo_ano_edicao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_editar.setBackground(new java.awt.Color(102, 102, 102));
        btn_editar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("LISTA DE LIVROS");

        tbl_dados_livros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome do Livro", "Autor", "Capa", "Ano de Edição", "Nota de Usuário", "Resenha", "Data de cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_dados_livros.getTableHeader().setReorderingAllowed(false);
        tbl_dados_livros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dados_livrosMouseClicked(evt);
            }
        });
        tbl_dados_livros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_dados_livrosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_dados_livrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dados_livros);
        if (tbl_dados_livros.getColumnModel().getColumnCount() > 0) {
            tbl_dados_livros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_dados_livros.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_dados_livros.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_dados_livros.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbl_dados_livros.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbl_dados_livros.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbl_dados_livros.getColumnModel().getColumn(6).setPreferredWidth(200);
            tbl_dados_livros.getColumnModel().getColumn(7).setResizable(false);
            tbl_dados_livros.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Aviso: Para DELETAR E/OU EDITAR um item da lista clicar sobre o mesmo afim de habilitar os botões.");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/visao/home.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Livros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel13.setText("CAPA DO LIVRO");

        jLabel14.setText("ANO DE EDIÇÃO");

        jLabel15.setText("NOME DO LIVRO");

        campo_resenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_resenhaActionPerformed(evt);
            }
        });

        jLabel16.setText("NOTAS DE USUARIO");

        jLabel17.setText("RESENHA");

        jLabel18.setText("*PREENCHA TODOS OS CAMPOS");

        jLabel19.setText("AUTOR");

        campo_data_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_data_cadastroActionPerformed(evt);
            }
        });

        jLabel20.setText("CODIGO");

        jLabel21.setText("DATA DE CADASTRO");

        btn_cadastrar1.setBackground(new java.awt.Color(0, 153, 51));
        btn_cadastrar1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar1.setText("SALVAR");
        btn_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar1ActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("LIMPAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        btn_cancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_nome_autor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_nome_livro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campo_data_cadastro)
                                .addGap(88, 88, 88)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)
                                    .addComponent(campo_resenha, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campo_ano_edicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(campo_nota_usuario, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campo_imagem_capa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(btn_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_resenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nome_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nota_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_ano_edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campo_imagem_capa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_data_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Livro Safe");

        btn_deletar.setBackground(new java.awt.Color(204, 0, 51));
        btn_deletar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_deletar.setForeground(new java.awt.Color(255, 255, 255));
        btn_deletar.setText("DELETAR");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(696, 696, 696)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(774, 774, 774))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(571, 571, 571)
                        .addComponent(jScrollPane8)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(8, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar1ActionPerformed
           
        
            Livro livro = new Livro();
            LivroDao dao = new LivroDao();
                     
        livro.setCodigoLivro(Integer.parseInt(campo_codigo.getText()));
        livro.setNome_livro(campo_nome_livro.getText());
        livro.setAutor(campo_nome_autor.getText());
        livro.setImagem_livro(campo_imagem_capa.getText());
        livro.setAno_edicao(campo_ano_edicao.getText());
        livro.setNota_usuario(campo_nota_usuario.getText());
        livro.setResenha(campo_resenha.getText());
        livro.setData_cadastro(campo_data_cadastro.getText());
                  
        if(  campo_codigo.getText() == null            || campo_nome_livro.getText().equals("")
          || campo_nome_autor.getText().equals("")  || campo_imagem_capa.getText().equals("")
          || campo_ano_edicao.getText().equals("")  || campo_nota_usuario.getText().equals("")
          || campo_resenha.getText().equals("")     || campo_data_cadastro.getText().equals("")){
      
                       
                       JOptionPane.showMessageDialog(null, "Preencha todos os campos ");
        }else if((int)tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 0) != Integer.parseInt(campo_codigo.getText())){ 
          
           dao.cadastrarNovo(livro); 
                   recuperarTabela();
        campo_codigo.setText("");
        campo_nome_livro.setText("");
        campo_nome_autor.setText("");
        campo_imagem_capa.setText("");
        campo_ano_edicao.setText("");
        campo_nota_usuario.setText("");
        campo_resenha.setText("");
        campo_data_cadastro.setText("");
        
                       
                       
    }else{
              JOptionPane.showMessageDialog(null, "Existe campos com valores iguais ");
              
               
                 
              
          
          }
                   
                  
    
        
    
                  
    }//GEN-LAST:event_btn_cadastrar1ActionPerformed
    
    private void campo_resenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_resenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_resenhaActionPerformed

    private void tbl_dados_livrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_dados_livrosKeyPressed
              
             
               
    }//GEN-LAST:event_tbl_dados_livrosKeyPressed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        
        if(tbl_dados_livros.getSelectedRow() != -1){
        Livro livro = new Livro();
        LivroDao dao = new LivroDao();
       
        livro.setCodigoLivro(Integer.parseInt(campo_codigo.getText()));
        livro.setNome_livro(campo_nome_livro.getText());
        livro.setAutor(campo_nome_autor.getText());
        livro.setImagem_livro(campo_imagem_capa.getText());
        livro.setAno_edicao(campo_ano_edicao.getText());
        livro.setNota_usuario(campo_nota_usuario.getText());
        livro.setResenha(campo_resenha.getText());
        livro.setData_cadastro(campo_data_cadastro.getText());
        livro.setCodigoLivro((int)tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 0));
        dao.atualizar(livro);
        
        
        campo_codigo.setText("");
        campo_nome_livro.setText("");
        campo_nome_autor.setText("");
        campo_imagem_capa.setText("");
        campo_data_cadastro.setText("");
        campo_nota_usuario.setText("");
        campo_resenha.setText("");
        campo_ano_edicao.setText("");
         recuperarTabela();
        
        } 
        else{
            JOptionPane.showMessageDialog(null, "Selecione um item para atualizar");
        }
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void tbl_dados_livrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dados_livrosMouseClicked
                  campo_codigo.getText();
                  campo_nome_livro.getText();
                  campo_nome_autor.getText();
                  campo_imagem_capa.getText();
                  campo_ano_edicao.getText();
                  campo_nota_usuario.getText();
                  campo_resenha.getText();
                  campo_data_cadastro.getText();
                 btn_editar.setEnabled(true);
                 btn_deletar.setEnabled(true);
                 campo_codigo.setEnabled(false);
                 
                  if(tbl_dados_livros.getSelectedRow() != -1){
            campo_codigo.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 0).toString());
            campo_nome_livro.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 1).toString());
            campo_nome_autor.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 2).toString());
            campo_imagem_capa.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 3).toString());
            campo_ano_edicao.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 4).toString());
            campo_nota_usuario.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 5).toString());
            campo_resenha.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 6).toString());
            campo_data_cadastro.setText(tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 7).toString());
        
          
        
    } 
             
    }//GEN-LAST:event_tbl_dados_livrosMouseClicked

    private void tbl_dados_livrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_dados_livrosKeyReleased
       
       
        
        
    }//GEN-LAST:event_tbl_dados_livrosKeyReleased

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
           
        if(tbl_dados_livros.getSelectedRow() != -1){
        Livro livro = new Livro();
        LivroDao dao = new LivroDao();
       
        livro.setCodigoLivro(Integer.parseInt(campo_codigo.getText()));
        livro.setNome_livro(campo_nome_livro.getText());
        livro.setAutor(campo_nome_autor.getText());
        livro.setImagem_livro(campo_imagem_capa.getText());
        livro.setAno_edicao(campo_ano_edicao.getText());
        livro.setNota_usuario(campo_nota_usuario.getText());
        livro.setResenha(campo_resenha.getText());
        livro.setData_cadastro(campo_data_cadastro.getText());
        livro.setCodigoLivro((int)tbl_dados_livros.getValueAt(tbl_dados_livros.getSelectedRow(), 0));
        dao.deletar(livro);
        campo_codigo.setEnabled(true);
        
        
        campo_codigo.setText("");
        campo_nome_livro.setText("");
        campo_nome_autor.setText("");
        campo_imagem_capa.setText("");
        campo_ano_edicao.setText("");
        campo_nota_usuario.setText("");
        campo_resenha.setText("");
        campo_data_cadastro.setText("");
        
          recuperarTabela();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deletarActionPerformed
        else{
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir");
        }
    }
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       
        
        if(tbl_dados_livros.getSelectedRow() != -1){
        
        campo_codigo.setText("");
        campo_nome_livro.setText("");
        campo_nome_autor.setText("");
        campo_imagem_capa.setText("");
        campo_ano_edicao.setText("");
        campo_nota_usuario.setText("");
        campo_resenha.setText("");
        campo_data_cadastro.setText("");
        campo_codigo.setEnabled(true);
        btn_deletar.setEnabled(false);
        btn_editar.setEnabled(false);
        
    }
       
        
            
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_cancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cancelarKeyPressed
        
    }//GEN-LAST:event_btn_cancelarKeyPressed

    private void campo_data_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_data_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_data_cadastroActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                 
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar1;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JToggleButton btn_editar;
    private javax.swing.JTextField campo_ano_edicao;
    private javax.swing.JTextField campo_codigo;
    private javax.swing.JTextField campo_data_cadastro;
    private javax.swing.JTextField campo_imagem_capa;
    private javax.swing.JTextField campo_nome_autor;
    private javax.swing.JTextField campo_nome_livro;
    private javax.swing.JTextField campo_nota_usuario;
    private javax.swing.JTextField campo_resenha;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_dados_livros;
    // End of variables declaration//GEN-END:variables
}

