package tetris.game.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Score")
public class Score {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String name;
	    private int score;
	    public Score() {
	    }
	    
		public Score( String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}

		@Override
		public String toString() {
			return "Score [id=" + id + ", name=" + name + ", score=" + score + "]";
		}
		
	    
}
