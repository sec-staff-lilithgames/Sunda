package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48545c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f48547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f48548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f48549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f48550i;

    public /* synthetic */ c(e1.v vVar, a.c.EnumC0490a enumC0490a, kv.l lVar, kv.q qVar, int i10, int i11) {
        this.f48544b = 1;
        this.f48545c = vVar;
        this.f48549h = enumC0490a;
        this.f48546e = lVar;
        this.f48550i = qVar;
        this.f48547f = i10;
        this.f48548g = i11;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48544b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return e.a((e1.v) this.f48545c, (String) this.f48549h, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0) this.f48550i, (kv.l) this.f48546e, this.f48547f, this.f48548g, (p0.w) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return i0.a((e1.v) this.f48545c, (a.c.EnumC0490a) this.f48549h, (kv.l) this.f48546e, (kv.q) this.f48550i, this.f48547f, this.f48548g, (p0.w) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c.a((Activity) this.f48545c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.f48549h, (kv.p) this.f48550i, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) this.f48546e, this.f48547f, this.f48548g, (p0.w) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.f48549h, (kv.a) this.f48550i, (kv.t) this.f48546e, (e1.v) this.f48545c, this.f48547f, this.f48548g, (p0.w) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) this.f48549h, (kv.a) this.f48550i, (kv.a) this.f48546e, (e1.v) this.f48545c, this.f48547f, this.f48548g, (p0.w) obj, iIntValue5);
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        this.f48544b = i12;
        this.f48545c = obj;
        this.f48549h = obj2;
        this.f48550i = obj3;
        this.f48546e = obj4;
        this.f48547f = i10;
        this.f48548g = i11;
    }

    public /* synthetic */ c(Object obj, kv.a aVar, tu.i iVar, e1.v vVar, int i10, int i11, int i12) {
        this.f48544b = i12;
        this.f48549h = obj;
        this.f48550i = aVar;
        this.f48546e = iVar;
        this.f48545c = vVar;
        this.f48547f = i10;
        this.f48548g = i11;
    }
}
