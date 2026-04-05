package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k.b f49584c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f49585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f49587g;

    public /* synthetic */ a(k.b bVar, e1.v vVar, int i10, int i11, int i12) {
        this.f49583b = i12;
        this.f49584c = bVar;
        this.f49585e = vVar;
        this.f49586f = i10;
        this.f49587g = i11;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49583b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return b.a(this.f49584c, this.f49585e, this.f49586f, this.f49587g, (p0.w) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return c0.a(this.f49584c, this.f49585e, this.f49586f, this.f49587g, (p0.w) obj, iIntValue2);
        }
    }
}
