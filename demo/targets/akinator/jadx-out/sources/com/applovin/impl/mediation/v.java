package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14829c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14832g;

    public /* synthetic */ v(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14828b = i10;
        this.f14829c = obj;
        this.f14830e = obj2;
        this.f14831f = obj3;
        this.f14832g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14828b) {
            case 0:
                ((h.b) this.f14829c).a((z2) this.f14830e, (MaxReward) this.f14831f, (Bundle) this.f14832g);
                break;
            case 1:
                ((h.b) this.f14829c).a((Runnable) this.f14830e, (MaxAdListener) this.f14831f, (String) this.f14832g);
                break;
            case 2:
                ((MediationServiceImpl) this.f14829c).a((z2) this.f14830e, (Long) this.f14831f, (MaxAdListener) this.f14832g);
                break;
            case 3:
                ((h) this.f14829c).a((MaxAdapterResponseParameters) this.f14830e, (MaxAdFormat) this.f14831f, (Activity) this.f14832g);
                break;
            default:
                ((h) this.f14829c).a((MaxAdapter.OnCompletionListener) this.f14830e, (MaxAdapterInitializationParameters) this.f14831f, (Activity) this.f14832g);
                break;
        }
    }
}
