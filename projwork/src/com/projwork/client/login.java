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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class login extends Composite  {

	private static loginUiBinder uiBinder = GWT.create(loginUiBinder.class);
	String susername, spassword;
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);
	

	interface loginUiBinder extends UiBinder<Widget, login> {
	}
	public login() {
		initWidget(uiBinder.createAndBindUi(this));
		
		

	b1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
				String s1=t1.getText();
				String s2=t2.getText();
				
				a1.Check(s1, s2, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						if(result.equals("Done"))
						{
						MaterialToast.fireToast(result,3000);
						RootPanel.get("d2").clear();
						RootPanel.get("d2").add(new clientreq());
						}
						else
						{
							MaterialToast.fireToast("Nikal Lo",3000);
							Window.alert("Please enter correct data");
						}
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("failed",3000);
						
						
					}
				});
				}
		
	});
	}				 
	

	@UiField
	MaterialImage i1;
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialCheckBox c1;
	@UiField
	MaterialButton b1;
	@UiField
	MaterialButton b2;

	public login(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		b1.setText(firstName);
	}

}
