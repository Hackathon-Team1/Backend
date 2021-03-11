package tetris.game.com.repository;

import org.springframework.data.repository.CrudRepository;

import tetris.game.com.entity.Score;

public interface ScoreRepository extends CrudRepository<Score, Integer>{
	Score findByName(String name);
}
