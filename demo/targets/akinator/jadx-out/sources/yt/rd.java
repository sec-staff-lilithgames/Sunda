package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class rd extends AtomicReference implements tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96284b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f96285c;

    public rd(tw.c cVar) {
        this.f96284b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        tt.d.dispose(this);
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            this.f96285c = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        tt.e eVar = tt.e.f87354b;
        if (get() != tt.d.f87352b) {
            if (!this.f96285c) {
                lazySet(eVar);
                this.f96284b.onError(new qt.e("Can't deliver value due to lack of requests"));
            } else {
                this.f96284b.onNext(0L);
                lazySet(eVar);
                this.f96284b.onComplete();
            }
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.trySet(this, cVar);
    }
}
