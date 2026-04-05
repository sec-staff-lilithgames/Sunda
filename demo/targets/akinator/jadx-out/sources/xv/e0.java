package xv;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f93614e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final a1 f93615a;

    /* renamed from: b, reason: collision with root package name */
    public final o f93616b;

    /* renamed from: c, reason: collision with root package name */
    public final List f93617c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f93618d;

    public e0(a1 tlsVersion, o cipherSuite, List<? extends Certificate> localCertificates, kv.a peerCertificatesFn) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.e0.checkNotNullParameter(localCertificates, "localCertificates");
        kotlin.jvm.internal.e0.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f93615a = tlsVersion;
        this.f93616b = cipherSuite;
        this.f93617c = localCertificates;
        this.f93618d = tu.q.lazy(new r6.e(1, peerCertificatesFn));
    }

    public static final e0 get(SSLSession sSLSession) throws IOException {
        return f93614e.get(sSLSession);
    }

    @tu.f
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final o m7884deprecated_cipherSuite() {
        return this.f93616b;
    }

    @tu.f
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m7885deprecated_localCertificates() {
        return this.f93617c;
    }

    @tu.f
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m7886deprecated_localPrincipal() {
        return localPrincipal();
    }

    @tu.f
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m7887deprecated_peerCertificates() {
        return peerCertificates();
    }

    @tu.f
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m7888deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @tu.f
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final a1 m7889deprecated_tlsVersion() {
        return this.f93615a;
    }

    public final o cipherSuite() {
        return this.f93616b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e0Var.f93615a == this.f93615a && kotlin.jvm.internal.e0.areEqual(e0Var.f93616b, this.f93616b) && kotlin.jvm.internal.e0.areEqual(e0Var.peerCertificates(), peerCertificates()) && kotlin.jvm.internal.e0.areEqual(e0Var.f93617c, this.f93617c);
    }

    public int hashCode() {
        return this.f93617c.hashCode() + ((peerCertificates().hashCode() + ((this.f93616b.hashCode() + ((this.f93615a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.f93617c;
    }

    public final Principal localPrincipal() {
        Object objFirstOrNull = uu.y0.firstOrNull((List<? extends Object>) this.f93617c);
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.f93618d.getValue();
    }

    public final Principal peerPrincipal() {
        Object objFirstOrNull = uu.y0.firstOrNull((List<? extends Object>) peerCertificates());
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final a1 tlsVersion() {
        return this.f93615a;
    }

    public String toString() {
        String type;
        String type2;
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(listPeerCertificates, 10));
        for (Certificate certificate : listPeerCertificates) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f93615a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f93616b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f93617c;
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public static final e0 get(a1 a1Var, o oVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return f93614e.get(a1Var, oVar, list, list2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final e0 m7890deprecated_get(SSLSession sslSession) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(sslSession, "sslSession");
            return get(sslSession);
        }

        public final e0 get(SSLSession sSLSession) throws IOException {
            List listEmptyList;
            kotlin.jvm.internal.e0.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (kotlin.jvm.internal.e0.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || kotlin.jvm.internal.e0.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            o oVarForJavaName = o.f93769b.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (kotlin.jvm.internal.e0.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            a1 a1VarForJavaName = a1.f93567c.forJavaName(protocol);
            try {
                listEmptyList = yv.i.toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = uu.p0.emptyList();
            }
            return new e0(a1VarForJavaName, oVarForJavaName, yv.i.toImmutableList(sSLSession.getLocalCertificates()), new o6.v0(listEmptyList, 16));
        }

        public final e0 get(a1 tlsVersion, o cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.e0.checkNotNullParameter(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.e0.checkNotNullParameter(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.e0.checkNotNullParameter(localCertificates, "localCertificates");
            return new e0(tlsVersion, cipherSuite, yv.i.toImmutableList(localCertificates), new o6.v0(yv.i.toImmutableList(peerCertificates), 16));
        }
    }
}
