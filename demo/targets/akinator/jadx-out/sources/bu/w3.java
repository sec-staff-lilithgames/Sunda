package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w3 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11160b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11161c;

    /* renamed from: h, reason: collision with root package name */
    public final st.o f11165h;

    /* renamed from: j, reason: collision with root package name */
    public pt.c f11167j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f11168k;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f11162e = new pt.b();

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f11164g = new iu.d();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f11163f = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f11166i = new AtomicReference();

    public w3(mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f11160b = i0Var;
        this.f11165h = oVar;
        this.f11161c = z10;
    }

    public final void a() {
        mt.i0 i0Var = this.f11160b;
        AtomicInteger atomicInteger = this.f11163f;
        AtomicReference atomicReference = this.f11166i;
        int iAddAndGet = 1;
        while (!this.f11168k) {
            if (!this.f11161c && ((Throwable) this.f11164g.get()) != null) {
                Throwable thTerminate = this.f11164g.terminate();
                eu.d dVar = (eu.d) this.f11166i.get();
                if (dVar != null) {
                    dVar.clear();
                }
                i0Var.onError(thTerminate);
                return;
            }
            boolean z10 = atomicInteger.get() == 0;
            eu.d dVar2 = (eu.d) atomicReference.get();
            Object objPoll = dVar2 != null ? dVar2.poll() : null;
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                Throwable thTerminate2 = this.f11164g.terminate();
                if (thTerminate2 != null) {
                    i0Var.onError(thTerminate2);
                    return;
                } else {
                    i0Var.onComplete();
                    return;
                }
            }
            if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                i0Var.onNext(objPoll);
            }
        }
        eu.d dVar3 = (eu.d) this.f11166i.get();
        if (dVar3 != null) {
            dVar3.clear();
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f11168k = true;
        this.f11167j.dispose();
        this.f11162e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11168k;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11163f.decrementAndGet();
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11163f.decrementAndGet();
        if (!this.f11164g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f11161c) {
            this.f11162e.dispose();
        }
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        try {
            mt.t0 t0Var = (mt.t0) ut.o0.requireNonNull(this.f11165h.apply(obj), "The mapper returned a null SingleSource");
            this.f11163f.getAndIncrement();
            v3 v3Var = new v3(this);
            if (this.f11168k || !this.f11162e.add(v3Var)) {
                return;
            }
            t0Var.subscribe(v3Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f11167j.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11167j, cVar)) {
            this.f11167j = cVar;
            this.f11160b.onSubscribe(this);
        }
    }
}
