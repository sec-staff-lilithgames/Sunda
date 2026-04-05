package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t4 extends hu.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f96356b;

    /* renamed from: c, reason: collision with root package name */
    public int f96357c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f96358e;

    public t4(Object[] objArr) {
        this.f96356b = objArr;
    }

    public abstract void a();

    public abstract void b(long j10);

    @Override // hu.b, vt.l, tw.d
    public final void cancel() {
        this.f96358e = true;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final void clear() {
        this.f96357c = this.f96356b.length;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final boolean isEmpty() {
        return this.f96357c == this.f96356b.length;
    }

    @Override // hu.b, vt.l, vt.k, vt.o
    public final Object poll() {
        int i10 = this.f96357c;
        Object[] objArr = this.f96356b;
        if (i10 == objArr.length) {
            return null;
        }
        this.f96357c = i10 + 1;
        return ut.o0.requireNonNull(objArr[i10], "array element is null");
    }

    @Override // hu.b, vt.l, tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10) && iu.e.add(this, j10) == 0) {
            if (j10 == Long.MAX_VALUE) {
                a();
            } else {
                b(j10);
            }
        }
    }

    @Override // hu.b, vt.l, vt.k
    public final int requestFusion(int i10) {
        return i10 & 1;
    }
}
