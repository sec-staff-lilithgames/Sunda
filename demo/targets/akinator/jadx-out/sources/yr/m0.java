package yr;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f94963a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94964b;

    public m0(SSLSocketFactory sSLSocketFactory, boolean z10) {
        this.f94963a = (SSLSocketFactory) p1.checkNotNull(sSLSocketFactory, "socketFactory");
        this.f94964b = z10;
    }

    public final SSLSocket a(Socket socket) throws IOException {
        if (!(socket instanceof SSLSocket)) {
            throw new IOException("SocketFactory " + this.f94963a + " did not produce an SSLSocket: " + socket.getClass());
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        if (this.f94964b) {
            sSLSocket.setNeedClientAuth(true);
            return sSLSocket;
        }
        sSLSocket.setWantClientAuth(true);
        return sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f94963a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f94963a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f94963a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f94963a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f94963a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f94963a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f94963a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
