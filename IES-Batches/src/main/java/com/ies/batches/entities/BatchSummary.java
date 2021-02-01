package com.ies.batches.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="batch_summary")
public class BatchSummary {
	
	@Column(name="summary_id")
	protected Integer summaryId;
	@Column(name="batch_name")
	protected String batchName;
	@Column(name="failure_trigger_count")
	protected Integer failureTriggerCount;
	@Column(name="success_trigger_count")
	protected Integer successTriggerCount;
	@Column(name="total_trigger_processed")
	protected Integer totalTriggerProcessed;
	public Integer getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}
	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}
	public Integer getSuccessTriggerCount() {
		return successTriggerCount;
	}
	public void setSuccessTriggerCount(Integer successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}
	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}
	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}
	

}
