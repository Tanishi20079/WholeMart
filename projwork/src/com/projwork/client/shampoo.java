package com.projwork.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;

public class shampoo extends Composite {

	private static shampooUiBinder uiBinder = GWT.create(shampooUiBinder.class);

	interface shampooUiBinder extends UiBinder<Widget, shampoo> {
	}



	@UiField
	MaterialButton t1;
	@UiField
	MaterialButton t2;
	@UiField
	MaterialButton t3;
	@UiField
	MaterialButton t4;
	

	public shampoo() {
		initWidget(uiBinder.createAndBindUi(this));
		t1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("d2").clear();
				RootPanel.get("d2").add(new dove());
				
			}
		});
		t2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get("d2").clear();
				RootPanel.get("d2").add(new loreal());
				
			}
		});
		t3.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new treseme());
		
	}
});
		t4.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new sunsilk());
		
	}
});
		
	}

	

}

