package com.applovin.shadow.okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        e0.checkNotNullParameter(address, "address");
        e0.checkNotNullParameter(proxy, "proxy");
        e0.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @f
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m341deprecated_address() {
        return this.address;
    }

    @f
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m342deprecated_proxy() {
        return this.proxy;
    }

    @f
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m343deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return e0.areEqual(route.address, this.address) && e0.areEqual(route.proxy, this.proxy) && e0.areEqual(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + AbstractJsonLexerKt.END_OBJ;
    }
}
