package yr;

import javax.net.ssl.SSLSocketFactory;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f95027a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.f f95028b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95029c;

    public s(SSLSocketFactory sSLSocketFactory, wr.f fVar, String str) {
        this.f95027a = sSLSocketFactory;
        this.f95028b = fVar;
        this.f95029c = str;
    }

    public static s error(String str) {
        return new s(null, null, (String) p1.checkNotNull(str, "error"));
    }

    public static s factory(SSLSocketFactory sSLSocketFactory) {
        return new s((SSLSocketFactory) p1.checkNotNull(sSLSocketFactory, "factory"), null, null);
    }

    public static s plaintext() {
        return new s(null, null, null);
    }

    public s withCallCredentials(wr.f fVar) {
        p1.checkNotNull(fVar, "callCreds");
        if (this.f95029c != null) {
            return this;
        }
        wr.f fVar2 = this.f95028b;
        if (fVar2 != null) {
            fVar = new wr.b0(fVar2, fVar);
        }
        return new s(this.f95027a, fVar, null);
    }
}
