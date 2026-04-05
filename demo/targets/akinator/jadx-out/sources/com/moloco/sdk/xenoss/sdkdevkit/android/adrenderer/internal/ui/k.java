package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import p0.l3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class k implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48639c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f48642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f48643h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f48644i;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f48638b = i11;
        this.f48640e = obj;
        this.f48641f = obj2;
        this.f48642g = obj3;
        this.f48643h = obj4;
        this.f48644i = obj5;
        this.f48639c = i10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48638b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return m.a((g0.e0) this.f48640e, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) this.f48641f, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) this.f48642g, (kv.b) this.f48643h, (kv.b) this.f48644i, this.f48639c, (p0.w) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                ((z0.t) this.f48640e).invoke(this.f48641f, this.f48642g, this.f48643h, this.f48644i, (p0.w) obj, l3.updateChangedFlags(this.f48639c) | 1);
                return x0.f87415a;
        }
    }
}
