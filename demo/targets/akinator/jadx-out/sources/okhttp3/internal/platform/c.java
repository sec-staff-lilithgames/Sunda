package okhttp3.internal.platform;

import j1.o2;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mw.e;
import pw.g;
import uu.p0;
import uu.q0;
import xv.l0;
import xv.n0;
import yv.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f79515a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f79516b;

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f79517c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final c access$findPlatform(a aVar) {
            aVar.getClass();
            return d.f79518a.findPlatform();
        }

        public static void resetForTests$default(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar.getClass();
                cVar = d.f79518a.findPlatform();
            }
            aVar.resetForTests(cVar);
        }

        public final List<String> alpnProtocolNames(List<? extends n0> protocols) {
            e0.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((n0) obj) != n0.f93759e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((n0) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] concatLengthPrefixed(List<? extends n0> protocols) {
            e0.checkNotNullParameter(protocols, "protocols");
            g gVar = new g();
            for (String str : alpnProtocolNames(protocols)) {
                gVar.writeByte(str.length());
                gVar.writeUtf8(str);
            }
            return gVar.readByteArray();
        }

        public final c get() {
            return c.f79516b;
        }

        public final boolean isAndroid() {
            return d.f79518a.isAndroid();
        }

        public final void resetForTests(c platform) {
            e0.checkNotNullParameter(platform, "platform");
            c.f79516b = platform;
        }
    }

    static {
        a aVar = new a(null);
        f79515a = aVar;
        f79516b = a.access$findPlatform(aVar);
        f79517c = Logger.getLogger(l0.class.getName());
    }

    public static final c get() {
        return f79515a.get();
    }

    public static /* synthetic */ void log$default(c cVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        cVar.log(str, i10, th2);
    }

    public void afterHandshake(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public mw.c buildCertificateChainCleaner(X509TrustManager trustManager) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        return new mw.a(buildTrustRootIndex(trustManager));
    }

    public e buildTrustRootIndex(X509TrustManager trustManager) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new mw.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<n0> protocols) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
    }

    public void connectSocket(Socket socket, InetSocketAddress address, int i10) throws IOException {
        e0.checkNotNullParameter(socket, "socket");
        e0.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    public List<String> getHandshakeServerNames(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        SSLSession session = sslSocket.getSession();
        ExtendedSSLSession extendedSSLSession = session instanceof ExtendedSSLSession ? (ExtendedSSLSession) session : null;
        if (extendedSSLSession == null) {
            return p0.emptyList();
        }
        try {
            List<SNIServerName> requestedServerNames = extendedSSLSession.getRequestedServerNames();
            e0.checkNotNullExpressionValue(requestedServerNames, "getRequestedServerNames(...)");
            ArrayList arrayList = new ArrayList();
            for (SNIServerName sNIServerName : requestedServerNames) {
                SNIHostName sNIHostName = sNIServerName instanceof SNIHostName ? (SNIHostName) sNIServerName : null;
                String asciiName = sNIHostName != null ? sNIHostName.getAsciiName() : null;
                if (asciiName != null) {
                    arrayList.add(asciiName);
                }
            }
            return arrayList;
        } catch (UnsupportedOperationException unused) {
            return p0.emptyList();
        }
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object getStackTraceForCloseable(String closer) {
        e0.checkNotNullParameter(closer, "closer");
        if (f79517c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String hostname) {
        e0.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void log(String message, int i10, Throwable th2) {
        e0.checkNotNullParameter(message, "message");
        f79517c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void logCloseableLeak(String message, Object obj) {
        e0.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = o2.l(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(message, 5, (Throwable) obj);
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        e0.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) throws KeyManagementException {
        e0.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            e0.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        e0.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                e0.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        e0.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            e0.checkNotNull(cls);
            Object fieldOrNull = i.readFieldOrNull(sslSocketFactory, cls, "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) i.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e10) {
            if (!e0.areEqual(e10.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e10;
            }
            return null;
        }
    }
}
