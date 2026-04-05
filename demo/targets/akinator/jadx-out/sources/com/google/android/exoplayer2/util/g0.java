package com.google.android.exoplayer2.util;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f28454a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f28455b;

    public g0() {
        this(32);
    }

    public void add(long j10) {
        int i10 = this.f28454a;
        long[] jArr = this.f28455b;
        if (i10 == jArr.length) {
            this.f28455b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f28455b;
        int i11 = this.f28454a;
        this.f28454a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long get(int i10) {
        if (i10 >= 0 && i10 < this.f28454a) {
            return this.f28455b[i10];
        }
        StringBuilder sbT = o2.t(i10, "Invalid index ", ", size is ");
        sbT.append(this.f28454a);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int size() {
        return this.f28454a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f28455b, this.f28454a);
    }

    public g0(int i10) {
        this.f28455b = new long[i10];
    }
}
