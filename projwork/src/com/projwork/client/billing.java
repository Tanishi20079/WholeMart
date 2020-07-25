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

public class billing extends Composite  {

	private static billingUiBinder uiBinder = GWT.create(billingUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	interface billingUiBinder extends UiBinder<Widget, billing> {
	}


	public billing() {
		initWidget(uiBinder.createAndBindUi(this));
		a1.billingfetch(new AsyncCallback<String>() {

			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub

				String s1[] = result.split("@");
				String s2[] = s1[0].split(",");
				t1.setText(s2[0]);
				t2.setText(s2[1]);
				t3.setText(s2[2]);
				t4.setText(s2[3]);
				t5.setText(s2[4]);
				t7.setText(s2[5]);
				t9.setText(s2[7]);
				t6.setText(s2[8]);

			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		    		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
					int s1=Integer.parseInt(t6.getText());
					int s2=Integer.parseInt(t9.getText());
				a1.insertbill(s1, s2, new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("succes");
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("Fail"+caught.getMessage());
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
	MaterialTextBox t5;

	@UiField
	MaterialTextBox t7;

	@UiField
	MaterialTextBox t9;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialButton b1;
}

	
