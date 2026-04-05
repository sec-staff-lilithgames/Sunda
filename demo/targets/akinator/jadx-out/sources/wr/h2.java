package wr;

import com.amazon.device.ads.DTBMetricsConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f90951a;

    /* renamed from: b, reason: collision with root package name */
    public q f90952b;

    public i2 build() {
        mh.p1.checkState(this.f90951a != null, "config is not set");
        return new i2(m6.f91037e, this.f90951a, this.f90952b);
    }

    public h2 setConfig(Object obj) {
        this.f90951a = mh.p1.checkNotNull(obj, DTBMetricsConfiguration.CONFIG_DIR);
        return this;
    }

    public h2 setInterceptor(q qVar) {
        this.f90952b = (q) mh.p1.checkNotNull(qVar, "interceptor");
        return this;
    }
}
