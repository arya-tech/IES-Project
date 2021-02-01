package com.ies.batches.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eligibility_details")
public class EligibilityDetails {
	
	@Id
	@Column(name="ed_trace_id")
	protected Integer edTraceId;
	@Column(name="benefit_amt")
	protected Double benifitAmt;
	@Column(name="case_num")
	protected Integer caseNum;
	@Column(name="create_dt")
	protected Date createDt;
	@Column(name="denial_reason")
	protected String denialReason;
	@Column(name="plan_end_dt")
	protected String planEndDt;
	@Column(name="plan_name")
	protected String planName;
	@Column(name="plan_start_dt")
	protected String planStartDt;
	@Column(name="plan_status")
	protected String planStatus;
	@Column(name="update_dt")
	protected Date updateDt;
	public Integer getEdTraceId() {
		return edTraceId;
	}
	public void setEdTraceId(Integer edTraceId) {
		this.edTraceId = edTraceId;
	}
	public Double getBenifitAmt() {
		return benifitAmt;
	}
	public void setBenifitAmt(Double benifitAmt) {
		this.benifitAmt = benifitAmt;
	}
	public Integer getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public String getPlanEndDt() {
		return planEndDt;
	}
	public void setPlanEndDt(String planEndDt) {
		this.planEndDt = planEndDt;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStartDt() {
		return planStartDt;
	}
	public void setPlanStartDt(String planStartDt) {
		this.planStartDt = planStartDt;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
	

}
