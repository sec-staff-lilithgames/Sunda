package xt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends mt.c implements mt.f {

    /* renamed from: g, reason: collision with root package name */
    public static final f[] f93406g = new f[0];

    /* renamed from: h, reason: collision with root package name */
    public static final f[] f93407h = new f[0];

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93408b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f93409c = new AtomicReference(f93406g);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f93410e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public Throwable f93411f;

    public g(mt.i iVar) {
        this.f93408b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(f fVar) {
        f[] fVarArr;
        while (true) {
            AtomicReference atomicReference = this.f93409c;
            f[] fVarArr2 = (f[]) atomicReference.get();
            int length = fVarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (fVarArr2[i10] == fVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                fVarArr = f93406g;
            } else {
                f[] fVarArr3 = new f[length - 1];
                System.arraycopy(fVarArr2, 0, fVarArr3, 0, i10);
                System.arraycopy(fVarArr2, i10 + 1, fVarArr3, i10, (length - i10) - 1);
                fVarArr = fVarArr3;
            }
            while (!atomicReference.compareAndSet(fVarArr2, fVarArr)) {
                if (atomicReference.get() != fVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // mt.f
    public void onComplete() {
        for (f fVar : (f[]) this.f93409c.getAndSet(f93407h)) {
            if (!fVar.get()) {
                fVar.f93401b.onComplete();
            }
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93411f = th2;
        for (f fVar : (f[]) this.f93409c.getAndSet(f93407h)) {
            if (!fVar.get()) {
                fVar.f93401b.onError(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        f fVar2 = new f(this, fVar);
        fVar.onSubscribe(fVar2);
        while (true) {
            AtomicReference atomicReference = this.f93409c;
            f[] fVarArr = (f[]) atomicReference.get();
            if (fVarArr == f93407h) {
                Throwable th2 = this.f93411f;
                if (th2 != null) {
                    fVar.onError(th2);
                    return;
                } else {
                    fVar.onComplete();
                    return;
                }
            }
            int length = fVarArr.length;
            f[] fVarArr2 = new f[length + 1];
            System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
            fVarArr2[length] = fVar2;
            while (!atomicReference.compareAndSet(fVarArr, fVarArr2)) {
                if (atomicReference.get() != fVarArr) {
                    break;
                }
            }
            if (fVar2.isDisposed()) {
                d(fVar2);
            }
            if (this.f93410e.compareAndSet(false, true)) {
                this.f93408b.subscribe(this);
                return;
            }
            return;
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
    }
}
