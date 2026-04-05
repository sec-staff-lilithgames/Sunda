package fu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56031b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56032c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f56033e;

    public i0(Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f56031b = runnable;
        this.f56032c = j10;
        this.f56033e = timeUnit;
    }

    @Override // fu.m0
    public final pt.c a(m0.a aVar, mt.f fVar) {
        return aVar.schedule(new k0(this.f56031b, fVar), this.f56032c, this.f56033e);
    }
}
