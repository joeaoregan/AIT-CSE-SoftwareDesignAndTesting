package ait.java.wk9.ArrayExample;

public class Prisoner {
	private String inmateNumber;
	private String name;
	private double sentence;
	
	public Prisoner() {
		
	}
	
	public Prisoner(String inmateNumber, String name, double sentence) {
		this.inmateNumber = inmateNumber;
		this.name = name;
		this.sentence = sentence;
	}

	public String getInmateNumber() {
		return inmateNumber;
	}

	public void setInmateNumber(String inmateNumber) {
		this.inmateNumber = inmateNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSentence() {
		return sentence;
	}

	public void setSentence(double sentence) {
		this.sentence = sentence;
	}
	
	@Override
	public String toString() {
		return "Prisoner{name="+name+", inmateNumber="+inmateNumber+", senctence="+sentence+"}";
	}
}
