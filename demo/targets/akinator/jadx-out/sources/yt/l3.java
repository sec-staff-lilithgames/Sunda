package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l3 extends gu.b {

    /* renamed from: h, reason: collision with root package name */
    public final st.g f95844h;

    /* renamed from: i, reason: collision with root package name */
    public final st.g f95845i;

    /* renamed from: j, reason: collision with root package name */
    public final st.a f95846j;

    /* renamed from: k, reason: collision with root package name */
    public final st.a f95847k;

    public l3(tw.c cVar, st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        super(cVar);
        this.f95844h = gVar;
        this.f95845i = gVar2;
        this.f95846j = aVar;
        this.f95847k = aVar2;
    }

    @Override // gu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58420f) {
            return;
        }
        try {
            this.f95846j.run();
            this.f58420f = true;
            this.f58417b.onComplete();
            try {
                this.f95847k.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    @Override // gu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tw.c cVar = this.f58417b;
        if (this.f58420f) {
            mu.a.onError(th2);
            return;
        }
        this.f58420f = true;
        try {
            this.f95845i.accept(th2);
            cVar.onError(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cVar.onError(new qt.c(th2, th3));
        }
        try {
            this.f95847k.run();
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(th4);
        }
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
            this.f95844h.accept(obj);
            cVar.onNext(obj);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        qt.c cVar;
        st.g gVar = this.f95845i;
        try {
            Object objPoll = this.f58419e.poll();
            st.a aVar = this.f95847k;
            if (objPoll == null) {
                if (this.f58421g == 1) {
                    this.f95846j.run();
                    aVar.run();
                }
                return objPoll;
            }
            try {
                this.f95844h.accept(objPoll);
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

    @Override // gu.b, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
