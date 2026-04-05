package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i7 extends wt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10420b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10421c;

    /* renamed from: e, reason: collision with root package name */
    public long f10422e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10423f;

    public i7(mt.i0 i0Var, long j10, long j11) {
        this.f10420b = i0Var;
        this.f10422e = j10;
        this.f10421c = j11;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f10422e = this.f10421c;
        lazySet(1);
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        set(1);
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return get() != 0;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f10422e == this.f10421c;
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        this.f10423f = true;
        return 1;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Integer poll() throws Exception {
        long j10 = this.f10422e;
        if (j10 != this.f10421c) {
            this.f10422e = 1 + j10;
            return Integer.valueOf((int) j10);
        }
        lazySet(1);
        return null;
    }
}
