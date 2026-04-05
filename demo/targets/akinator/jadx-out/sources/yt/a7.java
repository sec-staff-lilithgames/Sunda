package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a7 extends gu.b {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f95149h;

    public a7(tw.c cVar, st.o oVar) {
        super(cVar);
        this.f95149h = oVar;
    }

    @Override // gu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58420f) {
            return;
        }
        int i10 = this.f58421g;
        tw.c cVar = this.f58417b;
        if (i10 != 0) {
            cVar.onNext(null);
            return;
        }
        try {
            cVar.onNext(ut.o0.requireNonNull(this.f95149h.apply(obj), "The mapper function returned a null value."));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f58419e.poll();
        if (objPoll != null) {
            return ut.o0.requireNonNull(this.f95149h.apply(objPoll), "The mapper function returned a null value.");
        }
        return null;
    }

    @Override // gu.b, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
