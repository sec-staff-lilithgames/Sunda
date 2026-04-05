package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    final a f43150a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f43151b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f43152c;

    public a0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f43150a = aVar;
        this.f43151b = proxy;
        this.f43152c = inetSocketAddress;
    }

    public a a() {
        return this.f43150a;
    }

    public Proxy b() {
        return this.f43151b;
    }

    public boolean c() {
        return this.f43150a.f43147i != null && this.f43151b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f43152c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return a0Var.f43150a.equals(this.f43150a) && a0Var.f43151b.equals(this.f43151b) && a0Var.f43152c.equals(this.f43152c);
    }

    public int hashCode() {
        return this.f43152c.hashCode() + ((this.f43151b.hashCode() + ((this.f43150a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.f43152c + "}";
    }
}
