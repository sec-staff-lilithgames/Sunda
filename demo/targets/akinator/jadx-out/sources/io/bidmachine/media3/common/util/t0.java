package io.bidmachine.media3.common.util;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f60799a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f60800b;

    /* renamed from: c, reason: collision with root package name */
    public int f60801c;

    /* renamed from: d, reason: collision with root package name */
    public int f60802d;

    public t0() {
        this(10);
    }

    public final void a() {
        int length = this.f60800b.length;
        if (this.f60802d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f60801c;
        int i12 = length - i11;
        System.arraycopy(this.f60799a, i11, jArr, 0, i12);
        System.arraycopy(this.f60800b, this.f60801c, objArr, 0, i12);
        int i13 = this.f60801c;
        if (i13 > 0) {
            System.arraycopy(this.f60799a, 0, jArr, i12, i13);
            System.arraycopy(this.f60800b, 0, objArr, i12, this.f60801c);
        }
        this.f60799a = jArr;
        this.f60800b = objArr;
        this.f60801c = 0;
    }

    public synchronized void add(long j10, Object obj) {
        if (this.f60802d > 0) {
            if (j10 <= this.f60799a[((this.f60801c + r0) - 1) % this.f60800b.length]) {
                clear();
            }
        }
        a();
        int i10 = this.f60801c;
        int i11 = this.f60802d;
        Object[] objArr = this.f60800b;
        int length = (i10 + i11) % objArr.length;
        this.f60799a[length] = j10;
        objArr[length] = obj;
        this.f60802d = i11 + 1;
    }

    public final Object b(long j10, boolean z10) {
        Object objC = null;
        long j11 = Long.MAX_VALUE;
        while (this.f60802d > 0) {
            long j12 = j10 - this.f60799a[this.f60801c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objC = c();
            j11 = j12;
        }
        return objC;
    }

    public final Object c() {
        a.checkState(this.f60802d > 0);
        Object[] objArr = this.f60800b;
        int i10 = this.f60801c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f60801c = (i10 + 1) % objArr.length;
        this.f60802d--;
        return obj;
    }

    public synchronized void clear() {
        this.f60801c = 0;
        this.f60802d = 0;
        Arrays.fill(this.f60800b, (Object) null);
    }

    public synchronized Object poll(long j10) {
        return b(j10, false);
    }

    public synchronized Object pollFirst() {
        return this.f60802d == 0 ? null : c();
    }

    public synchronized Object pollFloor(long j10) {
        return b(j10, true);
    }

    public synchronized int size() {
        return this.f60802d;
    }

    public t0(int i10) {
        this.f60799a = new long[i10];
        this.f60800b = new Object[i10];
    }
}
