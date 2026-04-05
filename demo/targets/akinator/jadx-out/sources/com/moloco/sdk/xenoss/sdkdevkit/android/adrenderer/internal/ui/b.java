package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class b implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f48530c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f48531e;

    public /* synthetic */ b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, String str, int i10) {
        this.f48529b = i10;
        this.f48530c = e0Var;
        this.f48531e = str;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f48529b) {
            case 0:
                return e.b(this.f48530c, this.f48531e, (String) obj);
            case 1:
                return e.c(this.f48530c, this.f48531e, (String) obj);
            default:
                return e.a(this.f48530c, this.f48531e, (String) obj);
        }
    }
}
