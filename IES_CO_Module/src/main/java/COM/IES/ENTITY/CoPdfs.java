package COM.IES.ENTITY;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class CoPdfs {

	@NotNull
	private Integer Co_Pdf_Id;
	private String Plan_Status;
	private String Case_Number;
	private Byte[] Pdf_Document;
	private String Plan_Name;
}
