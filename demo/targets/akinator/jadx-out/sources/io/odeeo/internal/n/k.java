package io.odeeo.internal.n;

import io.odeeo.internal.b.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f64862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64864c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64865d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64866e;

    /* renamed from: f, reason: collision with root package name */
    public final t f64867f;

    /* renamed from: g, reason: collision with root package name */
    public final int f64868g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f64869h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f64870i;

    /* renamed from: j, reason: collision with root package name */
    public final int f64871j;

    /* renamed from: k, reason: collision with root package name */
    public final l[] f64872k;

    public k(int i10, int i11, long j10, long j11, long j12, t tVar, int i12, l[] lVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f64862a = i10;
        this.f64863b = i11;
        this.f64864c = j10;
        this.f64865d = j11;
        this.f64866e = j12;
        this.f64867f = tVar;
        this.f64868g = i12;
        this.f64872k = lVarArr;
        this.f64871j = i13;
        this.f64869h = jArr;
        this.f64870i = jArr2;
    }

    public k copyWithFormat(t tVar) {
        return new k(this.f64862a, this.f64863b, this.f64864c, this.f64865d, this.f64866e, tVar, this.f64868g, this.f64872k, this.f64871j, this.f64869h, this.f64870i);
    }

    public l getSampleDescriptionEncryptionBox(int i10) {
        l[] lVarArr = this.f64872k;
        if (lVarArr == null) {
            return null;
        }
        return lVarArr[i10];
    }
}
