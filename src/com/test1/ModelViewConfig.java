package com.test1;

public class ModelViewConfig {
	private Integer modelCode;
	private String viewCode;
	private boolean modelViewConfError;
	private Integer mvcId;
	private String viewresolver;
	private String dispatcherServlet;
	private Integer jaksonCode;
	private Integer xlmVersion;
	private String jsonVersion;
	private Integer dataSourceCount;
	private String scanDataSource;
	private String createdDate;
	private String entityState;

	public ModelViewConfig() {

	}

	public ModelViewConfig(Integer modelCode, String viewCode, boolean modelViewConfError, Integer mvcId,
			String viewresolver, String dispatcherServlet, Integer jaksonCode, Integer xlmVersion, String jsonVersion,
			Integer dataSourceCount, String scanDataSource, String createdDate, String entityState) {
		super();
		this.modelCode = modelCode;
		this.viewCode = viewCode;
		this.modelViewConfError = modelViewConfError;
		this.mvcId = mvcId;
		this.viewresolver = viewresolver;
		this.dispatcherServlet = dispatcherServlet;
		this.jaksonCode = jaksonCode;
		this.xlmVersion = xlmVersion;
		this.jsonVersion = jsonVersion;
		this.dataSourceCount = dataSourceCount;
		this.scanDataSource = scanDataSource;
		this.createdDate = createdDate;
		this.entityState = entityState;
	}

	public Integer getModelCode() {
		return modelCode;
	}

	public void setModelCode(Integer modelCode) {
		this.modelCode = modelCode;
	}

	public String getViewCode() {
		return viewCode;
	}

	public void setViewCode(String viewCode) {
		this.viewCode = viewCode;
	}

	public boolean isModelViewConfError() {
		return modelViewConfError;
	}

	public void setModelViewConfError(boolean modelViewConfError) {
		this.modelViewConfError = modelViewConfError;
	}

	public Integer getMvcId() {
		return mvcId;
	}

	public void setMvcId(Integer mvcId) {
		this.mvcId = mvcId;
	}

	public String getViewresolver() {
		return viewresolver;
	}

	public void setViewresolver(String viewresolver) {
		this.viewresolver = viewresolver;
	}

	public String getDispatcherServlet() {
		return dispatcherServlet;
	}

	public void setDispatcherServlet(String dispatcherServlet) {
		this.dispatcherServlet = dispatcherServlet;
	}

	public Integer getJaksonCode() {
		return jaksonCode;
	}

	public void setJaksonCode(Integer jaksonCode) {
		this.jaksonCode = jaksonCode;
	}

	public Integer getXlmVersion() {
		return xlmVersion;
	}

	public void setXlmVersion(Integer xlmVersion) {
		this.xlmVersion = xlmVersion;
	}

	public String getJsonVersion() {
		return jsonVersion;
	}

	public void setJsonVersion(String jsonVersion) {
		this.jsonVersion = jsonVersion;
	}

	public Integer getDataSourceCount() {
		return dataSourceCount;
	}

	public void setDataSourceCount(Integer dataSourceCount) {
		this.dataSourceCount = dataSourceCount;
	}

	public String getScanDataSource() {
		return scanDataSource;
	}

	public void setScanDataSource(String scanDataSource) {
		this.scanDataSource = scanDataSource;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
