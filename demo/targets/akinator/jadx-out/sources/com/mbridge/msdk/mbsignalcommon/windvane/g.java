package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected Context f41947a;

    /* renamed from: b, reason: collision with root package name */
    protected Object f41948b;

    /* renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f41949c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f41947a = context;
        this.f41949c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f41948b = obj;
        this.f41949c = windVaneWebView;
    }
}
