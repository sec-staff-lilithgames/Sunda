package mw;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.e0;
import pw.f1;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements HostnameVerifier {

    /* renamed from: b, reason: collision with root package name */
    public static final d f74964b = new d();

    public static List a(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return p0.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && e0.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return p0.emptyList();
        }
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) throws CertificateParsingException {
        e0.checkNotNullParameter(certificate, "certificate");
        return y0.plus((Collection) a(certificate, 7), (Iterable) a(certificate, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:1: B:24:0x007d->B:89:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean verify(java.lang.String r20, java.security.cert.X509Certificate r21) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.d.verify(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(session, "session");
        if (host.length() == ((int) f1.size$default(host, 0, 0, 3, null))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return verify(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
