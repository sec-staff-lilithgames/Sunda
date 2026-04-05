package com.unity3d.services.core.webview.bridge;

import b3.h;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Invocation {
    private static AtomicInteger _idCount = new AtomicInteger(0);
    private static Map<Integer, Invocation> _invocationSets;
    private IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private ArrayList<ArrayList<Object>> _invocations;
    private ArrayList<ArrayList<Object>> _responses;
    private final IWebViewBridge _webViewBridge;

    /* JADX WARN: Illegal instructions before constructor call */
    public Invocation() {
        SharedInstances sharedInstances = SharedInstances.INSTANCE;
        this(sharedInstances.getWebViewAppInvocationCallbackInvoker(), sharedInstances.getWebViewBridge());
    }

    public static synchronized Invocation getInvocationById(int i10) {
        Map<Integer, Invocation> map = _invocationSets;
        if (map == null || !map.containsKey(Integer.valueOf(i10))) {
            return null;
        }
        return _invocationSets.get(Integer.valueOf(i10));
    }

    public void addInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) {
        if (this._invocations == null) {
            this._invocations = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(webViewCallback);
        this._invocations.add(arrayList);
    }

    public int getId() {
        return this._invocationId;
    }

    public ArrayList<ArrayList<Object>> getResponses() {
        return this._responses;
    }

    public boolean nextInvocation() {
        ArrayList<ArrayList<Object>> arrayList = this._invocations;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList<Object> arrayListRemove = this._invocations.remove(0);
        String str = (String) arrayListRemove.get(0);
        String str2 = (String) arrayListRemove.get(1);
        Object[] objArr = (Object[]) arrayListRemove.get(2);
        try {
            this._webViewBridge.handleInvocation(str, str2, objArr, (WebViewCallback) arrayListRemove.get(3));
        } catch (Exception e10) {
            String string = Arrays.toString(objArr);
            StringBuilder sbB = h.b("Error handling invocation ", str, ".", str2, "(");
            sbB.append(string);
            sbB.append(")");
            DeviceLog.exception(sbB.toString(), e10);
        }
        return true;
    }

    public void sendInvocationCallback() {
        _invocationSets.remove(Integer.valueOf(getId()));
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public void setInvocationResponse(CallbackStatus callbackStatus, Enum r32, Object... objArr) {
        if (this._responses == null) {
            this._responses = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(callbackStatus);
        arrayList.add(r32);
        arrayList.add(objArr);
        this._responses.add(arrayList);
    }

    public Invocation(IWebViewBridge iWebViewBridge) {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iWebViewBridge);
    }

    public Invocation(IInvocationCallbackInvoker iInvocationCallbackInvoker, IWebViewBridge iWebViewBridge) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker;
        this._webViewBridge = iWebViewBridge;
        this._invocationId = _idCount.getAndIncrement();
        if (_invocationSets == null) {
            _invocationSets = new HashMap();
        }
        _invocationSets.put(Integer.valueOf(this._invocationId), this);
    }
}
