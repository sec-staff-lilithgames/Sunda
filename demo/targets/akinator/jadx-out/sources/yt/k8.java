package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k8 extends AtomicLong implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95811b;

    /* renamed from: c, reason: collision with root package name */
    public volatile l8 f95812c;

    /* renamed from: e, reason: collision with root package name */
    public long f95813e;

    public k8(tw.c cVar) {
        this.f95811b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        l8 l8Var;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (l8Var = this.f95812c) == null) {
            return;
        }
        l8Var.c(this);
        l8Var.b();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.addCancel(this, j10);
            l8 l8Var = this.f95812c;
            if (l8Var != null) {
                l8Var.b();
            }
        }
    }
}
