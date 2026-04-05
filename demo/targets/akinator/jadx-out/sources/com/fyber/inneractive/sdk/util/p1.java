package com.fyber.inneractive.sdk.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f26800a;

    public p1(s1 s1Var) {
        this.f26800a = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1 s1Var = this.f26800a;
        s1Var.getClass();
        r.f26803a.execute(new r1(s1Var));
    }
}
