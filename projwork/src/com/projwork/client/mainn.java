package com.projwork.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class mainn {
	private static mainn aa=null;
	offers a2=null;
	shampoo a3=null;
	login a7=null;
	aboutus a8=null;

	
	private mainn() {}
	

	public static mainn getInstance() {
		// TODO Auto-generated method stub
		if(aa==null)
			aa=new mainn();
		return aa;
	}
	public void fun()
	{
		if(History.getToken()=="aa1")
		{
			RootPanel.get("d2").clear();
			RootPanel.get("d2").add(getoffers());

		}
		if(History.getToken()=="aa2")
		{
			RootPanel.get("d2").clear();
			RootPanel.get("d2").add(getshampoo());

		}
			if(History.getToken()=="aa6")
		{
			RootPanel.get("d2").clear();
			RootPanel.get("d2").add(getlogin());

		}
		if(History.getToken()=="aa7")
		{
			RootPanel.get("d2").clear();
			RootPanel.get("d2").add(getabout());

		}
	}


		aboutus getabout() {
		// TODO Auto-generated method stub
			if(a8==null)
			a8=new aboutus();
		return a8;
	}


		login getlogin() {
		// TODO Auto-generated method stub
			if(a7==null)
				a7=new login();
			return a7;
	}




	

	shampoo getshampoo() {
		// TODO Auto-generated method stub
		if(a3==null)
			a3=new shampoo();
		return a3;
	}


	offers getoffers() {
		// TODO Auto-generated method stub
		if(a2==null)
			a2=new offers();
		return a2;
	}



}
