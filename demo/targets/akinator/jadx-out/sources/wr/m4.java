package wr;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f91028a;

    /* renamed from: b, reason: collision with root package name */
    public g5 f91029b;

    /* renamed from: c, reason: collision with root package name */
    public u6 f91030c;

    /* renamed from: d, reason: collision with root package name */
    public p4.c f91031d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledExecutorService f91032e;

    /* renamed from: f, reason: collision with root package name */
    public m f91033f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f91034g;

    /* renamed from: h, reason: collision with root package name */
    public String f91035h;

    public n4 build() {
        return new n4(this.f91028a, this.f91029b, this.f91030c, this.f91031d, this.f91032e, this.f91033f, this.f91034g, this.f91035h);
    }

    public m4 setChannelLogger(m mVar) {
        this.f91033f = (m) mh.p1.checkNotNull(mVar);
        return this;
    }

    public m4 setDefaultPort(int i10) {
        this.f91028a = Integer.valueOf(i10);
        return this;
    }

    public m4 setOffloadExecutor(Executor executor) {
        this.f91034g = executor;
        return this;
    }

    public m4 setOverrideAuthority(String str) {
        this.f91035h = str;
        return this;
    }

    public m4 setProxyDetector(g5 g5Var) {
        this.f91029b = (g5) mh.p1.checkNotNull(g5Var);
        return this;
    }

    public m4 setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f91032e = (ScheduledExecutorService) mh.p1.checkNotNull(scheduledExecutorService);
        return this;
    }

    public m4 setServiceConfigParser(p4.c cVar) {
        this.f91031d = (p4.c) mh.p1.checkNotNull(cVar);
        return this;
    }

    public m4 setSynchronizationContext(u6 u6Var) {
        this.f91030c = (u6) mh.p1.checkNotNull(u6Var);
        return this;
    }
}
