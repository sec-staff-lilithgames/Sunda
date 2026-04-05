package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y3 extends gu.b implements vt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.q f96593h;

    public y3(tw.c cVar, st.q qVar) {
        super(cVar);
        this.f96593h = qVar;
    }

    @Override // gu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj)) {
            return;
        }
        this.f58418c.request(1L);
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        vt.l lVar = this.f58419e;
        while (true) {
            Object objPoll = lVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f96593h.test(objPoll)) {
                return objPoll;
            }
            if (this.f58421g == 2) {
                lVar.request(1L);
            }
        }
    }

    @Override // gu.b, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (this.f58420f) {
            return false;
        }
        int i10 = this.f58421g;
        tw.c cVar = this.f58417b;
        if (i10 != 0) {
            cVar.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.f96593h.test(obj);
            if (zTest) {
                cVar.onNext(obj);
            }
            return zTest;
        } catch (Throwable th2) {
            a(th2);
            return true;
        }
    }
}
