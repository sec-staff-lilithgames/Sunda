package jw;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.e0;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements l {
    @Override // jw.l
    public n create(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return new k();
    }

    @Override // jw.l
    public boolean matchesSocket(SSLSocket sslSocket) {
        e0.checkNotNullParameter(sslSocket, "sslSocket");
        return k.f69969a.isSupported() && Conscrypt.isConscrypt(sslSocket);
    }
}
