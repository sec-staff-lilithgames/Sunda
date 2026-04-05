package yr;

import java.io.IOException;
import java.net.Socket;
import wr.h5;
import wr.q1;
import xr.s4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h1 implements k {
    @Override // yr.k
    public j handshake(Socket socket, wr.c cVar) throws IOException {
        return new j(socket, cVar.toBuilder().set(q1.f91098b, socket.getLocalSocketAddress()).set(q1.f91097a, socket.getRemoteSocketAddress()).set(s4.f92979a, h5.f90958b).build(), null);
    }
}
