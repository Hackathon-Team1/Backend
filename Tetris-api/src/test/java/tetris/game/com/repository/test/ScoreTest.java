package tetris.game.com.repository.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tetris.game.com.entity.Score;
import tetris.game.com.repository.ScoreRepository;

class ScoreTest {

	 @Autowired
	    private ScoreRepository scoreRepository;
	    @Before(value = "")
	    public void setUp() throws Exception {
	        Score user1= new Score("Alice", 23);
	        Score user2= new Score("Bob", 38);
	        //save user, verify has ID value after save
	        assertNull(user1.getId());
	        assertNull(user2.getId());//null before save
	        this.scoreRepository.save(user1);
	        this.scoreRepository.save(user2);
	        assertNotNull(user1.getId());
	        assertNotNull(user2.getId());
	    }

	@Test
	 public void testFetchData(){
        /*Test data retrieval*/
        Score userA = scoreRepository.findByName("Bob");
        assertNotNull(userA);
        assertEquals(38, userA.getScore());
        /*Get all products, list should only have two*/
        Iterable<Score> users = scoreRepository.findAll();
        int count = 0;
        for(Score p : users){
            count++;
        }
        assertEquals(count, 2);
    }

}
