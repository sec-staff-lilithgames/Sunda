package qu;

import iu.b0;
import iu.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ku.h;
import mt.q;
import st.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends h implements q, tw.d {

    /* renamed from: k, reason: collision with root package name */
    public final tw.c f83507k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f83508l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f83509m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicLong f83510n;

    public f() {
        this(e.f83505b, Long.MAX_VALUE);
    }

    public static <T> f create() {
        return new f();
    }

    public final f assertOf(g gVar) {
        try {
            gVar.accept(this);
            return this;
        } catch (Throwable th2) {
            throw m.wrapOrThrow(th2);
        }
    }

    @Override // tw.d
    public final void cancel() {
        if (this.f83508l) {
            return;
        }
        this.f83508l = true;
        hu.g.cancel(this.f83509m);
    }

    @Override // ku.h, pt.c
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.f83509m.get() != null;
    }

    public final boolean isCancelled() {
        return this.f83508l;
    }

    @Override // ku.h, pt.c
    public final boolean isDisposed() {
        return this.f83508l;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        CountDownLatch countDownLatch = this.f72019b;
        if (!this.f72024h) {
            this.f72024h = true;
            if (this.f83509m.get() == null) {
                this.f72021e.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f72023g = Thread.currentThread();
            this.f72022f++;
            this.f83507k.onComplete();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        CountDownLatch countDownLatch = this.f72019b;
        boolean z10 = this.f72024h;
        b0 b0Var = this.f72021e;
        if (!z10) {
            this.f72024h = true;
            if (this.f83509m.get() == null) {
                b0Var.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f72023g = Thread.currentThread();
            b0Var.add(th2);
            if (th2 == null) {
                b0Var.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f83507k.onError(th2);
            countDownLatch.countDown();
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        boolean z10 = this.f72024h;
        b0 b0Var = this.f72021e;
        if (!z10) {
            this.f72024h = true;
            if (this.f83509m.get() == null) {
                b0Var.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f72023g = Thread.currentThread();
        this.f72020c.add(obj);
        if (obj == null) {
            b0Var.add(new NullPointerException("onNext received a null value"));
        }
        this.f83507k.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        AtomicReference atomicReference;
        this.f72023g = Thread.currentThread();
        b0 b0Var = this.f72021e;
        if (dVar == null) {
            b0Var.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f83509m;
            if (atomicReference.compareAndSet(null, dVar)) {
                this.f83507k.onSubscribe(dVar);
                long andSet = this.f83510n.getAndSet(0L);
                if (andSet != 0) {
                    dVar.request(andSet);
                    return;
                }
                return;
            }
        } while (atomicReference.get() == null);
        dVar.cancel();
        if (atomicReference.get() != hu.g.f59176b) {
            b0Var.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + dVar));
        }
    }

    @Override // tw.d
    public final void request(long j10) {
        hu.g.deferredRequest(this.f83509m, this.f83510n, j10);
    }

    public final f requestMore(long j10) {
        request(j10);
        return this;
    }

    public f(long j10) {
        this(e.f83505b, j10);
    }

    public static <T> f create(long j10) {
        return new f(j10);
    }

    @Override // ku.h
    public final f assertNotSubscribed() {
        if (this.f83509m.get() != null) {
            throw a("Subscribed!");
        }
        if (this.f72021e.isEmpty()) {
            return this;
        }
        throw a("Not subscribed but errors found");
    }

    @Override // ku.h
    public final f assertSubscribed() {
        if (this.f83509m.get() != null) {
            return this;
        }
        throw a("Not subscribed!");
    }

    public f(tw.c cVar) {
        this(cVar, Long.MAX_VALUE);
    }

    public static <T> f create(tw.c cVar) {
        return new f(cVar);
    }

    public f(tw.c cVar, long j10) {
        if (j10 >= 0) {
            this.f83507k = cVar;
            this.f83509m = new AtomicReference();
            this.f83510n = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
