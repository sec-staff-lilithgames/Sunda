package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25360c;

    /* renamed from: d, reason: collision with root package name */
    public int f25361d;

    /* renamed from: e, reason: collision with root package name */
    public String f25362e;

    public e0(int i10, int i11, int i12) {
        this.f25358a = i10 != Integer.MIN_VALUE ? o2.j(i10, "/") : "";
        this.f25359b = i11;
        this.f25360c = i12;
        this.f25361d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i10 = this.f25361d;
        this.f25361d = i10 == Integer.MIN_VALUE ? this.f25359b : i10 + this.f25360c;
        this.f25362e = this.f25358a + this.f25361d;
    }

    public final void b() {
        if (this.f25361d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
