package yr;

import com.ironsource.Q6;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f94926b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f94927c;

    /* renamed from: a, reason: collision with root package name */
    public final zr.m f94928a;

    static {
        i0 i0Var;
        Logger logger = Logger.getLogger(i0.class.getName());
        f94926b = logger;
        zr.m mVar = zr.m.get();
        ClassLoader classLoader = i0.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                i0Var = new i0(mVar);
            }
        }
        i0Var = new h0(mVar);
        f94927c = i0Var;
    }

    public i0(zr.m mVar) {
        this.f94928a = (zr.m) p1.checkNotNull(mVar, Q6.H);
    }

    public static i0 get() {
        return f94927c;
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f94928a.configureTlsExtensions(sSLSocket, str, list);
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return this.f94928a.getSelectedProtocol(sSLSocket);
    }

    public String negotiate(SSLSocket sSLSocket, String str, List<zr.p> list) throws IOException {
        zr.m mVar = this.f94928a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            if (selectedProtocol != null) {
                return selectedProtocol;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            mVar.afterHandshake(sSLSocket);
        }
    }
}
