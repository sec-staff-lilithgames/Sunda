package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ua extends wa {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f96413j;

    public ua(qu.d dVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(dVar, j10, timeUnit, m0Var);
        this.f96413j = new AtomicInteger(1);
    }

    @Override // yt.wa
    public final void a() {
        b();
        if (this.f96413j.decrementAndGet() == 0) {
            this.f96501b.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicInteger atomicInteger = this.f96413j;
        if (atomicInteger.incrementAndGet() == 2) {
            b();
            if (atomicInteger.decrementAndGet() == 0) {
                this.f96501b.onComplete();
            }
        }
    }
}
