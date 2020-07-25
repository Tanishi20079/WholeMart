package com.projwork.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialFooter;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBar;

public class index extends Composite 
{

	private static indexUiBinder uiBinder = GWT.create(indexUiBinder.class);

	interface indexUiBinder extends UiBinder<Widget, index> {
	}
	@UiField
	MaterialNavBar nb;
	@UiField
	MaterialLink lp;
	@UiField
	MaterialLink lp3;
	@UiField
	MaterialLink lp4;
	@UiField
	MaterialLink lp2;
	@UiField
	MaterialFooter k;

	public index() {
		initWidget(uiBinder.createAndBindUi(this));
History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				// TODO Auto-generated method stub
				mainn.getInstance().fun();
			}
		});
		RootPanel.get("d1").add(nb);
		RootPanel.get("d3").add(k);
		RootPanel.get("d2").add(mainn.getInstance().getoffers());
		
		lp.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("aa1");
				mainn.getInstance().fun();
			}
		});



		lp2.addClickHandler(new ClickHandler() {
	
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				History.newItem("aa2");
				mainn.getInstance().fun();
			}
		});
		
	
		
		lp3.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						History.newItem("aa6");
						mainn.getInstance().fun();
					}
				});
		lp4.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						History.newItem("aa7");
						mainn.getInstance().fun();
					}
				});
			}

	}



