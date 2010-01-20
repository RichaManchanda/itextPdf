/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 12:04:04 PM
 */
package com.wissen.PdfAsg.client.widgets;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.wissen.PdfAsg.client.PdfObserver.PdfObserver;
import com.wissen.PdfAsg.client.controller.Controller;
import com.google.gwt.user.client.ui.Composite;


/**
 * @author Richa
 *
 * Create Date : 20-Jan-2010
 */
public class FramePdf extends Composite implements PdfObserver{
    private HorizontalPanel framepanel;
    Frame framepdf;
    
    public FramePdf() 
    {
        framepanel=new HorizontalPanel();
        framepdf=new Frame("/FlightTicket.pdf");
        framepdf.setWidth("100%");
        framepanel.add(framepdf);
        initWidget(framepanel);
        Controller.getInstance().addPdfObserver(this);
        
    }

    /**
     * @see com.wissen.PdfAsg.client.PdfObserver.PdfObserver#notifyPdfFailed(java.lang.String)
     */
    @Override
    public void notifyPdfFailed(String errMessage) {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see com.wissen.PdfAsg.client.PdfObserver.PdfObserver#notifyPdfSucceeded(java.lang.String)
     */
    @Override
    public void notifyPdfSucceeded(String url) {
        // TODO Auto-generated method stub
        
    }

   
    
    

}
