package com.projwork.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
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

public class gotocart extends Composite {

	private static gotocartUiBinder uiBinder = GWT.create(gotocartUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	interface gotocartUiBinder extends UiBinder<Widget, gotocart> {
	}

	public gotocart() {
		initWidget(uiBinder.createAndBindUi(this));
		a1.fetchgotocart(new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				
				
				String s1[]=result.split("@");
				for(int i=0;i<s1.length;i++)
				{
				String s2[]=s1[i].split(",");
				String s=s2[0]+"\t"+s2[1]+"\t"+s2[2];
				MaterialLabel l=new MaterialLabel(s);
				l.setFontSize(1.0,Unit.CM );
				RootPanel.get("d2").add(l);
				}
				String k="CONFIRM";
				MaterialButton b1=new MaterialButton(k);
				b1.setFontSize(0.5,Unit.CM );
				RootPanel.get("d2").add(b1);
				b1.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						RootPanel.get("d2").clear();
						RootPanel.get("d2").add(new orderform());
					}
				});
			}
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	
	
	}

	
	
}
				
				
				
				
			
	

