package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respondent_details")
public class RespondentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String pronounceGIF;
	
	@Column
    private String problemSolving;
	
	@Column
    private String buildingThings;
	
	@Column
    private String learningNewTech;
	
	@Column
    private String boringDetails;
	
	@Column
    private String jobSecurity;
	
	@Column
    private String diversityImportant;
	
	@Column
    private String annoyingUI;
	
	@Column
    private String friendsDevelopers;
	
	@Column
    private String rightWrongWay;
	
	@Column
    private String understandComputers;
	
	@Column
    private String seriousWork;
	
	@Column
    private String investTimeTools;
	
	@Column
    private String workPayCare;
	
	@Column
    private String kinshipDevelopers;
	
	@Column
    private String challengeMyself;
	
	@Column
    private String competePeers;
	
	@Column
    private String changeWorld;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPronounceGIF() {
		return pronounceGIF;
	}

	public void setPronounceGIF(String pronounceGIF) {
		this.pronounceGIF = pronounceGIF;
	}

	public String getProblemSolving() {
		return problemSolving;
	}

	public void setProblemSolving(String problemSolving) {
		this.problemSolving = problemSolving;
	}

	public String getBuildingThings() {
		return buildingThings;
	}

	public void setBuildingThings(String buildingThings) {
		this.buildingThings = buildingThings;
	}

	public String getLearningNewTech() {
		return learningNewTech;
	}

	public void setLearningNewTech(String learningNewTech) {
		this.learningNewTech = learningNewTech;
	}

	public String getBoringDetails() {
		return boringDetails;
	}

	public void setBoringDetails(String boringDetails) {
		this.boringDetails = boringDetails;
	}

	public String getJobSecurity() {
		return jobSecurity;
	}

	public void setJobSecurity(String jobSecurity) {
		this.jobSecurity = jobSecurity;
	}

	public String getDiversityImportant() {
		return diversityImportant;
	}

	public void setDiversityImportant(String diversityImportant) {
		this.diversityImportant = diversityImportant;
	}

	public String getAnnoyingUI() {
		return annoyingUI;
	}

	public void setAnnoyingUI(String annoyingUI) {
		this.annoyingUI = annoyingUI;
	}

	public String getFriendsDevelopers() {
		return friendsDevelopers;
	}

	public void setFriendsDevelopers(String friendsDevelopers) {
		this.friendsDevelopers = friendsDevelopers;
	}

	public String getRightWrongWay() {
		return rightWrongWay;
	}

	public void setRightWrongWay(String rightWrongWay) {
		this.rightWrongWay = rightWrongWay;
	}

	public String getUnderstandComputers() {
		return understandComputers;
	}

	public void setUnderstandComputers(String understandComputers) {
		this.understandComputers = understandComputers;
	}

	public String getSeriousWork() {
		return seriousWork;
	}

	public void setSeriousWork(String seriousWork) {
		this.seriousWork = seriousWork;
	}

	public String getInvestTimeTools() {
		return investTimeTools;
	}

	public void setInvestTimeTools(String investTimeTools) {
		this.investTimeTools = investTimeTools;
	}

	public String getWorkPayCare() {
		return workPayCare;
	}

	public void setWorkPayCare(String workPayCare) {
		this.workPayCare = workPayCare;
	}

	public String getKinshipDevelopers() {
		return kinshipDevelopers;
	}

	public void setKinshipDevelopers(String kinshipDevelopers) {
		this.kinshipDevelopers = kinshipDevelopers;
	}

	public String getChallengeMyself() {
		return challengeMyself;
	}

	public void setChallengeMyself(String challengeMyself) {
		this.challengeMyself = challengeMyself;
	}

	public String getCompetePeers() {
		return competePeers;
	}

	public void setCompetePeers(String competePeers) {
		this.competePeers = competePeers;
	}

	public String getChangeWorld() {
		return changeWorld;
	}

	public void setChangeWorld(String changeWorld) {
		this.changeWorld = changeWorld;
	}

}
