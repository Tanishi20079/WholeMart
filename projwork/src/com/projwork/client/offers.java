package com.projwork.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialSlideItem;
import gwt.material.design.client.ui.MaterialSlider;

public class offers extends Composite  {

	private static offersUiBinder uiBinder = GWT.create(offersUiBinder.class);

	interface offersUiBinder extends UiBinder<Widget, offers> {
	}


	public offers() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	MaterialSlider z1;
	@UiField
	MaterialSlideItem z2;
	@UiField
	MaterialSlideItem z3;
	@UiField
	MaterialSlideItem z4;
	@UiField
	MaterialSlideItem z5;
	@UiField
	MaterialSlideItem z6;
	@UiField
	MaterialSlideItem z7;
	@UiField
	MaterialSlideItem z8;
	@UiField
	MaterialSlideItem z9;
	@UiField
	MaterialSlideItem z10;
	@UiField
	MaterialSlideItem z11;

	
}
