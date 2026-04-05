package zr;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements HostnameVerifier {

    /* renamed from: b, reason: collision with root package name */
    public static final h f98478b = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f98479c = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) throws CertificateParsingException {
        List listA = a(x509Certificate, 7);
        List listA2 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listA2.size() + listA.size());
        arrayList.addAll(listA);
        arrayList.addAll(listA2);
        return arrayList;
    }

    public static boolean b(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strFindMostSpecific;
        if (f98479c.matcher(str).matches()) {
            List listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (str.equalsIgnoreCase((String) listA.get(i10))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        List listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size2) {
            if (b(lowerCase, (String) listA2.get(i11))) {
                return true;
            }
            i11++;
            z10 = true;
        }
        if (!z10 && (strFindMostSpecific = new e(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn")) != null) {
            return b(lowerCase, strFindMostSpecific);
        }
        return false;
    }
}
