package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.q;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f43344a;

    /* renamed from: b, reason: collision with root package name */
    private final d f43345b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f43346c;

    /* renamed from: d, reason: collision with root package name */
    private final n f43347d;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f43348e;

    /* renamed from: f, reason: collision with root package name */
    private int f43349f;

    /* renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f43350g;

    /* renamed from: h, reason: collision with root package name */
    private final List<a0> f43351h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<a0> f43352a;

        /* renamed from: b, reason: collision with root package name */
        private int f43353b = 0;

        public a(List<a0> list) {
            this.f43352a = list;
        }

        public List<a0> a() {
            return new ArrayList(this.f43352a);
        }

        public boolean b() {
            return this.f43353b < this.f43352a.size();
        }

        public a0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<a0> list = this.f43352a;
            int i10 = this.f43353b;
            this.f43353b = i10 + 1;
            return list.get(i10);
        }
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, n nVar) {
        List list = Collections.EMPTY_LIST;
        this.f43348e = list;
        this.f43350g = list;
        this.f43351h = new ArrayList();
        this.f43344a = aVar;
        this.f43345b = dVar;
        this.f43346c = dVar2;
        this.f43347d = nVar;
        a(aVar.k(), aVar.f());
    }

    private boolean b() {
        return this.f43349f < this.f43348e.size();
    }

    private Proxy d() throws IOException {
        if (!b()) {
            throw new SocketException("No route to " + this.f43344a.k().g() + "; exhausted proxy configurations: " + this.f43348e);
        }
        List<Proxy> list = this.f43348e;
        int i10 = this.f43349f;
        this.f43349f = i10 + 1;
        Proxy proxy = list.get(i10);
        a(proxy);
        return proxy;
    }

    public boolean a() {
        return b() || !this.f43351h.isEmpty();
    }

    public a c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            int size = this.f43350g.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0 a0Var = new a0(this.f43344a, proxyD, this.f43350g.get(i10));
                if (this.f43345b.c(a0Var)) {
                    this.f43351h.add(a0Var);
                } else {
                    arrayList.add(a0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f43351h);
            this.f43351h.clear();
        }
        return new a(arrayList);
    }

    public void a(a0 a0Var, IOException iOException) {
        if (a0Var.b().type() != Proxy.Type.DIRECT && this.f43344a.h() != null) {
            this.f43344a.h().connectFailed(this.f43344a.k().m(), a0Var.b().address(), iOException);
        }
        this.f43345b.b(a0Var);
    }

    private void a(q qVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f43348e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f43344a.h().select(qVar.m());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f43348e = listA;
        }
        this.f43349f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f43350g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f43344a.k().g();
            iJ = this.f43344a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f43350g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f43347d.dnsStart(this.f43346c, strG);
            List<InetAddress> listA = this.f43344a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f43347d.dnsEnd(this.f43346c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f43350g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f43344a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + ":" + iJ + "; port is out of range");
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
