/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 4:19:08 PM
 */
package com.wissen.PdfAsg.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * @author Richa
 *
 * Create Date : 19-Jan-2010
 */
public interface PdfServiceAsync {
    void viewPdf(AsyncCallback<String> callback);
}
