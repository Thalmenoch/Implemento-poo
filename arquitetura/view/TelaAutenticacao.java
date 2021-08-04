package arquitetura.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import arquitetura.controller.CtrlLogin;
import arquitetura.model.LoginBean;

public class TelaAutenticacao extends JFrame {
	
	// Rótulos
	private JLabel lbUser;
	private JLabel lbPassword;
	// Campos de texto
	private JTextField tfUser;
	private JPasswordField tfPassword;
	// Botões
	private JButton btLogin;
	private JButton btClose;
	
	// Construtor
	public TelaAutenticacao() {
		setTitle("Autenticação");
		setSize(400,135);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	// Inicialização de componentes da tela
	private void initComponents() {
		// Configurar a janela
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		// Criação dos componentes
		lbUser = new JLabel("Login:");
		lbPassword = new JLabel("Senha:");
		tfUser = new JTextField();
		tfPassword = new JPasswordField();
		btLogin = new JButton("Login");
		btClose = new JButton("Sair");
		// Configurar posições dos componentes
		lbUser.setBounds(10, 10, 70, 20);
		lbPassword.setBounds(10, 35, 70, 20);
		tfUser.setBounds(80, 9, 300, 20);
		tfPassword.setBounds(80, 34, 300, 20);
		btLogin.setBounds(70, 65, 125, 20);
		btClose.setBounds(210, 65, 125, 20);
		// Adicionar componentes na janela
		add(lbUser); add(lbPassword); 
		add(tfUser); add(tfPassword);
		add(btLogin); add(btClose);
		// Configurar eventos
		configureEvents();
	}
	
	// Configuração dos eventos da tela
	private void configureEvents() {
		tfUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfPassword.requestFocus();
			}
		});
		tfPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btLogin.doClick();
			}
		});
		btClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LoginBean loginBean = new LoginBean(
							tfUser.getText(),
							new String(tfPassword.getPassword()));
					boolean result = CtrlLogin.login(loginBean);
					if (result)
						JOptionPane.showMessageDialog(null,
								"Login realizado com sucesso!",
								getTitle(), JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,
								"Usuário e/ou senha não encontrados!",
								getTitle(), JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Não foi possível realizar o login: "+e1.getMessage(),
							getTitle(), JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		new TelaAutenticacao();
	}
}
