package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.a;
import tu.f;
import tu.o;
import tu.q;
import uu.p0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final o peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : p0.emptyList();
        }

        @f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m258deprecated_get(SSLSession sslSession) throws IOException {
            e0.checkNotNullParameter(sslSession, "sslSession");
            return get(sslSession);
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
            List<Certificate> listEmptyList;
            e0.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (e0.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : e0.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (e0.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                listEmptyList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = p0.emptyList();
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(listEmptyList));
        }

        private Companion() {
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            e0.checkNotNullParameter(tlsVersion, "tlsVersion");
            e0.checkNotNullParameter(cipherSuite, "cipherSuite");
            e0.checkNotNullParameter(peerCertificates, "peerCertificates");
            e0.checkNotNullParameter(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        final /* synthetic */ a $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar) {
            super(0);
            this.$peerCertificatesFn = aVar;
        }

        @Override // kv.a
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return p0.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> localCertificates, a peerCertificatesFn) {
        e0.checkNotNullParameter(tlsVersion, "tlsVersion");
        e0.checkNotNullParameter(cipherSuite, "cipherSuite");
        e0.checkNotNullParameter(localCertificates, "localCertificates");
        e0.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates$delegate = q.lazy(new AnonymousClass2(peerCertificatesFn));
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        e0.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @f
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m252deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @f
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m253deprecated_localCertificates() {
        return this.localCertificates;
    }

    @f
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m254deprecated_localPrincipal() {
        return localPrincipal();
    }

    @f
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m255deprecated_peerCertificates() {
        return peerCertificates();
    }

    @f
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m256deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @f
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m257deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.tlsVersion == this.tlsVersion && e0.areEqual(handshake.cipherSuite, this.cipherSuite) && e0.areEqual(handshake.peerCertificates(), peerCertificates()) && e0.areEqual(handshake.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objFirstOrNull = y0.firstOrNull((List<? extends Object>) this.localCertificates);
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object objFirstOrNull = y0.firstOrNull((List<? extends Object>) peerCertificates());
        X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }
}
