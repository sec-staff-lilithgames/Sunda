package yt;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z2 extends gu.b {

    /* renamed from: h, reason: collision with root package name */
    public final Collection f96639h;

    /* renamed from: i, reason: collision with root package name */
    public final st.o f96640i;

    public z2(tw.c cVar, st.o oVar, Collection collection) {
        super(cVar);
        this.f96640i = oVar;
        this.f96639h = collection;
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public void clear() {
        this.f96639h.clear();
        super.clear();
    }

    @Override // gu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58420f) {
            return;
        }
        this.f58420f = true;
        this.f96639h.clear();
        this.f58417b.onComplete();
    }

    @Override // gu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f58420f) {
            mu.a.onError(th2);
            return;
        }
        this.f58420f = true;
        this.f96639h.clear();
        this.f58417b.onError(th2);
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
            if (this.f96639h.add(ut.o0.requireNonNull(this.f96640i.apply(obj), "The keySelector returned a null key"))) {
                cVar.onNext(obj);
            } else {
                this.f58418c.request(1L);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // gu.b, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll;
        while (true) {
            objPoll = this.f58419e.poll();
            if (objPoll == null) {
                break;
            }
            if (this.f96639h.add(ut.o0.requireNonNull(this.f96640i.apply(objPoll), "The keySelector returned a null key"))) {
                break;
            }
            if (this.f58421g == 2) {
                this.f58418c.request(1L);
            }
        }
        return objPoll;
    }

    @Override // gu.b, vt.l, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
