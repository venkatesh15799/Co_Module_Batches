package COM.IES.ENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="Eligibility_Details")
public class EligibilityDetails {

	@Id
	@NotNull
	@Column(name="Ed_Trace_Id")
	private Integer Ed_Trace_Id;
	
	@Column(name="Benefit_Amt")
    private String Benefit_Amt;
	
	@Column(name="Case_Num")
    private Integer Case_Num;
	
	@Column(name="Create_Date")
    private String Create_Date;
	
	@Column(name="Denial_Reason")
    private String Denial_Reason;
	
	@Column(name="Plan_End_Date")
    private String Plan_End_Date;
	
	@Column(name="Plan_Name")
    private String Plan_Name;
	
	@Column(name="Plan_Start_Date")
    private String Plan_Start_Date;
	
	@Column(name="Plan_Status")
    private String Plan_Status;
	
	@Column(name="Update_Date")
    private String Update_Date;
  
}
