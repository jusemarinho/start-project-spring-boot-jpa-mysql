package br.com.josemarinho.spring_jpa_mysql.repository;

import br.com.josemarinho.spring_jpa_mysql.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> { }
