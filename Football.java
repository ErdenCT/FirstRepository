     import java.util.ArrayList;
     import java.util.Random;
public class Football {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> teams = new ArrayList<String>();
		teams.add("Liverpool");
		teams.add("Arsenal");
		teams.add("Man City");
		teams.add("Man Utd");
		teams.add("Chelsea");
		teams.add("Tottenham");
		teams.add("Leicester");
		teams.add("Aston Villa");
		System.out.println(teams);
		
		/*	
		for (String love : teams) {
			System.out.println(love);
		}
		
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(89);
		points.add(87);
		points.add(80);
		points.add(79);
		points.add(76);
		points.add(68);
		points.add(67);
		points.add(67);
		for (int puan : points) {
			if (puan > 75) {
			System.out.println(puan);
			}
		}
		*/
	
		Random scoreGenerator = new Random(); 
		
		int score1 = scoreGenerator.nextInt(6) + 0;
		int score2 = scoreGenerator.nextInt(6) + 0;
		int score3 = scoreGenerator.nextInt(6) + 0;
		int score4 = scoreGenerator.nextInt(6) + 0;
		int score5 = scoreGenerator.nextInt(6) + 0;
		int score6 = scoreGenerator.nextInt(6) + 0;

		
        int i =0;
        while (i < teams.size()) {
        	int score0 = scoreGenerator.nextInt(6);
        	System.out.println(teams.get(i) + ":" + score0);
            i += 1;
        }
		
        
	}

}
