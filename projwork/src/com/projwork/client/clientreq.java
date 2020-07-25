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
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;

public class clientreq extends Composite 
 {

	private static clientreqUiBinder uiBinder = GWT.create(clientreqUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);


	interface clientreqUiBinder extends UiBinder<Widget, clientreq> {
	}

	public clientreq() {
		initWidget(uiBinder.createAndBindUi(this));
t.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
a1.clientreqfetch(new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				String s1[]=result.split("&");
				String s2[]=s1[0].split(",");
				l1.setText(s2[1]);
				l2.setText(s2[2]);
				l3.setText(s2[3]);
				l4.setText(s2[4]);
				l5.setText(s2[5]);
				l6.setText(s2[6]);
				l7.setText(s2[7]);
				l8.setText(s2[9]);
				l9.setText(s2[10]);
				l10.setText(s2[11]);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
			}
		});
tt.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new adminpanel());
	}
});
ttt.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new report());
	}
});
b1.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new billing());
	}
});

}
	@UiField
	MaterialButton b1;
	
	@UiField
	MaterialLabel l1;

	@UiField
	MaterialLabel l2;
	@UiField
	MaterialLabel l3;
	@UiField
	MaterialLabel l4;
	@UiField
	MaterialLabel l5;
	@UiField
	MaterialLabel l6;
	@UiField
	MaterialLabel l7;
	@UiField
	MaterialLabel l8;
	@UiField
	MaterialLabel l9;
	@UiField
	MaterialLabel l10;
	@UiField
	MaterialLabel t1;
	@UiField
	MaterialLabel t2;
	@UiField
	MaterialLabel t3;
	@UiField
	MaterialLink t;
	@UiField
	MaterialLink tt;
	@UiField
	MaterialLink ttt;
}