package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z6 extends gu.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f96644h;

    public z6(vt.a aVar, st.o oVar) {
        super(aVar);
        this.f96644h = oVar;
    }

    @Override // gu.a, vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58415f) {
            return;
        }
        int i10 = this.f58416g;
        vt.a aVar = this.f58412b;
        if (i10 != 0) {
            aVar.onNext(null);
            return;
        }
        try {
            aVar.onNext(ut.o0.requireNonNull(this.f96644h.apply(obj), "The mapper function returned a null value."));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // gu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f58414e.poll();
        if (objPoll != null) {
            return ut.o0.requireNonNull(this.f96644h.apply(objPoll), "The mapper function returned a null value.");
        }
        return null;
    }

    @Override // gu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }

    @Override // gu.a, vt.a
    public boolean tryOnNext(Object obj) {
        if (this.f58415f) {
            return false;
        }
        try {
            return this.f58412b.tryOnNext(ut.o0.requireNonNull(this.f96644h.apply(obj), "The mapper function returned a null value."));
        } catch (Throwable th2) {
            a(th2);
            return true;
        }
    }
}
