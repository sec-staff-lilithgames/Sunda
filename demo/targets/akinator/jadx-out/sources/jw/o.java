package jw;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends g {

    /* renamed from: i, reason: collision with root package name */
    public static final a f69974i = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public final Class f69975g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f69976h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ n buildIfSupported$default(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.buildIfSupported(str);
        }

        public final n buildIfSupported(String packageName) throws ClassNotFoundException {
            e0.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                e0.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                e0.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                e0.checkNotNull(cls3);
                return new o(cls, cls2, cls3);
            } catch (Exception e10) {
                c cVar = c.f69955a;
                String name = l0.class.getName();
                e0.checkNotNullExpressionValue(name, "getName(...)");
                cVar.androidLog$okhttp(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        e0.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        e0.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        e0.checkNotNullParameter(paramClass, "paramClass");
        this.f69975g = sslSocketFactoryClass;
        this.f69976h = paramClass;
    }

    @Override // jw.g, jw.n
    public boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return this.f69975g.isInstance(sslSocketFactory);
    }

    @Override // jw.g, jw.n
    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Object fieldOrNull = yv.i.readFieldOrNull(sslSocketFactory, this.f69976h, "sslParameters");
        e0.checkNotNull(fieldOrNull);
        X509TrustManager x509TrustManager = (X509TrustManager) yv.i.readFieldOrNull(fieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) yv.i.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager") : x509TrustManager;
    }
}
