package business.control;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import business.model.Usuario;
import infra.InfraException;

public class ManterUsuarioTest {//adicionaUsuario , removeUsuario , logaUsuario, iniciaSistema

	ManterUsuario controle;
	
	@Before
	public void setUp() throws Exception {
		controle = new ManterUsuario();
	}
		
	@After
	public void tearDown() throws Exception {
		controle = null;
	}
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();
	
	@Test
	public void testAdd() throws LoginException, SenhaException, InfraException {
		controle.adicionaUsuario("Usuario","senha123");
		
		controle.adicionaUsuario("Usuari","123senha");
		
	}
	
	@Test
	public void testAddLoginExistente() throws LoginException, SenhaException, InfraException {
			controle.adicionaUsuario("Us","senha123");
			excecaoEsperada.expect(LoginException.class);
			controle.adicionaUsuario("Us","senha123");	
	}
	
	@Test
	public void testAddLoginVaziu() throws LoginException, SenhaException, InfraException {
		excecaoEsperada.expect(LoginException.class);
		controle.adicionaUsuario("", "senha456");
	}
	
	@Test
	public void testAddLoginNumero() throws LoginException, SenhaException, InfraException {
		excecaoEsperada.expect(LoginException.class);
		controle.adicionaUsuario("15Usuario", "senha456");
	}
	
	@Test
	public void testRemove() throws LoginException, SenhaException, InfraException {
		controle.excluirUsuario("Usuario","senha123");
	}
	
	@Test
	public void testRemoveInexistente() throws LoginException, SenhaException, InfraException {
		excecaoEsperada.expect(LoginException.class);
		controle.excluirUsuario("carlos","senha123");
	}

	








}
