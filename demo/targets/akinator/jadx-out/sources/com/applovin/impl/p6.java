package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f15043g;

    public p6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15043g.run();
    }

    public p6(com.applovin.impl.sdk.k kVar, boolean z10, String str, Runnable runnable) {
        super(a.b.k("TaskRunnable:", str), kVar, z10);
        this.f15043g = runnable;
    }
}
