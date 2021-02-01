package com.ies.batches.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="co_pdfs")
public class CoPdf {
	@Column(name="co_pdf_id")
	protected Integer coPdfId;
	@Column(name="plan_status")
	protected String planStatus;
	@Column(name="case_number")
	protected String caseNumber;
	@Lob
	@Column(name = "pdf_document")
	protected byte[] pdfDocument;
	@Column(name="plan_name")
	protected String planName;
	public Integer getCoPdfId() {
		return coPdfId;
	}
	public void setCoPdfId(Integer coPdfId) {
		this.coPdfId = coPdfId;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public byte[] getPdfDocument() {
		return pdfDocument;
	}
	public void setPdfDocument(byte[] pdfDocument) {
		this.pdfDocument = pdfDocument;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	

}
