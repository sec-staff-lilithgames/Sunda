package gu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final st.q f58434b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f58435c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f58436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58437f;

    public i(st.q qVar, st.g gVar, st.a aVar) {
        this.f58434b = qVar;
        this.f58435c = gVar;
        this.f58436e = aVar;
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58437f) {
            return;
        }
        this.f58437f = true;
        try {
            this.f58436e.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f58437f) {
            mu.a.onError(th2);
            return;
        }
        this.f58437f = true;
        try {
            this.f58435c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f58437f) {
            return;
        }
        try {
            if (this.f58434b.test(obj)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
