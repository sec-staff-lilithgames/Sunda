package wr;

import java.net.SocketAddress;
import java.security.cert.Certificate;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e2 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f90880f = Logger.getLogger(e2.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final e2 f90881g = new e2();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f90882a = new ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentSkipListMap f90883b = new ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f90884c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f90885d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f90886e = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f90887a;

        public a(String str, Object obj) {
            mh.p1.checkState(obj == null || obj.getClass().getName().endsWith("com.google.protobuf.Any"), "the 'any' object must be of type com.google.protobuf.Any");
            this.f90887a = obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f90888a;

        public b(List<m2> list, boolean z10) {
            this.f90888a = (List) mh.p1.checkNotNull(list);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final List f90889a;

        public d(List<m2> list, boolean z10) {
            this.f90889a = (List) mh.p1.checkNotNull(list);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final List f90890a;

        public e(List<v2> list, boolean z10) {
            this.f90890a = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final List f90891a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public long f90892a;

            /* renamed from: b, reason: collision with root package name */
            public long f90893b;

            /* renamed from: c, reason: collision with root package name */
            public long f90894c;

            /* renamed from: d, reason: collision with root package name */
            public long f90895d;

            /* renamed from: e, reason: collision with root package name */
            public final ArrayList f90896e = new ArrayList();

            public a addListenSockets(List<m2> list) {
                mh.p1.checkNotNull(list, "listenSockets");
                Iterator<m2> it = list.iterator();
                while (it.hasNext()) {
                    this.f90896e.add((m2) mh.p1.checkNotNull(it.next(), "null listen socket"));
                }
                return this;
            }

            public f build() {
                return new f(this.f90892a, this.f90893b, this.f90894c, this.f90895d, this.f90896e);
            }

            public a setCallsFailed(long j10) {
                this.f90894c = j10;
                return this;
            }

            public a setCallsStarted(long j10) {
                this.f90892a = j10;
                return this;
            }

            public a setCallsSucceeded(long j10) {
                this.f90893b = j10;
                return this;
            }

            public a setLastCallStartedNanos(long j10) {
                this.f90895d = j10;
                return this;
            }
        }

        public f(long j10, long j11, long j12, long j13, List<m2> list) {
            this.f90891a = (List) mh.p1.checkNotNull(list);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Map f90897a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final HashMap f90898a = new HashMap();

            /* renamed from: b, reason: collision with root package name */
            public Integer f90899b;

            /* renamed from: c, reason: collision with root package name */
            public Integer f90900c;

            public a addOption(String str, String str2) {
                this.f90898a.put(str, (String) mh.p1.checkNotNull(str2));
                return this;
            }

            public g build() {
                return new g(this.f90899b, this.f90900c, null, this.f90898a);
            }

            public a setSocketOptionLingerSeconds(Integer num) {
                this.f90900c = num;
                return this;
            }

            public a setSocketOptionTimeoutMillis(Integer num) {
                this.f90899b = num;
                return this;
            }

            public a addOption(String str, int i10) {
                this.f90898a.put(str, Integer.toString(i10));
                return this;
            }

            public a addOption(String str, boolean z10) {
                this.f90898a.put(str, Boolean.toString(z10));
                return this;
            }

            public a setTcpInfo(g2 g2Var) {
                return this;
            }
        }

        public g(Integer num, Integer num2, g2 g2Var, Map<String, String> map) {
            mh.p1.checkNotNull(map);
            this.f90897a = Collections.unmodifiableMap(new HashMap(map));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {
        public h(j jVar, SocketAddress socketAddress, SocketAddress socketAddress2, g gVar, c cVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i {
        public i(String str, Certificate certificate, Certificate certificate2) {
        }

        public i(SSLSession sSLSession) throws SSLPeerUnverifiedException {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                e2.f90880f.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j {
        public j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        }
    }

    public static void a(AbstractMap abstractMap, m2 m2Var) {
    }

    public static void b(AbstractMap abstractMap, m2 m2Var) {
    }

    public static long id(v2 v2Var) {
        return v2Var.getLogId().getId();
    }

    public static e2 instance() {
        return f90881g;
    }

    public void addClientSocket(m2 m2Var) {
        a(this.f90885d, m2Var);
    }

    public void addListenSocket(m2 m2Var) {
        a(this.f90885d, m2Var);
    }

    public void addRootChannel(m2 m2Var) {
        a(this.f90883b, m2Var);
    }

    public void addServer(m2 m2Var) {
        a(this.f90882a, m2Var);
    }

    public void addServerSocket(m2 m2Var, m2 m2Var2) {
        a((f2) this.f90886e.get(Long.valueOf(id(m2Var))), m2Var2);
    }

    public void addSubchannel(m2 m2Var) {
        a(this.f90884c, m2Var);
    }

    public boolean containsClientSocket(n2 n2Var) {
        return this.f90885d.containsKey(Long.valueOf(n2Var.getId()));
    }

    public boolean containsServer(n2 n2Var) {
        return this.f90882a.containsKey(Long.valueOf(n2Var.getId()));
    }

    public boolean containsSubchannel(n2 n2Var) {
        return this.f90884c.containsKey(Long.valueOf(n2Var.getId()));
    }

    public m2 getChannel(long j10) {
        return (m2) this.f90883b.get(Long.valueOf(j10));
    }

    public m2 getRootChannel(long j10) {
        return (m2) this.f90883b.get(Long.valueOf(j10));
    }

    public b getRootChannels(long j10, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f90883b.tailMap((ConcurrentSkipListMap) Long.valueOf(j10)).values().iterator();
        while (it.hasNext() && arrayList.size() < i10) {
            arrayList.add((m2) it.next());
        }
        return new b(arrayList, !it.hasNext());
    }

    public m2 getServer(long j10) {
        return (m2) this.f90882a.get(Long.valueOf(j10));
    }

    public e getServerSockets(long j10, long j11, int i10) {
        f2 f2Var = (f2) this.f90886e.get(Long.valueOf(j10));
        if (f2Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = f2Var.tailMap((f2) Long.valueOf(j11)).values().iterator();
        while (arrayList.size() < i10 && it.hasNext()) {
            arrayList.add((v2) it.next());
        }
        return new e(arrayList, !it.hasNext());
    }

    public d getServers(long j10, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = this.f90882a.tailMap((ConcurrentSkipListMap) Long.valueOf(j10)).values().iterator();
        while (it.hasNext() && arrayList.size() < i10) {
            arrayList.add((m2) it.next());
        }
        return new d(arrayList, !it.hasNext());
    }

    public m2 getSocket(long j10) {
        m2 m2Var = (m2) this.f90885d.get(Long.valueOf(j10));
        if (m2Var != null) {
            return m2Var;
        }
        Iterator it = this.f90886e.values().iterator();
        while (it.hasNext()) {
            m2 m2Var2 = (m2) ((f2) it.next()).get(Long.valueOf(j10));
            if (m2Var2 != null) {
                return m2Var2;
            }
        }
        return null;
    }

    public m2 getSubchannel(long j10) {
        return (m2) this.f90884c.get(Long.valueOf(j10));
    }

    public void removeClientSocket(m2 m2Var) {
        b(this.f90885d, m2Var);
    }

    public void removeListenSocket(m2 m2Var) {
        b(this.f90885d, m2Var);
    }

    public void removeRootChannel(m2 m2Var) {
        b(this.f90883b, m2Var);
    }

    public void removeServer(m2 m2Var) {
        b(this.f90882a, m2Var);
    }

    public void removeServerSocket(m2 m2Var, m2 m2Var2) {
        b((f2) this.f90886e.get(Long.valueOf(id(m2Var))), m2Var2);
    }

    public void removeSubchannel(m2 m2Var) {
        b(this.f90884c, m2Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {
        public c(i iVar) {
        }

        public c(a aVar) {
        }
    }
}
