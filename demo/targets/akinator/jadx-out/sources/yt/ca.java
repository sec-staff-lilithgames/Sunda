package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ca implements tw.b {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f95262b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95263c;

    public ca(AtomicReference atomicReference, Callable callable) {
        this.f95262b = atomicReference;
        this.f95263c = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tw.b
    public void subscribe(tw.c cVar) {
        da daVar;
        loop0: while (true) {
            AtomicReference atomicReference = this.f95262b;
            daVar = (da) atomicReference.get();
            if (daVar != null) {
                break;
            }
            try {
                da daVar2 = new da((aa) this.f95263c.call());
                while (!atomicReference.compareAndSet(null, daVar2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                daVar = daVar2;
                break loop0;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                hu.d.error(th2, cVar);
                return;
            }
        }
        w9 w9Var = new w9(daVar, cVar);
        cVar.onSubscribe(w9Var);
        AtomicReference atomicReference2 = daVar.f95366e;
        loop2: while (true) {
            w9[] w9VarArr = (w9[]) atomicReference2.get();
            if (w9VarArr != da.f95363k) {
                int length = w9VarArr.length;
                w9[] w9VarArr2 = new w9[length + 1];
                System.arraycopy(w9VarArr, 0, w9VarArr2, 0, length);
                w9VarArr2[length] = w9Var;
                while (!atomicReference2.compareAndSet(w9VarArr, w9VarArr2)) {
                    if (atomicReference2.get() != w9VarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (w9Var.isDisposed()) {
            daVar.b(w9Var);
        } else {
            daVar.a();
            daVar.f95364b.replay(w9Var);
        }
    }
}
