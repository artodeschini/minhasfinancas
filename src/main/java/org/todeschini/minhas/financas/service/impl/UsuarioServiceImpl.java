package org.todeschini.minhas.financas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.todeschini.minhas.financas.exception.RegraNegogioException;
import org.todeschini.minhas.financas.model.entity.Usuario;
import org.todeschini.minhas.financas.model.repository.UsuarioRepository;
import org.todeschini.minhas.financas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		return null;
	}

	@Override
	public void validarEmail(String email) {
		if (this.repository.existsByEmail(email)) {
			throw new RegraNegogioException("Já existe um usuario cadastrado com esse amil");
		}
	}

}
