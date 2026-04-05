package yr;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.C3191e4;
import com.squareup.okhttp.ConnectionSpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import mh.p1;
import wr.l3;
import wr.v1;
import wr.x6;
import wr.y6;
import xr.c5;
import xr.ff;
import xr.j4;
import xr.re;
import xr.v6;
import xr.y9;
import xr.z8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends wr.g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f95032q = Logger.getLogger(t.class.getName());

    /* renamed from: r, reason: collision with root package name */
    public static final zr.c f95033r = new zr.b(zr.c.f98464e).cipherSuites(zr.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zr.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zr.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zr.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zr.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zr.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).tlsVersions(zr.r.TLS_1_2).supportsTlsExtensions(true).build();

    /* renamed from: s, reason: collision with root package name */
    public static final long f95034s = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: t, reason: collision with root package name */
    public static final re f95035t = re.forResource(new n());

    /* renamed from: u, reason: collision with root package name */
    public static final EnumSet f95036u = EnumSet.of(x6.f91191c, x6.f91192e);

    /* renamed from: a, reason: collision with root package name */
    public final z8 f95037a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.a f95038b;

    /* renamed from: c, reason: collision with root package name */
    public y9 f95039c;

    /* renamed from: d, reason: collision with root package name */
    public y9 f95040d;

    /* renamed from: e, reason: collision with root package name */
    public SocketFactory f95041e;

    /* renamed from: f, reason: collision with root package name */
    public SSLSocketFactory f95042f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95043g;

    /* renamed from: h, reason: collision with root package name */
    public HostnameVerifier f95044h;

    /* renamed from: i, reason: collision with root package name */
    public zr.c f95045i;

    /* renamed from: j, reason: collision with root package name */
    public int f95046j;

    /* renamed from: k, reason: collision with root package name */
    public long f95047k;

    /* renamed from: l, reason: collision with root package name */
    public long f95048l;

    /* renamed from: m, reason: collision with root package name */
    public int f95049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95050n;

    /* renamed from: o, reason: collision with root package name */
    public int f95051o;

    /* renamed from: p, reason: collision with root package name */
    public int f95052p;

    public t(String str) {
        this.f95038b = ff.getDefaultFactory();
        this.f95039c = f95035t;
        this.f95040d = re.forResource(c5.f92326u);
        this.f95045i = f95033r;
        this.f95046j = 1;
        this.f95047k = Long.MAX_VALUE;
        this.f95048l = c5.f92319n;
        this.f95049m = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f95051o = 4194304;
        this.f95052p = Integer.MAX_VALUE;
        this.f95037a = new z8(str, new p(this), new o(this));
        this.f95043g = false;
    }

    public static KeyManager[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            X509Certificate[] x509Certificates = es.a.getX509Certificates(byteArrayInputStream);
            c5.closeQuietly(byteArrayInputStream);
            byteArrayInputStream = new ByteArrayInputStream(bArr2);
            try {
                try {
                    PrivateKey privateKey = es.a.getPrivateKey(byteArrayInputStream);
                    c5.closeQuietly(byteArrayInputStream);
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    try {
                        keyStore.load(null, null);
                        keyStore.setKeyEntry(C3191e4.h.W, privateKey, new char[0], x509Certificates);
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, new char[0]);
                        return keyManagerFactory.getKeyManagers();
                    } catch (IOException e10) {
                        throw new GeneralSecurityException(e10);
                    }
                } catch (IOException e11) {
                    throw new GeneralSecurityException("Unable to decode private key", e11);
                }
            } finally {
            }
        } finally {
        }
    }

    public static TrustManager[] c(byte[] bArr) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            keyStore.load(null, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                X509Certificate[] x509Certificates = es.a.getX509Certificates(byteArrayInputStream);
                c5.closeQuietly(byteArrayInputStream);
                for (X509Certificate x509Certificate : x509Certificates) {
                    keyStore.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Throwable th2) {
                c5.closeQuietly(byteArrayInputStream);
                throw th2;
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static s d(wr.k kVar) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        KeyManager[] keyManagerArrB;
        TrustManager[] trustManagerArrC;
        if (!(kVar instanceof y6)) {
            if (kVar instanceof v1) {
                return s.plaintext();
            }
            if (kVar instanceof wr.c0) {
                wr.c0 c0Var = (wr.c0) kVar;
                return d(c0Var.getChannelCredentials()).withCallCredentials(c0Var.getCallCredentials());
            }
            if (!(kVar instanceof wr.n)) {
                return s.error("Unsupported credential type: ".concat(kVar.getClass().getName()));
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<wr.k> it = ((wr.n) kVar).getCredentialsList().iterator();
            while (it.hasNext()) {
                s sVarD = d(it.next());
                if (sVarD.f95029c == null) {
                    return sVarD;
                }
                sb2.append(", ");
                sb2.append(sVarD.f95029c);
            }
            return s.error(sb2.substring(2));
        }
        y6 y6Var = (y6) kVar;
        Set<x6> setIncomprehensible = y6Var.incomprehensible(f95036u);
        if (!setIncomprehensible.isEmpty()) {
            return s.error("TLS features not understood: " + setIncomprehensible);
        }
        List<KeyManager> keyManagers = y6Var.getKeyManagers();
        Logger logger = f95032q;
        if (keyManagers != null) {
            keyManagerArrB = (KeyManager[]) y6Var.getKeyManagers().toArray(new KeyManager[0]);
        } else if (y6Var.getPrivateKey() == null) {
            keyManagerArrB = null;
        } else {
            if (y6Var.getPrivateKeyPassword() != null) {
                return s.error("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrB = b(y6Var.getCertificateChain(), y6Var.getPrivateKey());
            } catch (GeneralSecurityException e10) {
                logger.log(Level.FINE, "Exception loading private key from credential", (Throwable) e10);
                return s.error("Unable to load private key: " + e10.getMessage());
            }
        }
        if (y6Var.getTrustManagers() != null) {
            trustManagerArrC = (TrustManager[]) y6Var.getTrustManagers().toArray(new TrustManager[0]);
        } else if (y6Var.getRootCertificates() != null) {
            try {
                trustManagerArrC = c(y6Var.getRootCertificates());
            } catch (GeneralSecurityException e11) {
                logger.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e11);
                return s.error("Unable to load root certificates: " + e11.getMessage());
            }
        } else {
            trustManagerArrC = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", zr.m.get().getProvider());
            sSLContext.init(keyManagerArrB, trustManagerArrC, null);
            return s.factory(sSLContext.getSocketFactory());
        } catch (GeneralSecurityException e12) {
            throw new RuntimeException("TLS Provider failure", e12);
        }
    }

    public static t forAddress(String str, int i10) {
        return new t(c5.authorityFromHostAndPort(str, i10));
    }

    public static t forTarget(String str) {
        return new t(str);
    }

    @Override // wr.g1
    public final l3 a() {
        return this.f95037a;
    }

    public t connectionSpec(ConnectionSpec connectionSpec) {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        p1.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        this.f95045i = k1.b(connectionSpec);
        return this;
    }

    public t flowControlWindow(int i10) {
        p1.checkState(i10 > 0, "flowControlWindow must be positive");
        this.f95049m = i10;
        return this;
    }

    public t hostnameVerifier(HostnameVerifier hostnameVerifier) {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        this.f95044h = hostnameVerifier;
        return this;
    }

    @Deprecated
    public t negotiationType(m mVar) {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        p1.checkNotNull(mVar, "type");
        int iOrdinal = mVar.ordinal();
        if (iOrdinal == 0) {
            this.f95046j = 1;
            return this;
        }
        if (iOrdinal == 1) {
            this.f95046j = 2;
            return this;
        }
        throw new AssertionError("Unknown negotiation type: " + mVar);
    }

    public t scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f95040d = new j4((ScheduledExecutorService) p1.checkNotNull(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public t socketFactory(SocketFactory socketFactory) {
        this.f95041e = socketFactory;
        return this;
    }

    public t sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        this.f95042f = sSLSocketFactory;
        this.f95046j = 1;
        return this;
    }

    public t tlsConnectionSpec(String[] strArr, String[] strArr2) {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        p1.checkNotNull(strArr, "tls versions must not null");
        p1.checkNotNull(strArr2, "ciphers must not null");
        this.f95045i = new zr.b(true).supportsTlsExtensions(true).tlsVersions(strArr).cipherSuites(strArr2).build();
        return this;
    }

    public t transportExecutor(Executor executor) {
        if (executor == null) {
            this.f95039c = f95035t;
            return this;
        }
        this.f95039c = new j4(executor);
        return this;
    }

    public static t forTarget(String str, wr.k kVar) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        s sVarD = d(kVar);
        if (sVarD.f95029c == null) {
            return new t(str, kVar, sVarD.f95028b, sVarD.f95027a);
        }
        throw new IllegalArgumentException(sVarD.f95029c);
    }

    @Override // wr.g1, wr.l3
    public t keepAliveTime(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f95047k = nanos;
        long jClampKeepAliveTimeInNanos = v6.clampKeepAliveTimeInNanos(nanos);
        this.f95047k = jClampKeepAliveTimeInNanos;
        if (jClampKeepAliveTimeInNanos >= f95034s) {
            this.f95047k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // wr.g1, wr.l3
    public t keepAliveTimeout(long j10, TimeUnit timeUnit) {
        p1.checkArgument(j10 > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f95048l = nanos;
        this.f95048l = v6.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // wr.g1, wr.l3
    public t keepAliveWithoutCalls(boolean z10) {
        this.f95050n = z10;
        return this;
    }

    @Override // wr.g1, wr.l3
    public t maxInboundMessageSize(int i10) {
        p1.checkArgument(i10 >= 0, "negative max");
        this.f95051o = i10;
        return this;
    }

    @Override // wr.g1, wr.l3
    public t maxInboundMetadataSize(int i10) {
        p1.checkArgument(i10 > 0, "maxInboundMetadataSize must be > 0");
        this.f95052p = i10;
        return this;
    }

    @Override // wr.g1, wr.l3
    public t usePlaintext() {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        this.f95046j = 2;
        return this;
    }

    @Override // wr.g1, wr.l3
    public t useTransportSecurity() {
        p1.checkState(!this.f95043g, "Cannot change security when using ChannelCredentials");
        this.f95046j = 1;
        return this;
    }

    public static t forAddress(String str, int i10, wr.k kVar) {
        return forTarget(c5.authorityFromHostAndPort(str, i10), kVar);
    }

    public t(String str, wr.k kVar, wr.f fVar, SSLSocketFactory sSLSocketFactory) {
        this.f95038b = ff.getDefaultFactory();
        this.f95039c = f95035t;
        this.f95040d = re.forResource(c5.f92326u);
        this.f95045i = f95033r;
        this.f95046j = 1;
        this.f95047k = Long.MAX_VALUE;
        this.f95048l = c5.f92319n;
        this.f95049m = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f95051o = 4194304;
        this.f95052p = Integer.MAX_VALUE;
        this.f95037a = new z8(str, kVar, fVar, new p(this), new o(this));
        this.f95042f = sSLSocketFactory;
        this.f95046j = sSLSocketFactory == null ? 2 : 1;
        this.f95043g = true;
    }
}
