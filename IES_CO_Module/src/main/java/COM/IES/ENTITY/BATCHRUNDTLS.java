package COM.IES.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Batch_Run_Details")
public class BATCHRUNDTLS {
	
	@Id
	@Column(name="BATCH_RUN_SEQ")
	 private Integer batchRunSeq;
	
	@Column(name="BATCH_NAME")
	 private String batchName;
	
	@Column(name="RUN_STATUS")
	 private String runStatus;
	
	@Column(name="END_DATE")
	 private String  endDate;
	
	@Column(name="INSTANCE_NUMBER")
	 private Integer instanceNumber;
	
	@Column(name="START_DATE")
	 private String startDate;
	
}
