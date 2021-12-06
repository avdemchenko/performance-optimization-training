package software.sigma.training.po.survey.data.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "respondent")
public class Respondent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	@Column
	private String respondentName;

	@Column
    private String professional;

	@Column
    private String programHobby;

	@Column
    private String country;

	@Column
    private String gender;

	@Column
    private String race;

	@Column
    private String salary;

	@Column
    private String expectedSalary;

	@Column
    private String surveyLong;

	@Column
    private String questionsInteresting;

	@Column
    private String questionsConfusing;

	@Column
    private String InterestedAnswers;

	@ManyToOne(cascade = {CascadeType.ALL})
    private Assess assesses;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Education educationInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Employment employmentInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Equipment equipmentInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private ExCoder exCoderInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private HaveWorkedAndWant haveWorkedAndWantInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private ImportantHiring importantHiringInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Influence influenceInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private JobInfo job;

    @ManyToOne(cascade = {CascadeType.ALL})
    private RespondentDetails respondentDetailsInfo;

    @ManyToOne(cascade = {CascadeType.ALL})
    private StackOverflowInfo stackOverflow;

    @ManyToOne(cascade = {CascadeType.ALL})
    private TechnicalDetails technicalDetailsInfo;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRespondentName() {
		return respondentName;
	}
	public void setRespondentName(String respondentName) {
		this.respondentName = respondentName;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getProgramHobby() {
		return programHobby;
	}
	public void setProgramHobby(String programHobby) {
		this.programHobby = programHobby;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public String getSurveyLong() {
		return surveyLong;
	}
	public void setSurveyLong(String surveyLong) {
		this.surveyLong = surveyLong;
	}
	public String getQuestionsInteresting() {
		return questionsInteresting;
	}
	public void setQuestionsInteresting(String questionsInteresting) {
		this.questionsInteresting = questionsInteresting;
	}
	public String getQuestionsConfusing() {
		return questionsConfusing;
	}
	public void setQuestionsConfusing(String questionsConfusing) {
		this.questionsConfusing = questionsConfusing;
	}
	public String getInterestedAnswers() {
		return InterestedAnswers;
	}
	public void setInterestedAnswers(String interestedAnswers) {
		InterestedAnswers = interestedAnswers;
	}
	public Assess getAssesses() {
		return assesses;
	}
	public void setAssesses(Assess assesses) {
		this.assesses = assesses;
	}
	public Education getEducationInfo() {
		return educationInfo;
	}
	public void setEducationInfo(Education educationInfo) {
		this.educationInfo = educationInfo;
	}
	public Employment getEmploymentInfo() {
		return employmentInfo;
	}
	public void setEmploymentInfo(Employment employmentInfo) {
		this.employmentInfo = employmentInfo;
	}
	public Equipment getEquipmentInfo() {
		return equipmentInfo;
	}
	public void setEquipmentInfo(Equipment equipmentInfo) {
		this.equipmentInfo = equipmentInfo;
	}
	public ExCoder getExCoderInfo() {
		return exCoderInfo;
	}
	public void setExCoderInfo(ExCoder exCoderInfo) {
		this.exCoderInfo = exCoderInfo;
	}
	public HaveWorkedAndWant getHaveWorkedAndWantInfo() {
		return haveWorkedAndWantInfo;
	}
	public void setHaveWorkedAndWantInfo(HaveWorkedAndWant haveWorkedAndWantInfo) {
		this.haveWorkedAndWantInfo = haveWorkedAndWantInfo;
	}
	public ImportantHiring getImportantHiringInfo() {
		return importantHiringInfo;
	}
	public void setImportantHiringInfo(ImportantHiring importantHiringInfo) {
		this.importantHiringInfo = importantHiringInfo;
	}
	public Influence getInfluenceInfo() {
		return influenceInfo;
	}
	public void setInfluenceInfo(Influence influenceInfo) {
		this.influenceInfo = influenceInfo;
	}
	public JobInfo getJob() {
		return job;
	}
	public void setJob(JobInfo job) {
		this.job = job;
	}
	public RespondentDetails getRespondentDetailsInfo() {
		return respondentDetailsInfo;
	}
	public void setRespondentDetailsInfo(RespondentDetails respondentDetailsInfo) {
		this.respondentDetailsInfo = respondentDetailsInfo;
	}
	public StackOverflowInfo getStackOverflow() {
		return stackOverflow;
	}
	public void setStackOverflow(StackOverflowInfo stackOverflow) {
		this.stackOverflow = stackOverflow;
	}
	public TechnicalDetails getTechnicalDetailsInfo() {
		return technicalDetailsInfo;
	}
	public void setTechnicalDetailsInfo(TechnicalDetails technicalDetailsInfo) {
		this.technicalDetailsInfo = technicalDetailsInfo;
	}
    @Override
    public String toString() {
        return "Respondent [id=" + id + ", respondentName=" + respondentName + ", professional=" + professional
                + ", programHobby=" + programHobby + ", country=" + country + ", gender=" + gender + ", race=" + race
                + ", salary=" + salary + ", expectedSalary=" + expectedSalary + ", surveyLong=" + surveyLong
                + ", questionsInteresting=" + questionsInteresting + ", questionsConfusing=" + questionsConfusing
                + ", InterestedAnswers=" + InterestedAnswers + ", assesses=" + assesses + ", educationInfo="
                + educationInfo + ", employmentInfo=" + employmentInfo + ", equipmentInfo=" + equipmentInfo
                + ", exCoderInfo=" + exCoderInfo + ", haveWorkedAndWantInfo=" + haveWorkedAndWantInfo
                + ", importantHiringInfo=" + importantHiringInfo + ", influenceInfo=" + influenceInfo + ", job=" + job
                + ", respondentDetailsInfo=" + respondentDetailsInfo + ", stackOverflow=" + stackOverflow
                + ", technicalDetailsInfo=" + technicalDetailsInfo + "]";
    }

}
