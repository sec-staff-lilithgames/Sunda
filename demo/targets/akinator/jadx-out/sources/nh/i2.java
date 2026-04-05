package nh;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i2 extends f2 {

    /* renamed from: m, reason: collision with root package name */
    public transient long[] f76346m;

    /* renamed from: n, reason: collision with root package name */
    public transient int f76347n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f76348o;

    public static <K, V> i2 create() {
        return new i2(3);
    }

    public static <K, V> i2 createWithExpectedSize(int i10) {
        return new i2(i10);
    }

    @Override // nh.f2
    public final int b(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // nh.f2
    public final int c() {
        int iC = super.c();
        this.f76346m = new long[iC];
        return iC;
    }

    @Override // nh.f2, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (o()) {
            return;
        }
        this.f76347n = -2;
        this.f76348o = -2;
        long[] jArr = this.f76346m;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // nh.f2
    public final Map d() {
        Map mapD = super.d();
        this.f76346m = null;
        return mapD;
    }

    @Override // nh.f2
    public final LinkedHashMap e(int i10) {
        return new LinkedHashMap(i10, 1.0f, false);
    }

    @Override // nh.f2
    public final int g() {
        return this.f76347n;
    }

    @Override // nh.f2
    public final int h(int i10) {
        return ((int) v()[i10]) - 1;
    }

    @Override // nh.f2
    public final void l(int i10) {
        super.l(i10);
        this.f76347n = -2;
        this.f76348o = -2;
    }

    @Override // nh.f2
    public final void m(int i10, Object obj, Object obj2, int i11, int i12) {
        super.m(i10, obj, obj2, i11, i12);
        w(this.f76348o, i10);
        w(i10, -2);
    }

    @Override // nh.f2
    public final void n(int i10, int i11) {
        int size = size() - 1;
        super.n(i10, i11);
        w(((int) (v()[i10] >>> 32)) - 1, h(i10));
        if (i10 < size) {
            w(((int) (v()[size] >>> 32)) - 1, i10);
            w(i10, h(size));
        }
        v()[size] = 0;
    }

    @Override // nh.f2
    public final void t(int i10) {
        super.t(i10);
        this.f76346m = Arrays.copyOf(v(), i10);
    }

    public final long[] v() {
        long[] jArr = this.f76346m;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void w(int i10, int i11) {
        if (i10 == -2) {
            this.f76347n = i11;
        } else {
            v()[i10] = (v()[i10] & (-4294967296L)) | ((i11 + 1) & 4294967295L);
        }
        if (i11 == -2) {
            this.f76348o = i10;
        } else {
            v()[i11] = (4294967295L & v()[i11]) | ((i10 + 1) << 32);
        }
    }

    @Override // nh.f2
    public final void a(int i10) {
    }
}
