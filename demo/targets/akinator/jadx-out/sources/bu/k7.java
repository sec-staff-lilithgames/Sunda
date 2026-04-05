package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k7 extends wt.b {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10521b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10522c;

    /* renamed from: e, reason: collision with root package name */
    public long f10523e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10524f;

    public k7(mt.i0 i0Var, long j10, long j11) {
        this.f10521b = i0Var;
        this.f10523e = j10;
        this.f10522c = j11;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f10523e = this.f10522c;
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
        return this.f10523e == this.f10522c;
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        this.f10524f = true;
        return 1;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Long poll() throws Exception {
        long j10 = this.f10523e;
        if (j10 != this.f10522c) {
            this.f10523e = 1 + j10;
            return Long.valueOf(j10);
        }
        lazySet(1);
        return null;
    }
}
