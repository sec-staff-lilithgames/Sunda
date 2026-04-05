package bu;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends AtomicBoolean implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11269c;

    /* renamed from: e, reason: collision with root package name */
    public final int f11270e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f11271f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f11272g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f11273h = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public long f11274i;

    public z(mt.i0 i0Var, int i10, int i11, Callable callable) {
        this.f11268b = i0Var;
        this.f11269c = i10;
        this.f11270e = i11;
        this.f11271f = callable;
    }

    @Override // pt.c
    public void dispose() {
        this.f11272g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11272g.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f11273h;
            boolean zIsEmpty = arrayDeque.isEmpty();
            mt.i0 i0Var = this.f11268b;
            if (zIsEmpty) {
                i0Var.onComplete();
                return;
            }
            i0Var.onNext(arrayDeque.poll());
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11273h.clear();
        this.f11268b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long j10 = this.f11274i;
        this.f11274i = 1 + j10;
        long j11 = j10 % this.f11270e;
        mt.i0 i0Var = this.f11268b;
        ArrayDeque arrayDeque = this.f11273h;
        if (j11 == 0) {
            try {
                arrayDeque.offer((Collection) ut.o0.requireNonNull(this.f11271f.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
            } catch (Throwable th2) {
                arrayDeque.clear();
                this.f11272g.dispose();
                i0Var.onError(th2);
                return;
            }
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) it.next();
            collection.add(obj);
            if (this.f11269c <= collection.size()) {
                it.remove();
                i0Var.onNext(collection);
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11272g, cVar)) {
            this.f11272g = cVar;
            this.f11268b.onSubscribe(this);
        }
    }
}
