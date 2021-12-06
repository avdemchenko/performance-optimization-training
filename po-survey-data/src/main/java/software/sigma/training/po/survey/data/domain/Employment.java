package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employment")
public class Employment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String employmentStatus;
	
	@Column
    private String homeRemote;
	
	@Column
    private String companySize;
	
	@Column
    private String companyType;
	
	@Column
    private String yearsProgram;
	
	@Column
    private String yearsCodedJob;
	
	@Column
    private String yearsCodedJobPast;
	
	@Column
    private String developerType;
	
	@Column
    private String webDeveloperType;
	
	@Column
    private String mobileDeveloperType;
	
	@Column
    private String nonDeveloperType;
	
	@Column
    private String careerSatisfaction;
	
	@Column
    private String jobSatisfaction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getHomeRemote() {
		return homeRemote;
	}

	public void setHomeRemote(String homeRemote) {
		this.homeRemote = homeRemote;
	}

	public String getCompanySize() {
		return companySize;
	}

	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getYearsProgram() {
		return yearsProgram;
	}

	public void setYearsProgram(String yearsProgram) {
		this.yearsProgram = yearsProgram;
	}

	public String getYearsCodedJob() {
		return yearsCodedJob;
	}

	public void setYearsCodedJob(String yearsCodedJob) {
		this.yearsCodedJob = yearsCodedJob;
	}

	public String getYearsCodedJobPast() {
		return yearsCodedJobPast;
	}

	public void setYearsCodedJobPast(String yearsCodedJobPast) {
		this.yearsCodedJobPast = yearsCodedJobPast;
	}

	public String getDeveloperType() {
		return developerType;
	}

	public void setDeveloperType(String developerType) {
		this.developerType = developerType;
	}

	public String getWebDeveloperType() {
		return webDeveloperType;
	}

	public void setWebDeveloperType(String webDeveloperType) {
		this.webDeveloperType = webDeveloperType;
	}

	public String getMobileDeveloperType() {
		return mobileDeveloperType;
	}

	public void setMobileDeveloperType(String mobileDeveloperType) {
		this.mobileDeveloperType = mobileDeveloperType;
	}

	public String getNonDeveloperType() {
		return nonDeveloperType;
	}

	public void setNonDeveloperType(String nonDeveloperType) {
		this.nonDeveloperType = nonDeveloperType;
	}

	public String getCareerSatisfaction() {
		return careerSatisfaction;
	}

	public void setCareerSatisfaction(String careerSatisfaction) {
		this.careerSatisfaction = careerSatisfaction;
	}

	public String getJobSatisfaction() {
		return jobSatisfaction;
	}

	public void setJobSatisfaction(String jobSatisfaction) {
		this.jobSatisfaction = jobSatisfaction;
	}

    @Override
    public String toString() {
        return "Employment [id=" + id + ", employmentStatus=" + employmentStatus + ", homeRemote=" + homeRemote
                + ", companySize=" + companySize + ", companyType=" + companyType + ", yearsProgram=" + yearsProgram
                + ", yearsCodedJob=" + yearsCodedJob + ", yearsCodedJobPast=" + yearsCodedJobPast + ", developerType="
                + developerType + ", webDeveloperType=" + webDeveloperType + ", mobileDeveloperType="
                + mobileDeveloperType + ", nonDeveloperType=" + nonDeveloperType + ", careerSatisfaction="
                + careerSatisfaction + ", jobSatisfaction=" + jobSatisfaction + "]";
    }

}
