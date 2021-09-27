package com.lina.microservices.exercisesservice.exercise3.bean.successResponse;

public class SuccessData {

	private int solicitationId;
	
	private String solicitationType;
	
	private SolicitationStatus solicitationStatus;

	public SuccessData() {
		
	}
	
	public SuccessData(int solicitationId, String solicitationType, SolicitationStatus solicitationStatus) {
		super();
		this.solicitationId = solicitationId;
		this.solicitationType = solicitationType;
		this.solicitationStatus = solicitationStatus;
	}

	public int getSolicitationId() {
		return solicitationId;
	}

	public void setSolicitationId(int solicitationId) {
		this.solicitationId = solicitationId;
	}

	public String getSolicitationType() {
		return solicitationType;
	}

	public void setSolicitationType(String solicitationType) {
		this.solicitationType = solicitationType;
	}

	public SolicitationStatus getSolicitationStatus() {
		return solicitationStatus;
	}

	public void setSolicitationStatus(SolicitationStatus solicitationStatus) {
		this.solicitationStatus = solicitationStatus;
	}
	
}
