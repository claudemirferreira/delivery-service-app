package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}