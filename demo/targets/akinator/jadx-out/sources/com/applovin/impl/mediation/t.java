package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14823c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14825f;

    public /* synthetic */ t(Object obj, int i10, Object obj2, Object obj3) {
        this.f14822b = i10;
        this.f14823c = obj;
        this.f14824e = obj2;
        this.f14825f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14822b) {
            case 0:
                ((h.b) this.f14823c).a((MaxError) this.f14824e, (Bundle) this.f14825f);
                break;
            case 1:
                ((h.c) this.f14823c).a((MaxAdapter.InitializationStatus) this.f14824e, (String) this.f14825f);
                break;
            case 2:
                ((h) this.f14823c).a((v2) this.f14824e, (Runnable) this.f14825f);
                break;
            default:
                ((h) this.f14823c).a((String) this.f14824e, (Runnable) this.f14825f);
                break;
        }
    }
}
