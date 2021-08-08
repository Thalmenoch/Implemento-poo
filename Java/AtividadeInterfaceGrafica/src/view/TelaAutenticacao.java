package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.CtrlLogin;
import model.LoginBean;

public class TelaAutenticacao extends JFrame {

	private JLabel labelUsuario;
	private JLabel labelSenha;
	private JTextField textUsuario;
	private JPasswordField textSenha;
	private JButton buttonLogin;
	private JButton buttonSair;

	public TelaAutenticacao() {
		setTitle("Autenticação");
		setSize(400, 135);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
		setVisible(true);
		configurarEventos();
	}

	private void iniciarComponentes() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		labelUsuario = new JLabel("Login:");
		labelSenha = new JLabel("Senha:");
		textUsuario = new JTextField();
		textSenha = new JPasswordField();
		buttonLogin = new JButton("Login");
		buttonSair = new JButton("Sair");

		labelUsuario.setBounds(11, 10, 70, 20);
		labelSenha.setBounds(10, 35, 70, 20);
		textUsuario.setBounds(80, 9, 300, 20);
		textSenha.setBounds(80, 34, 300, 20);
		buttonLogin.setBounds(70, 65, 125, 20);
		buttonSair.setBounds(210, 65, 125, 20);

		add(labelUsuario);
		add(labelSenha);
		add(textUsuario);
		add(textSenha);
		add(buttonLogin);
		add(buttonSair);
	}

	private void configurarEventos() {
		textUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				textSenha.requestFocus();
			}
		});
		textSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				buttonLogin.doClick();
			}
		});
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				dispose();
			}
		});
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				try {
					LoginBean loginBean = new LoginBean(textUsuario.getText(), new String(textSenha.getPassword()));
					boolean loginValidado = CtrlLogin.login(loginBean);
					if (loginValidado) {
						JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", getTitle(),
								JOptionPane.INFORMATION_MESSAGE);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Usuário e/ou senha não encontrados!", getTitle(),
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível realizar o login: " + e.getMessage(),
							getTitle(), JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	public static void main(String[] args) {
		new TelaAutenticacao();
	}

}
