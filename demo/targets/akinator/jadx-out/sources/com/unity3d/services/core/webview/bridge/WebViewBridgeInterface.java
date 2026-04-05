package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import k6.a;
import k6.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JavascriptInterface
    public final void handleCallback(String callbackId, String callbackStatus, String rawParameters) throws Exception {
        e0.checkNotNullParameter(callbackId, "callbackId");
        e0.checkNotNullParameter(callbackStatus, "callbackStatus");
        e0.checkNotNullParameter(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(String data) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(data, "data");
        DeviceLog.debug("handleInvocation " + data);
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            e0.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            e0.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            e0.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView view, l message, Uri sourceOrigin, boolean z10, a replyProxy) throws Exception {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        e0.checkNotNullParameter(replyProxy, "replyProxy");
        String data = message.getData();
        if (!z10 || data == null || n0.isBlank(data)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(data);
        String callbackId = jSONObject.getString("id");
        String callbackStatus = jSONObject.getString("status");
        String rawParameters = jSONObject.getString("parameters");
        e0.checkNotNullExpressionValue(callbackId, "callbackId");
        e0.checkNotNullExpressionValue(callbackStatus, "callbackStatus");
        e0.checkNotNullExpressionValue(rawParameters, "rawParameters");
        handleCallback(callbackId, callbackStatus, rawParameters);
    }

    public final void onHandleInvocation(WebView view, l message, Uri sourceOrigin, boolean z10, a replyProxy) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(sourceOrigin, "sourceOrigin");
        e0.checkNotNullParameter(replyProxy, "replyProxy");
        String data = message.getData();
        if (!z10 || data == null || n0.isBlank(data)) {
            return;
        }
        handleInvocation(data);
    }

    public WebViewBridgeInterface(IWebViewBridge webViewBridge, IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        e0.checkNotNullParameter(webViewBridge, "webViewBridge");
        e0.checkNotNullParameter(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i10, u uVar) {
        this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
