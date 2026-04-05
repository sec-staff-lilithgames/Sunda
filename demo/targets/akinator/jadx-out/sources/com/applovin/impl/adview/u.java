package com.applovin.impl.adview;

import android.view.KeyEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f13568c;

    public /* synthetic */ u(KeyEvent.Callback callback, int i10) {
        this.f13567b = i10;
        this.f13568c = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13567b) {
            case 0:
                ((f) this.f13568c).e();
                break;
            case 1:
                ((f) this.f13568c).f();
                break;
            default:
                a.a((WebView) this.f13568c);
                break;
        }
    }
}
