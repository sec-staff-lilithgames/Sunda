package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.app.Activity;
import p0.k1;
import p0.l3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class d0 implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48558c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48559e;

    public /* synthetic */ d0(Object obj, int i10, int i11) {
        this.f48557b = i11;
        this.f48559e = obj;
        this.f48558c = i10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48557b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return e0.a((Activity) this.f48559e, this.f48558c, (p0.w) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                k1.LaunchedEffect((kv.p) this.f48559e, (p0.w) obj, l3.updateChangedFlags(this.f48558c | 1));
                return x0.f87415a;
        }
    }
}
