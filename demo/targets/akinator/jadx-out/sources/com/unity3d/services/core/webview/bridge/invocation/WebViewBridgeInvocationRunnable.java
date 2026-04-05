package com.unity3d.services.core.webview.bridge.invocation;

import android.os.ConditionVariable;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewBridgeInvocationRunnable implements Runnable {
    private static CallbackStatus _callbackStatus;
    private static ConditionVariable _responseTimeout;
    private String _className;
    private IWebViewBridgeInvocationCallback _invocationCallback;
    private Object[] _invocationParameters;
    private String _methodName;
    private int _timeoutLengthInMilliSeconds;
    private Method _webViewBridgeCallbackMethod;
    private IWebViewBridgeInvoker _webViewBridgeInvoker;

    public WebViewBridgeInvocationRunnable(IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback, IWebViewBridgeInvoker iWebViewBridgeInvoker, String str, String str2, int i10, Object... objArr) {
        try {
            this._webViewBridgeCallbackMethod = WebViewBridgeInvocationRunnable.class.getMethod("onInvocationComplete", CallbackStatus.class);
            this._invocationCallback = iWebViewBridgeInvocationCallback;
            this._webViewBridgeInvoker = iWebViewBridgeInvoker;
            this._className = str;
            this._methodName = str2;
            this._timeoutLengthInMilliSeconds = i10;
            this._invocationParameters = objArr;
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", e10);
        }
    }

    public static synchronized void onInvocationComplete(CallbackStatus callbackStatus) {
        _callbackStatus = callbackStatus;
        ConditionVariable conditionVariable = _responseTimeout;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        _callbackStatus = null;
        _responseTimeout = new ConditionVariable();
        boolean zInvokeMethod = this._webViewBridgeInvoker.invokeMethod(this._className, this._methodName, this._webViewBridgeCallbackMethod, this._invocationParameters);
        IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback = this._invocationCallback;
        if (iWebViewBridgeInvocationCallback == null) {
            return;
        }
        if (!zInvokeMethod) {
            iWebViewBridgeInvocationCallback.onFailure("WebViewBridgeInvocationRunnable:run: invokeMethod failure", null);
            return;
        }
        if (!_responseTimeout.block(this._timeoutLengthInMilliSeconds)) {
            this._invocationCallback.onTimeout();
        } else if (_callbackStatus == CallbackStatus.OK) {
            this._invocationCallback.onSuccess();
        } else {
            this._invocationCallback.onFailure("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", _callbackStatus);
        }
    }
}
