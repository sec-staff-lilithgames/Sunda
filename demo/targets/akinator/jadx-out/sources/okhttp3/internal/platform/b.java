package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import jw.g;
import jw.i;
import jw.k;
import jw.m;
import jw.n;
import jw.o;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mw.e;
import uu.p0;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends c implements iw.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f79508f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f79509g = "OkHttp";

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f79510h;

    /* renamed from: d, reason: collision with root package name */
    public Context f79511d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f79512e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final c buildIfSupported() {
            if (isSupported()) {
                return new b();
            }
            return null;
        }

        public final String getTag() {
            return b.f79509g;
        }

        public final boolean isSupported() {
            return b.f79510h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name */
    public static final class C0757b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f79513a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f79514b;

        public C0757b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            e0.checkNotNullParameter(trustManager, "trustManager");
            e0.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f79513a = trustManager;
            this.f79514b = findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ C0757b copy$default(C0757b c0757b, X509TrustManager x509TrustManager, Method method, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                x509TrustManager = c0757b.f79513a;
            }
            if ((i10 & 2) != 0) {
                method = c0757b.f79514b;
            }
            return c0757b.copy(x509TrustManager, method);
        }

        public final C0757b copy(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            e0.checkNotNullParameter(trustManager, "trustManager");
            e0.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new C0757b(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0757b)) {
                return false;
            }
            C0757b c0757b = (C0757b) obj;
            return e0.areEqual(this.f79513a, c0757b.f79513a) && e0.areEqual(this.f79514b, c0757b.f79514b);
        }

        @Override // mw.e
        public X509Certificate findByIssuerAndSignature(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            e0.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f79514b.invoke(this.f79513a, cert);
                e0.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f79514b.hashCode() + (this.f79513a.hashCode() * 31);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f79513a + ", findByIssuerAndSignatureMethod=" + this.f79514b + ')';
        }
    }

    static {
        f79510h = c.f79515a.isAndroid() && Build.VERSION.SDK_INT < 29;
    }

    public b() {
        List listListOfNotNull = p0.listOfNotNull((Object[]) new n[]{o.a.buildIfSupported$default(o.f69974i, null, 1, null), new m(g.f69960e.getPlayProviderFactory()), new m(k.f69969a.getFactory()), new m(i.f69966a.getFactory())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f79512e = arrayList;
    }

    @Override // okhttp3.internal.platform.c
    public mw.c buildCertificateChainCleaner(X509TrustManager trustManager) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        jw.b bVarBuildIfSupported = jw.b.f69952d.buildIfSupported(trustManager);
        return bVarBuildIfSupported != null ? bVarBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public e buildTrustRootIndex(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        e0.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            e0.checkNotNull(declaredMethod);
            return new C0757b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<n0> protocols) {
        Object next;
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f79512e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((n) next).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            nVar.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.c
    public void connectSocket(Socket socket, InetSocketAddress address, int i10) throws IOException {
        e0.checkNotNullParameter(socket, "socket");
        e0.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // iw.a
    public Context getApplicationContext() {
        return this.f79511d;
    }

    @Override // okhttp3.internal.platform.c
    public List<String> getHandshakeServerNames(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return super.getHandshakeServerNames(sslSocket);
    }

    @Override // okhttp3.internal.platform.c
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Object next;
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f79512e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).matchesSocket(sslSocket)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.c
    public boolean isCleartextTrafficPermitted(String hostname) {
        e0.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void log(String message, int i10, Throwable th2) {
        e0.checkNotNullParameter(message, "message");
        String str = f79509g;
        if (i10 == 5) {
            Log.w(str, message, th2);
        } else {
            Log.i(str, message, th2);
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext newSSLContext() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.newSSLContext();
    }

    @Override // iw.a
    public void setApplicationContext(Context context) {
        this.f79511d = context;
    }

    @Override // okhttp3.internal.platform.c
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        Object next;
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator it = this.f79512e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).matchesSocketFactory(sslSocketFactory)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.trustManager(sslSocketFactory);
        }
        return null;
    }
}
