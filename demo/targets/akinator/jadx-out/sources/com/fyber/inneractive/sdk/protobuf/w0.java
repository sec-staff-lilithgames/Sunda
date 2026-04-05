package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f26514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26515b;

    /* renamed from: c, reason: collision with root package name */
    public final j4 f26516c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26517d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26518e;

    public w0(e1 e1Var, int i10, j4 j4Var, boolean z10, boolean z11) {
        this.f26514a = e1Var;
        this.f26515b = i10;
        this.f26516c = j4Var;
        this.f26517d = z10;
        this.f26518e = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26515b - ((w0) obj).f26515b;
    }
}
