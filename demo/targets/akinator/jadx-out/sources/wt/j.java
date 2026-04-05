package wt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends AtomicReference implements mt.f, pt.c, st.g, ku.k {

    /* renamed from: b, reason: collision with root package name */
    public final st.g f91255b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f91256c;

    public j(st.a aVar) {
        this.f91255b = this;
        this.f91256c = aVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return this.f91255b != this;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.f
    public void onComplete() {
        try {
            this.f91256c.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        lazySet(tt.d.f87352b);
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        try {
            this.f91255b.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(th3);
        }
        lazySet(tt.d.f87352b);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // st.g
    public void accept(Throwable th2) {
        mu.a.onError(new qt.f(th2));
    }

    public j(st.g gVar, st.a aVar) {
        this.f91255b = gVar;
        this.f91256c = aVar;
    }
}
