package com.projwork.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void insertquantity(String product, String quantity, String price,AsyncCallback<String> callback) throws IllegalArgumentException;
	void FetchDove(AsyncCallback<String> callback)throws IllegalArgumentException;
	void FetchLoreal(AsyncCallback<String> callback)throws IllegalArgumentException;
	void FetchSunsilk(AsyncCallback<String> callback)throws IllegalArgumentException;
	void FetchTreseme(AsyncCallback<String> callback)throws IllegalArgumentException;
	void fetchgotocart(AsyncCallback<String> callback) throws IllegalArgumentException;
	void insertorder(String s1, String s2, String s3, String s4, String s5, String s6, String s7, AsyncCallback<String> asyncCallback);
	void Check(String username, String password, AsyncCallback<String> callback)throws IllegalArgumentException;
	void insertadmin(String s1, String s2, String s3, String s4, AsyncCallback<String> asyncCallback);
	void clientreqfetch(AsyncCallback<String> callback) throws IllegalArgumentException;
	void billingfetch(AsyncCallback<String> callback) throws IllegalArgumentException;
	void insertbill(int discount,int total ,AsyncCallback<String> callback) throws IllegalArgumentException;

}
