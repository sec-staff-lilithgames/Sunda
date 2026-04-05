package xr;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y8 extends wr.t4 {

    /* renamed from: a, reason: collision with root package name */
    public final SocketAddress f93261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93262b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f93263c;

    public y8(SocketAddress socketAddress, String str) {
        this.f93261a = socketAddress;
        this.f93262b = str;
        this.f93263c = Collections.singleton(socketAddress.getClass());
    }

    @Override // wr.p4.a
    public String getDefaultScheme() {
        return "directaddress";
    }

    @Override // wr.t4
    public Collection<Class<? extends SocketAddress>> getProducedSocketAddressTypes() {
        return this.f93263c;
    }

    @Override // wr.p4.a
    public wr.p4 newNameResolver(URI uri, wr.n4 n4Var) {
        return new x8(this);
    }

    @Override // wr.t4
    public final int priority() {
        return 5;
    }
}
