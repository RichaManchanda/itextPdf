/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 4:14:33 PM
 */
package com.wissen.PdfAsg.client.PdfObserver;


/**
 * @author Richa
 *
 * Create Date : 19-Jan-2010
 */
public interface PdfObserver {
    void notifyPdfSucceeded(String url);
    void notifyPdfFailed(String errMessage);

}
