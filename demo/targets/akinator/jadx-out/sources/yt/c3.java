package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c3 extends gu.b implements vt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f95247h;

    /* renamed from: i, reason: collision with root package name */
    public final st.d f95248i;

    /* renamed from: j, reason: collision with root package name */
    public Object f95249j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f95250k;

    public c3(tw.c cVar, st.o oVar, st.d dVar) {
        super(cVar);
        this.f95247h = oVar;
        this.f95248i = dVar;
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
        while (true) {
            Object objPoll = this.f58419e.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f95247h.apply(objPoll);
            if (!this.f95250k) {
                this.f95250k = true;
                this.f95249j = objApply;
                return objPoll;
            }
            if (!((ut.n0) this.f95248i).test(this.f95249j, objApply)) {
                this.f95249j = objApply;
                return objPoll;
            }
            this.f95249j = objApply;
            if (this.f58421g != 1) {
                this.f58418c.request(1L);
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
            cVar.onNext(obj);
            return true;
        }
        try {
            Object objApply = this.f95247h.apply(obj);
            if (this.f95250k) {
                boolean zTest = ((ut.n0) this.f95248i).test(this.f95249j, objApply);
                this.f95249j = objApply;
                if (zTest) {
                    return false;
                }
            } else {
                this.f95250k = true;
                this.f95249j = objApply;
            }
            cVar.onNext(obj);
            return true;
        } catch (Throwable th2) {
            a(th2);
            return true;
        }
    }
}
