package wr;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f91066a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f91067b;

    /* renamed from: c, reason: collision with root package name */
    public final u6 f91068c;

    /* renamed from: d, reason: collision with root package name */
    public final p4.c f91069d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f91070e;

    /* renamed from: f, reason: collision with root package name */
    public final m f91071f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f91072g;

    /* renamed from: h, reason: collision with root package name */
    public final String f91073h;

    public n4(Integer num, g5 g5Var, u6 u6Var, p4.c cVar, ScheduledExecutorService scheduledExecutorService, m mVar, Executor executor, String str) {
        this.f91066a = ((Integer) mh.p1.checkNotNull(num, "defaultPort not set")).intValue();
        this.f91067b = (g5) mh.p1.checkNotNull(g5Var, "proxyDetector not set");
        this.f91068c = (u6) mh.p1.checkNotNull(u6Var, "syncContext not set");
        this.f91069d = (p4.c) mh.p1.checkNotNull(cVar, "serviceConfigParser not set");
        this.f91070e = scheduledExecutorService;
        this.f91071f = mVar;
        this.f91072g = executor;
        this.f91073h = str;
    }

    public static m4 newBuilder() {
        return new m4();
    }

    public m getChannelLogger() {
        m mVar = this.f91071f;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("ChannelLogger is not set in Builder");
    }

    public int getDefaultPort() {
        return this.f91066a;
    }

    public Executor getOffloadExecutor() {
        return this.f91072g;
    }

    public String getOverrideAuthority() {
        return this.f91073h;
    }

    public g5 getProxyDetector() {
        return this.f91067b;
    }

    public ScheduledExecutorService getScheduledExecutorService() {
        ScheduledExecutorService scheduledExecutorService = this.f91070e;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    public p4.c getServiceConfigParser() {
        return this.f91069d;
    }

    public u6 getSynchronizationContext() {
        return this.f91068c;
    }

    public m4 toBuilder() {
        m4 m4Var = new m4();
        m4Var.setDefaultPort(this.f91066a);
        m4Var.setProxyDetector(this.f91067b);
        m4Var.setSynchronizationContext(this.f91068c);
        m4Var.setServiceConfigParser(this.f91069d);
        m4Var.setScheduledExecutorService(this.f91070e);
        m4Var.setChannelLogger(this.f91071f);
        m4Var.setOffloadExecutor(this.f91072g);
        m4Var.setOverrideAuthority(this.f91073h);
        return m4Var;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("defaultPort", this.f91066a).add("proxyDetector", this.f91067b).add("syncContext", this.f91068c).add("serviceConfigParser", this.f91069d).add("scheduledExecutorService", this.f91070e).add("channelLogger", this.f91071f).add("executor", this.f91072g).add("overrideAuthority", this.f91073h).toString();
    }
}
