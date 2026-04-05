package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p8 extends rt.a implements vt.h, tt.g {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96124c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96125e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f96126f = new AtomicReference();

    public p8(tw.b bVar, int i10) {
        this.f96124c = bVar;
        this.f96125e = i10;
    }

    @Override // rt.a
    public void connect(st.g gVar) {
        o8 o8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f96126f;
            o8Var = (o8) atomicReference.get();
            if (o8Var != null && !o8Var.isDisposed()) {
                break;
            }
            o8 o8Var2 = new o8(atomicReference, this.f96125e);
            while (!atomicReference.compareAndSet(o8Var, o8Var2)) {
                if (atomicReference.get() != o8Var) {
                    break;
                }
            }
            o8Var = o8Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = o8Var.f96073e;
        boolean z10 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(o8Var);
            if (z10) {
                this.f96124c.subscribe(o8Var);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            throw iu.m.wrapOrThrow(th2);
        }
    }

    public int publishBufferSize() {
        return this.f96125e;
    }

    @Override // tt.g
    public void resetIf(pt.c cVar) {
        AtomicReference atomicReference;
        o8 o8Var = (o8) cVar;
        do {
            atomicReference = this.f96126f;
            if (atomicReference.compareAndSet(o8Var, null)) {
                return;
            }
        } while (atomicReference.get() == o8Var);
    }

    @Override // vt.h
    public tw.b source() {
        return this.f96124c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        o8 o8Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f96126f;
            o8Var = (o8) atomicReference.get();
            if (o8Var != null) {
                break;
            }
            o8 o8Var2 = new o8(atomicReference, this.f96125e);
            while (!atomicReference.compareAndSet(o8Var, o8Var2)) {
                if (atomicReference.get() != o8Var) {
                    break;
                }
            }
            o8Var = o8Var2;
            break loop0;
        }
        n8 n8Var = new n8(cVar, o8Var);
        cVar.onSubscribe(n8Var);
        AtomicReference atomicReference2 = o8Var.f96074f;
        while (true) {
            n8[] n8VarArr = (n8[]) atomicReference2.get();
            if (n8VarArr == o8.f96070n) {
                Throwable th2 = o8Var.f96079k;
                if (th2 != null) {
                    cVar.onError(th2);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            int length = n8VarArr.length;
            n8[] n8VarArr2 = new n8[length + 1];
            System.arraycopy(n8VarArr, 0, n8VarArr2, 0, length);
            n8VarArr2[length] = n8Var;
            while (!atomicReference2.compareAndSet(n8VarArr, n8VarArr2)) {
                if (atomicReference2.get() != n8VarArr) {
                    break;
                }
            }
            if (n8Var.isCancelled()) {
                o8Var.c(n8Var);
                return;
            } else {
                o8Var.b();
                return;
            }
        }
    }
}
