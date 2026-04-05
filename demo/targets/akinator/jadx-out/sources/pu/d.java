package pu;

import java.util.concurrent.atomic.AtomicReference;
import mt.i0;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final c[] f81842e = new c[0];

    /* renamed from: f, reason: collision with root package name */
    public static final c[] f81843f = new c[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f81844b = new AtomicReference(f81843f);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f81845c;

    public static <T> d create() {
        return new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(c cVar) {
        c[] cVarArr;
        while (true) {
            AtomicReference atomicReference = this.f81844b;
            c[] cVarArr2 = (c[]) atomicReference.get();
            if (cVarArr2 == f81842e || cVarArr2 == (cVarArr = f81843f)) {
                return;
            }
            int length = cVarArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (cVarArr2[i10] == cVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                cVarArr = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr, 0, i10);
                System.arraycopy(cVarArr2, i10 + 1, cVarArr, i10, (length - i10) - 1);
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pu.f
    public Throwable getThrowable() {
        if (this.f81844b.get() == f81842e) {
            return this.f81845c;
        }
        return null;
    }

    @Override // pu.f
    public boolean hasComplete() {
        return this.f81844b.get() == f81842e && this.f81845c == null;
    }

    @Override // pu.f
    public boolean hasObservers() {
        return ((c[]) this.f81844b.get()).length != 0;
    }

    @Override // pu.f
    public boolean hasThrowable() {
        return this.f81844b.get() == f81842e && this.f81845c != null;
    }

    @Override // pu.f, mt.i0, mt.f
    public void onComplete() {
        AtomicReference atomicReference = this.f81844b;
        Object obj = atomicReference.get();
        Object obj2 = f81842e;
        if (obj == obj2) {
            return;
        }
        c[] cVarArr = (c[]) atomicReference.getAndSet(obj2);
        for (c cVar : cVarArr) {
            cVar.onComplete();
        }
    }

    @Override // pu.f, mt.i0, mt.f
    public void onError(Throwable th2) {
        o0.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f81844b;
        Object obj = atomicReference.get();
        Object obj2 = f81842e;
        if (obj == obj2) {
            mu.a.onError(th2);
            return;
        }
        this.f81845c = th2;
        c[] cVarArr = (c[]) atomicReference.getAndSet(obj2);
        for (c cVar : cVarArr) {
            cVar.onError(th2);
        }
    }

    @Override // pu.f, mt.i0
    public void onNext(Object obj) {
        o0.requireNonNull(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (c cVar : (c[]) this.f81844b.get()) {
            cVar.onNext(obj);
        }
    }

    @Override // pu.f, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (this.f81844b.get() == f81842e) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        c cVar = new c(i0Var, this);
        i0Var.onSubscribe(cVar);
        while (true) {
            AtomicReference atomicReference = this.f81844b;
            c[] cVarArr = (c[]) atomicReference.get();
            if (cVarArr == f81842e) {
                Throwable th2 = this.f81845c;
                if (th2 != null) {
                    i0Var.onError(th2);
                    return;
                } else {
                    i0Var.onComplete();
                    return;
                }
            }
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            if (cVar.isDisposed()) {
                d(cVar);
                return;
            }
            return;
        }
    }
}
