package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14800c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0034a f14802f;

    public /* synthetic */ m(a.InterfaceC0034a interfaceC0034a, int i10, String str, int i11) {
        this.f14799b = i11;
        this.f14802f = interfaceC0034a;
        this.f14800c = i10;
        this.f14801e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14799b) {
            case 0:
                ((d.b) this.f14802f).a(this.f14800c, this.f14801e);
                break;
            default:
                ((e.b) this.f14802f).a(this.f14800c, this.f14801e);
                break;
        }
    }
}
