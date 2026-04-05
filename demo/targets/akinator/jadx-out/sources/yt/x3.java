package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x3 extends gu.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.q f96543h;

    public x3(vt.a aVar, st.q qVar) {
        super(aVar);
        this.f96543h = qVar;
    }

    @Override // gu.a, vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj)) {
            return;
        }
        this.f58413c.request(1L);
    }

    @Override // gu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        vt.l lVar = this.f58414e;
        while (true) {
            Object objPoll = lVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f96543h.test(objPoll)) {
                return objPoll;
            }
            if (this.f58416g == 2) {
                lVar.request(1L);
            }
        }
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
        int i10 = this.f58416g;
        vt.a aVar = this.f58412b;
        if (i10 != 0) {
            return aVar.tryOnNext(null);
        }
        try {
            return this.f96543h.test(obj) && aVar.tryOnNext(obj);
        } catch (Throwable th2) {
            a(th2);
            return true;
        }
    }
}
