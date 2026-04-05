package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f26355a;

    public c0(b0 b0Var) {
        Charset charset = l1.f26429a;
        if (b0Var == null) {
            throw new NullPointerException("output");
        }
        this.f26355a = b0Var;
        b0Var.f26350a = this;
    }

    public final void a(int i10, float f10) {
        b0 b0Var = this.f26355a;
        b0Var.getClass();
        b0Var.a(i10, Float.floatToRawIntBits(f10));
    }

    public final void a(int i10, double d10) {
        b0 b0Var = this.f26355a;
        b0Var.getClass();
        b0Var.a(i10, Double.doubleToRawLongBits(d10));
    }

    public final void a(int i10, int i11) {
        this.f26355a.d(i10, b0.d(i11));
    }

    public final void a(int i10, long j10) {
        this.f26355a.b(i10, b0.b(j10));
    }

    public final void a(int i10, Object obj, t2 t2Var) {
        b0 b0Var = this.f26355a;
        b0Var.c(i10, 3);
        t2Var.a(obj, b0Var.f26350a);
        b0Var.c(i10, 4);
    }
}
