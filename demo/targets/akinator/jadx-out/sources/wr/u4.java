package wr;

import java.net.URI;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u4 extends p4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w4 f91153a;

    public u4(w4 w4Var) {
        this.f91153a = w4Var;
    }

    @Override // wr.p4.a
    public String getDefaultScheme() {
        return this.f91153a.getDefaultScheme();
    }

    @Override // wr.p4.a
    public p4 newNameResolver(URI uri, n4 n4Var) {
        t4 providerForScheme = this.f91153a.getProviderForScheme(uri.getScheme());
        if (providerForScheme == null) {
            return null;
        }
        return providerForScheme.newNameResolver(uri, n4Var);
    }
}
