package xv;

import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f93908a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f93909b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f93910c;

    public y0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.e0.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.e0.checkNotNullParameter(socketAddress, "socketAddress");
        this.f93908a = address;
        this.f93909b = proxy;
        this.f93910c = socketAddress;
    }

    @tu.f
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final a m8010deprecated_address() {
        return this.f93908a;
    }

    @tu.f
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m8011deprecated_proxy() {
        return this.f93909b;
    }

    @tu.f
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m8012deprecated_socketAddress() {
        return this.f93910c;
    }

    public final a address() {
        return this.f93908a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.e0.areEqual(y0Var.f93908a, this.f93908a) && kotlin.jvm.internal.e0.areEqual(y0Var.f93909b, this.f93909b) && kotlin.jvm.internal.e0.areEqual(y0Var.f93910c, this.f93910c);
    }

    public int hashCode() {
        return this.f93910c.hashCode() + ((this.f93909b.hashCode() + ((this.f93908a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.f93909b;
    }

    public final boolean requiresTunnel() {
        if (this.f93909b.type() != Proxy.Type.HTTP) {
            return false;
        }
        a aVar = this.f93908a;
        return aVar.sslSocketFactory() != null || aVar.protocols().contains(n0.f93763i);
    }

    public final InetSocketAddress socketAddress() {
        return this.f93910c;
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        a aVar = this.f93908a;
        String strHost = aVar.url().host();
        InetSocketAddress inetSocketAddress = this.f93910c;
        InetAddress address = inetSocketAddress.getAddress();
        String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : yv.f.toCanonicalHost(hostAddress);
        if (sv.n0.contains$default((CharSequence) strHost, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
            w0.i.h(sb2, C3191e4.i.f36529d, strHost, C3191e4.i.f36531e);
        } else {
            sb2.append(strHost);
        }
        if (aVar.url().port() != inetSocketAddress.getPort() || kotlin.jvm.internal.e0.areEqual(strHost, canonicalHost)) {
            sb2.append(":");
            sb2.append(aVar.url().port());
        }
        if (!kotlin.jvm.internal.e0.areEqual(strHost, canonicalHost)) {
            if (kotlin.jvm.internal.e0.areEqual(this.f93909b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(yFkbx.XBKgHayBif);
            }
            if (canonicalHost == null) {
                sb2.append("<unresolved>");
            } else if (sv.n0.contains$default((CharSequence) canonicalHost, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
                w0.i.h(sb2, C3191e4.i.f36529d, canonicalHost, C3191e4.i.f36531e);
            } else {
                sb2.append(canonicalHost);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
