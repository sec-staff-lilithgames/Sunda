package wr;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final s6 f91138a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f91139b;

    public t6(s6 s6Var, ScheduledFuture scheduledFuture) {
        this.f91138a = (s6) mh.p1.checkNotNull(s6Var, "runnable");
        this.f91139b = (ScheduledFuture) mh.p1.checkNotNull(scheduledFuture, "future");
    }

    public void cancel() {
        this.f91138a.f91130c = true;
        this.f91139b.cancel(false);
    }

    public boolean isPending() {
        s6 s6Var = this.f91138a;
        return (s6Var.f91131e || s6Var.f91130c) ? false : true;
    }
}
