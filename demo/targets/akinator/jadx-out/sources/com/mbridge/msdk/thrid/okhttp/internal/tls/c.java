package com.mbridge.msdk.thrid.okhttp.internal.tls;

import com.mbridge.msdk.thrid.okhttp.internal.platform.g;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {
    public static c a(X509TrustManager x509TrustManager) {
        return g.d().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
