package com.applovin.impl;

import com.applovin.impl.b6;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f14009g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f14010h;

    public g6(q4 q4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f14009g = new WeakReference(q4Var);
        this.f14010h = obj;
    }

    public static void a(long j10, q4 q4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j10 <= 0) {
            return;
        }
        kVar.r0().a(new g6(q4Var, obj, str, kVar), b6.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        q4 q4Var = (q4) this.f14009g.get();
        if (q4Var == null || q4Var.c()) {
            return;
        }
        this.f14003a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14003a.O().d(this.f14004b, "Attempting to timeout pending task " + q4Var.b() + " with " + this.f14010h);
        }
        q4Var.a(this.f14010h);
    }
}
