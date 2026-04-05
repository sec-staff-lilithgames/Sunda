package eu;

import iu.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import vt.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements n {

    /* renamed from: k, reason: collision with root package name */
    public static final int f55143k = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f55144l = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f55145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55146c;

    /* renamed from: e, reason: collision with root package name */
    public long f55147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f55148f;

    /* renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f55149g;

    /* renamed from: h, reason: collision with root package name */
    public final int f55150h;

    /* renamed from: i, reason: collision with root package name */
    public AtomicReferenceArray f55151i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f55152j;

    public d(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f55145b = atomicLong;
        this.f55152j = new AtomicLong();
        int iRoundToPowerOfTwo = x.roundToPowerOfTwo(Math.max(8, i10));
        int i11 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iRoundToPowerOfTwo + 1);
        this.f55149g = atomicReferenceArray;
        this.f55148f = i11;
        this.f55146c = Math.min(iRoundToPowerOfTwo / 4, f55143k);
        this.f55151i = atomicReferenceArray;
        this.f55150h = i11;
        this.f55147e = iRoundToPowerOfTwo - 2;
        atomicLong.lazySet(0L);
    }

    @Override // vt.n, vt.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // vt.n, vt.o
    public boolean isEmpty() {
        return this.f55145b.get() == this.f55152j.get();
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f55149g;
        AtomicLong atomicLong = this.f55145b;
        long j10 = atomicLong.get();
        int i10 = this.f55148f;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f55147e) {
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j11 = this.f55146c + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f55147e = j11 - 1;
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j12 = j10 + 1;
        if (atomicReferenceArray.get(((int) j12) & i10) == null) {
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j12);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f55149g = atomicReferenceArray2;
        this.f55147e = (j10 + i10) - 1;
        atomicReferenceArray2.lazySet(i11, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i11, f55144l);
        atomicLong.lazySet(j12);
        return true;
    }

    public Object peek() {
        AtomicReferenceArray atomicReferenceArray = this.f55151i;
        int i10 = (int) this.f55152j.get();
        int i11 = this.f55150h;
        int i12 = i10 & i11;
        Object obj = atomicReferenceArray.get(i12);
        if (obj != f55144l) {
            return obj;
        }
        int i13 = i11 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i13);
        atomicReferenceArray.lazySet(i13, null);
        this.f55151i = atomicReferenceArray2;
        return atomicReferenceArray2.get(i12);
    }

    @Override // vt.n, vt.o
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f55151i;
        AtomicLong atomicLong = this.f55152j;
        long j10 = atomicLong.get();
        int i10 = this.f55150h;
        int i11 = ((int) j10) & i10;
        Object obj = atomicReferenceArray.get(i11);
        boolean z10 = obj == f55144l;
        if (obj != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
            return obj;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f55151i = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i11);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
        }
        return obj2;
    }

    public int size() {
        AtomicLong atomicLong = this.f55152j;
        long j10 = atomicLong.get();
        while (true) {
            long j11 = this.f55145b.get();
            long j12 = atomicLong.get();
            if (j10 == j12) {
                return (int) (j11 - j12);
            }
            j10 = j12;
        }
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f55149g;
        AtomicLong atomicLong = this.f55145b;
        long j10 = atomicLong.get();
        long j11 = 2 + j10;
        int i10 = this.f55148f;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            int i11 = ((int) j10) & i10;
            atomicReferenceArray.lazySet(i11 + 1, obj2);
            atomicReferenceArray.lazySet(i11, obj);
            atomicLong.lazySet(j11);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f55149g = atomicReferenceArray2;
        int i12 = ((int) j10) & i10;
        atomicReferenceArray2.lazySet(i12 + 1, obj2);
        atomicReferenceArray2.lazySet(i12, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i12, f55144l);
        atomicLong.lazySet(j11);
        return true;
    }
}
