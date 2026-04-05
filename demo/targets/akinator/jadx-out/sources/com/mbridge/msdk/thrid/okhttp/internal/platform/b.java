package com.mbridge.msdk.thrid.okhttp.internal.platform;

import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.thrid.okhttp.u;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f43606c;

    /* renamed from: d, reason: collision with root package name */
    private final f<Socket> f43607d;

    /* renamed from: e, reason: collision with root package name */
    private final f<Socket> f43608e;

    /* renamed from: f, reason: collision with root package name */
    private final f<Socket> f43609f;

    /* renamed from: g, reason: collision with root package name */
    private final f<Socket> f43610g;

    /* renamed from: h, reason: collision with root package name */
    private final c f43611h = c.a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends com.mbridge.msdk.thrid.okhttp.internal.tls.c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f43612a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f43613b;

        public a(Object obj, Method method) {
            this.f43612a = obj;
            this.f43613b = method;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.c
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f43613b.invoke(this.f43612a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b$b, reason: collision with other inner class name */
    public static final class C0334b implements com.mbridge.msdk.thrid.okhttp.internal.tls.e {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f43614a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f43615b;

        public C0334b(X509TrustManager x509TrustManager, Method method) {
            this.f43615b = method;
            this.f43614a = x509TrustManager;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f43615b.invoke(this.f43614a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e10) {
                throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get issues and signature", (Exception) e10);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0334b)) {
                return false;
            }
            C0334b c0334b = (C0334b) obj;
            return this.f43614a.equals(c0334b.f43614a) && this.f43615b.equals(c0334b.f43615b);
        }

        public int hashCode() {
            return (this.f43615b.hashCode() * 31) + this.f43614a.hashCode();
        }
    }

    public b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        this.f43606c = cls;
        this.f43607d = fVar;
        this.f43608e = fVar2;
        this.f43609f = fVar3;
        this.f43610g = fVar4;
    }

    public static g h() throws ClassNotFoundException {
        Class<?> cls;
        f fVar;
        f fVar2;
        try {
            if (!g.f()) {
                return null;
            }
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            f fVar3 = new f(null, "setUseSessionTickets", Boolean.TYPE);
            f fVar4 = new f(null, "setHostname", String.class);
            if (j()) {
                fVar = new f(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                fVar2 = new f(null, "setAlpnProtocols", byte[].class);
            } else {
                fVar = null;
                fVar2 = null;
            }
            return new b(cls2, fVar3, fVar4, fVar, fVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int i() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean j() throws ClassNotFoundException {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(int i10, String str, Throwable th2) {
        int iMin;
        int i11 = i10 != 5 ? 3 : 5;
        if (th2 != null) {
            StringBuilder sbS = a.b.s(str, '\n');
            sbS.append(Log.getStackTraceString(th2));
            str = sbS.toString();
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(10, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f43609f;
        if (fVar == null || !fVar.a((f<Socket>) sSLSocket) || (bArr = (byte[]) this.f43609f.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, com.mbridge.msdk.thrid.okhttp.internal.c.f43296j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public SSLContext e() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Method f43616a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f43617b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f43618c;

        public c(Method method, Method method2, Method method3) {
            this.f43616a = method;
            this.f43617b = method2;
            this.f43618c = method3;
        }

        public Object a(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f43616a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, null);
                    this.f43617b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean a(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (obj == null) {
                return false;
            }
            try {
                this.f43618c.invoke(obj, null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public static c a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new c(method3, method2, method);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public boolean b(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return b(str, cls, cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to determine cleartext support", e);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return a(str, cls, obj);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e11);
                throw iOException;
            }
            throw e11;
        } catch (SecurityException e12) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e12);
            throw iOException2;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public com.mbridge.msdk.thrid.okhttp.internal.tls.e b(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0334b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<u> list) throws IOException {
        if (str != null) {
            this.f43607d.c(sSLSocket, Boolean.TRUE);
            this.f43608e.c(sSLSocket, str);
        }
        f<Socket> fVar = this.f43610g;
        if (fVar == null || !fVar.a((f<Socket>) sSLSocket)) {
            return;
        }
        this.f43610g.d(sSLSocket, g.b(list));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public Object a(String str) {
        return this.f43611h.a(str);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(String str, Object obj) {
        if (this.f43611h.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    private boolean a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public com.mbridge.msdk.thrid.okhttp.internal.tls.c a(X509TrustManager x509TrustManager) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }
}
