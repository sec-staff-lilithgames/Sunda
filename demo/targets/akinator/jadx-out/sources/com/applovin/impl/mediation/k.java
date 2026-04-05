package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q4;
import com.applovin.impl.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements q4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f14788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14790d;

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i10) {
        this.f14787a = i10;
        this.f14788b = mediationServiceImpl;
        this.f14789c = obj;
        this.f14790d = obj2;
    }

    @Override // com.applovin.impl.q4.a
    public final void a(Object obj) {
        switch (this.f14787a) {
            case 0:
                this.f14788b.a((h) this.f14789c, (q4) this.f14790d, (String) obj);
                break;
            default:
                this.f14788b.a((v2) this.f14789c, (a.InterfaceC0034a) this.f14790d, (String) obj);
                break;
        }
    }
}
