package du;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final pt.b f52657b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.q0 f52658c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f52659e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f52660f;

    public a(mt.q0 q0Var, pt.b bVar, AtomicBoolean atomicBoolean) {
        this.f52658c = q0Var;
        this.f52657b = bVar;
        this.f52659e = atomicBoolean;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        if (!this.f52659e.compareAndSet(false, true)) {
            mu.a.onError(th2);
            return;
        }
        pt.c cVar = this.f52660f;
        pt.b bVar = this.f52657b;
        bVar.delete(cVar);
        bVar.dispose();
        this.f52658c.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52660f = cVar;
        this.f52657b.add(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        if (this.f52659e.compareAndSet(false, true)) {
            pt.c cVar = this.f52660f;
            pt.b bVar = this.f52657b;
            bVar.delete(cVar);
            bVar.dispose();
            this.f52658c.onSuccess(obj);
        }
    }
}
