package jw;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends mw.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f69952d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f69953b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f69954c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final b buildIfSupported(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            e0.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        e0.checkNotNullParameter(trustManager, "trustManager");
        e0.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f69953b = trustManager;
        this.f69954c = x509TrustManagerExtensions;
    }

    @Override // mw.c
    public List<Certificate> clean(List<? extends Certificate> chain, String hostname) throws CertificateException, SSLPeerUnverifiedException {
        e0.checkNotNullParameter(chain, "chain");
        e0.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f69954c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            e0.checkNotNullExpressionValue(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f69953b == this.f69953b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f69953b);
    }
}
