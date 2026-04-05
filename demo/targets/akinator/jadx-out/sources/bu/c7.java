package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c7 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: g, reason: collision with root package name */
    public static final b7[] f10169g = new b7[0];

    /* renamed from: h, reason: collision with root package name */
    public static final b7[] f10170h = new b7[0];

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10172c;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f10174f;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10171b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f10173e = new AtomicReference();

    public c7(AtomicReference atomicReference) {
        this.f10172c = atomicReference;
        lazySet(f10169g);
    }

    public boolean add(b7 b7Var) {
        b7[] b7VarArr;
        b7[] b7VarArr2;
        do {
            b7VarArr = (b7[]) get();
            if (b7VarArr == f10170h) {
                return false;
            }
            int length = b7VarArr.length;
            b7VarArr2 = new b7[length + 1];
            System.arraycopy(b7VarArr, 0, b7VarArr2, 0, length);
            b7VarArr2[length] = b7Var;
        } while (!compareAndSet(b7VarArr, b7VarArr2));
        return true;
    }

    @Override // pt.c
    public void dispose() {
        AtomicReference atomicReference;
        getAndSet(f10170h);
        do {
            atomicReference = this.f10172c;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        tt.d.dispose(this.f10173e);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == f10170h;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10173e.lazySet(tt.d.f87352b);
        for (b7 b7Var : (b7[]) getAndSet(f10170h)) {
            b7Var.f10120b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10174f = th2;
        this.f10173e.lazySet(tt.d.f87352b);
        for (b7 b7Var : (b7[]) getAndSet(f10170h)) {
            b7Var.f10120b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        for (b7 b7Var : (b7[]) get()) {
            b7Var.f10120b.onNext(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10173e, cVar);
    }

    public void remove(b7 b7Var) {
        b7[] b7VarArr;
        b7[] b7VarArr2;
        do {
            b7VarArr = (b7[]) get();
            int length = b7VarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (b7VarArr[i10] == b7Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length != 1) {
                b7VarArr2 = new b7[length - 1];
                System.arraycopy(b7VarArr, 0, b7VarArr2, 0, i10);
                System.arraycopy(b7VarArr, i10 + 1, b7VarArr2, i10, (length - i10) - 1);
            } else {
                b7VarArr2 = f10169g;
            }
        } while (!compareAndSet(b7VarArr, b7VarArr2));
    }
}
