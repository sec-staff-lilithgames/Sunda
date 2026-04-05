package du;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends mt.n0 implements mt.q0 {

    /* renamed from: h, reason: collision with root package name */
    public static final c[] f52695h = new c[0];

    /* renamed from: i, reason: collision with root package name */
    public static final c[] f52696i = new c[0];

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52697b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f52698c = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f52699e = new AtomicReference(f52695h);

    /* renamed from: f, reason: collision with root package name */
    public Object f52700f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f52701g;

    public d(mt.t0 t0Var) {
        this.f52697b = t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(c cVar) {
        c[] cVarArr;
        while (true) {
            AtomicReference atomicReference = this.f52699e;
            c[] cVarArr2 = (c[]) atomicReference.get();
            int length = cVarArr2.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                cVarArr = f52695h;
            } else {
                c[] cVarArr3 = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i10);
                System.arraycopy(cVarArr2, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                cVarArr = cVarArr3;
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52701g = th2;
        for (c cVar : (c[]) this.f52699e.getAndSet(f52696i)) {
            if (!cVar.isDisposed()) {
                cVar.f52686b.onError(th2);
            }
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52700f = obj;
        for (c cVar : (c[]) this.f52699e.getAndSet(f52696i)) {
            if (!cVar.isDisposed()) {
                cVar.f52686b.onSuccess(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        c cVar = new c(q0Var, this);
        q0Var.onSubscribe(cVar);
        while (true) {
            AtomicReference atomicReference = this.f52699e;
            c[] cVarArr = (c[]) atomicReference.get();
            if (cVarArr == f52696i) {
                Throwable th2 = this.f52701g;
                if (th2 != null) {
                    q0Var.onError(th2);
                    return;
                } else {
                    q0Var.onSuccess(this.f52700f);
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
                c(cVar);
            }
            if (this.f52698c.getAndIncrement() == 0) {
                this.f52697b.subscribe(this);
                return;
            }
            return;
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
    }
}
