package tetris.game.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tetris.game.com.entity.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer>{
	Score findByName(String name);
	
}
