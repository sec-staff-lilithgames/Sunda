package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements mt.q, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public static final n f8139j = new n(null);

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f8140b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8141c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8142e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8143f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f8144g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f8145h;

    /* renamed from: i, reason: collision with root package name */
    public tw.d f8146i;

    public o(mt.f fVar, st.o oVar, boolean z10) {
        this.f8140b = fVar;
        this.f8141c = oVar;
        this.f8142e = z10;
    }

    @Override // pt.c
    public void dispose() {
        this.f8146i.cancel();
        AtomicReference atomicReference = this.f8144g;
        n nVar = f8139j;
        n nVar2 = (n) atomicReference.getAndSet(nVar);
        if (nVar2 == null || nVar2 == nVar) {
            return;
        }
        tt.d.dispose(nVar2);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8144g.get() == f8139j;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f8145h = true;
        if (this.f8144g.get() == null) {
            Throwable thTerminate = this.f8143f.terminate();
            if (thTerminate == null) {
                this.f8140b.onComplete();
            } else {
                this.f8140b.onError(thTerminate);
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f8143f;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8142e) {
            onComplete();
            return;
        }
        AtomicReference atomicReference = this.f8144g;
        n nVar = f8139j;
        n nVar2 = (n) atomicReference.getAndSet(nVar);
        if (nVar2 != null && nVar2 != nVar) {
            tt.d.dispose(nVar2);
        }
        Throwable thTerminate = dVar.terminate();
        if (thTerminate != iu.m.f68415a) {
            this.f8140b.onError(thTerminate);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f8141c.apply(obj), "The mapper returned a null CompletableSource");
            n nVar = new n(this);
            while (true) {
                AtomicReference atomicReference = this.f8144g;
                n nVar2 = (n) atomicReference.get();
                if (nVar2 == f8139j) {
                    return;
                }
                while (!atomicReference.compareAndSet(nVar2, nVar)) {
                    if (atomicReference.get() != nVar2) {
                        break;
                    }
                }
                if (nVar2 != null) {
                    tt.d.dispose(nVar2);
                }
                iVar.subscribe(nVar);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8146i.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f8146i, dVar)) {
            this.f8146i = dVar;
            this.f8140b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
