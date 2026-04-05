package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n8 extends AtomicLong implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96000b;

    /* renamed from: c, reason: collision with root package name */
    public final o8 f96001c;

    /* renamed from: e, reason: collision with root package name */
    public long f96002e;

    public n8(tw.c cVar, o8 o8Var) {
        this.f96000b = cVar;
        this.f96001c = o8Var;
    }

    @Override // tw.d
    public void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            o8 o8Var = this.f96001c;
            o8Var.c(this);
            o8Var.b();
        }
    }

    public boolean isCancelled() {
        return get() == Long.MIN_VALUE;
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.addCancel(this, j10);
        this.f96001c.b();
    }
}
