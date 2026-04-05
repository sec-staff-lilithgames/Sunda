package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f50974b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f50975c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f50976e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50977f;

    public e0(tw.c cVar, f0 f0Var) {
        this.f50974b = cVar;
        this.f50975c = f0Var;
    }

    @Override // tw.d
    public void cancel() {
        try {
            this.f50975c.f50989i.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        this.f50976e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.c cVar = this.f50974b;
        f0 f0Var = this.f50975c;
        if (this.f50977f) {
            return;
        }
        this.f50977f = true;
        try {
            f0Var.f50985e.run();
            cVar.onComplete();
            try {
                f0Var.f50986f.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cVar.onError(th3);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        f0 f0Var = this.f50975c;
        if (this.f50977f) {
            mu.a.onError(th2);
            return;
        }
        this.f50977f = true;
        try {
            f0Var.f50984d.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f50974b.onError(th2);
        try {
            f0Var.f50986f.run();
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(th4);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        f0 f0Var = this.f50975c;
        if (this.f50977f) {
            return;
        }
        try {
            f0Var.f50982b.accept(obj);
            this.f50974b.onNext(obj);
            try {
                f0Var.f50983c.accept(obj);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            onError(th3);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        tw.c cVar = this.f50974b;
        if (hu.g.validate(this.f50976e, dVar)) {
            this.f50976e = dVar;
            try {
                this.f50975c.f50987g.accept(dVar);
                cVar.onSubscribe(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                dVar.cancel();
                cVar.onSubscribe(hu.d.f59164b);
                onError(th2);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        try {
            ((ut.q) this.f50975c.f50988h).accept(j10);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        this.f50976e.request(j10);
    }
}
