package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y1 extends AtomicLong implements mt.n, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96591b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f96592c = new tt.h();

    public y1(tw.c cVar) {
        this.f96591b = cVar;
    }

    public final void a() {
        tt.h hVar = this.f96592c;
        if (isCancelled()) {
            return;
        }
        try {
            this.f96591b.onComplete();
        } finally {
            hVar.dispose();
        }
    }

    public final boolean b(Throwable th2) {
        tt.h hVar = this.f96592c;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isCancelled()) {
            return false;
        }
        try {
            this.f96591b.onError(th2);
            hVar.dispose();
            return true;
        } catch (Throwable th3) {
            hVar.dispose();
            throw th3;
        }
    }

    @Override // tw.d
    public final void cancel() {
        this.f96592c.dispose();
        d();
    }

    @Override // mt.n
    public final boolean isCancelled() {
        return this.f96592c.isDisposed();
    }

    public void onComplete() {
        a();
    }

    @Override // mt.n, mt.k
    public final void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
            c();
        }
    }

    @Override // mt.n
    public final long requested() {
        return get();
    }

    @Override // mt.n
    public final mt.n serialize() {
        return new e2(this);
    }

    @Override // mt.n
    public final void setCancellable(st.f fVar) {
        setDisposable(new tt.b(fVar));
    }

    @Override // mt.n
    public final void setDisposable(pt.c cVar) {
        this.f96592c.update(cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return e3.g.k(getClass().getSimpleName(), "{", super.toString(), "}");
    }

    public boolean tryOnError(Throwable th2) {
        return b(th2);
    }

    public void c() {
    }

    public void d() {
    }
}
