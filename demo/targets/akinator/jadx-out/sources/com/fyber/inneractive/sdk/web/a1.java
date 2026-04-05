package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f26837a;

    public a1(b1 b1Var) {
        this.f26837a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26837a.f26840a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
