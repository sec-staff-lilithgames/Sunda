package io.odeeo.internal.q0;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f65845a;

    /* renamed from: b, reason: collision with root package name */
    public V[] f65846b;

    /* renamed from: c, reason: collision with root package name */
    public int f65847c;

    /* renamed from: d, reason: collision with root package name */
    public int f65848d;

    public d0() {
        this(10);
    }

    public final V a(long j10, boolean z10) {
        V vB = null;
        long j11 = Long.MAX_VALUE;
        while (this.f65848d > 0) {
            long j12 = j10 - this.f65845a[this.f65847c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vB = b();
            j11 = j12;
        }
        return vB;
    }

    public synchronized void add(long j10, V v10) {
        a(j10);
        a();
        a(j10, (long) v10);
    }

    public final V b() {
        a.checkState(this.f65848d > 0);
        V[] vArr = this.f65846b;
        int i10 = this.f65847c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f65847c = (i10 + 1) % vArr.length;
        this.f65848d--;
        return v10;
    }

    public synchronized void clear() {
        this.f65847c = 0;
        this.f65848d = 0;
        Arrays.fill(this.f65846b, (Object) null);
    }

    public synchronized V poll(long j10) {
        return a(j10, false);
    }

    public synchronized V pollFirst() {
        return this.f65848d == 0 ? null : b();
    }

    public synchronized V pollFloor(long j10) {
        return a(j10, true);
    }

    public synchronized int size() {
        return this.f65848d;
    }

    public d0(int i10) {
        this.f65845a = new long[i10];
        this.f65846b = (V[]) a(i10);
    }

    public final void a(long j10) {
        if (this.f65848d > 0) {
            if (j10 <= this.f65845a[((this.f65847c + r0) - 1) % this.f65846b.length]) {
                clear();
            }
        }
    }

    public final void a() {
        int length = this.f65846b.length;
        if (this.f65848d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) a(i10);
        int i11 = this.f65847c;
        int i12 = length - i11;
        System.arraycopy(this.f65845a, i11, jArr, 0, i12);
        System.arraycopy(this.f65846b, this.f65847c, vArr, 0, i12);
        int i13 = this.f65847c;
        if (i13 > 0) {
            System.arraycopy(this.f65845a, 0, jArr, i12, i13);
            System.arraycopy(this.f65846b, 0, vArr, i12, this.f65847c);
        }
        this.f65845a = jArr;
        this.f65846b = vArr;
        this.f65847c = 0;
    }

    public final void a(long j10, V v10) {
        int i10 = this.f65847c;
        int i11 = this.f65848d;
        V[] vArr = this.f65846b;
        int length = (i10 + i11) % vArr.length;
        this.f65845a[length] = j10;
        vArr[length] = v10;
        this.f65848d = i11 + 1;
    }

    public static <V> V[] a(int i10) {
        return (V[]) new Object[i10];
    }
}
