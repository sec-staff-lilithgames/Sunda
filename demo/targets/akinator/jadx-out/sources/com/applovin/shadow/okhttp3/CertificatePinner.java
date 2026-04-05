package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okio.ByteString;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import kv.a;
import p0.o2;
import sv.k0;
import sv.n0;
import tu.f;
import uu.p0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            e0.checkNotNullParameter(pattern, "pattern");
            e0.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(y0.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            e0.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            e0.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            e0.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            e0.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            e0.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.e0.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "pin"
                kotlin.jvm.internal.e0.checkNotNullParameter(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = sv.k0.startsWith$default(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L27
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                r5 = r12
                int r12 = sv.n0.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L48
                goto L28
            L27:
                r5 = r12
            L28:
                java.lang.String r12 = "**."
                boolean r12 = sv.k0.startsWith$default(r5, r12, r1, r2, r3)
                if (r12 == 0) goto L3c
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                int r12 = sv.n0.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L48
            L3c:
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                int r12 = sv.n0.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r4) goto Lbe
            L48:
                java.lang.String r12 = com.applovin.shadow.okhttp3.internal.HostnamesKt.toCanonicalHost(r5)
                if (r12 == 0) goto Lb2
                r11.pattern = r12
                java.lang.String r12 = "sha1/"
                boolean r12 = sv.k0.startsWith$default(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r12 == 0) goto L7d
                java.lang.String r12 = "sha1"
                r11.hashAlgorithm = r12
                com.applovin.shadow.okio.ByteString$Companion r12 = com.applovin.shadow.okio.ByteString.Companion
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r4)
                com.applovin.shadow.okio.ByteString r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto L73
                r11.hash = r12
                return
            L73:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = r0.concat(r13)
                r12.<init>(r13)
                throw r12
            L7d:
                java.lang.String r12 = "sha256/"
                boolean r12 = sv.k0.startsWith$default(r13, r12, r1, r2, r3)
                if (r12 == 0) goto La6
                java.lang.String r12 = "sha256"
                r11.hashAlgorithm = r12
                com.applovin.shadow.okio.ByteString$Companion r12 = com.applovin.shadow.okio.ByteString.Companion
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r4)
                com.applovin.shadow.okio.ByteString r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto L9c
                r11.hash = r12
                return
            L9c:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = r0.concat(r13)
                r12.<init>(r13)
                throw r12
            La6:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r13 = a.b.k(r0, r13)
                r12.<init>(r13)
                throw r12
            Lb2:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Invalid pattern: "
                java.lang.String r13 = a.b.k(r13, r5)
                r12.<init>(r13)
                throw r12
            Lbe:
                java.lang.String r12 = "Unexpected pattern: "
                java.lang.String r12 = a.b.k(r12, r5)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return e0.areEqual(this.pattern, pin.pattern) && e0.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && e0.areEqual(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + o2.e(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            e0.checkNotNullParameter(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (e0.areEqual(str, "sha256")) {
                return e0.areEqual(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (e0.areEqual(str, "sha1")) {
                return e0.areEqual(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            e0.checkNotNullParameter(hostname, "hostname");
            if (k0.startsWith$default(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return k0.regionMatches$default(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, (Object) null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!k0.startsWith$default(this.pattern, "*.", false, 2, null)) {
                return e0.areEqual(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return k0.regionMatches$default(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) && n0.lastIndexOf$default((CharSequence) hostname, '.', (hostname.length() - length3) + (-1), false, 4, (Object) null) == -1;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.base64();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okhttp3.CertificatePinner$check$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // kv.a
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            List<Certificate> list = listClean;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        e0.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        e0.checkNotNullParameter(hostname, "hostname");
        e0.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new AnonymousClass1(peerCertificates, hostname));
    }

    public final void check$okhttp(String hostname, a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        e0.checkNotNullParameter(hostname, "hostname");
        e0.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (e0.areEqual(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (e0.areEqual(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!e0.areEqual(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (e0.areEqual(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(Companion.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return e0.areEqual(certificatePinner.pins, this.pins) && e0.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String hostname) {
        e0.checkNotNullParameter(hostname, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> listEmptyList = p0.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                e0.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                h1.asMutableList(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        e0.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return e0.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @f
    public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        e0.checkNotNullParameter(hostname, "hostname");
        e0.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, uu.k0.toList(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, u uVar) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }
}
