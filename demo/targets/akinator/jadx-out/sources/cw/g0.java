package cw;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.o0;
import uu.p0;
import uu.v0;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f51145i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final xv.a f51146a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f51147b;

    /* renamed from: c, reason: collision with root package name */
    public final h f51148c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f51149d;

    /* renamed from: e, reason: collision with root package name */
    public final List f51150e;

    /* renamed from: f, reason: collision with root package name */
    public int f51151f;

    /* renamed from: g, reason: collision with root package name */
    public List f51152g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f51153h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            kotlin.jvm.internal.e0.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f51154a;

        /* renamed from: b, reason: collision with root package name */
        public int f51155b;

        public b(List<y0> routes) {
            kotlin.jvm.internal.e0.checkNotNullParameter(routes, "routes");
            this.f51154a = routes;
        }

        public final List<y0> getRoutes() {
            return this.f51154a;
        }

        public final boolean hasNext() {
            return this.f51155b < this.f51154a.size();
        }

        public final y0 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f51155b;
            this.f51155b = i10 + 1;
            return (y0) this.f51154a.get(i10);
        }
    }

    public g0(xv.a address, c0 routeDatabase, h connectionUser, boolean z10) {
        List<? extends Proxy> listImmutableListOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.e0.checkNotNullParameter(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionUser, "connectionUser");
        this.f51146a = address;
        this.f51147b = routeDatabase;
        this.f51148c = connectionUser;
        this.f51149d = z10;
        this.f51150e = p0.emptyList();
        this.f51152g = p0.emptyList();
        this.f51153h = new ArrayList();
        xv.g0 g0VarUrl = address.url();
        Proxy proxy = address.proxy();
        connectionUser.proxySelectStart(g0VarUrl);
        if (proxy != null) {
            listImmutableListOf = o0.listOf(proxy);
        } else {
            URI uri = g0VarUrl.uri();
            if (uri.getHost() == null) {
                listImmutableListOf = yv.i.immutableListOf(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = address.proxySelector().select(uri);
                List<Proxy> list = listSelect;
                listImmutableListOf = (list == null || list.isEmpty()) ? yv.i.immutableListOf(Proxy.NO_PROXY) : yv.i.toImmutableList(listSelect);
            }
        }
        this.f51150e = listImmutableListOf;
        this.f51151f = 0;
        connectionUser.proxySelectEnd(g0VarUrl, listImmutableListOf);
    }

    public final boolean hasNext() {
        return this.f51151f < this.f51150e.size() || !this.f51153h.isEmpty();
    }

    public final b next() throws IOException {
        ArrayList arrayList;
        String strHost;
        int iPort;
        List<InetAddress> listReorderForHappyEyeballs;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i10 = this.f51151f;
            int size = this.f51150e.size();
            arrayList = this.f51153h;
            if (i10 >= size) {
                break;
            }
            int i11 = this.f51151f;
            int size2 = this.f51150e.size();
            xv.a aVar = this.f51146a;
            if (i11 >= size2) {
                throw new SocketException("No route to " + aVar.url().host() + "; exhausted proxy configurations: " + this.f51150e);
            }
            int i12 = this.f51151f;
            this.f51151f = i12 + 1;
            Proxy proxy = (Proxy) this.f51150e.get(i12);
            ArrayList arrayList3 = new ArrayList();
            this.f51152g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strHost = aVar.url().host();
                iPort = aVar.url().port();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strHost = f51145i.getSocketHost(inetSocketAddress);
                iPort = inetSocketAddress.getPort();
            }
            if (1 > iPort || iPort >= 65536) {
                throw new SocketException("No route to " + strHost + AbstractJsonLexerKt.COLON + iPort + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(strHost, iPort));
            } else {
                if (yv.f.canParseAsIpAddress(strHost)) {
                    listReorderForHappyEyeballs = o0.listOf(InetAddress.getByName(strHost));
                } else {
                    h hVar = this.f51148c;
                    hVar.dnsStart(strHost);
                    List<InetAddress> listLookup = aVar.dns().lookup(strHost);
                    if (listLookup.isEmpty()) {
                        throw new UnknownHostException(aVar.dns() + " returned no addresses for " + strHost);
                    }
                    hVar.dnsEnd(strHost, listLookup);
                    listReorderForHappyEyeballs = listLookup;
                }
                if (this.f51149d) {
                    listReorderForHappyEyeballs = o.reorderForHappyEyeballs(listReorderForHappyEyeballs);
                }
                Iterator<InetAddress> it = listReorderForHappyEyeballs.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new InetSocketAddress(it.next(), iPort));
                }
            }
            Iterator it2 = this.f51152g.iterator();
            while (it2.hasNext()) {
                y0 y0Var = new y0(aVar, proxy, (InetSocketAddress) it2.next());
                if (this.f51147b.shouldPostpone(y0Var)) {
                    arrayList.add(y0Var);
                } else {
                    arrayList2.add(y0Var);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            v0.addAll(arrayList2, arrayList);
            arrayList.clear();
        }
        return new b(arrayList2);
    }
}
