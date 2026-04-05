package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.i2;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n2<K> {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f66978a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f66979b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f66980c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f66981d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f66982e;

    /* renamed from: f, reason: collision with root package name */
    public transient long[] f66983f;

    /* renamed from: g, reason: collision with root package name */
    public transient float f66984g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f66985h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends i2.e<K> {

        /* renamed from: a, reason: collision with root package name */
        public final K f66986a;

        /* renamed from: b, reason: collision with root package name */
        public int f66987b;

        public a(int i10) {
            this.f66986a = (K) n2.this.f66978a[i10];
            this.f66987b = i10;
        }

        public void a() {
            int i10 = this.f66987b;
            if (i10 == -1 || i10 >= n2.this.c() || !io.odeeo.internal.t0.p.equal(this.f66986a, n2.this.f66978a[this.f66987b])) {
                this.f66987b = n2.this.a(this.f66986a);
            }
        }

        @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
        public int getCount() {
            a();
            int i10 = this.f66987b;
            if (i10 == -1) {
                return 0;
            }
            return n2.this.f66979b[i10];
        }

        @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
        public K getElement() {
            return this.f66986a;
        }

        public int setCount(int i10) {
            a();
            int i11 = this.f66987b;
            if (i11 == -1) {
                n2.this.put(this.f66986a, i10);
                return 0;
            }
            int[] iArr = n2.this.f66979b;
            int i12 = iArr[i11];
            iArr[i11] = i10;
            return i12;
        }
    }

    public n2() {
        a(3, 1.0f);
    }

    public static int b(long j10) {
        return (int) j10;
    }

    public static <K> n2<K> create() {
        return new n2<>();
    }

    public static <K> n2<K> createWithExpectedSize(int i10) {
        return new n2<>(i10);
    }

    public static long[] f(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] g(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public int a(int i10, int i11) {
        return i10 - 1;
    }

    public int c() {
        return this.f66980c;
    }

    public void clear() {
        this.f66981d++;
        Arrays.fill(this.f66978a, 0, this.f66980c, (Object) null);
        Arrays.fill(this.f66979b, 0, this.f66980c, 0);
        Arrays.fill(this.f66982e, -1);
        Arrays.fill(this.f66983f, -1L);
        this.f66980c = 0;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public int d(int i10) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, this.f66980c);
        return this.f66979b[i10];
    }

    public void e(int i10) {
        int iC = c() - 1;
        if (i10 >= iC) {
            this.f66978a[i10] = null;
            this.f66979b[i10] = 0;
            this.f66983f[i10] = -1;
            return;
        }
        Object[] objArr = this.f66978a;
        objArr[i10] = objArr[iC];
        int[] iArr = this.f66979b;
        iArr[i10] = iArr[iC];
        objArr[iC] = null;
        iArr[iC] = 0;
        long[] jArr = this.f66983f;
        long j10 = jArr[iC];
        jArr[i10] = j10;
        jArr[iC] = -1;
        int iA = a(j10) & b();
        int[] iArr2 = this.f66982e;
        int i11 = iArr2[iA];
        if (i11 == iC) {
            iArr2[iA] = i10;
            return;
        }
        while (true) {
            long j11 = this.f66983f[i11];
            int iB = b(j11);
            if (iB == iC) {
                this.f66983f[i11] = a(j11, i10);
                return;
            }
            i11 = iB;
        }
    }

    public int get(Object obj) {
        int iA = a(obj);
        if (iA == -1) {
            return 0;
        }
        return this.f66979b[iA];
    }

    public int h(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f66980c) {
            return i11;
        }
        return -1;
    }

    public int i(int i10) {
        return a(this.f66978a[i10], a(this.f66983f[i10]));
    }

    public void j(int i10) {
        this.f66978a = Arrays.copyOf(this.f66978a, i10);
        this.f66979b = Arrays.copyOf(this.f66979b, i10);
        long[] jArr = this.f66983f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f66983f = jArrCopyOf;
    }

    public final void k(int i10) {
        int length = this.f66983f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                j(iMax);
            }
        }
    }

    public final void l(int i10) {
        if (this.f66982e.length >= 1073741824) {
            this.f66985h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f66984g)) + 1;
        int[] iArrG = g(i10);
        long[] jArr = this.f66983f;
        int length = iArrG.length - 1;
        for (int i12 = 0; i12 < this.f66980c; i12++) {
            int iA = a(jArr[i12]);
            int i13 = iA & length;
            int i14 = iArrG[i13];
            iArrG[i13] = i12;
            jArr[i12] = (iA << 32) | (i14 & 4294967295L);
        }
        this.f66985h = i11;
        this.f66982e = iArrG;
    }

    public int put(K k10, int i10) {
        r.b(i10, "count");
        long[] jArr = this.f66983f;
        Object[] objArr = this.f66978a;
        int[] iArr = this.f66979b;
        int iA = b1.a(k10);
        int iB = b() & iA;
        int i11 = this.f66980c;
        int[] iArr2 = this.f66982e;
        int i12 = iArr2[iB];
        if (i12 == -1) {
            iArr2[iB] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (a(j10) == iA && io.odeeo.internal.t0.p.equal(k10, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int iB2 = b(j10);
                if (iB2 == -1) {
                    jArr[i12] = a(j10, i11);
                    break;
                }
                i12 = iB2;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        k(i14);
        a(i11, k10, i10, iA);
        this.f66980c = i14;
        if (i11 >= this.f66985h) {
            l(this.f66982e.length * 2);
        }
        this.f66981d++;
        return 0;
    }

    public int remove(Object obj) {
        return a(obj, b1.a(obj));
    }

    public static int a(long j10) {
        return (int) (j10 >>> 32);
    }

    public final int b() {
        return this.f66982e.length - 1;
    }

    public K c(int i10) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, this.f66980c);
        return (K) this.f66978a[i10];
    }

    public n2(n2<? extends K> n2Var) {
        a(n2Var.c(), 1.0f);
        int iA = n2Var.a();
        while (iA != -1) {
            put(n2Var.c(iA), n2Var.d(iA));
            iA = n2Var.h(iA);
        }
    }

    public static long a(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    public void b(int i10, int i11) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, this.f66980c);
        this.f66979b[i10] = i11;
    }

    public void a(int i10, float f10) {
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        io.odeeo.internal.t0.u.checkArgument(f10 > 0.0f, "Illegal load factor");
        int iA = b1.a(i10, f10);
        this.f66982e = g(iA);
        this.f66984g = f10;
        this.f66978a = new Object[i10];
        this.f66979b = new int[i10];
        this.f66983f = f(i10);
        this.f66985h = Math.max(1, (int) (iA * f10));
    }

    public h2.a<K> b(int i10) {
        io.odeeo.internal.t0.u.checkElementIndex(i10, this.f66980c);
        return new a(i10);
    }

    public n2(int i10) {
        this(i10, 1.0f);
    }

    public n2(int i10, float f10) {
        a(i10, f10);
    }

    public int a() {
        return this.f66980c == 0 ? -1 : 0;
    }

    public void a(int i10) {
        if (i10 > this.f66983f.length) {
            j(i10);
        }
        if (i10 >= this.f66985h) {
            l(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public void a(int i10, K k10, int i11, int i12) {
        this.f66983f[i10] = (i12 << 32) | 4294967295L;
        this.f66978a[i10] = k10;
        this.f66979b[i10] = i11;
    }

    public int a(Object obj) {
        int iA = b1.a(obj);
        int iB = this.f66982e[b() & iA];
        while (iB != -1) {
            long j10 = this.f66983f[iB];
            if (a(j10) == iA && io.odeeo.internal.t0.p.equal(obj, this.f66978a[iB])) {
                return iB;
            }
            iB = b(j10);
        }
        return -1;
    }

    public final int a(Object obj, int i10) {
        int iB = b() & i10;
        int i11 = this.f66982e[iB];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (a(this.f66983f[i11]) == i10 && io.odeeo.internal.t0.p.equal(obj, this.f66978a[i11])) {
                int i13 = this.f66979b[i11];
                if (i12 == -1) {
                    this.f66982e[iB] = b(this.f66983f[i11]);
                } else {
                    long[] jArr = this.f66983f;
                    jArr[i12] = a(jArr[i12], b(jArr[i11]));
                }
                e(i11);
                this.f66980c--;
                this.f66981d++;
                return i13;
            }
            int iB2 = b(this.f66983f[i11]);
            if (iB2 == -1) {
                return 0;
            }
            i12 = i11;
            i11 = iB2;
        }
    }
}
