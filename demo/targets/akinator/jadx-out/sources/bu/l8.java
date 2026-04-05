package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l8 implements mt.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f10600b;

    /* renamed from: c, reason: collision with root package name */
    public final c8 f10601c;

    public l8(AtomicReference atomicReference, c8 c8Var) {
        this.f10600b = atomicReference;
        this.f10601c = c8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.g0
    public void subscribe(mt.i0 i0Var) {
        k8 k8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f10600b;
            k8Var = (k8) atomicReference.get();
            if (k8Var != null) {
                break;
            }
            k8 k8Var2 = new k8(this.f10601c.call());
            while (!atomicReference.compareAndSet(null, k8Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            k8Var = k8Var2;
            break loop0;
        }
        e8 e8Var = new e8(k8Var, i0Var);
        i0Var.onSubscribe(e8Var);
        AtomicReference atomicReference2 = k8Var.f10529e;
        loop2: while (true) {
            e8[] e8VarArr = (e8[]) atomicReference2.get();
            if (e8VarArr != k8.f10526h) {
                int length = e8VarArr.length;
                e8[] e8VarArr2 = new e8[length + 1];
                System.arraycopy(e8VarArr, 0, e8VarArr2, 0, length);
                e8VarArr2[length] = e8Var;
                while (!atomicReference2.compareAndSet(e8VarArr, e8VarArr2)) {
                    if (atomicReference2.get() != e8VarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (e8Var.isDisposed()) {
            k8Var.a(e8Var);
        } else {
            k8Var.f10527b.replay(e8Var);
        }
    }
}
