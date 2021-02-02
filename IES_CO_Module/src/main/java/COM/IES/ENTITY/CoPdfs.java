package COM.IES.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CO_PDFS")
public class CoPdfs {

	@Id
	@Column(name="CO_PDF_ID")
	private Integer coPdfId;
	
	@Column(name="PLAN_STATUS")
	private String planStatus;
	
	@Column(name="CASE_NUMBER")
	private  long caseNumber;
	
	@Column(name="PLAN_NAME")
	private String planName;
}
