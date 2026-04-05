package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ob extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10762b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10763c;

    public ob(long j10, rb rbVar) {
        this.f10763c = j10;
        this.f10762b = rbVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bu.rb, java.lang.Object] */
    @Override // mt.i0, mt.f
    public void onComplete() {
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj != dVar) {
            lazySet(dVar);
            this.f10762b.onTimeout(this.f10763c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bu.rb, java.lang.Object] */
    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj == dVar) {
            mu.a.onError(th2);
        } else {
            lazySet(dVar);
            this.f10762b.onTimeoutError(this.f10763c, th2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [bu.rb, java.lang.Object] */
    @Override // mt.i0
    public void onNext(Object obj) {
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar != dVar) {
            cVar.dispose();
            lazySet(dVar);
            this.f10762b.onTimeout(this.f10763c);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
