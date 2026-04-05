package yr;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f94836a = Collections.unmodifiableList(Arrays.asList(zr.p.HTTP_2));

    public static SSLSocket upgrade(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, zr.c cVar) throws IOException {
        p1.checkNotNull(sSLSocketFactory, "sslSocketFactory");
        p1.checkNotNull(socket, "socket");
        p1.checkNotNull(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        cVar.apply(sSLSocket, false);
        i0 i0Var = i0.get();
        boolean zSupportsTlsExtensions = cVar.supportsTlsExtensions();
        List<zr.p> list = f94836a;
        String strNegotiate = i0Var.negotiate(sSLSocket, str, zSupportsTlsExtensions ? list : null);
        p1.checkState(list.contains(zr.p.get(strNegotiate)), "Only " + list + " are supported, but negotiated protocol is %s", strNegotiate);
        if (hostnameVerifier == null) {
            hostnameVerifier = zr.h.f98478b;
        }
        if (hostnameVerifier.verify((str.startsWith(C3191e4.i.f36529d) && str.endsWith(C3191e4.i.f36531e)) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
