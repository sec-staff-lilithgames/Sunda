package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52825b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52826c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52827e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f52828f;

    public r(mt.q0 q0Var, mt.t0 t0Var) {
        this.f52825b = q0Var;
        this.f52826c = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f52828f.cancel();
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f52827e) {
            return;
        }
        this.f52827e = true;
        this.f52826c.subscribe(new wt.v(this, this.f52825b));
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f52827e) {
            mu.a.onError(th2);
        } else {
            this.f52827e = true;
            this.f52825b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f52828f.cancel();
        onComplete();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f52828f, dVar)) {
            this.f52828f = dVar;
            this.f52825b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
