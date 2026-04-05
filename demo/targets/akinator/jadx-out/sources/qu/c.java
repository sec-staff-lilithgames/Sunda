package qu;

import hu.g;
import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f83496b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f83497c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83498e;

    public c(tw.c cVar) {
        this.f83496b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        try {
            this.f83497c.cancel();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f83498e) {
            return;
        }
        this.f83498e = true;
        tw.d dVar = this.f83497c;
        tw.c cVar = this.f83496b;
        if (dVar != null) {
            try {
                cVar.onComplete();
                return;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            cVar.onSubscribe(hu.d.f59164b);
            try {
                cVar.onError(nullPointerException);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(nullPointerException, th3));
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(new qt.c(nullPointerException, th4));
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f83498e) {
            mu.a.onError(th2);
            return;
        }
        this.f83498e = true;
        tw.d dVar = this.f83497c;
        tw.c cVar = this.f83496b;
        if (dVar != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                cVar.onError(th2);
                return;
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            cVar.onSubscribe(hu.d.f59164b);
            try {
                cVar.onError(new qt.c(th2, nullPointerException));
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                mu.a.onError(new qt.c(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            mu.a.onError(new qt.c(th2, nullPointerException, th5));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f83498e) {
            return;
        }
        tw.d dVar = this.f83497c;
        tw.c cVar = this.f83496b;
        if (dVar == null) {
            this.f83498e = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                cVar.onSubscribe(hu.d.f59164b);
                try {
                    cVar.onError(nullPointerException);
                    return;
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    mu.a.onError(new qt.c(nullPointerException, th2));
                    return;
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(nullPointerException, th3));
                return;
            }
        }
        if (obj == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f83497c.cancel();
                onError(nullPointerException2);
                return;
            } catch (Throwable th4) {
                qt.d.throwIfFatal(th4);
                onError(new qt.c(nullPointerException2, th4));
                return;
            }
        }
        try {
            cVar.onNext(obj);
        } catch (Throwable th5) {
            qt.d.throwIfFatal(th5);
            try {
                this.f83497c.cancel();
                onError(th5);
            } catch (Throwable th6) {
                qt.d.throwIfFatal(th6);
                onError(new qt.c(th5, th6));
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (g.validate(this.f83497c, dVar)) {
            this.f83497c = dVar;
            try {
                this.f83496b.onSubscribe(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f83498e = true;
                try {
                    dVar.cancel();
                    mu.a.onError(th2);
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    mu.a.onError(new qt.c(th2, th3));
                }
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        try {
            this.f83497c.request(j10);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            try {
                this.f83497c.cancel();
                mu.a.onError(th2);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                mu.a.onError(new qt.c(th2, th3));
            }
        }
    }
}
