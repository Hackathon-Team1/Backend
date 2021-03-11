package tetris.game.com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tetris.game.com.entity.Score;
import tetris.game.com.service.ScoreService;

@RestController
@CrossOrigin
@RequestMapping("/score")
public class tetrisController {
 @Autowired
 private ScoreService scoreService;
 @GetMapping("/name/{name}")
 public Score getScoreById(@PathVariable String name) {
	 return scoreService.getScoreByName(name);
 }
 @PostMapping("")
	public Score createScore( @RequestBody Score score) {		
	
		return scoreService.createScore(score);
	}
 @GetMapping("")
	public List<Score> getScore() {		
	
		return scoreService.getScores();
	}

}
