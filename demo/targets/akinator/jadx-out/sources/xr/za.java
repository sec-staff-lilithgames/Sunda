package xr;

import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class za implements wr.g5 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f93326d = Logger.getLogger(za.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final wa f93327e = new wa();

    /* renamed from: f, reason: collision with root package name */
    public static final xa f93328f = new xa();

    /* renamed from: a, reason: collision with root package name */
    public final mh.v2 f93329a;

    /* renamed from: b, reason: collision with root package name */
    public final ya f93330b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f93331c;

    public za() {
        String str = System.getenv("GRPC_PROXY_EXP");
        this.f93329a = (mh.v2) mh.p1.checkNotNull(f93328f);
        this.f93330b = (ya) mh.p1.checkNotNull(f93327e);
        if (str == null) {
            this.f93331c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i10 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f93326d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f93331c = new InetSocketAddress(strArrSplit[0], i10);
    }

    @Override // wr.g5
    public wr.f5 proxyFor(SocketAddress socketAddress) throws IOException {
        URI uri;
        ProxySelector proxySelector;
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress inetSocketAddress = this.f93331c;
        if (inetSocketAddress != null) {
            return wr.u1.newBuilder().setProxyAddress(inetSocketAddress).setTargetAddress((InetSocketAddress) socketAddress).build();
        }
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddress;
        Logger logger = f93326d;
        try {
            try {
                uri = new URI(HttpRequest.DEFAULT_SCHEME, null, c5.getHost(inetSocketAddress2), inetSocketAddress2.getPort(), null, null, null);
                proxySelector = (ProxySelector) this.f93329a.get();
            } catch (URISyntaxException e10) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
            }
        } catch (Throwable th2) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
        }
        if (proxySelector == null) {
            logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
            return null;
        }
        List<Proxy> listSelect = proxySelector.select(uri);
        if (listSelect.size() > 1) {
            logger.warning("More than 1 proxy detected, gRPC will select the first one");
        }
        Proxy proxy = listSelect.get(0);
        if (proxy.type() != Proxy.Type.DIRECT) {
            InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = ((wa) this.f93330b).requestPasswordAuthentication(c5.getHost(inetSocketAddress3), inetSocketAddress3.getAddress(), inetSocketAddress3.getPort(), HttpRequest.DEFAULT_SCHEME, "", null);
            if (inetSocketAddress3.isUnresolved()) {
                inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
            }
            wr.t1 proxyAddress = wr.u1.newBuilder().setTargetAddress(inetSocketAddress2).setProxyAddress(inetSocketAddress3);
            if (passwordAuthenticationRequestPasswordAuthentication == null) {
                return proxyAddress.build();
            }
            return proxyAddress.setUsername(passwordAuthenticationRequestPasswordAuthentication.getUserName()).setPassword(passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null).build();
        }
        return null;
    }
}
