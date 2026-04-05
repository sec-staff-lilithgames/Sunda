package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f43184c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f43185a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.tls.c f43186b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f43187a = new ArrayList();

        public e a() {
            return new e(new LinkedHashSet(this.f43187a), null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f43188a;

        /* renamed from: b, reason: collision with root package name */
        final String f43189b;

        /* renamed from: c, reason: collision with root package name */
        final String f43190c;

        /* renamed from: d, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okio.f f43191d;

        public boolean a(String str) {
            if (!this.f43188a.startsWith("*.")) {
                return str.equals(this.f43189b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f43189b.length()) {
                return false;
            }
            String str2 = this.f43189b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f43188a.equals(bVar.f43188a) && this.f43190c.equals(bVar.f43190c) && this.f43191d.equals(bVar.f43191d);
        }

        public int hashCode() {
            return this.f43191d.hashCode() + o2.e(o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f43188a), 31, this.f43190c);
        }

        public String toString() {
            return this.f43190c + this.f43191d.a();
        }
    }

    public e(Set<b> set, com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        this.f43185a = set;
        this.f43186b = cVar;
    }

    public static com.mbridge.msdk.thrid.okio.f b(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listA = a(str);
        if (listA.isEmpty()) {
            return;
        }
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f43186b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = listA.size();
            com.mbridge.msdk.thrid.okio.f fVarB = null;
            com.mbridge.msdk.thrid.okio.f fVarA = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = listA.get(i11);
                if (bVar.f43190c.equals("sha256/")) {
                    if (fVarB == null) {
                        fVarB = b(x509Certificate);
                    }
                    if (bVar.f43191d.equals(fVarB)) {
                        return;
                    }
                } else {
                    if (!bVar.f43190c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f43190c);
                    }
                    if (fVarA == null) {
                        fVarA = a(x509Certificate);
                    }
                    if (bVar.f43191d.equals(fVarA)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb2.append("\n    ");
            sb2.append(a((Certificate) x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        int size4 = listA.size();
        for (int i13 = 0; i13 < size4; i13++) {
            b bVar2 = listA.get(i13);
            sb2.append("\n    ");
            sb2.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43186b, eVar.f43186b) && this.f43185a.equals(eVar.f43185a);
    }

    public int hashCode() {
        com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar = this.f43186b;
        return this.f43185a.hashCode() + ((cVar != null ? cVar.hashCode() : 0) * 31);
    }

    public List<b> a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f43185a) {
            if (bVar.a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public e a(com.mbridge.msdk.thrid.okhttp.internal.tls.c cVar) {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43186b, cVar) ? this : new e(this.f43185a, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static com.mbridge.msdk.thrid.okio.f a(X509Certificate x509Certificate) {
        return com.mbridge.msdk.thrid.okio.f.a(x509Certificate.getPublicKey().getEncoded()).c();
    }
}
