package com.applovin.shadow.okhttp3.internal.tls;

import b0.e2;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Utf8;
import io.ktor.util.date.GMTDateParser;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        return e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
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

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (e0.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) throws CertificateParsingException {
        e0.checkNotNullParameter(certificate, "certificate");
        return y0.plus((Collection) getSubjectAltNames(certificate, 7), (Iterable) getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            e0.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        e0.checkNotNullParameter(host, "host");
        e0.checkNotNullParameter(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !k0.startsWith$default(str, ".", false, 2, null) && !k0.endsWith$default(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !k0.startsWith$default(str2, ".", false, 2, null) && !k0.endsWith$default(str2, "..", false, 2, null)) {
            if (!k0.endsWith$default(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!k0.endsWith$default(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strAsciiToLowercase = asciiToLowercase(str2);
            if (!n0.contains$default((CharSequence) strAsciiToLowercase, (CharSequence) "*", false, 2, (Object) null)) {
                return e0.areEqual(str3, strAsciiToLowercase);
            }
            if (!k0.startsWith$default(strAsciiToLowercase, "*.", false, 2, null) || n0.indexOf$default((CharSequence) strAsciiToLowercase, GMTDateParser.ANY, 1, false, 4, (Object) null) != -1 || str3.length() < strAsciiToLowercase.length() || e0.areEqual("*.", strAsciiToLowercase)) {
                return false;
            }
            String strSubstring = strAsciiToLowercase.substring(1);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!k0.endsWith$default(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || n0.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }
}
