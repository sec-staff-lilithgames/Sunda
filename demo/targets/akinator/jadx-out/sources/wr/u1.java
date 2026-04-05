package wr;

import com.applovin.sdk.AppLovinEventParameters;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u1 extends f5 {

    /* renamed from: b, reason: collision with root package name */
    public final SocketAddress f91146b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f91147c;

    /* renamed from: e, reason: collision with root package name */
    public final String f91148e;

    /* renamed from: f, reason: collision with root package name */
    public final String f91149f;

    public u1(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        mh.p1.checkNotNull(socketAddress, "proxyAddress");
        mh.p1.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            mh.p1.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f91146b = socketAddress;
        this.f91147c = inetSocketAddress;
        this.f91148e = str;
        this.f91149f = str2;
    }

    public static t1 newBuilder() {
        return new t1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return mh.h1.equal(this.f91146b, u1Var.f91146b) && mh.h1.equal(this.f91147c, u1Var.f91147c) && mh.h1.equal(this.f91148e, u1Var.f91148e) && mh.h1.equal(this.f91149f, u1Var.f91149f);
    }

    public String getPassword() {
        return this.f91149f;
    }

    public SocketAddress getProxyAddress() {
        return this.f91146b;
    }

    public InetSocketAddress getTargetAddress() {
        return this.f91147c;
    }

    public String getUsername() {
        return this.f91148e;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f91146b, this.f91147c, this.f91148e, this.f91149f);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("proxyAddr", this.f91146b).add("targetAddr", this.f91147c).add(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, this.f91148e).add("hasPassword", this.f91149f != null).toString();
    }
}
