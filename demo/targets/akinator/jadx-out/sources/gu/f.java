package gu;

import iu.u;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends AtomicReference implements mt.q, tw.d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f58425c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Queue f58426b;

    public f(Queue<Object> queue) {
        this.f58426b = queue;
    }

    @Override // tw.d
    public void cancel() {
        if (hu.g.cancel(this)) {
            this.f58426b.offer(f58425c);
        }
    }

    public boolean isCancelled() {
        return get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58426b.offer(u.complete());
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58426b.offer(u.error(th2));
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f58426b.offer(u.next(obj));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            this.f58426b.offer(u.subscription(this));
        }
    }

    @Override // tw.d
    public void request(long j10) {
        ((tw.d) get()).request(j10);
    }
}
