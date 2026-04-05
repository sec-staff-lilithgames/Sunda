package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import kv.p;
import p0.l3;
import p0.w;
import tu.i;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f48755c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f48757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f48758g;

    public /* synthetic */ c(boolean z10, i iVar, int i10, int i11, int i12) {
        this.f48754b = i12;
        this.f48755c = z10;
        this.f48758g = iVar;
        this.f48756e = i10;
        this.f48757f = i11;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48754b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return d.a(this.f48755c, (p) this.f48758g, this.f48756e, this.f48757f, (w) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = l3.updateChangedFlags(this.f48756e | 1);
                g.c.BackHandler(this.f48755c, (kv.a) this.f48758g, (w) obj, iUpdateChangedFlags, this.f48757f);
                return x0.f87415a;
        }
    }
}
