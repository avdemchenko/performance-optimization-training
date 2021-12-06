package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_info")
public class JobInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
	
	@Column
    private String jobSeekingStatus;
	
	@Column
    private String hoursPerWeek;
	
	@Column
    private String workStart;
	
	@Column
    private String lastNewJob;
	
	@Column
    private String importantBenefits;
	
	@Column
    private String clickyKeys;
	
	@Column
    private String jobProfile;
	
	@Column
    private String resumePrompted;
	
	@Column
    private String currency;
	
	@Column
    private String overpaid;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getJobSeekingStatus() {
		return jobSeekingStatus;
	}

	public void setJobSeekingStatus(String jobSeekingStatus) {
		this.jobSeekingStatus = jobSeekingStatus;
	}

	public String getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(String hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getWorkStart() {
		return workStart;
	}

	public void setWorkStart(String workStart) {
		this.workStart = workStart;
	}

	public String getLastNewJob() {
		return lastNewJob;
	}

	public void setLastNewJob(String lastNewJob) {
		this.lastNewJob = lastNewJob;
	}

	public String getImportantBenefits() {
		return importantBenefits;
	}

	public void setImportantBenefits(String importantBenefits) {
		this.importantBenefits = importantBenefits;
	}

	public String getClickyKeys() {
		return clickyKeys;
	}

	public void setClickyKeys(String clickyKeys) {
		this.clickyKeys = clickyKeys;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public String getResumePrompted() {
		return resumePrompted;
	}

	public void setResumePrompted(String resumePrompted) {
		this.resumePrompted = resumePrompted;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOverpaid() {
		return overpaid;
	}

	public void setOverpaid(String overpaid) {
		this.overpaid = overpaid;
	}

}
