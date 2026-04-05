package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import p0.h3;
import p0.l3;
import p0.n0;
import p0.o0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47560c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f47562f;

    public /* synthetic */ a(Object obj, Object obj2, int i10, int i11) {
        this.f47559b = i11;
        this.f47562f = obj;
        this.f47560c = obj2;
        this.f47561e = i10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47559b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                ((Integer) obj2).intValue();
                o0.CompositionLocalProvider((h3) this.f47562f, (kv.p) this.f47560c, (p0.w) obj, l3.updateChangedFlags(this.f47561e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                o0.CompositionLocalProvider((h3[]) this.f47562f, (kv.p) this.f47560c, (p0.w) obj, l3.updateChangedFlags(this.f47561e | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                o0.CompositionLocalProvider((n0) this.f47562f, (kv.p) this.f47560c, (p0.w) obj, l3.updateChangedFlags(this.f47561e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = l3.updateChangedFlags(this.f47561e) | 1;
                ((z0.t) this.f47562f).invoke(this.f47560c, (p0.w) obj, iUpdateChangedFlags);
                break;
        }
        return x0.f87415a;
    }
}
