package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "influence")
public class Influence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String influenceInternet;
	
	@Column
    private String influenceWorkstation;
	
	@Column
    private String influenceHardware;
	
	@Column
    private String influenceServers;
	
	@Column
    private String influenceTechStack;
	
	@Column
    private String influenceDeptTech;
	
	@Column
    private String influenceVizTools;
	
	@Column
    private String influenceDatabase;
	
	@Column
    private String influenceCloud;
	
	@Column
    private String influenceConsultants;
	
	@Column
    private String influenceRecruitment;
	
	@Column
    private String influenceCommunication;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInfluenceInternet() {
		return influenceInternet;
	}

	public void setInfluenceInternet(String influenceInternet) {
		this.influenceInternet = influenceInternet;
	}

	public String getInfluenceWorkstation() {
		return influenceWorkstation;
	}

	public void setInfluenceWorkstation(String influenceWorkstation) {
		this.influenceWorkstation = influenceWorkstation;
	}

	public String getInfluenceHardware() {
		return influenceHardware;
	}

	public void setInfluenceHardware(String influenceHardware) {
		this.influenceHardware = influenceHardware;
	}

	public String getInfluenceServers() {
		return influenceServers;
	}

	public void setInfluenceServers(String influenceServers) {
		this.influenceServers = influenceServers;
	}

	public String getInfluenceTechStack() {
		return influenceTechStack;
	}

	public void setInfluenceTechStack(String influenceTechStack) {
		this.influenceTechStack = influenceTechStack;
	}

	public String getInfluenceDeptTech() {
		return influenceDeptTech;
	}

	public void setInfluenceDeptTech(String influenceDeptTech) {
		this.influenceDeptTech = influenceDeptTech;
	}

	public String getInfluenceVizTools() {
		return influenceVizTools;
	}

	public void setInfluenceVizTools(String influenceVizTools) {
		this.influenceVizTools = influenceVizTools;
	}

	public String getInfluenceDatabase() {
		return influenceDatabase;
	}

	public void setInfluenceDatabase(String influenceDatabase) {
		this.influenceDatabase = influenceDatabase;
	}

	public String getInfluenceCloud() {
		return influenceCloud;
	}

	public void setInfluenceCloud(String influenceCloud) {
		this.influenceCloud = influenceCloud;
	}

	public String getInfluenceConsultants() {
		return influenceConsultants;
	}

	public void setInfluenceConsultants(String influenceConsultants) {
		this.influenceConsultants = influenceConsultants;
	}

	public String getInfluenceRecruitment() {
		return influenceRecruitment;
	}

	public void setInfluenceRecruitment(String influenceRecruitment) {
		this.influenceRecruitment = influenceRecruitment;
	}

	public String getInfluenceCommunication() {
		return influenceCommunication;
	}

	public void setInfluenceCommunication(String influenceCommunication) {
		this.influenceCommunication = influenceCommunication;
	}

	
}
