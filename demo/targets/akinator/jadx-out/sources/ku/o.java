package ku;

import iu.b0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import mt.i0;
import mt.q0;
import mt.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o extends h implements i0, v, q0, mt.f {

    /* renamed from: k, reason: collision with root package name */
    public final i0 f72040k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f72041l;

    public o() {
        this(n.f72038b);
    }

    public static <T> o create() {
        return new o();
    }

    public final o assertOf(st.g gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw iu.m.wrapOrThrow(th2);
        }
    }

    public final void cancel() {
        dispose();
    }

    @Override // ku.h, pt.c
    public final void dispose() {
        tt.d.dispose(this.f72041l);
    }

    public final boolean hasSubscription() {
        return this.f72041l.get() != null;
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    @Override // ku.h, pt.c
    public final boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f72041l.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        CountDownLatch countDownLatch = this.f72019b;
        if (!this.f72024h) {
            this.f72024h = true;
            if (this.f72041l.get() == null) {
                this.f72021e.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f72023g = Thread.currentThread();
            this.f72022f++;
            this.f72040k.onComplete();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        CountDownLatch countDownLatch = this.f72019b;
        boolean z10 = this.f72024h;
        b0 b0Var = this.f72021e;
        if (!z10) {
            this.f72024h = true;
            if (this.f72041l.get() == null) {
                b0Var.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f72023g = Thread.currentThread();
            if (th2 == null) {
                b0Var.add(new NullPointerException("onError received a null Throwable"));
            } else {
                b0Var.add(th2);
            }
            this.f72040k.onError(th2);
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        boolean z10 = this.f72024h;
        b0 b0Var = this.f72021e;
        if (!z10) {
            this.f72024h = true;
            if (this.f72041l.get() == null) {
                b0Var.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f72023g = Thread.currentThread();
        this.f72020c.add(obj);
        if (obj == null) {
            b0Var.add(new NullPointerException("onNext received a null value"));
        }
        this.f72040k.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        AtomicReference atomicReference;
        this.f72023g = Thread.currentThread();
        b0 b0Var = this.f72021e;
        if (cVar == null) {
            b0Var.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f72041l;
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f72040k.onSubscribe(cVar);
                return;
            }
        } while (atomicReference.get() == null);
        cVar.dispose();
        if (atomicReference.get() != tt.d.f87352b) {
            b0Var.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + cVar));
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        onNext(obj);
        onComplete();
    }

    public o(i0 i0Var) {
        this.f72041l = new AtomicReference();
        this.f72040k = i0Var;
    }

    public static <T> o create(i0 i0Var) {
        return new o(i0Var);
    }

    @Override // ku.h
    public final o assertNotSubscribed() {
        if (this.f72041l.get() != null) {
            throw a("Subscribed!");
        }
        if (this.f72021e.isEmpty()) {
            return this;
        }
        throw a("Not subscribed but errors found");
    }

    @Override // ku.h
    public final o assertSubscribed() {
        if (this.f72041l.get() != null) {
            return this;
        }
        throw a("Not subscribed!");
    }
}
