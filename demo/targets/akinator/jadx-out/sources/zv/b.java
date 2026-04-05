package zv;

import io.ktor.http.auth.AuthScheme;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import uu.y0;
import xv.c;
import xv.g0;
import xv.m;
import xv.o0;
import xv.v0;
import xv.w;
import xv.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final z f98857b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static InetAddress a(Proxy proxy, g0 g0Var, z zVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) y0.first((List) zVar.lookup(g0Var.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        e0.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        e0.checkNotNullExpressionValue(address, "getAddress(...)");
        return address;
    }

    @Override // xv.c
    public o0 authenticate(xv.y0 y0Var, v0 response) throws IOException {
        Proxy proxy;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        xv.a aVarAddress;
        z zVarDns;
        e0.checkNotNullParameter(response, "response");
        List<m> listChallenges = response.challenges();
        o0 o0VarRequest = response.request();
        g0 g0VarUrl = o0VarRequest.url();
        boolean z10 = response.code() == 407;
        if (y0Var == null || (proxy = y0Var.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (m mVar : listChallenges) {
            if (k0.equals(AuthScheme.Basic, mVar.scheme(), true)) {
                z zVar = (y0Var == null || (aVarAddress = y0Var.address()) == null || (zVarDns = aVarAddress.dns()) == null) ? this.f98857b : zVarDns;
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    e0.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    e0.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, a(proxy, g0VarUrl, zVar), inetSocketAddress.getPort(), g0VarUrl.scheme(), mVar.realm(), mVar.scheme(), g0VarUrl.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = g0VarUrl.host();
                    e0.checkNotNull(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strHost, a(proxy, g0VarUrl, zVar), g0VarUrl.port(), g0VarUrl.scheme(), mVar.realm(), mVar.scheme(), g0VarUrl.url(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    e0.checkNotNullExpressionValue(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    e0.checkNotNullExpressionValue(password, "getPassword(...)");
                    return o0VarRequest.newBuilder().header(str, w.basic(userName, new String(password), mVar.charset())).build();
                }
            }
        }
        return null;
    }

    public b(z defaultDns) {
        e0.checkNotNullParameter(defaultDns, "defaultDns");
        this.f98857b = defaultDns;
    }

    public /* synthetic */ b(z zVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? z.f93911a : zVar);
    }
}
