package com.test1;

public class AutoConfiguration {
	private Integer applicationId;
	private String configurablePart;
	private String functionality;
	private String backgroundCode;
	private String servlets;
	private String filters;
	private String dispatcherServlet;
	private Integer arcId;
	private String jsonOld;
	private String jsonNew;
	private String status;

	public AutoConfiguration() {

	}

	public AutoConfiguration(Integer applicationId, String configurablePart, String functionality,
			String backgroundCode, String servlets, String filters, String dispatcherServlet, Integer arcId,
			String jsonOld, String jsonNew, String status) {
		super();
		this.applicationId = applicationId;
		this.configurablePart = configurablePart;
		this.functionality = functionality;
		this.backgroundCode = backgroundCode;
		this.servlets = servlets;
		this.filters = filters;
		this.dispatcherServlet = dispatcherServlet;
		this.arcId = arcId;
		this.jsonOld = jsonOld;
		this.jsonNew = jsonNew;
		this.status = status;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getConfigurablePart() {
		return configurablePart;
	}

	public void setConfigurablePart(String configurablePart) {
		this.configurablePart = configurablePart;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public String getBackgroundCode() {
		return backgroundCode;
	}

	public void setBackgroundCode(String backgroundCode) {
		this.backgroundCode = backgroundCode;
	}

	public String getServlets() {
		return servlets;
	}

	public void setServlets(String servlets) {
		this.servlets = servlets;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getDispatcherServlet() {
		return dispatcherServlet;
	}

	public void setDispatcherServlet(String dispatcherServlet) {
		this.dispatcherServlet = dispatcherServlet;
	}

	public Integer getArcId() {
		return arcId;
	}

	public void setArcId(Integer arcId) {
		this.arcId = arcId;
	}

	public String getJsonOld() {
		return jsonOld;
	}

	public void setJsonOld(String jsonOld) {
		this.jsonOld = jsonOld;
	}

	public String getJsonNew() {
		return jsonNew;
	}

	public void setJsonNew(String jsonNew) {
		this.jsonNew = jsonNew;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
