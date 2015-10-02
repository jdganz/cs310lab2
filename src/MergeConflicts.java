

// beep boop diddly doop
public class MergeConflicts {
	private String name;
	private boolean bool;
	
	public MergeConflicts(){
		name = "name";
		bool = true;
	}

	public MergeConflicts(String name, boolean bool){
		this.name = name;
		this.bool = bool;
	}
	
	//added comment
	public String getName(){
		return "conflict";
	}
	
	public boolean getBool(){
		return true;
	}

	public void getNothing(){}
	
	
}
