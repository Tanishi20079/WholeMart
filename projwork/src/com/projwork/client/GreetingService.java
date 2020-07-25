package com.projwork.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String insertquantity(String product, String quantity, String price) throws IllegalArgumentException;
	String FetchDove()throws IllegalArgumentException;
	String FetchLoreal()throws IllegalArgumentException;
	String FetchSunsilk()throws IllegalArgumentException;
	String FetchTreseme()throws IllegalArgumentException;
	String fetchgotocart()throws IllegalArgumentException;
	String insertorder(String name,String address,String city,String state,String phone1,String phone2,String email);
	String Check(String username,String password) throws IllegalArgumentException;
	String insertadmin(String productname,String qty, String price, String brand);
	String clientreqfetch()throws IllegalArgumentException;
	String billingfetch()throws IllegalArgumentException;
	String insertbill(int discount,int total)throws IllegalArgumentException;

	}
