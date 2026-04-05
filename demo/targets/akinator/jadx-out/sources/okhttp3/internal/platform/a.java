package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
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
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mw.e;
import uu.p0;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends c implements iw.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0756a f79504f = new C0756a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f79505g;

    /* renamed from: d, reason: collision with root package name */
    public Context f79506d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f79507e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name */
    public static final class C0756a {
        public C0756a(u uVar) {
        }

        public final c buildIfSupported() {
            if (isSupported()) {
                return new a();
            }
            return null;
        }

        public final boolean isSupported() {
            return a.f79505g;
        }
    }

    static {
        f79505g = c.f79515a.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listListOfNotNull = p0.listOfNotNull((Object[]) new n[]{jw.a.f69951a.buildIfSupported(), new m(g.f69960e.getPlayProviderFactory()), new m(k.f69969a.getFactory()), new m(i.f69966a.getFactory())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f79507e = arrayList;
    }

    @Override // okhttp3.internal.platform.c
    public mw.c buildCertificateChainCleaner(X509TrustManager trustManager) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        jw.b bVarBuildIfSupported = jw.b.f69952d.buildIfSupported(trustManager);
        return bVarBuildIfSupported != null ? bVarBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public e buildTrustRootIndex(X509TrustManager trustManager) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.buildTrustRootIndex(trustManager);
    }

    @Override // okhttp3.internal.platform.c
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends n0> protocols) {
        Object next;
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f79507e.iterator();
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

    @Override // iw.a
    public Context getApplicationContext() {
        return this.f79506d;
    }

    @Override // okhttp3.internal.platform.c
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Object next;
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f79507e.iterator();
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
    public Object getStackTraceForCloseable(String closer) {
        e0.checkNotNullParameter(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.getStackTraceForCloseable(closer);
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open(closer);
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.c
    public boolean isCleartextTrafficPermitted(String hostname) {
        e0.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.c
    public void logCloseableLeak(String message, Object obj) {
        e0.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.logCloseableLeak(message, obj);
        } else {
            e0.checkNotNull(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            ((CloseGuard) obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.c
    public SSLContext newSSLContext() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.newSSLContext();
    }

    @Override // iw.a
    public void setApplicationContext(Context context) {
        this.f79506d = context;
    }

    @Override // okhttp3.internal.platform.c
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object next;
        e0.checkNotNullParameter(sSLSocketFactory, KGUkpTlXZlJLy.iNFKpgeOItPF);
        Iterator it = this.f79507e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((n) next).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            return nVar.trustManager(sSLSocketFactory);
        }
        return null;
    }
}
