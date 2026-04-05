package xr;

import java.net.URI;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w9 extends wr.t4 {

    /* renamed from: a, reason: collision with root package name */
    public p4.a f93219a;

    @Override // wr.p4.a
    public String getDefaultScheme() {
        return this.f93219a.getDefaultScheme();
    }

    @Override // wr.p4.a
    public wr.p4 newNameResolver(URI uri, wr.n4 n4Var) {
        return this.f93219a.newNameResolver(uri, n4Var);
    }

    @Override // wr.t4
    public final int priority() {
        return 5;
    }
}
