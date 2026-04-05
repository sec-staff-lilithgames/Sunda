package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s8 extends AtomicLong implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96316b;

    /* renamed from: c, reason: collision with root package name */
    public final r8 f96317c;

    /* renamed from: e, reason: collision with root package name */
    public long f96318e;

    public s8(tw.c cVar, r8 r8Var) {
        this.f96316b = cVar;
        this.f96317c = r8Var;
    }

    @Override // tw.d
    public void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            r8 r8Var = this.f96317c;
            r8Var.h(this);
            r8Var.f();
        }
    }

    public boolean isCancelled() {
        return get() == Long.MIN_VALUE;
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.addCancel(this, j10);
            this.f96317c.f();
        }
    }
}
