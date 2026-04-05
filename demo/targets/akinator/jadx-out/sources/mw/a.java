package mw;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final e f74961b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: mw.a$a, reason: collision with other inner class name */
    public static final class C0749a {
        public C0749a(u uVar) {
        }
    }

    static {
        new C0749a(null);
    }

    public a(e trustRootIndex) {
        e0.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f74961b = trustRootIndex;
    }

    public static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (!e0.areEqual(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // mw.c
    public List<Certificate> clean(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
        e0.checkNotNullParameter(chain, "chain");
        e0.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        e0.checkNotNullExpressionValue(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            e0.checkNotNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f74961b.findByIssuerAndSignature(x509Certificate);
            if (x509CertificateFindByIssuerAndSignature == null) {
                Iterator it = arrayDeque.iterator();
                e0.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    e0.checkNotNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (a(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !e0.areEqual(x509Certificate, x509CertificateFindByIssuerAndSignature)) {
                arrayList.add(x509CertificateFindByIssuerAndSignature);
            }
            if (a(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature, arrayList.size() - 2)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && e0.areEqual(((a) obj).f74961b, this.f74961b);
    }

    public int hashCode() {
        return this.f74961b.hashCode();
    }
}
