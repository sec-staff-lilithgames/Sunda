package xt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o1 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93470b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f93471c = new n1(this);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f93472e = new AtomicBoolean();

    public o1(mt.f fVar) {
        this.f93470b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f93472e.compareAndSet(false, true)) {
            tt.d.dispose(this);
            tt.d.dispose(this.f93471c);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93472e.get();
    }

    @Override // mt.f
    public void onComplete() {
        if (this.f93472e.compareAndSet(false, true)) {
            tt.d.dispose(this.f93471c);
            this.f93470b.onComplete();
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        if (!this.f93472e.compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(this.f93471c);
            this.f93470b.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
