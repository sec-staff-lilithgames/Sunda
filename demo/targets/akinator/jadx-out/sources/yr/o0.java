package yr;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import mh.p1;
import wr.b7;
import wr.c7;
import wr.l1;
import wr.n5;
import wr.w1;
import xr.c5;
import xr.ce;
import xr.ff;
import xr.j4;
import xr.re;
import xr.v6;
import xr.y9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o0 extends l1 {

    /* renamed from: r, reason: collision with root package name */
    public static final Logger f94968r = Logger.getLogger(o0.class.getName());

    /* renamed from: s, reason: collision with root package name */
    public static final long f94969s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f94970t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f94971u;

    /* renamed from: v, reason: collision with root package name */
    public static final re f94972v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumSet f94973w;

    /* renamed from: b, reason: collision with root package name */
    public final SocketAddress f94975b;

    /* renamed from: c, reason: collision with root package name */
    public final k f94976c;

    /* renamed from: n, reason: collision with root package name */
    public boolean f94987n;

    /* renamed from: a, reason: collision with root package name */
    public final ce f94974a = new ce(new l0(this));

    /* renamed from: d, reason: collision with root package name */
    public final ff.a f94977d = ff.getDefaultFactory();

    /* renamed from: e, reason: collision with root package name */
    public y9 f94978e = f94972v;

    /* renamed from: f, reason: collision with root package name */
    public y9 f94979f = re.forResource(c5.f92326u);

    /* renamed from: g, reason: collision with root package name */
    public ServerSocketFactory f94980g = ServerSocketFactory.getDefault();

    /* renamed from: h, reason: collision with root package name */
    public long f94981h = c5.f92320o;

    /* renamed from: i, reason: collision with root package name */
    public long f94982i = c5.f92321p;

    /* renamed from: j, reason: collision with root package name */
    public int f94983j = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: k, reason: collision with root package name */
    public int f94984k = Segment.SIZE;

    /* renamed from: l, reason: collision with root package name */
    public int f94985l = 4194304;

    /* renamed from: m, reason: collision with root package name */
    public long f94986m = Long.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public long f94988o = TimeUnit.MINUTES.toNanos(5);

    /* renamed from: p, reason: collision with root package name */
    public long f94989p = Long.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public long f94990q = Long.MAX_VALUE;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f94969s = timeUnit.toNanos(1L);
        f94970t = timeUnit.toNanos(1L);
        f94971u = TimeUnit.DAYS.toNanos(1000L);
        f94972v = t.f95035t;
        f94973w = EnumSet.of(b7.f90838c, b7.f90839e);
    }

    public o0(SocketAddress socketAddress, k kVar) {
        this.f94975b = (SocketAddress) p1.checkNotNull(socketAddress, "address");
        this.f94976c = (k) p1.checkNotNull(kVar, "handshakerSocketFactory");
    }

    public static n0 a(n5 n5Var) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        KeyManager[] keyManagerArrB;
        TrustManager[] trustManagerArrC;
        m0 m0Var;
        if (!(n5Var instanceof c7)) {
            if (n5Var instanceof w1) {
                return n0.factory(new h1());
            }
            if (n5Var instanceof i1) {
                return n0.factory(new j1((i1) n5Var));
            }
            if (!(n5Var instanceof wr.o)) {
                return n0.error("Unsupported credential type: ".concat(n5Var.getClass().getName()));
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<n5> it = ((wr.o) n5Var).getCredentialsList().iterator();
            while (it.hasNext()) {
                n0 n0VarA = a(it.next());
                if (n0VarA.f94966b == null) {
                    return n0VarA;
                }
                sb2.append(", ");
                sb2.append(n0VarA.f94966b);
            }
            return n0.error(sb2.substring(2));
        }
        c7 c7Var = (c7) n5Var;
        Set<b7> setIncomprehensible = c7Var.incomprehensible(f94973w);
        if (!setIncomprehensible.isEmpty()) {
            return n0.error("TLS features not understood: " + setIncomprehensible);
        }
        List<KeyManager> keyManagers = c7Var.getKeyManagers();
        Logger logger = f94968r;
        if (keyManagers != null) {
            keyManagerArrB = (KeyManager[]) c7Var.getKeyManagers().toArray(new KeyManager[0]);
        } else if (c7Var.getPrivateKey() == null) {
            keyManagerArrB = null;
        } else {
            if (c7Var.getPrivateKeyPassword() != null) {
                return n0.error("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrB = t.b(c7Var.getCertificateChain(), c7Var.getPrivateKey());
            } catch (GeneralSecurityException e10) {
                logger.log(Level.FINE, "Exception loading private key from credential", (Throwable) e10);
                return n0.error("Unable to load private key: " + e10.getMessage());
            }
        }
        if (c7Var.getTrustManagers() != null) {
            trustManagerArrC = (TrustManager[]) c7Var.getTrustManagers().toArray(new TrustManager[0]);
        } else if (c7Var.getRootCertificates() != null) {
            try {
                trustManagerArrC = t.c(c7Var.getRootCertificates());
            } catch (GeneralSecurityException e11) {
                logger.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e11);
                return n0.error("Unable to load root certificates: " + e11.getMessage());
            }
        } else {
            trustManagerArrC = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", zr.m.get().getProvider());
            sSLContext.init(keyManagerArrB, trustManagerArrC, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            int iOrdinal = c7Var.getClientAuth().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    m0Var = new m0(socketFactory, false);
                } else {
                    if (iOrdinal != 2) {
                        return n0.error("Unknown TlsServerCredentials.ClientAuth value: " + c7Var.getClientAuth());
                    }
                    m0Var = new m0(socketFactory, true);
                }
                socketFactory = m0Var;
            }
            return n0.factory(new j1(new i1(socketFactory)));
        } catch (GeneralSecurityException e12) {
            throw new RuntimeException("TLS Provider failure", e12);
        }
    }

    @Deprecated
    public static o0 forPort(int i10) {
        throw new UnsupportedOperationException("Use forPort(int, ServerCredentials) instead");
    }

    public o0 flowControlWindow(int i10) {
        p1.checkState(i10 > 0, "flowControlWindow must be positive");
        this.f94983j = i10;
        return this;
    }

    public o0 scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f94979f = new j4((ScheduledExecutorService) p1.checkNotNull(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public o0 socketFactory(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this.f94980g = ServerSocketFactory.getDefault();
            return this;
        }
        this.f94980g = serverSocketFactory;
        return this;
    }

    public o0 transportExecutor(Executor executor) {
        if (executor == null) {
            this.f94978e = f94972v;
            return this;
        }
        this.f94978e = new j4(executor);
        return this;
    }

    public static o0 forPort(int i10, n5 n5Var) {
        return forPort(new InetSocketAddress(i10), n5Var);
    }

    @Override // wr.l1, wr.j5
    public o0 keepAliveTime(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f94981h = nanos;
        long jClampKeepAliveTimeInNanos = v6.clampKeepAliveTimeInNanos(nanos);
        this.f94981h = jClampKeepAliveTimeInNanos;
        if (jClampKeepAliveTimeInNanos >= f94971u) {
            this.f94981h = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 keepAliveTimeout(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f94982i = nanos;
        this.f94982i = v6.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 maxConnectionAge(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "max connection age must be positive: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f94989p = nanos;
        if (nanos >= f94971u) {
            this.f94989p = Long.MAX_VALUE;
        }
        long j11 = this.f94989p;
        long j12 = f94970t;
        if (j11 < j12) {
            this.f94989p = j12;
        }
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 maxConnectionAgeGrace(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 >= 0, "max connection age grace must be non-negative: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f94990q = nanos;
        if (nanos >= f94971u) {
            this.f94990q = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 maxConnectionIdle(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "max connection idle must be positive: %s", j10);
        long nanos = timeUnit.toNanos(j10);
        this.f94986m = nanos;
        if (nanos >= f94971u) {
            this.f94986m = Long.MAX_VALUE;
        }
        long j11 = this.f94986m;
        long j12 = f94969s;
        if (j11 < j12) {
            this.f94986m = j12;
        }
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 maxInboundMessageSize(int i10) {
        p1.checkArgument(i10 >= 0, "negative max bytes");
        this.f94985l = i10;
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 maxInboundMetadataSize(int i10) {
        p1.checkArgument(i10 > 0, "maxInboundMetadataSize must be > 0");
        this.f94984k = i10;
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 permitKeepAliveTime(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 >= 0, "permit keepalive time must be non-negative: %s", j10);
        this.f94988o = timeUnit.toNanos(j10);
        return this;
    }

    @Override // wr.l1, wr.j5
    public o0 permitKeepAliveWithoutCalls(boolean z10) {
        this.f94987n = z10;
        return this;
    }

    public static o0 forPort(SocketAddress socketAddress, n5 n5Var) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        n0 n0VarA = a(n5Var);
        if (n0VarA.f94966b == null) {
            return new o0(socketAddress, n0VarA.f94965a);
        }
        throw new IllegalArgumentException(n0VarA.f94966b);
    }
}
