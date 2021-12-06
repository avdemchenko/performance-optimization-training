package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "have_worked_and_want")
public class HaveWorkedAndWant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String haveWorkedLanguage;
	
	@Column
    private String wantWorkLanguage;
	
	@Column
    private String haveWorkedFramework;
	
	@Column
    private String wantWorkFramework;
	
	@Column
    private String haveWorkedDatabase;
	
	@Column
    private String wantWorkDatabase;
	
	@Column
    private String haveWorkedPlatform;
	
	@Column
    private String wantWorkPlatform;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHaveWorkedLanguage() {
		return haveWorkedLanguage;
	}

	public void setHaveWorkedLanguage(String haveWorkedLanguage) {
		this.haveWorkedLanguage = haveWorkedLanguage;
	}

	public String getWantWorkLanguage() {
		return wantWorkLanguage;
	}

	public void setWantWorkLanguage(String wantWorkLanguage) {
		this.wantWorkLanguage = wantWorkLanguage;
	}

	public String getHaveWorkedFramework() {
		return haveWorkedFramework;
	}

	public void setHaveWorkedFramework(String haveWorkedFramework) {
		this.haveWorkedFramework = haveWorkedFramework;
	}

	public String getWantWorkFramework() {
		return wantWorkFramework;
	}

	public void setWantWorkFramework(String wantWorkFramework) {
		this.wantWorkFramework = wantWorkFramework;
	}

	public String getHaveWorkedDatabase() {
		return haveWorkedDatabase;
	}

	public void setHaveWorkedDatabase(String haveWorkedDatabase) {
		this.haveWorkedDatabase = haveWorkedDatabase;
	}

	public String getWantWorkDatabase() {
		return wantWorkDatabase;
	}

	public void setWantWorkDatabase(String wantWorkDatabase) {
		this.wantWorkDatabase = wantWorkDatabase;
	}

	public String getHaveWorkedPlatform() {
		return haveWorkedPlatform;
	}

	public void setHaveWorkedPlatform(String haveWorkedPlatform) {
		this.haveWorkedPlatform = haveWorkedPlatform;
	}

	public String getWantWorkPlatform() {
		return wantWorkPlatform;
	}

	public void setWantWorkPlatform(String wantWorkPlatform) {
		this.wantWorkPlatform = wantWorkPlatform;
	}

}
