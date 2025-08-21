package br.com.sistemacomercial.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;



public class TelaCadastroProduto extends JFrame {



    private JTextField txtNome, txtPreco;

    private JButton btnSalvar, btnEditar, btnExcluir;

    private JTable tabela;

    private DefaultTableModel modelo;



    public TelaCadastroProduto() {

        configurarJanela();

        inicializarComponentes();

        configurarEventos();

    }



    private void configurarJanela() {

        setTitle("Cadastro de Produtos");

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

    }



    private void inicializarComponentes() {

        JPanel painelTopo = new JPanel(new FlowLayout());



        painelTopo.add(new JLabel("Nome:"));

        txtNome = new JTextField(15);

        painelTopo.add(txtNome);



        painelTopo.add(new JLabel("Preço:"));

        txtPreco = new JTextField(8);

        painelTopo.add(txtPreco);



        btnSalvar = new JButton("Salvar");

        btnEditar = new JButton("Editar");

        btnExcluir = new JButton("Excluir");



        painelTopo.add(btnSalvar);

        painelTopo.add(btnEditar);

        painelTopo.add(btnExcluir);



        modelo = new DefaultTableModel(new Object[]{"Nome", "Preço"}, 0);

        tabela = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabela);



        add(painelTopo, BorderLayout.NORTH);

        add(scroll, BorderLayout.CENTER);

    }



    private void configurarEventos() {

        btnSalvar.addActionListener(e -> salvarProduto());

        btnEditar.addActionListener(e -> editarProduto());

        btnExcluir.addActionListener(e -> excluirProduto());

    }



    private void salvarProduto() {

        String nome = txtNome.getText().trim();

        String preco = txtPreco.getText().trim();



        if (!nome.isEmpty() && !preco.isEmpty()) {

            modelo.addRow(new Object[]{nome, preco});

            limparCampos();

        } else {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");

        }

    }

    private void editarProduto() {

        int linha = tabela.getSelectedRow();



        if (linha != -1) {

            String nome = txtNome.getText().trim();

            String preco = txtPreco.getText().trim();



            if (!nome.isEmpty() && !preco.isEmpty()) {

                modelo.setValueAt(nome, linha, 0);

                modelo.setValueAt(preco, linha, 1);

                limparCampos();

            } else {

                JOptionPane.showMessageDialog(this, "Preencha os campos antes de editar!");

            }

        } else {

            JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");

        }

    }



    private void excluirProduto() {

        int linha = tabela.getSelectedRow();



        if (linha != -1) {

            modelo.removeRow(linha);

        } else {

            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir!");

        }

    }



    private void limparCampos() {

        txtNome.setText("");

        txtPreco.setText("");

        txtNome.requestFocus();

    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new TelaCadastroProduto().setVisible(true));

    }

}