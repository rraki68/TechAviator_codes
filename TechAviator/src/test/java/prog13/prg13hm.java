package prog13;


public class prg13hm {
	private String name;
	private int math;
	private int eng;
	private int sci;
	
	
	public prg13hm(String name, int math,int eng,int sci)
	{
		this.name = name;
		
		this.math = math;
		
		this.sci = sci;
		
		this.eng = eng;	
		
	}
	

		
public String getname(){
		
		return name;
	}

	public int  getenglish_marks(){
		return eng;
	}
	
	public int  getmath_marks(){
		return math;
	}
	
	public int  getscience_marks(){
		return sci;
	}

}
