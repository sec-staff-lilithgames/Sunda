package io.bidmachine.media3.common.util;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f60701a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f60702b;

    public c0() {
        this(32);
    }

    public void add(long j10) {
        int i10 = this.f60701a;
        long[] jArr = this.f60702b;
        if (i10 == jArr.length) {
            this.f60702b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f60702b;
        int i11 = this.f60701a;
        this.f60701a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void addAll(long[] jArr) {
        int length = this.f60701a + jArr.length;
        long[] jArr2 = this.f60702b;
        if (length > jArr2.length) {
            this.f60702b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f60702b, this.f60701a, jArr.length);
        this.f60701a = length;
    }

    public long get(int i10) {
        if (i10 >= 0 && i10 < this.f60701a) {
            return this.f60702b[i10];
        }
        StringBuilder sbT = o2.t(i10, "Invalid index ", ", size is ");
        sbT.append(this.f60701a);
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public int size() {
        return this.f60701a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f60702b, this.f60701a);
    }

    public c0(int i10) {
        this.f60702b = new long[i10];
    }
}
