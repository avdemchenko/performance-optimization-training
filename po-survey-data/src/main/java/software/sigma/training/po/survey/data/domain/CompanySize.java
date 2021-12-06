package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_size")
public class CompanySize {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String size;
	
	@Column
	private String sizeClass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeClass() {
		return sizeClass;
	}

	public void setSizeClass(String sizeClass) {
		this.sizeClass = sizeClass;
	}

    @Override
    public String toString() {
        return "CompanySize [id=" + id + ", size=" + size + ", sizeClass=" + sizeClass + "]";
    }
	
}
