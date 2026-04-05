package du;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f52829b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f52830c;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f52831e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.q0 f52832f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f52833g;

    public r0(int i10, pt.b bVar, Object[] objArr, mt.q0 q0Var, AtomicInteger atomicInteger) {
        this.f52829b = i10;
        this.f52830c = bVar;
        this.f52831e = objArr;
        this.f52832f = q0Var;
        this.f52833g = atomicInteger;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        AtomicInteger atomicInteger;
        int i10;
        do {
            atomicInteger = this.f52833g;
            i10 = atomicInteger.get();
            if (i10 >= 2) {
                mu.a.onError(th2);
                return;
            }
        } while (!atomicInteger.compareAndSet(i10, 2));
        this.f52830c.dispose();
        this.f52832f.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52830c.add(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        int i10 = this.f52829b;
        Object[] objArr = this.f52831e;
        objArr[i10] = obj;
        if (this.f52833g.incrementAndGet() == 2) {
            this.f52832f.onSuccess(Boolean.valueOf(ut.o0.equals(objArr[0], objArr[1])));
        }
    }
}
