package ait.sdt.wk7.BoardingKennel;

public class Pet {
	private String petType;
	private Boolean vacinationStatus;
	private String petName;

	public Pet(String petType, Boolean vaccinationStatus, String petName) {
		this.petType = petType;
		this.vacinationStatus = vaccinationStatus;
		this.petName = petName;
	}
	
	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public Boolean getVacinationStatus() {
		return vacinationStatus;
	}

	public void setVaccinationStatus(Boolean vaccinationStatus) {
		this.vacinationStatus = vaccinationStatus;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
}
