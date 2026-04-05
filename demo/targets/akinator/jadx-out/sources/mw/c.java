package mw;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f74963a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final c get(X509TrustManager trustManager) {
            e0.checkNotNullParameter(trustManager, "trustManager");
            return okhttp3.internal.platform.c.f79515a.get().buildCertificateChainCleaner(trustManager);
        }

        public final c get(X509Certificate... caCerts) {
            e0.checkNotNullParameter(caCerts, "caCerts");
            return new mw.a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }
    }

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
