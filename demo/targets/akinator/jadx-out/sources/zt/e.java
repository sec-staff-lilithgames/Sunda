package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends mt.s implements mt.v {

    /* renamed from: g, reason: collision with root package name */
    public static final d[] f98577g = new d[0];

    /* renamed from: h, reason: collision with root package name */
    public static final d[] f98578h = new d[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f98579b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f98580c = new AtomicReference(f98577g);

    /* renamed from: e, reason: collision with root package name */
    public Object f98581e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f98582f;

    public e(mt.y yVar) {
        this.f98579b = new AtomicReference(yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(d dVar) {
        d[] dVarArr;
        while (true) {
            AtomicReference atomicReference = this.f98580c;
            d[] dVarArr2 = (d[]) atomicReference.get();
            int length = dVarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (dVarArr2[i10] == dVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                dVarArr = f98577g;
            } else {
                d[] dVarArr3 = new d[length - 1];
                System.arraycopy(dVarArr2, 0, dVarArr3, 0, i10);
                System.arraycopy(dVarArr2, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                dVarArr = dVarArr3;
            }
            while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                if (atomicReference.get() != dVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // mt.v
    public void onComplete() {
        for (d dVar : (d[]) this.f98580c.getAndSet(f98578h)) {
            if (!dVar.isDisposed()) {
                dVar.f98560b.onComplete();
            }
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98582f = th2;
        for (d dVar : (d[]) this.f98580c.getAndSet(f98578h)) {
            if (!dVar.isDisposed()) {
                dVar.f98560b.onError(th2);
            }
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98581e = obj;
        for (d dVar : (d[]) this.f98580c.getAndSet(f98578h)) {
            if (!dVar.isDisposed()) {
                dVar.f98560b.onSuccess(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        d dVar = new d(vVar, this);
        vVar.onSubscribe(dVar);
        while (true) {
            AtomicReference atomicReference = this.f98580c;
            d[] dVarArr = (d[]) atomicReference.get();
            if (dVarArr == f98578h) {
                if (dVar.isDisposed()) {
                    return;
                }
                Throwable th2 = this.f98582f;
                if (th2 != null) {
                    vVar.onError(th2);
                    return;
                }
                Object obj = this.f98581e;
                if (obj != null) {
                    vVar.onSuccess(obj);
                    return;
                } else {
                    vVar.onComplete();
                    return;
                }
            }
            int length = dVarArr.length;
            d[] dVarArr2 = new d[length + 1];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
            dVarArr2[length] = dVar;
            while (!atomicReference.compareAndSet(dVarArr, dVarArr2)) {
                if (atomicReference.get() != dVarArr) {
                    break;
                }
            }
            if (dVar.isDisposed()) {
                a(dVar);
                return;
            }
            mt.y yVar = (mt.y) this.f98579b.getAndSet(null);
            if (yVar != null) {
                yVar.subscribe(this);
                return;
            }
            return;
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
    }
}
