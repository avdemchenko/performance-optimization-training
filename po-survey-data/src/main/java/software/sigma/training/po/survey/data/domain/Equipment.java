package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String equipmentSatisfiedMonitors;
	
	@Column
    private String equipmentSatisfiedCPU;
	
	@Column
    private String equipmentSatisfiedRAM;
	
	@Column
    private String equipmentSatisfiedStorage;
	
	@Column
    private String equipmentSatisfiedRW;

    @Override
    public String toString() {
        return "Equipment [id=" + id + ", equipmentSatisfiedMonitors=" + equipmentSatisfiedMonitors
                + ", equipmentSatisfiedCPU=" + equipmentSatisfiedCPU + ", equipmentSatisfiedRAM="
                + equipmentSatisfiedRAM + ", equipmentSatisfiedStorage=" + equipmentSatisfiedStorage
                + ", equipmentSatisfiedRW=" + equipmentSatisfiedRW + "]";
    }

}
