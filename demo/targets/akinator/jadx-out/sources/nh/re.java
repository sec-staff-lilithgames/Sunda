package nh;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class re {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f76604a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f76605b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f76606c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f76607d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f76608e;

    /* renamed from: f, reason: collision with root package name */
    public transient long[] f76609f;

    /* renamed from: g, reason: collision with root package name */
    public transient float f76610g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f76611h;

    public re() {
        f(3);
    }

    public final void a(int i10) {
        if (i10 > this.f76609f.length) {
            l(i10);
        }
        if (i10 >= this.f76611h) {
            m(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public int b() {
        return this.f76606c == 0 ? -1 : 0;
    }

    public final Object c(int i10) {
        mh.p1.checkElementIndex(i10, this.f76606c);
        return this.f76604a[i10];
    }

    public void clear() {
        this.f76607d++;
        Arrays.fill(this.f76604a, 0, this.f76606c, (Object) null);
        Arrays.fill(this.f76605b, 0, this.f76606c, 0);
        Arrays.fill(this.f76608e, -1);
        Arrays.fill(this.f76609f, -1L);
        this.f76606c = 0;
    }

    public boolean containsKey(Object obj) {
        return e(obj) != -1;
    }

    public final int d(int i10) {
        mh.p1.checkElementIndex(i10, this.f76606c);
        return this.f76605b[i10];
    }

    public final int e(Object obj) {
        int iG = kotlin.jvm.internal.d0.G(obj);
        int i10 = this.f76608e[(r1.length - 1) & iG];
        while (i10 != -1) {
            long j10 = this.f76609f[i10];
            if (((int) (j10 >>> 32)) == iG && Objects.equals(obj, this.f76604a[i10])) {
                return i10;
            }
            i10 = (int) j10;
        }
        return -1;
    }

    public void f(int i10) {
        mh.p1.checkArgument(i10 >= 0, "Initial capacity must be non-negative");
        mh.p1.checkArgument(true, "Illegal load factor");
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0f * iHighestOneBit)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.f76608e = iArr;
        this.f76610g = 1.0f;
        this.f76604a = new Object[i10];
        this.f76605b = new int[i10];
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        this.f76609f = jArr;
        this.f76611h = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public void g(int i10, int i11, int i12, Object obj) {
        this.f76609f[i10] = (i12 << 32) | 4294967295L;
        this.f76604a[i10] = obj;
        this.f76605b[i10] = i11;
    }

    public int get(Object obj) {
        int iE = e(obj);
        if (iE == -1) {
            return 0;
        }
        return this.f76605b[iE];
    }

    public void h(int i10) {
        int i11 = this.f76606c - 1;
        if (i10 >= i11) {
            this.f76604a[i10] = null;
            this.f76605b[i10] = 0;
            this.f76609f[i10] = -1;
            return;
        }
        Object[] objArr = this.f76604a;
        objArr[i10] = objArr[i11];
        int[] iArr = this.f76605b;
        iArr[i10] = iArr[i11];
        objArr[i11] = null;
        iArr[i11] = 0;
        long[] jArr = this.f76609f;
        long j10 = jArr[i11];
        jArr[i10] = j10;
        jArr[i11] = -1;
        int[] iArr2 = this.f76608e;
        int length = ((int) (j10 >>> 32)) & (iArr2.length - 1);
        int i12 = iArr2[length];
        if (i12 == i11) {
            iArr2[length] = i10;
            return;
        }
        while (true) {
            long[] jArr2 = this.f76609f;
            long j11 = jArr2[i12];
            int i13 = (int) j11;
            if (i13 == i11) {
                jArr2[i12] = (j11 & (-4294967296L)) | (4294967295L & i10);
                return;
            }
            i12 = i13;
        }
    }

    public int i(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f76606c) {
            return i11;
        }
        return -1;
    }

    public final int j(Object obj, int i10) {
        int length = (r0.length - 1) & i10;
        int i11 = this.f76608e[length];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (((int) (this.f76609f[i11] >>> 32)) == i10 && Objects.equals(obj, this.f76604a[i11])) {
                int i13 = this.f76605b[i11];
                if (i12 == -1) {
                    this.f76608e[length] = (int) this.f76609f[i11];
                } else {
                    long[] jArr = this.f76609f;
                    jArr[i12] = (jArr[i12] & (-4294967296L)) | (((int) jArr[i11]) & 4294967295L);
                }
                h(i11);
                this.f76606c--;
                this.f76607d++;
                return i13;
            }
            int i14 = (int) this.f76609f[i11];
            if (i14 == -1) {
                return 0;
            }
            i12 = i11;
            i11 = i14;
        }
    }

    public final int k(int i10) {
        return j(this.f76604a[i10], (int) (this.f76609f[i10] >>> 32));
    }

    public void l(int i10) {
        this.f76604a = Arrays.copyOf(this.f76604a, i10);
        this.f76605b = Arrays.copyOf(this.f76605b, i10);
        long[] jArr = this.f76609f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f76609f = jArrCopyOf;
    }

    public final void m(int i10) {
        if (this.f76608e.length >= 1073741824) {
            this.f76611h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f76610g)) + 1;
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f76609f;
        int i12 = i10 - 1;
        for (int i13 = 0; i13 < this.f76606c; i13++) {
            int i14 = (int) (jArr[i13] >>> 32);
            int i15 = i14 & i12;
            int i16 = iArr[i15];
            iArr[i15] = i13;
            jArr[i13] = (i14 << 32) | (i16 & 4294967295L);
        }
        this.f76611h = i11;
        this.f76608e = iArr;
    }

    public int put(Object obj, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(a.b.e(i10, "count must be positive but was: "));
        }
        long[] jArr = this.f76609f;
        Object[] objArr = this.f76604a;
        int[] iArr = this.f76605b;
        int iG = kotlin.jvm.internal.d0.G(obj);
        int[] iArr2 = this.f76608e;
        int length = (iArr2.length - 1) & iG;
        int i11 = this.f76606c;
        int i12 = iArr2[length];
        if (i12 == -1) {
            iArr2[length] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (((int) (j10 >>> 32)) == iG && Objects.equals(obj, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int i14 = (int) j10;
                if (i14 == -1) {
                    jArr[i12] = ((-4294967296L) & j10) | (4294967295L & i11);
                    break;
                }
                i12 = i14;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i15 = i11 + 1;
        int length2 = this.f76609f.length;
        if (i15 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i16 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i16 != length2) {
                l(i16);
            }
        }
        g(i11, i10, iG, obj);
        this.f76606c = i15;
        if (i11 >= this.f76611h) {
            m(this.f76608e.length * 2);
        }
        this.f76607d++;
        return 0;
    }

    public int remove(Object obj) {
        return j(obj, kotlin.jvm.internal.d0.G(obj));
    }

    public re(re reVar) {
        f(reVar.f76606c);
        int iB = reVar.b();
        while (iB != -1) {
            put(reVar.c(iB), reVar.d(iB));
            iB = reVar.i(iB);
        }
    }

    public re(int i10) {
        f(i10);
    }
}
