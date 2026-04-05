package zr;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f98464e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98465a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f98466b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f98467c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f98468d;

    static {
        b bVarCipherSuites = new b(true).cipherSuites(a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA);
        r rVar = r.TLS_1_3;
        r rVar2 = r.TLS_1_2;
        c cVarBuild = bVarCipherSuites.tlsVersions(rVar, rVar2).supportsTlsExtensions(true).build();
        f98464e = cVarBuild;
        new b(cVarBuild).tlsVersions(rVar, rVar2, r.TLS_1_1, r.TLS_1_0).supportsTlsExtensions(true).build();
        new b(false).build();
    }

    public c(b bVar) {
        this.f98465a = bVar.f98460a;
        this.f98466b = bVar.f98461b;
        this.f98467c = bVar.f98462c;
        this.f98468d = bVar.f98463d;
    }

    public static boolean a(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (s.equal(str, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void apply(SSLSocket sSLSocket, boolean z10) {
        String[] strArr = this.f98466b;
        String[] enabledCipherSuites = strArr != null ? (String[]) s.intersect(String.class, strArr, sSLSocket.getEnabledCipherSuites()) : null;
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr2, 0, enabledCipherSuites.length);
            strArr2[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr2;
        }
        c cVarBuild = new b(this).cipherSuites(enabledCipherSuites).tlsVersions((String[]) s.intersect(String.class, this.f98467c, sSLSocket.getEnabledProtocols())).build();
        sSLSocket.setEnabledProtocols(cVarBuild.f98467c);
        String[] strArr3 = cVarBuild.f98466b;
        if (strArr3 != null) {
            sSLSocket.setEnabledCipherSuites(strArr3);
        }
    }

    public List<a> cipherSuites() {
        String[] strArr = this.f98466b;
        if (strArr == null) {
            return null;
        }
        a[] aVarArr = new a[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            aVarArr[i10] = a.forJavaName(strArr[i10]);
        }
        return s.immutableList(aVarArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        boolean z10 = cVar.f98465a;
        boolean z11 = this.f98465a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f98466b, cVar.f98466b) && Arrays.equals(this.f98467c, cVar.f98467c) && this.f98468d == cVar.f98468d);
    }

    public int hashCode() {
        if (this.f98465a) {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f98466b)) * 31) + Arrays.hashCode(this.f98467c)) * 31) + (!this.f98468d ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.f98465a) {
            return false;
        }
        if (!a(this.f98467c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr = this.f98466b;
        return strArr == null ? sSLSocket.getEnabledCipherSuites().length > 0 : a(strArr, sSLSocket.getEnabledCipherSuites());
    }

    public boolean isTls() {
        return this.f98465a;
    }

    public boolean supportsTlsExtensions() {
        return this.f98468d;
    }

    public List<r> tlsVersions() {
        String[] strArr = this.f98467c;
        r[] rVarArr = new r[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            rVarArr[i10] = r.forJavaName(strArr[i10]);
        }
        return s.immutableList(rVarArr);
    }

    public String toString() {
        if (!this.f98465a) {
            return "ConnectionSpec()";
        }
        List<a> listCipherSuites = cipherSuites();
        StringBuilder sbO = e3.g.o("ConnectionSpec(cipherSuites=", listCipherSuites == null ? "[use default]" : listCipherSuites.toString(), ", tlsVersions=");
        sbO.append(tlsVersions());
        sbO.append(", supportsTlsExtensions=");
        return a.b.q(sbO, this.f98468d, ")");
    }
}
