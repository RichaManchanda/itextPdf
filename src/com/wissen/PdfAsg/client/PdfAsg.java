package com.wissen.PdfAsg.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.wissen.PdfAsg.client.widgets.FramePdf;
import com.wissen.PdfAsg.client.widgets.PdfWidget;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PdfAsg implements EntryPoint {

private FlexTable flextable;
private VerticalPanel framepanel;    
    @Override
    public void onModuleLoad() {
        // TODO Auto-generated method stub
         flextable=new FlexTable();
         framepanel=new VerticalPanel();
         flextable.setWidget(1,0,new PdfWidget());
         flextable.setWidget(3,0,new FramePdf());
         RootPanel.get("pageContent").add(flextable);
        // framepanel.add(new FramePdf());
    }
   /* public void displayFramePdf()
    {
        framepanel.clear();
        framepanel.add(new FramePdf());
        
    }*/
    
}
