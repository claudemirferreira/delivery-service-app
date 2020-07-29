package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

}