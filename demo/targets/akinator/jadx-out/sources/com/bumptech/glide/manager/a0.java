package com.bumptech.glide.manager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f16622c;

    public a0(b0 b0Var, boolean z10) {
        this.f16622c = b0Var;
        this.f16621b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        j9.s.assertMainThread();
        c0 c0Var = this.f16622c.f16623a;
        boolean z10 = c0Var.f16624a;
        boolean z11 = this.f16621b;
        c0Var.f16624a = z11;
        if (z10 != z11) {
            c0Var.f16625b.onConnectivityChanged(z11);
        }
    }
}
