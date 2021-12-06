package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String university;
	
	@Column
    private String formalEducation;
	
	@Column
    private String majorUndergrad;
	
	@Column
    private String educationImportant;
	
	@Column
    private String educationTypes;
	
	@Column
    private String selfTaughtTypes;
	
	@Column
    private String timeAfterBootcamp;
	
	@Column
    private String cousinEducation;
	
	@Column
    private String highestEducationParents;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getFormalEducation() {
		return formalEducation;
	}

	public void setFormalEducation(String formalEducation) {
		this.formalEducation = formalEducation;
	}

	public String getMajorUndergrad() {
		return majorUndergrad;
	}

	public void setMajorUndergrad(String majorUndergrad) {
		this.majorUndergrad = majorUndergrad;
	}

	public String getEducationImportant() {
		return educationImportant;
	}

	public void setEducationImportant(String educationImportant) {
		this.educationImportant = educationImportant;
	}

	public String getEducationTypes() {
		return educationTypes;
	}

	public void setEducationTypes(String educationTypes) {
		this.educationTypes = educationTypes;
	}

	public String getSelfTaughtTypes() {
		return selfTaughtTypes;
	}

	public void setSelfTaughtTypes(String selfTaughtTypes) {
		this.selfTaughtTypes = selfTaughtTypes;
	}

	public String getTimeAfterBootcamp() {
		return timeAfterBootcamp;
	}

	public void setTimeAfterBootcamp(String timeAfterBootcamp) {
		this.timeAfterBootcamp = timeAfterBootcamp;
	}

	public String getCousinEducation() {
		return cousinEducation;
	}

	public void setCousinEducation(String cousinEducation) {
		this.cousinEducation = cousinEducation;
	}

	public String getHighestEducationParents() {
		return highestEducationParents;
	}

	public void setHighestEducationParents(String highestEducationParents) {
		this.highestEducationParents = highestEducationParents;
	}

    @Override
    public String toString() {
        return "Education [id=" + id + ", university=" + university + ", formalEducation=" + formalEducation
                + ", majorUndergrad=" + majorUndergrad + ", educationImportant=" + educationImportant
                + ", educationTypes=" + educationTypes + ", selfTaughtTypes=" + selfTaughtTypes + ", timeAfterBootcamp="
                + timeAfterBootcamp + ", cousinEducation=" + cousinEducation + ", highestEducationParents="
                + highestEducationParents + "]";
    }

}
