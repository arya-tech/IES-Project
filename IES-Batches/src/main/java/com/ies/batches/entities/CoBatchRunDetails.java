package com.ies.batches.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="co_batch_run_dtls")
public class CoBatchRunDetails {
	@Column(name="batch_run_seq")
	protected Integer batchRunSeq;
	@Column(name="batch_name")
	protected String batchName;
	@Column(name="batch_run_status")
	protected String batchRunStatus;
	@Column(name="end_date")
	protected Date endDate;
	@Column(name="instance_num")
	protected Integer instanceNum;
	@Column(name="start_date")
	protected Date startDate;
	public Integer getBatchRunSeq() {
		return batchRunSeq;
	}
	public void setBatchRunSeq(Integer batchRunSeq) {
		this.batchRunSeq = batchRunSeq;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchRunStatus() {
		return batchRunStatus;
	}
	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getInstanceNum() {
		return instanceNum;
	}
	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
