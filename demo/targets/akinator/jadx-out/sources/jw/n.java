package jw;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface n {
    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends n0> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);

    default boolean matchesSocketFactory(SSLSocketFactory sslSocketFactory) {
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return false;
    }

    default X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        e0.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
