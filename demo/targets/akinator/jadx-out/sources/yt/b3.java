package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b3 extends gu.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f95199h;

    /* renamed from: i, reason: collision with root package name */
    public final st.d f95200i;

    /* renamed from: j, reason: collision with root package name */
    public Object f95201j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f95202k;

    public b3(vt.a aVar, st.o oVar, st.d dVar) {
        super(aVar);
        this.f95199h = oVar;
        this.f95200i = dVar;
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
        while (true) {
            Object objPoll = this.f58414e.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f95199h.apply(objPoll);
            if (!this.f95202k) {
                this.f95202k = true;
                this.f95201j = objApply;
                return objPoll;
            }
            if (!((ut.n0) this.f95200i).test(this.f95201j, objApply)) {
                this.f95201j = objApply;
                return objPoll;
            }
            this.f95201j = objApply;
            if (this.f58416g != 1) {
                this.f58413c.request(1L);
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
            return aVar.tryOnNext(obj);
        }
        try {
            Object objApply = this.f95199h.apply(obj);
            if (this.f95202k) {
                boolean zTest = ((ut.n0) this.f95200i).test(this.f95201j, objApply);
                this.f95201j = objApply;
                if (zTest) {
                    return false;
                }
            } else {
                this.f95202k = true;
                this.f95201j = objApply;
            }
            aVar.onNext(obj);
            return true;
        } catch (Throwable th2) {
            a(th2);
            return true;
        }
    }
}
