package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technical_details")
public class TechnicalDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String ide;
	
	@Column
    private String auditoryEnvironment;
	
	@Column
    private String methodology;
	
	@Column
    private String versionControl;
	
	@Column
    private String checkInCode;
	
	@Column
    private String shipIt;
	
	@Column
    private String otherPeoplesCode;
	
	@Column
    private String projectManagement;
	
	@Column
    private String enjoyDebugging;
	
	@Column
    private String inTheZone;
	
	@Column
    private String difficultCommunication;
	
	@Column
    private String collaborateRemote;
	
	@Column
    private String metricAssess;
	
	@Column
    private String tabsSpaces;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public String getAuditoryEnvironment() {
		return auditoryEnvironment;
	}

	public void setAuditoryEnvironment(String auditoryEnvironment) {
		this.auditoryEnvironment = auditoryEnvironment;
	}

	public String getMethodology() {
		return methodology;
	}

	public void setMethodology(String methodology) {
		this.methodology = methodology;
	}

	public String getVersionControl() {
		return versionControl;
	}

	public void setVersionControl(String versionControl) {
		this.versionControl = versionControl;
	}

	public String getCheckInCode() {
		return checkInCode;
	}

	public void setCheckInCode(String checkInCode) {
		this.checkInCode = checkInCode;
	}

	public String getShipIt() {
		return shipIt;
	}

	public void setShipIt(String shipIt) {
		this.shipIt = shipIt;
	}

	public String getOtherPeoplesCode() {
		return otherPeoplesCode;
	}

	public void setOtherPeoplesCode(String otherPeoplesCode) {
		this.otherPeoplesCode = otherPeoplesCode;
	}

	public String getProjectManagement() {
		return projectManagement;
	}

	public void setProjectManagement(String projectManagement) {
		this.projectManagement = projectManagement;
	}

	public String getEnjoyDebugging() {
		return enjoyDebugging;
	}

	public void setEnjoyDebugging(String enjoyDebugging) {
		this.enjoyDebugging = enjoyDebugging;
	}

	public String getInTheZone() {
		return inTheZone;
	}

	public void setInTheZone(String inTheZone) {
		this.inTheZone = inTheZone;
	}

	public String getDifficultCommunication() {
		return difficultCommunication;
	}

	public void setDifficultCommunication(String difficultCommunication) {
		this.difficultCommunication = difficultCommunication;
	}

	public String getCollaborateRemote() {
		return collaborateRemote;
	}

	public void setCollaborateRemote(String collaborateRemote) {
		this.collaborateRemote = collaborateRemote;
	}

	public String getMetricAssess() {
		return metricAssess;
	}

	public void setMetricAssess(String metricAssess) {
		this.metricAssess = metricAssess;
	}

	public String getTabsSpaces() {
		return tabsSpaces;
	}

	public void setTabsSpaces(String tabsSpaces) {
		this.tabsSpaces = tabsSpaces;
	}

}
