package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e3 extends gu.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.g f95411h;

    public e3(vt.a aVar, st.g gVar) {
        super(aVar);
        this.f95411h = gVar;
    }

    @Override // gu.a, vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58412b.onNext(obj);
        if (this.f58416g == 0) {
            try {
                this.f95411h.accept(obj);
            } catch (Throwable th2) {
                a(th2);
            }
        }
    }

    @Override // gu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f58414e.poll();
        if (objPoll != null) {
            this.f95411h.accept(objPoll);
        }
        return objPoll;
    }

    @Override // gu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }

    @Override // gu.a, vt.a
    public boolean tryOnNext(Object obj) {
        boolean zTryOnNext = this.f58412b.tryOnNext(obj);
        try {
            this.f95411h.accept(obj);
            return zTryOnNext;
        } catch (Throwable th2) {
            a(th2);
            return zTryOnNext;
        }
    }
}
