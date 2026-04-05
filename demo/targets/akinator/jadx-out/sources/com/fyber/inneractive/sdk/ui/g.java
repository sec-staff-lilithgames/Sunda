package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAmraidWebViewController f26744a;

    public g(IAmraidWebViewController iAmraidWebViewController) {
        this.f26744a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f26744a.f26879b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}
