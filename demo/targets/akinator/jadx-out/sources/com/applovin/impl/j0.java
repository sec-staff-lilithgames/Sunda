package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j0 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f14160b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f14161a;

    public j0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f14161a = new AtomicReference();
        if (f14160b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f14160b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f14160b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f14161a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f14161a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f14161a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f14161a.set(MotionEvent.obtain(motionEvent));
        if (f14160b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
