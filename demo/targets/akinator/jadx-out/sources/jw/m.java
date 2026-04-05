package jw;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.e0;
import xv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f69972a;

    /* renamed from: b, reason: collision with root package name */
    public n f69973b;

    public m(l socketAdapterFactory) {
        e0.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f69972a = socketAdapterFactory;
    }

    public final synchronized n a(SSLSocket sSLSocket) {
        try {
            if (this.f69973b == null && this.f69972a.matchesSocket(sSLSocket)) {
                this.f69973b = this.f69972a.create(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f69973b;
    }

    @Override // jw.n
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List<? extends n0> protocols) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        e0.checkNotNullParameter(protocols, "protocols");
        n nVarA = a(sslSocket);
        if (nVarA != null) {
            nVarA.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // jw.n
    public String getSelectedProtocol(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        n nVarA = a(sslSocket);
        if (nVarA != null) {
            return nVarA.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // jw.n
    public boolean isSupported() {
        return true;
    }

    @Override // jw.n
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f69972a.matchesSocket(sslSocket);
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
