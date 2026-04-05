package xr;

import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f92373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f92374b;

    public d0(e0 e0Var, long j10) {
        this.f92374b = e0Var;
        this.f92373a = j10;
    }

    public void backoff() {
        long j10 = this.f92373a;
        long jMax = Math.max(2 * j10, j10);
        e0 e0Var = this.f92374b;
        if (e0Var.f92454b.compareAndSet(j10, jMax)) {
            e0.f92452c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{e0Var.f92453a, Long.valueOf(jMax)});
        }
    }

    public long get() {
        return this.f92373a;
    }
}
