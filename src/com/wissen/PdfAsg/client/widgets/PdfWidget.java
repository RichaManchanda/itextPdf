/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 4:21:37 PM
 */
package com.wissen.PdfAsg.client.widgets;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.wissen.PdfAsg.client.PdfObserver.PdfObserver;
import com.wissen.PdfAsg.client.controller.Controller;

/**
 * @author Richa
 *
 * Create Date : 19-Jan-2010
 */
public class PdfWidget extends Composite implements PdfObserver {
        private HorizontalPanel buttonPanel;
        private Button viewbutton;
        
        public PdfWidget()
        {
            buttonPanel=new HorizontalPanel();
            viewbutton=new Button("View_Pdf");
            buttonPanel.add(viewbutton);
            
            viewbutton.addClickHandler(new ClickHandler()
            {
                public void onClick(ClickEvent event)
                {
                    viewPdf();
                }
            });
            initWidget(buttonPanel);
            Controller.getInstance().addPdfObserver(this);
        }
        private void viewPdf()
        {
            Controller.getInstance().viewPdf();
        }
        @Override
        public void notifyPdfFailed(String errMessage) {
            // TODO Auto-generated method stub
            Window.alert(errMessage);
        }
        @Override
        public void notifyPdfSucceeded(String url) {
            // TODO Auto-generated method stub
            Window.alert("Pdf is created");
        }
    }


