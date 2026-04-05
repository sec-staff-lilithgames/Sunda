package jw;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0710a f69951a = new C0710a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: jw.a$a, reason: collision with other inner class name */
    public static final class C0710a {
        public C0710a(u uVar) {
        }

        public final n buildIfSupported() {
            if (isSupported()) {
                return new a();
            }
            return null;
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.c.f79515a.isAndroid() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // jw.n
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends n0> protocols) throws IOException {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) okhttp3.internal.platform.c.f79515a.alpnProtocolNames(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // jw.n
    public String getSelectedProtocol(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!e0.areEqual(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // jw.n
    public boolean isSupported() {
        return f69951a.isSupported();
    }

    @Override // jw.n
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // jw.n
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return super.matchesSocketFactory(sSLSocketFactory);
    }

    @Override // jw.n
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return super.trustManager(sSLSocketFactory);
    }
}
