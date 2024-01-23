package com.test1;

public class DatasourceView {
	private Integer dataMaster;
	private String masterHistory;
	private String workflowAvail;
	private String workflowHistory;
	private Integer masterUnit;
	private Integer hierarchyLevel;
	private Integer ownerCount;
	private String ownerView;
	private String usersRole;
	private String usersEntitlement;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DatasourceView() {

	}

	public DatasourceView(Integer dataMaster, String masterHistory, String workflowAvail, String workflowHistory,
			Integer masterUnit, Integer hierarchyLevel, Integer ownerCount, String ownerView, String usersRole,
			String usersEntitlement, String creationDate, String modifiedDate, String entityState) {
		super();
		this.dataMaster = dataMaster;
		this.masterHistory = masterHistory;
		this.workflowAvail = workflowAvail;
		this.workflowHistory = workflowHistory;
		this.masterUnit = masterUnit;
		this.hierarchyLevel = hierarchyLevel;
		this.ownerCount = ownerCount;
		this.ownerView = ownerView;
		this.usersRole = usersRole;
		this.usersEntitlement = usersEntitlement;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getDataMaster() {
		return dataMaster;
	}

	public void setDataMaster(Integer dataMaster) {
		this.dataMaster = dataMaster;
	}

	public String getMasterHistory() {
		return masterHistory;
	}

	public void setMasterHistory(String masterHistory) {
		this.masterHistory = masterHistory;
	}

	public String getWorkflowAvail() {
		return workflowAvail;
	}

	public void setWorkflowAvail(String workflowAvail) {
		this.workflowAvail = workflowAvail;
	}

	public String getWorkflowHistory() {
		return workflowHistory;
	}

	public void setWorkflowHistory(String workflowHistory) {
		this.workflowHistory = workflowHistory;
	}

	public Integer getMasterUnit() {
		return masterUnit;
	}

	public void setMasterUnit(Integer masterUnit) {
		this.masterUnit = masterUnit;
	}

	public Integer getHierarchyLevel() {
		return hierarchyLevel;
	}

	public void setHierarchyLevel(Integer hierarchyLevel) {
		this.hierarchyLevel = hierarchyLevel;
	}

	public Integer getOwnerCount() {
		return ownerCount;
	}

	public void setOwnerCount(Integer ownerCount) {
		this.ownerCount = ownerCount;
	}

	public String getOwnerView() {
		return ownerView;
	}

	public void setOwnerView(String ownerView) {
		this.ownerView = ownerView;
	}

	public String getUsersRole() {
		return usersRole;
	}

	public void setUsersRole(String usersRole) {
		this.usersRole = usersRole;
	}

	public String getUsersEntitlement() {
		return usersEntitlement;
	}

	public void setUsersEntitlement(String usersEntitlement) {
		this.usersEntitlement = usersEntitlement;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
