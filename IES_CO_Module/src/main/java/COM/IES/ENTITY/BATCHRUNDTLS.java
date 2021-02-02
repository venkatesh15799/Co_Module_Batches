package COM.IES.ENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;
@Data
@Entity
public class BATCHRUNDTLS {
	
	@Id
	@GeneratedValue
	@NotNull
	private Integer BatchRunSeq;
	private String Batch_Name;
	private String Batch_Run_Status;
	private String End_Date;
	private Integer Instance_Num;
	private String Start_Date;
	
}
