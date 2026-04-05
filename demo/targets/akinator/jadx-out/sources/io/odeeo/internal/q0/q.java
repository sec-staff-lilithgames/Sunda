package io.odeeo.internal.q0;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f65917a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f65918b;

    public q() {
        this(32);
    }

    public void add(long j10) {
        int i10 = this.f65917a;
        long[] jArr = this.f65918b;
        if (i10 == jArr.length) {
            this.f65918b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f65918b;
        int i11 = this.f65917a;
        this.f65917a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long get(int i10) {
        if (i10 >= 0 && i10 < this.f65917a) {
            return this.f65918b[i10];
        }
        StringBuilder sbT = o2.t(i10, "Invalid index ", ", size is ");
        sbT.append(this.f65917a);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int size() {
        return this.f65917a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f65918b, this.f65917a);
    }

    public q(int i10) {
        this.f65918b = new long[i10];
    }
}
