package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f3 extends gu.b {

    /* renamed from: h, reason: collision with root package name */
    public final st.g f95467h;

    public f3(tw.c cVar, st.g gVar) {
        super(cVar);
        this.f95467h = gVar;
    }

    @Override // gu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58420f) {
            return;
        }
        this.f58417b.onNext(obj);
        if (this.f58421g == 0) {
            try {
                this.f95467h.accept(obj);
            } catch (Throwable th2) {
                a(th2);
            }
        }
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f58419e.poll();
        if (objPoll != null) {
            this.f95467h.accept(objPoll);
        }
        return objPoll;
    }

    @Override // gu.b, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
