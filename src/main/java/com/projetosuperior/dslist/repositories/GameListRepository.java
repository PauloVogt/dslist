package com.projetosuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
