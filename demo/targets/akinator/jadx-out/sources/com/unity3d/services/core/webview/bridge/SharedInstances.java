package com.unity3d.services.core.webview.bridge;

import com.google.android.gms.internal.ads.a;
import com.unity3d.services.core.webview.WebViewApp;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SharedInstances {
    public static final SharedInstances INSTANCE = new SharedInstances();
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new a(15);
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public NativeCallback getCallback(String callbackId) {
            e0.checkNotNullParameter(callbackId, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(callbackId);
            e0.checkNotNullExpressionValue(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(NativeCallback callback) {
            e0.checkNotNullParameter(callback, "callback");
            WebViewApp.getCurrentApp().removeCallback(callback);
        }
    };
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            return WebViewApp.getCurrentApp() != null;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
            e0.checkNotNullParameter(eventCategory, "eventCategory");
            e0.checkNotNullParameter(eventId, "eventId");
            e0.checkNotNullParameter(params, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
            }
            return false;
        }
    };
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(String str, String str2, Object[] objArr) throws Exception {
            WebViewBridge.getInstance().handleCallback(str, str2, objArr);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation it) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(it, "it");
        WebViewApp.getCurrentApp().invokeCallback(it);
    }

    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
