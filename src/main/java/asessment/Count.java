package asessment;

public class Count {

	private int occurences;
	
	public Count(){
		occurences = 0;
	}
	
	public void increase(){
		occurences++;
	}
	
	public int getCount(){
		return occurences;
	}
}
