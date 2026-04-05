package xr;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f92710a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.u6 f92711b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f92712c;

    /* renamed from: d, reason: collision with root package name */
    public final mh.t2 f92713d;

    /* renamed from: e, reason: collision with root package name */
    public long f92714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92715f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f92716g;

    public jb(v7 v7Var, wr.u6 u6Var, ScheduledExecutorService scheduledExecutorService, mh.t2 t2Var) {
        this.f92712c = v7Var;
        this.f92711b = u6Var;
        this.f92710a = scheduledExecutorService;
        this.f92713d = t2Var;
        t2Var.start();
    }
}
