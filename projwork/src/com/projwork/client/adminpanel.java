package com.projwork.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class adminpanel extends Composite{

	private static adminpanelUiBinder uiBinder = GWT.create(adminpanelUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	interface adminpanelUiBinder extends UiBinder<Widget, adminpanel> {
	}

	public adminpanel() {
		initWidget(uiBinder.createAndBindUi(this));
		
b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
					String s1=t1.getText();
					String s2=t2.getText();
					String s3=t3.getText();
					String s4=t4.getText();
					
					a1.insertadmin(s1, s2, s3, s4, new AsyncCallback<String>() {
						
						@Override
						public void onSuccess(String result) {
							// TODO Auto-generated method stub
							if(result.equals("yes"))
							{
							MaterialToast.fireToast(result,3000);
							Window.alert("product is added");
							}
							else
							{
								MaterialToast.fireToast("not done",3000);
								Window.alert("not added");
							}
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							MaterialToast.fireToast("Connection problem",3000);
							
							
						}
					});
					}
			
			});
	
	}

	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialButton b1;

}
