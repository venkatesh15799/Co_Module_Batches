package COM.IES.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CO_TRIGGERS")
public class CoTriggers {
	@Id
	@Column(name="TRG_ID")
	private Integer Trg_Id;
	
	@Column(name="Case_Num")
	private Integer Case_Num;
	
	@Column(name="Create_Date")
	private String Create_Date;
	
	@Column(name="Trg_Status")
	private String Trg_Status;
	
	@Column(name="Update_Date")
	private String Update_Date;
	
}
