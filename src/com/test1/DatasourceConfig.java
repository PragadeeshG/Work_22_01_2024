package com.test1;

public class DatasourceConfig {
	private Integer configId;
	private String url;
	private String driverClass;
	private String datasourceName;
	private String username;
	private Integer initalSchemaCount;
	private String password;
	private String initialConnection;
	private String connectionPoolSize;
	private Integer maxConnection;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DatasourceConfig() {

	}

	public DatasourceConfig(Integer configId, String url, String driverClass, String datasourceName, String username,
			Integer initalSchemaCount, String password, String initialConnection, String connectionPoolSize,
			Integer maxConnection, String creationDate, String modifiedDate, String entityState) {
		super();
		this.configId = configId;
		this.url = url;
		this.driverClass = driverClass;
		this.datasourceName = datasourceName;
		this.username = username;
		this.initalSchemaCount = initalSchemaCount;
		this.password = password;
		this.initialConnection = initialConnection;
		this.connectionPoolSize = connectionPoolSize;
		this.maxConnection = maxConnection;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getDatasourceName() {
		return datasourceName;
	}

	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getInitalSchemaCount() {
		return initalSchemaCount;
	}

	public void setInitalSchemaCount(Integer initalSchemaCount) {
		this.initalSchemaCount = initalSchemaCount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInitialConnection() {
		return initialConnection;
	}

	public void setInitialConnection(String initialConnection) {
		this.initialConnection = initialConnection;
	}

	public String getConnectionPoolSize() {
		return connectionPoolSize;
	}

	public void setConnectionPoolSize(String connectionPoolSize) {
		this.connectionPoolSize = connectionPoolSize;
	}

	public Integer getMaxConnection() {
		return maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
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
