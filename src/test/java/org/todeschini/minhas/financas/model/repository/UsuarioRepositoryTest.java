package org.todeschini.minhas.financas.model.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.todeschini.minhas.financas.model.entity.Usuario;

//@SpringBootTest
//@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UsuarioRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	

	@Autowired
	private UsuarioRepository repository;

	@Test
	public void testExistsByEmail() {
		// given
		String email = "artur@org.todeschini";
		Usuario usuario = Usuario.builder().nome("Artur").email(email).senha("mypass").build();
//		repository.saveAndFlush(usuario);
		entityManager.persist(usuario);

		// when
		boolean exist = repository.existsByEmail(email);
		
		//then
		assertTrue(exist);
	}

}
