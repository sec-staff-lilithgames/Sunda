package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f24279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f24281d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z10) {
        this.f24281d = t0Var;
        this.f24278a = obj;
        this.f24279b = exc;
        this.f24280c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24281d.f24283b.a(this.f24278a, this.f24279b, this.f24280c);
    }
}
