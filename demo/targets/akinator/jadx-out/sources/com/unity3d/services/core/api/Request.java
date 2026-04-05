package com.unity3d.services.core.api;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestListener;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.WebRequestError;
import com.unity3d.services.core.request.WebRequestEvent;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Request {
    @WebViewExposed
    public static void get(final String str, String str2, JSONArray jSONArray, Integer num, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            WebRequestThread.request(str2, WebRequest.RequestType.GET, getHeadersMap(jSONArray), null, num, num2, new IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.1
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(String str3, String str4, int i10, Map<String, List<String>> map) {
                    try {
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, str, str3, str4, Integer.valueOf(i10), Request.getResponseHeadersMap(map));
                    } catch (Exception e10) {
                        DeviceLog.exception("Error parsing response headers", e10);
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str3, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(String str3, String str4) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str3, str4);
                }
            });
            webViewCallback.invoke(str);
        } catch (Exception e10) {
            DeviceLog.exception("Error mapping headers for the request", e10);
            webViewCallback.error(WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    public static HashMap<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i10);
            List<String> arrayList = map.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(jSONArray2.getString(1));
            map.put(jSONArray2.getString(0), arrayList);
        }
        return map;
    }

    public static JSONArray getResponseHeadersMap(Map<String, List<String>> map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                JSONArray jSONArray2 = null;
                for (String str2 : map.get(str)) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(str);
                    jSONArray3.put(str2);
                    jSONArray2 = jSONArray3;
                }
                jSONArray.put(jSONArray2);
            }
        }
        return jSONArray;
    }

    @WebViewExposed
    public static void head(final String str, String str2, JSONArray jSONArray, Integer num, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            WebRequestThread.request(str2, WebRequest.RequestType.HEAD, getHeadersMap(jSONArray), num, num2, new IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.3
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(String str3, String str4, int i10, Map<String, List<String>> map) {
                    try {
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, str, str3, str4, Integer.valueOf(i10), Request.getResponseHeadersMap(map));
                    } catch (Exception e10) {
                        DeviceLog.exception("Error parsing response headers", e10);
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str3, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(String str3, String str4) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str3, str4);
                }
            });
            webViewCallback.invoke(str);
        } catch (Exception e10) {
            DeviceLog.exception("Error mapping headers for the request", e10);
            webViewCallback.error(WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void post(final String str, String str2, String str3, JSONArray jSONArray, Integer num, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str4 = (str3 == null || str3.length() != 0) ? str3 : null;
        if (jSONArray != null && jSONArray.length() == 0) {
            jSONArray = null;
        }
        try {
            WebRequestThread.request(str2, WebRequest.RequestType.POST, getHeadersMap(jSONArray), str4, num, num2, new IWebRequestListener() { // from class: com.unity3d.services.core.api.Request.2
                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onComplete(String str5, String str6, int i10, Map<String, List<String>> map) {
                    try {
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.COMPLETE, str, str5, str6, Integer.valueOf(i10), Request.getResponseHeadersMap(map));
                    } catch (Exception e10) {
                        DeviceLog.exception("Error parsing response headers", e10);
                        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str5, "Error parsing response headers");
                    }
                }

                @Override // com.unity3d.services.core.request.IWebRequestListener
                public void onFailed(String str5, String str6) {
                    WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.REQUEST, WebRequestEvent.FAILED, str, str5, str6);
                }
            });
            webViewCallback.invoke(str);
        } catch (Exception e10) {
            DeviceLog.exception("Error mapping headers for the request", e10);
            webViewCallback.error(WebRequestError.MAPPING_HEADERS_FAILED, str);
        }
    }

    @WebViewExposed
    public static void setConcurrentRequestCount(Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebRequestThread.setConcurrentRequestCount(num.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setKeepAliveTime(Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebRequestThread.setKeepAliveTime(num.longValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setMaximumPoolSize(Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebRequestThread.setMaximumPoolSize(num.intValue());
        webViewCallback.invoke(new Object[0]);
    }
}
