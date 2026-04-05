package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f28456a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f28457b;

    /* renamed from: c, reason: collision with root package name */
    public int f28458c;

    /* renamed from: d, reason: collision with root package name */
    public int f28459d;

    public g1() {
        this(10);
    }

    public final void a() {
        int length = this.f28457b.length;
        if (this.f28459d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f28458c;
        int i12 = length - i11;
        System.arraycopy(this.f28456a, i11, jArr, 0, i12);
        System.arraycopy(this.f28457b, this.f28458c, objArr, 0, i12);
        int i13 = this.f28458c;
        if (i13 > 0) {
            System.arraycopy(this.f28456a, 0, jArr, i12, i13);
            System.arraycopy(this.f28457b, 0, objArr, i12, this.f28458c);
        }
        this.f28456a = jArr;
        this.f28457b = objArr;
        this.f28458c = 0;
    }

    public synchronized void add(long j10, Object obj) {
        if (this.f28459d > 0) {
            if (j10 <= this.f28456a[((this.f28458c + r0) - 1) % this.f28457b.length]) {
                clear();
            }
        }
        a();
        int i10 = this.f28458c;
        int i11 = this.f28459d;
        Object[] objArr = this.f28457b;
        int length = (i10 + i11) % objArr.length;
        this.f28456a[length] = j10;
        objArr[length] = obj;
        this.f28459d = i11 + 1;
    }

    public final Object b(long j10, boolean z10) {
        Object objC = null;
        long j11 = Long.MAX_VALUE;
        while (this.f28459d > 0) {
            long j12 = j10 - this.f28456a[this.f28458c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objC = c();
            j11 = j12;
        }
        return objC;
    }

    public final Object c() {
        a.checkState(this.f28459d > 0);
        Object[] objArr = this.f28457b;
        int i10 = this.f28458c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f28458c = (i10 + 1) % objArr.length;
        this.f28459d--;
        return obj;
    }

    public synchronized void clear() {
        this.f28458c = 0;
        this.f28459d = 0;
        Arrays.fill(this.f28457b, (Object) null);
    }

    public synchronized Object poll(long j10) {
        return b(j10, false);
    }

    public synchronized Object pollFirst() {
        return this.f28459d == 0 ? null : c();
    }

    public synchronized Object pollFloor(long j10) {
        return b(j10, true);
    }

    public synchronized int size() {
        return this.f28459d;
    }

    public g1(int i10) {
        this.f28456a = new long[i10];
        this.f28457b = new Object[i10];
    }
}
