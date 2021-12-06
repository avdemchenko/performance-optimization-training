package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "important_hiring")
public class ImportantHiring {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String learnedHiring;
	
	@Column
    private String importantHiringAlgorithms;
	
	@Column
    private String importantHiringTechExp;
	
	@Column
    private String importantHiringCommunication;
	
	@Column
    private String importantHiringOpenSource;
	
	@Column
    private String importantHiringPMExp;
	
	@Column
    private String importantHiringCompanies;
	
	@Column
    private String importantHiringTitles;
	
	@Column
    private String importantHiringEducation;
	
	@Column
    private String importantHiringRep;
	
	@Column
    private String importantHiringGettingThingsDone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLearnedHiring() {
		return learnedHiring;
	}

	public void setLearnedHiring(String learnedHiring) {
		this.learnedHiring = learnedHiring;
	}

	public String getImportantHiringAlgorithms() {
		return importantHiringAlgorithms;
	}

	public void setImportantHiringAlgorithms(String importantHiringAlgorithms) {
		this.importantHiringAlgorithms = importantHiringAlgorithms;
	}

	public String getImportantHiringTechExp() {
		return importantHiringTechExp;
	}

	public void setImportantHiringTechExp(String importantHiringTechExp) {
		this.importantHiringTechExp = importantHiringTechExp;
	}

	public String getImportantHiringCommunication() {
		return importantHiringCommunication;
	}

	public void setImportantHiringCommunication(String importantHiringCommunication) {
		this.importantHiringCommunication = importantHiringCommunication;
	}

	public String getImportantHiringOpenSource() {
		return importantHiringOpenSource;
	}

	public void setImportantHiringOpenSource(String importantHiringOpenSource) {
		this.importantHiringOpenSource = importantHiringOpenSource;
	}

	public String getImportantHiringPMExp() {
		return importantHiringPMExp;
	}

	public void setImportantHiringPMExp(String importantHiringPMExp) {
		this.importantHiringPMExp = importantHiringPMExp;
	}

	public String getImportantHiringCompanies() {
		return importantHiringCompanies;
	}

	public void setImportantHiringCompanies(String importantHiringCompanies) {
		this.importantHiringCompanies = importantHiringCompanies;
	}

	public String getImportantHiringTitles() {
		return importantHiringTitles;
	}

	public void setImportantHiringTitles(String importantHiringTitles) {
		this.importantHiringTitles = importantHiringTitles;
	}

	public String getImportantHiringEducation() {
		return importantHiringEducation;
	}

	public void setImportantHiringEducation(String importantHiringEducation) {
		this.importantHiringEducation = importantHiringEducation;
	}

	public String getImportantHiringRep() {
		return importantHiringRep;
	}

	public void setImportantHiringRep(String importantHiringRep) {
		this.importantHiringRep = importantHiringRep;
	}

	public String getImportantHiringGettingThingsDone() {
		return importantHiringGettingThingsDone;
	}

	public void setImportantHiringGettingThingsDone(String importantHiringGettingThingsDone) {
		this.importantHiringGettingThingsDone = importantHiringGettingThingsDone;
	}

}
