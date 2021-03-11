package tetris.game.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tetris.game.com.entity.Score;
import tetris.game.com.repository.ScoreRepository;

@Service
public class ScoreService {
 @Autowired
 private ScoreRepository scoreRepository;
 public Score getScoreByName(String name){
	 return scoreRepository.findByName(name);
 }
 public List<Score> getScores(){
	 List <Score> list =(List<Score>) scoreRepository.findAll();
		return  list;
	}
	
	public Score createScore(Score score) {
		return scoreRepository.save(score);
	}
	
	public Score getScoreById(int id) {
		return scoreRepository.findById(id).get();
	}
}
