package yr;

import javax.net.ssl.SSLSocketFactory;
import mh.p1;
import wr.n5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i1 extends n5 {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f94929a;

    /* renamed from: b, reason: collision with root package name */
    public final zr.c f94930b;

    public i1(SSLSocketFactory sSLSocketFactory) {
        zr.c cVar = t.f95033r;
        this.f94929a = (SSLSocketFactory) p1.checkNotNull(sSLSocketFactory, "factory");
        this.f94930b = (zr.c) p1.checkNotNull(cVar, "connectionSpec");
    }

    public zr.c getConnectionSpec() {
        return this.f94930b;
    }

    public SSLSocketFactory getFactory() {
        return this.f94929a;
    }
}
