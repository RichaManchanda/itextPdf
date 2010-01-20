/*
 Copyright 2010 Wissen System Pvt. Ltd. All rights reserved.
 Author: Richa Manchanda on 4:13:31 PM
 */
package com.wissen.PdfAsg.client.controller;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.wissen.PdfAsg.client.PdfObserver.*;
import com.wissen.PdfAsg.client.services.PdfService;
import com.wissen.PdfAsg.client.services.PdfServiceAsync;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;




/**
 * @author Richa
 *
 * Create Date : 19-Jan-2010
 */
public class Controller {
    private final PdfServiceAsync pdfService = GWT.create(PdfService.class);
    private static Controller _instance;

   private Controller() {
       }
   
   public static Controller getInstance() {
       // TODO Auto-generated method stub
       if (_instance == null) {
           _instance = new Controller();
       }
       return _instance;
       
   }
   
   public PdfServiceAsync getPdfService() {
       return pdfService;
   }
   
   public void viewPdf() {
       // TODO Auto-generated method stub
       pdfService.viewPdf(callback);
       
   }
   
     private List<PdfObserver> pdfObservers=new ArrayList<PdfObserver>();
    
   
   //----------------Adding and removing observers------------------//
   
   public void addPdfObserver(PdfObserver observer) {
       pdfObservers.add(observer);
   }

   public void removePdfObserver(PdfObserver observer) {
       pdfObservers.remove(observer);
   }
 
   
// --------------- Registration and DeRegitration methods --------------//
   
   AsyncCallback<String> callback = new AsyncCallback<String>() {
       
       @Override
       public void onFailure(Throwable caught) {
           GWT.log("Sorry Error in conversion", caught);
           for (PdfObserver observer : pdfObservers) {
               observer.notifyPdfFailed("Pdf failed :: "+caught);
           }
       }
   @Override
   public void onSuccess(String url) {
       // TODO Auto-generated method stub
       for (PdfObserver observer : pdfObservers) {
           observer.notifyPdfSucceeded(url);
           //Window.alert(url+" Created Pdf.....");
       }
   }
   };

}
