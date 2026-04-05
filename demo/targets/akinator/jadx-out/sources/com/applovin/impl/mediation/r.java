package com.applovin.impl.mediation;

import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.h;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14817c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14818e;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.f14816b = i10;
        this.f14817c = obj;
        this.f14818e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14816b) {
            case 0:
                ((h.b) this.f14817c).a((MaxError) this.f14818e);
                break;
            case 1:
                ((MediationServiceImpl.b) this.f14817c).a((MaxAd) this.f14818e);
                break;
            case 2:
                ((b) this.f14817c).c((z2) this.f14818e);
                break;
            case 3:
                ((c) this.f14817c).a((z2) this.f14818e);
                break;
            default:
                ((h) this.f14817c).a((Runnable) this.f14818e);
                break;
        }
    }
}
