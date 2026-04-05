package com.unity3d.services.store.core.api;

import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.WebViewStoreExceptionHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import on.z;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Store {
    private static final WebViewStoreExceptionHandler WEB_VIEW_STORE_EXCEPTION_HANDLER;
    private static final StoreEventListenerFactory storeEventListenerFactory;
    private static final StoreMonitor storeMonitor;

    static {
        WebViewStoreExceptionHandler webViewStoreExceptionHandler = new WebViewStoreExceptionHandler(new WebViewErrorHandler());
        WEB_VIEW_STORE_EXCEPTION_HANDLER = webViewStoreExceptionHandler;
        storeEventListenerFactory = (StoreEventListenerFactory) Utilities.getService(StoreEventListenerFactory.class);
        storeMonitor = new StoreMonitor(webViewStoreExceptionHandler);
    }

    @WebViewExposed
    public static void getPurchaseHistory(Integer num, String str, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
        } else {
            storeMonitor2.getPurchaseHistory(num.intValue(), str, num2.intValue(), storeEventListenerFactory.invoke(num.intValue()));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getPurchases(Integer num, String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
        } else {
            storeMonitor2.getPurchases(num.intValue(), str, storeEventListenerFactory.invoke(num.intValue()));
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSkuDetails(Integer num, String str, JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            storeMonitor.getSkuDetails(num.intValue(), str, arrayList, storeEventListenerFactory.invoke(num.intValue()));
        } catch (JSONException e10) {
            WEB_VIEW_STORE_EXCEPTION_HANDLER.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, num.intValue(), e10);
        }
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initialize(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            storeMonitor.initialize(storeEventListenerFactory.invoke());
            webViewCallback.invoke(new Object[0]);
        } catch (Exception e10) {
            webViewCallback.error(StoreError.UNKNOWN_ERROR, e10.getMessage(), e10.getClass().getName());
        }
    }

    @WebViewExposed
    public static void isFeatureSupported(Integer num, String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
        } else {
            new Thread(new z(17, num, str)).start();
            webViewCallback.invoke(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isFeatureSupported$0(Integer num, String str) {
        storeMonitor.isFeatureSupported(num.intValue(), str, storeEventListenerFactory.invoke(num.intValue()));
    }

    @WebViewExposed
    public static void startPurchaseTracking(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!storeMonitor.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getString(i10));
            } catch (JSONException e10) {
                webViewCallback.error(StoreError.JSON_ERROR, e10.getMessage());
                return;
            }
        }
        storeMonitor.startPurchaseTracking(arrayList, storeEventListenerFactory.invoke(-1, true));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void stopPurchaseTracking(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StoreMonitor storeMonitor2 = storeMonitor;
        if (!storeMonitor2.isInitialized()) {
            webViewCallback.error(StoreError.NOT_INITIALIZED, new Object[0]);
        } else {
            storeMonitor2.stopPurchaseTracking();
            webViewCallback.invoke(new Object[0]);
        }
    }
}
