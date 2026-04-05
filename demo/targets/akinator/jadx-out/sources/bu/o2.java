package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o2 extends wt.a {

    /* renamed from: h, reason: collision with root package name */
    public final Collection f10725h;

    /* renamed from: i, reason: collision with root package name */
    public final st.o f10726i;

    public o2(mt.i0 i0Var, st.o oVar, Collection collection) {
        super(i0Var);
        this.f10726i = oVar;
        this.f10725h = collection;
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public void clear() {
        this.f10725h.clear();
        super.clear();
    }

    @Override // wt.a, mt.i0, mt.f
    public void onComplete() {
        if (this.f91242f) {
            return;
        }
        this.f91242f = true;
        this.f10725h.clear();
        this.f91239b.onComplete();
    }

    @Override // wt.a, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f91242f) {
            mu.a.onError(th2);
            return;
        }
        this.f91242f = true;
        this.f10725h.clear();
        this.f91239b.onError(th2);
    }

    @Override // wt.a, mt.i0
    public void onNext(Object obj) {
        if (this.f91242f) {
            return;
        }
        int i10 = this.f91243g;
        mt.i0 i0Var = this.f91239b;
        if (i10 != 0) {
            i0Var.onNext(null);
            return;
        }
        try {
            if (this.f10725h.add(ut.o0.requireNonNull(this.f10726i.apply(obj), "The keySelector returned a null key"))) {
                i0Var.onNext(obj);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll;
        do {
            objPoll = this.f91241e.poll();
            if (objPoll == null) {
                break;
            }
        } while (!this.f10725h.add(ut.o0.requireNonNull(this.f10726i.apply(objPoll), "The keySelector returned a null key")));
        return objPoll;
    }

    @Override // wt.a, vt.j, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
