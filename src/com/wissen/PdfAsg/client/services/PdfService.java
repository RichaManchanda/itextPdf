/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 4:18:52 PM
 */
package com.wissen.PdfAsg.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.client.rpc.AsyncCallback;


/**
 * @author Richa
 *
 * Create Date : 19-Jan-2010
 */

    @SuppressWarnings("unused")
    @RemoteServiceRelativePath("greet")
    
    public interface PdfService extends RemoteService
    {
       public String viewPdf();
    }

