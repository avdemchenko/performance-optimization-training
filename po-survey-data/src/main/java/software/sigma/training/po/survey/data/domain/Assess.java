package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assess")
public class Assess {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String assessJobIndustry;
	
	@Column
    private String assessJobRole;
	
	@Column
    private String assessJobExp;
	
	@Column
    private String assessJobDept;
	
	@Column
    private String assessJobTech;
	
	@Column
    private String assessJobProjects;
	
	@Column
    private String assessJobCompensation;
	
	@Column
    private String assessJobOffice;
	
	@Column
    private String assessJobCommute;
	
	@Column
    private String assessJobRemote;
	
	@Column
    private String assessJobLeaders;
	
	@Column
    private String assessJobProfDevel;
	
	@Column
    private String assessJobDiversity;
	
	@Column
    private String assessJobProduct;
	
	@Column
    private String assessJobFinances;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssessJobIndustry() {
		return assessJobIndustry;
	}

	public void setAssessJobIndustry(String assessJobIndustry) {
		this.assessJobIndustry = assessJobIndustry;
	}

	public String getAssessJobRole() {
		return assessJobRole;
	}

	public void setAssessJobRole(String assessJobRole) {
		this.assessJobRole = assessJobRole;
	}

	public String getAssessJobExp() {
		return assessJobExp;
	}

	public void setAssessJobExp(String assessJobExp) {
		this.assessJobExp = assessJobExp;
	}

	public String getAssessJobDept() {
		return assessJobDept;
	}

	public void setAssessJobDept(String assessJobDept) {
		this.assessJobDept = assessJobDept;
	}

	public String getAssessJobTech() {
		return assessJobTech;
	}

	public void setAssessJobTech(String assessJobTech) {
		this.assessJobTech = assessJobTech;
	}

	public String getAssessJobProjects() {
		return assessJobProjects;
	}

	public void setAssessJobProjects(String assessJobProjects) {
		this.assessJobProjects = assessJobProjects;
	}

	public String getAssessJobCompensation() {
		return assessJobCompensation;
	}

	public void setAssessJobCompensation(String assessJobCompensation) {
		this.assessJobCompensation = assessJobCompensation;
	}

	public String getAssessJobOffice() {
		return assessJobOffice;
	}

	public void setAssessJobOffice(String assessJobOffice) {
		this.assessJobOffice = assessJobOffice;
	}

	public String getAssessJobCommute() {
		return assessJobCommute;
	}

	public void setAssessJobCommute(String assessJobCommute) {
		this.assessJobCommute = assessJobCommute;
	}

	public String getAssessJobRemote() {
		return assessJobRemote;
	}

	public void setAssessJobRemote(String assessJobRemote) {
		this.assessJobRemote = assessJobRemote;
	}

	public String getAssessJobLeaders() {
		return assessJobLeaders;
	}

	public void setAssessJobLeaders(String assessJobLeaders) {
		this.assessJobLeaders = assessJobLeaders;
	}

	public String getAssessJobProfDevel() {
		return assessJobProfDevel;
	}

	public void setAssessJobProfDevel(String assessJobProfDevel) {
		this.assessJobProfDevel = assessJobProfDevel;
	}

	public String getAssessJobDiversity() {
		return assessJobDiversity;
	}

	public void setAssessJobDiversity(String assessJobDiversity) {
		this.assessJobDiversity = assessJobDiversity;
	}

	public String getAssessJobProduct() {
		return assessJobProduct;
	}

	public void setAssessJobProduct(String assessJobProduct) {
		this.assessJobProduct = assessJobProduct;
	}

	public String getAssessJobFinances() {
		return assessJobFinances;
	}

	public void setAssessJobFinances(String assessJobFinances) {
		this.assessJobFinances = assessJobFinances;
	}

    @Override
    public String toString() {
        return "Assess [id=" + id + ", assessJobIndustry=" + assessJobIndustry + ", assessJobRole=" + assessJobRole
                + ", assessJobExp=" + assessJobExp + ", assessJobDept=" + assessJobDept + ", assessJobTech="
                + assessJobTech + ", assessJobProjects=" + assessJobProjects + ", assessJobCompensation="
                + assessJobCompensation + ", assessJobOffice=" + assessJobOffice + ", assessJobCommute="
                + assessJobCommute + ", assessJobRemote=" + assessJobRemote + ", assessJobLeaders=" + assessJobLeaders
                + ", assessJobProfDevel=" + assessJobProfDevel + ", assessJobDiversity=" + assessJobDiversity
                + ", assessJobProduct=" + assessJobProduct + ", assessJobFinances=" + assessJobFinances + "]";
    }

	
	
}
