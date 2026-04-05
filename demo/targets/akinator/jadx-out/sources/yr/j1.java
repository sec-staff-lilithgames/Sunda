package yr;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import wr.e2;
import wr.h5;
import wr.q1;
import xr.s4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j1 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f94935a = new h1();

    /* renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f94936b;

    /* renamed from: c, reason: collision with root package name */
    public final zr.c f94937c;

    public j1(i1 i1Var) {
        this.f94936b = i1Var.getFactory();
        this.f94937c = i1Var.getConnectionSpec();
    }

    @Override // yr.k
    public j handshake(Socket socket, wr.c cVar) throws IOException {
        j jVarHandshake = this.f94935a.handshake(socket, cVar);
        Socket socket2 = jVarHandshake.f94931a;
        SSLSocketFactory sSLSocketFactory = this.f94936b;
        Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, (String) null, -1, true);
        if (!(socketCreateSocket instanceof SSLSocket)) {
            throw new IOException("SocketFactory " + sSLSocketFactory + " did not produce an SSLSocket: " + socketCreateSocket.getClass());
        }
        SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
        sSLSocket.setUseClientMode(false);
        zr.c cVar2 = this.f94937c;
        cVar2.apply(sSLSocket, false);
        i0 i0Var = i0.get();
        boolean zSupportsTlsExtensions = cVar2.supportsTlsExtensions();
        zr.p pVar = zr.p.HTTP_2;
        String strNegotiate = i0Var.negotiate(sSLSocket, null, zSupportsTlsExtensions ? Arrays.asList(pVar) : null);
        if (pVar.toString().equals(strNegotiate)) {
            return new j(socketCreateSocket, jVarHandshake.f94932b.toBuilder().set(s4.f92979a, h5.f90959c).set(q1.f91099c, sSLSocket.getSession()).build(), new e2.c(new e2.i(sSLSocket.getSession())));
        }
        throw new IOException("Expected NPN/ALPN " + pVar + ": " + strNegotiate);
    }
}
