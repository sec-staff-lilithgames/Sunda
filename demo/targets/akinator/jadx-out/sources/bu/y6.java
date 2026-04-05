package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y6 implements mt.i0, pt.c {

    /* renamed from: g, reason: collision with root package name */
    public static final x6[] f11249g = new x6[0];

    /* renamed from: h, reason: collision with root package name */
    public static final x6[] f11250h = new x6[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11251b;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f11254f = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f11252c = new AtomicReference(f11249g);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11253e = new AtomicBoolean();

    public y6(AtomicReference atomicReference) {
        this.f11251b = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(x6 x6Var) {
        x6[] x6VarArr;
        while (true) {
            AtomicReference atomicReference = this.f11252c;
            x6[] x6VarArr2 = (x6[]) atomicReference.get();
            int length = x6VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (x6VarArr2[i10].equals(x6Var)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                x6VarArr = f11249g;
            } else {
                x6[] x6VarArr3 = new x6[length - 1];
                System.arraycopy(x6VarArr2, 0, x6VarArr3, 0, i10);
                System.arraycopy(x6VarArr2, i10 + 1, x6VarArr3, i10, (length - i10) - 1);
                x6VarArr = x6VarArr3;
            }
            while (!atomicReference.compareAndSet(x6VarArr2, x6VarArr)) {
                if (atomicReference.get() != x6VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f11252c;
        x6[] x6VarArr = f11250h;
        if (((x6[]) atomicReference2.getAndSet(x6VarArr)) != x6VarArr) {
            do {
                atomicReference = this.f11251b;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            tt.d.dispose(this.f11254f);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11252c.get() == f11250h;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f11251b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        for (x6 x6Var : (x6[]) this.f11252c.getAndSet(f11250h)) {
            x6Var.f11209b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f11251b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        x6[] x6VarArr = (x6[]) this.f11252c.getAndSet(f11250h);
        if (x6VarArr.length == 0) {
            mu.a.onError(th2);
            return;
        }
        for (x6 x6Var : x6VarArr) {
            x6Var.f11209b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        for (x6 x6Var : (x6[]) this.f11252c.get()) {
            x6Var.f11209b.onNext(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f11254f, cVar);
    }
}
