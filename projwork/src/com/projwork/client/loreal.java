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
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class loreal extends Composite  {

	private static lorealUiBinder uiBinder = GWT.create(lorealUiBinder.class);
	GreetingServiceAsync a1 = GWT.create(GreetingService.class);

	interface lorealUiBinder extends UiBinder<Widget, loreal> {
	}

	public loreal() {
		initWidget(uiBinder.createAndBindUi(this));
a1.FetchLoreal( new AsyncCallback<String>() {
			
	@Override
	public void onSuccess(String result) {
		// TODO Auto-generated method stub
		String s1[]=result.split("@");
		int k=s1.length;
		MaterialLabel l1[]=new MaterialLabel[k];
		MaterialLabel l2[]=new MaterialLabel[k];
		MaterialTextBox l3[]=new MaterialTextBox[k];
		MaterialButton bb[]=new MaterialButton[k];
		for(int i=0;i<s1.length;i++) {
		String s2[]=s1[i].split(",");
	l1[i]=new MaterialLabel();
	l1[i].setText(s2[0]);
	l2[i]=new MaterialLabel();
	l2[i].setText("Price:" +s2[2]);
	l3[i]=new MaterialTextBox("Quantity");
	int j=i;
	bb[i]=new MaterialButton();
	bb[i].setText("Add To Cart");
	bb[i].addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			String s1=l1[j].getText();
			String s2=l2[j].getText();
			String s3=l3[j].getText();
			a1.insertquantity(s1, s3, s2, new AsyncCallback<String>() {
				
				@Override
				public void onSuccess(String result) {
					// TODO Auto-generated method stub
					
					MaterialToast.fireToast(result,3000);
					Window.alert("product is added");
			}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					MaterialToast.fireToast("Connection problem",3000);	
				}
			});
	}
});

	RootPanel.get("d2").add(l1[i]);
	RootPanel.get("d2").add(l2[i]);
	RootPanel.get("d2").add(l3[i]);
	RootPanel.get("d2").add(bb[i]);

		}
		MaterialButton last=new MaterialButton();
		last.setText("Go to Cart");
RootPanel.get("d2").add(last);				
last.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("d2").clear();
		RootPanel.get("d2").add(new gotocart());
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
