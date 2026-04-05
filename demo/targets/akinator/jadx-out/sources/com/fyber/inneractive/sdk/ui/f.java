package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAmraidWebViewController f26743a;

    public f(IAmraidWebViewController iAmraidWebViewController) {
        this.f26743a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f26743a.f26879b;
        if (mVar != null) {
            mVar.a("if (FyberMraidVideoController.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
        }
    }
}
