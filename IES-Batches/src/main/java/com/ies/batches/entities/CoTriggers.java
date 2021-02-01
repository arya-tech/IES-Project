package com.ies.batches.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="co_triggers")
public class CoTriggers {
	@Id
	@Column(name="trg_id")
	protected Integer trgId;
	@Column(name="case_num")
	protected Integer caseNum;
	@Column(name="create_dt")
	protected Date createDt;
	@Column(name="tar_status")
	protected String tarStatus;
	@Column(name="update_dt")
	protected Date updateDt;
	public Integer getTrgId() {
		return trgId;
	}
	public void setTrgId(Integer trgId) {
		this.trgId = trgId;
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
	public String getTarStatus() {
		return tarStatus;
	}
	public void setTarStatus(String tarStatus) {
		this.tarStatus = tarStatus;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

}
