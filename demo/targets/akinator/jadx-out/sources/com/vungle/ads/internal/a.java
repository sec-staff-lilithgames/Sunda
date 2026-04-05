package com.vungle.ads.internal;

import android.view.ViewTreeObserver;
import com.inmobi.media.D3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50764c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f50763b = i10;
        this.f50764c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f50763b) {
            case 0:
                return ImpressionTracker.m3589_init_$lambda0((ImpressionTracker) this.f50764c);
            default:
                return D3.a((D3) this.f50764c);
        }
    }
}
