package com.projetosuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
