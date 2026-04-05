package jw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final a f69960e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f69961f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f69962a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f69963b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f69964c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f69965d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final g access$build(a aVar, Class cls) {
            aVar.getClass();
            Class superclass = cls;
            while (superclass != null && !e0.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(a.b.i(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                }
            }
            e0.checkNotNull(superclass);
            return new g(superclass);
        }

        public final l factory(String packageName) {
            e0.checkNotNullParameter(packageName, "packageName");
            return new f(packageName);
        }

        public final l getPlayProviderFactory() {
            return g.f69961f;
        }
    }

    static {
        a aVar = new a(null);
        f69960e = aVar;
        f69961f = aVar.factory("com.google.android.gms.org.conscrypt");
    }

    public g(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException, SecurityException {
        e0.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f69962a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        e0.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f69963b = declaredMethod;
        sslSocketClass.getMethod("setHostname", String.class);
        this.f69964c = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f69965d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // jw.n
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends n0> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.f69963b.invoke(sslSocket, Boolean.TRUE);
                this.f69965d.invoke(sslSocket, okhttp3.internal.platform.c.f79515a.concatLengthPrefixed(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // jw.n
    public String getSelectedProtocol(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f69964c.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, sv.g.f86134b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && e0.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // jw.n
    public boolean isSupported() {
        return okhttp3.internal.platform.b.f79508f.isSupported();
    }

    @Override // jw.n
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f69962a.isInstance(sslSocket);
    }

    @Override // jw.n
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // jw.n
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }
}
