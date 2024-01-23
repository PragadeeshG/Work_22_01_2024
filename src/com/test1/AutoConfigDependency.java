package com.test1;

public class AutoConfigDependency {
	private Integer configId;
	private Integer depManagementId;
	private String managedBy;
	private String proxy;
	private String tasks;
	private String plugins;
	private boolean propertiesAvail;
	private String properties;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AutoConfigDependency() {

	}

	public AutoConfigDependency(Integer configId, Integer depManagementId, String managedBy, String proxy, String tasks,
			String plugins, boolean propertiesAvail, String properties, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.configId = configId;
		this.depManagementId = depManagementId;
		this.managedBy = managedBy;
		this.proxy = proxy;
		this.tasks = tasks;
		this.plugins = plugins;
		this.propertiesAvail = propertiesAvail;
		this.properties = properties;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public Integer getDepManagementId() {
		return depManagementId;
	}

	public void setDepManagementId(Integer depManagementId) {
		this.depManagementId = depManagementId;
	}

	public String getManagedBy() {
		return managedBy;
	}

	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getPlugins() {
		return plugins;
	}

	public void setPlugins(String plugins) {
		this.plugins = plugins;
	}

	public boolean isPropertiesAvail() {
		return propertiesAvail;
	}

	public void setPropertiesAvail(boolean propertiesAvail) {
		this.propertiesAvail = propertiesAvail;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
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
