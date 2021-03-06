package com.health.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.health.shared.PatientInfo;


public interface HealthServiceAsync {

  void getBlobStoreUploadUrl( AsyncCallback<String> callback);

  void getPicture(String id, AsyncCallback<PatientInfo> callback);

void storePatienceInfo(PatientInfo patientInfo,
		AsyncCallback<PatientInfo> asyncCallback);







}