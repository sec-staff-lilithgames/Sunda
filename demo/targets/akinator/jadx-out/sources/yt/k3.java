package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k3 extends gu.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.g f95795h;

    /* renamed from: i, reason: collision with root package name */
    public final st.g f95796i;

    /* renamed from: j, reason: collision with root package name */
    public final st.a f95797j;

    /* renamed from: k, reason: collision with root package name */
    public final st.a f95798k;

    public k3(vt.a aVar, st.g gVar, st.g gVar2, st.a aVar2, st.a aVar3) {
        super(aVar);
        this.f95795h = gVar;
        this.f95796i = gVar2;
        this.f95797j = aVar2;
        this.f95798k = aVar3;
    }

    @Override // gu.a, vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58415f) {
            return;
        }
        try {
            this.f95797j.run();
            this.f58415f = true;
            this.f58412b.onComplete();
            try {
                this.f95798k.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    @Override // gu.a, vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        vt.a aVar = this.f58412b;
        if (this.f58415f) {
            mu.a.onError(th2);
            return;
        }
        this.f58415f = true;
        try {
            this.f95796i.accept(th2);
            aVar.onError(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            aVar.onError(new qt.c(th2, th3));
        }
        try {
            this.f95798k.run();
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(th4);
        }
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
            this.f95795h.accept(obj);
            aVar.onNext(obj);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // gu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        qt.c cVar;
        st.g gVar = this.f95796i;
        try {
            Object objPoll = this.f58414e.poll();
            st.a aVar = this.f95798k;
            if (objPoll == null) {
                if (this.f58416g == 1) {
                    this.f95797j.run();
                    aVar.run();
                }
                return objPoll;
            }
            try {
                this.f95795h.accept(objPoll);
                aVar.run();
                return objPoll;
            } catch (Throwable th2) {
                try {
                    qt.d.throwIfFatal(th2);
                    try {
                        gVar.accept(th2);
                        throw iu.m.throwIfThrowable(th2);
                    } finally {
                    }
                } catch (Throwable th3) {
                    aVar.run();
                    throw th3;
                }
            }
        } catch (Throwable th22) {
            qt.d.throwIfFatal(th22);
            try {
                gVar.accept(th22);
                throw iu.m.throwIfThrowable(th22);
            } finally {
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
        try {
            this.f95795h.accept(obj);
            return this.f58412b.tryOnNext(obj);
        } catch (Throwable th2) {
            a(th2);
            return false;
        }
    }
}
