package wr;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public SocketAddress f91132a;

    /* renamed from: b, reason: collision with root package name */
    public InetSocketAddress f91133b;

    /* renamed from: c, reason: collision with root package name */
    public String f91134c;

    /* renamed from: d, reason: collision with root package name */
    public String f91135d;

    public u1 build() {
        return new u1(this.f91132a, this.f91133b, this.f91134c, this.f91135d);
    }

    public t1 setPassword(String str) {
        this.f91135d = str;
        return this;
    }

    public t1 setProxyAddress(SocketAddress socketAddress) {
        this.f91132a = (SocketAddress) mh.p1.checkNotNull(socketAddress, "proxyAddress");
        return this;
    }

    public t1 setTargetAddress(InetSocketAddress inetSocketAddress) {
        this.f91133b = (InetSocketAddress) mh.p1.checkNotNull(inetSocketAddress, "targetAddress");
        return this;
    }

    public t1 setUsername(String str) {
        this.f91134c = str;
        return this;
    }
}
