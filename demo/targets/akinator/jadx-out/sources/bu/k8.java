package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k8 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: g, reason: collision with root package name */
    public static final e8[] f10525g = new e8[0];

    /* renamed from: h, reason: collision with root package name */
    public static final e8[] f10526h = new e8[0];

    /* renamed from: b, reason: collision with root package name */
    public final i8 f10527b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10528c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f10529e = new AtomicReference(f10525g);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f10530f = new AtomicBoolean();

    public k8(i8 i8Var) {
        this.f10527b = i8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(e8 e8Var) {
        e8[] e8VarArr;
        while (true) {
            AtomicReference atomicReference = this.f10529e;
            e8[] e8VarArr2 = (e8[]) atomicReference.get();
            int length = e8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (e8VarArr2[i10].equals(e8Var)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                e8VarArr = f10525g;
            } else {
                e8[] e8VarArr3 = new e8[length - 1];
                System.arraycopy(e8VarArr2, 0, e8VarArr3, 0, i10);
                System.arraycopy(e8VarArr2, i10 + 1, e8VarArr3, i10, (length - i10) - 1);
                e8VarArr = e8VarArr3;
            }
            while (!atomicReference.compareAndSet(e8VarArr2, e8VarArr)) {
                if (atomicReference.get() != e8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f10529e.set(f10526h);
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10529e.get() == f10526h;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10528c) {
            return;
        }
        this.f10528c = true;
        i8 i8Var = this.f10527b;
        i8Var.complete();
        for (e8 e8Var : (e8[]) this.f10529e.getAndSet(f10526h)) {
            i8Var.replay(e8Var);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10528c) {
            mu.a.onError(th2);
            return;
        }
        this.f10528c = true;
        i8 i8Var = this.f10527b;
        i8Var.error(th2);
        for (e8 e8Var : (e8[]) this.f10529e.getAndSet(f10526h)) {
            i8Var.replay(e8Var);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10528c) {
            return;
        }
        i8 i8Var = this.f10527b;
        i8Var.next(obj);
        for (e8 e8Var : (e8[]) this.f10529e.get()) {
            i8Var.replay(e8Var);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            for (e8 e8Var : (e8[]) this.f10529e.get()) {
                this.f10527b.replay(e8Var);
            }
        }
    }
}
