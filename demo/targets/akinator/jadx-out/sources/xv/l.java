package xv;

import com.moloco.sdk.BKC.KerkSviMAy;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.h1;
import p0.o2;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final b f93694c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final l f93695d = new a().build();

    /* renamed from: a, reason: collision with root package name */
    public final Set f93696a;

    /* renamed from: b, reason: collision with root package name */
    public final mw.c f93697b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f93698a = new ArrayList();

        public final a add(String pattern, String... pins) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pattern, "pattern");
            kotlin.jvm.internal.e0.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.f93698a.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final l build() {
            return new l(uu.y0.toSet(this.f93698a), null, 2, 0 == true ? 1 : 0);
        }

        public final List<c> getPins() {
            return this.f93698a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final String pin(Certificate certificate) {
            kotlin.jvm.internal.e0.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        public final pw.l sha1Hash(X509Certificate x509Certificate) {
            kotlin.jvm.internal.e0.checkNotNullParameter(x509Certificate, "<this>");
            l.a aVar = pw.l.f81911f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return l.a.of$default(aVar, encoded, 0, 0, 3, null).sha1();
        }

        public final pw.l sha256Hash(X509Certificate x509Certificate) {
            kotlin.jvm.internal.e0.checkNotNullParameter(x509Certificate, "<this>");
            l.a aVar = pw.l.f81911f;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return l.a.of$default(aVar, encoded, 0, 0, 3, null).sha256();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f93699a;

        /* renamed from: b, reason: collision with root package name */
        public final String f93700b;

        /* renamed from: c, reason: collision with root package name */
        public final pw.l f93701c;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(java.lang.String r12, java.lang.String r13) {
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
                java.lang.String r12 = yv.f.toCanonicalHost(r5)
                if (r12 == 0) goto Lb2
                r11.f93699a = r12
                java.lang.String r12 = "sha1/"
                boolean r12 = sv.k0.startsWith$default(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "substring(...)"
                if (r12 == 0) goto L7d
                java.lang.String r12 = "sha1"
                r11.f93700b = r12
                pw.l$a r12 = pw.l.f81911f
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r4)
                pw.l r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto L73
                r11.f93701c = r12
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
                r11.f93700b = r12
                pw.l$a r12 = pw.l.f81911f
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r4)
                pw.l r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto L9c
                r11.f93701c = r12
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
            throw new UnsupportedOperationException("Method not decompiled: xv.l.c.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f93699a, cVar.f93699a) && kotlin.jvm.internal.e0.areEqual(this.f93700b, cVar.f93700b) && kotlin.jvm.internal.e0.areEqual(this.f93701c, cVar.f93701c);
        }

        public final pw.l getHash() {
            return this.f93701c;
        }

        public final String getHashAlgorithm() {
            return this.f93700b;
        }

        public final String getPattern() {
            return this.f93699a;
        }

        public int hashCode() {
            return this.f93701c.hashCode() + o2.e(this.f93699a.hashCode() * 31, 31, this.f93700b);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            kotlin.jvm.internal.e0.checkNotNullParameter(certificate, "certificate");
            String str = this.f93700b;
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(str, "sha256");
            pw.l lVar = this.f93701c;
            if (zAreEqual) {
                return kotlin.jvm.internal.e0.areEqual(lVar, l.f93694c.sha256Hash(certificate));
            }
            if (kotlin.jvm.internal.e0.areEqual(str, "sha1")) {
                return kotlin.jvm.internal.e0.areEqual(lVar, l.f93694c.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String hostname) {
            kotlin.jvm.internal.e0.checkNotNullParameter(hostname, "hostname");
            String str = this.f93699a;
            if (sv.k0.startsWith$default(str, "**.", false, 2, null)) {
                int length = str.length() - 3;
                int length2 = hostname.length() - length;
                return sv.k0.regionMatches$default(hostname, hostname.length() - length, this.f93699a, 3, length, false, 16, (Object) null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!sv.k0.startsWith$default(str, "*.", false, 2, null)) {
                return kotlin.jvm.internal.e0.areEqual(hostname, str);
            }
            int length3 = str.length() - 1;
            return sv.k0.regionMatches$default(hostname, hostname.length() - length3, this.f93699a, 1, length3, false, 16, (Object) null) && sv.n0.lastIndexOf$default((CharSequence) hostname, '.', (hostname.length() - length3) + (-1), false, 4, (Object) null) == -1;
        }

        public String toString() {
            return this.f93700b + '/' + this.f93701c.base64();
        }
    }

    public l(Set<c> pins, mw.c cVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pins, "pins");
        this.f93696a = pins;
        this.f93697b = cVar;
    }

    public static final String pin(Certificate certificate) {
        return f93694c.pin(certificate);
    }

    public static final pw.l sha1Hash(X509Certificate x509Certificate) {
        return f93694c.sha1Hash(x509Certificate);
    }

    public static final pw.l sha256Hash(X509Certificate x509Certificate) {
        return f93694c.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(hostname, "hostname");
        kotlin.jvm.internal.e0.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new com.moloco.sdk.internal.ilrd.j(this, peerCertificates, hostname));
    }

    public final void check$okhttp(String hostname, kv.a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(hostname, "hostname");
        kotlin.jvm.internal.e0.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            b bVar = f93694c;
            if (!zHasNext) {
                StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                for (X509Certificate x509Certificate : list) {
                    sb2.append("\n    ");
                    sb2.append(bVar.pin(x509Certificate));
                    sb2.append(": ");
                    sb2.append(x509Certificate.getSubjectDN().getName());
                }
                sb2.append("\n  Pinned certificates for ");
                sb2.append(hostname);
                sb2.append(":");
                for (c cVar : listFindMatchingPins) {
                    sb2.append("\n    ");
                    sb2.append(cVar);
                }
                throw new SSLPeerUnverifiedException(sb2.toString());
            }
            X509Certificate x509Certificate2 = (X509Certificate) it.next();
            pw.l lVarSha256Hash = null;
            pw.l lVarSha1Hash = null;
            for (c cVar2 : listFindMatchingPins) {
                String hashAlgorithm = cVar2.getHashAlgorithm();
                if (kotlin.jvm.internal.e0.areEqual(hashAlgorithm, "sha256")) {
                    if (lVarSha256Hash == null) {
                        lVarSha256Hash = bVar.sha256Hash(x509Certificate2);
                    }
                    if (kotlin.jvm.internal.e0.areEqual(cVar2.getHash(), lVarSha256Hash)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.e0.areEqual(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar2.getHashAlgorithm());
                    }
                    if (lVarSha1Hash == null) {
                        lVarSha1Hash = bVar.sha1Hash(x509Certificate2);
                    }
                    if (kotlin.jvm.internal.e0.areEqual(cVar2.getHash(), lVarSha1Hash)) {
                        return;
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.e0.areEqual(lVar.f93696a, this.f93696a) && kotlin.jvm.internal.e0.areEqual(lVar.f93697b, this.f93697b);
    }

    public final List<c> findMatchingPins(String hostname) {
        kotlin.jvm.internal.e0.checkNotNullParameter(hostname, "hostname");
        Set set = this.f93696a;
        List<c> listEmptyList = uu.p0.emptyList();
        for (Object obj : set) {
            if (((c) obj).matchesHostname(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                kotlin.jvm.internal.e0.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                h1.asMutableList(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    public final mw.c getCertificateChainCleaner$okhttp() {
        return this.f93697b;
    }

    public final Set<c> getPins() {
        return this.f93696a;
    }

    public int hashCode() {
        int iHashCode = (this.f93696a.hashCode() + 1517) * 41;
        mw.c cVar = this.f93697b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final l withCertificateChainCleaner$okhttp(mw.c certificateChainCleaner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.e0.areEqual(this.f93697b, certificateChainCleaner) ? this : new l(this.f93696a, certificateChainCleaner);
    }

    @tu.f
    public final void check(String str, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, KerkSviMAy.WhMNZIQgh);
        kotlin.jvm.internal.e0.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(str, uu.k0.toList(peerCertificates));
    }

    public /* synthetic */ l(Set set, mw.c cVar, int i10, kotlin.jvm.internal.u uVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
